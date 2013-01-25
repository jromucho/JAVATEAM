using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;
using System.Data.SqlClient;
using System.Configuration;

namespace WebApplication
{
    public partial class Login : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if (!IsPostBack)
            { 
            }
        }

        protected void lbIngresar_Click(object sender, EventArgs e)
        {
            int valida = validarUsuario(TextBox1.Text, TextBox2.Text);
            if (valida > 0)
                Response.Redirect("DatosPersonales.aspx", false);
            else
            {
                Page.ClientScript.RegisterStartupScript(this.GetType(), "mensaje", "mensaje('Usuario o contraseña incorrectos.');", true);
            }
        }

        private int validarUsuario(string numero, string clave)
        {
            int count = 0;
            try
            {
                SqlConnection cn = new SqlConnection(ConfigurationManager.ConnectionStrings["ConnectionStringGarfield"].ConnectionString);
                SqlCommand cmd = new SqlCommand();
                cmd.CommandText = "usp_ValidarUsuario";
                cmd.CommandType = CommandType.StoredProcedure;
                cmd.Parameters.Add(new SqlParameter("@NumeroDocumento", SqlDbType.VarChar, 15) { Value = numero });
                cmd.Parameters.Add(new SqlParameter("@Clave", SqlDbType.VarChar,50) { Value = clave });
                cmd.Connection = cn;
                cn.Open();
                SqlDataReader dr = cmd.ExecuteReader();
                if (dr.Read())
                {
                    count = int.Parse(dr[0].ToString());
                }
                cn.Close();
                cn.Dispose();
                cmd.Dispose();
            }
            catch (Exception ex)
            {
            }
            return count;
        }

    }
}