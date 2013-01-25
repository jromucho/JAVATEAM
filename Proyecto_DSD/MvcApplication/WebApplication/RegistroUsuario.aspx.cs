using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;
using System.Data.SqlClient;
using System.Configuration;
using WebApplication.WebReference;

namespace WebApplication
{
    public partial class RegistroUsuario : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if (!IsPostBack)
            { 
            }
        }

        protected void lbGrabar_Click(object sender, EventArgs e)
        {
            Grabar();
            //Page.ClientScript.RegisterStartupScript(this.GetType(), "mensaje", "mensaje('El usuario fue creado satisfactiramente');", true);
            Response.Redirect("Login.aspx", false);
        }
        
        public void Grabar() 
        {
            try
            {
                SqlConnection cn = new SqlConnection(ConfigurationManager.ConnectionStrings["ConnectionStringGarfield"].ConnectionString);
                SqlCommand cmd = new SqlCommand();
                cmd.CommandText = "usp_Registrar";
                cmd.CommandType = CommandType.StoredProcedure;
                cmd.Parameters.Add(new SqlParameter("@TipoUsuario", SqlDbType.Char, 1) { Value = ddlTipoPersona.SelectedValue });
                cmd.Parameters.Add(new SqlParameter("@NombreCompleto", SqlDbType.VarChar, 50) { Value = TextBox1.Text });
                cmd.Parameters.Add(new SqlParameter("@RazonSocial", SqlDbType.VarChar, 50) { Value = TextBox2.Text });
                cmd.Parameters.Add(new SqlParameter("@TipoDocumento", SqlDbType.VarChar, 5) { Value = ddlTipoDocumento.SelectedValue });
                cmd.Parameters.Add(new SqlParameter("@NumeroDocumento", SqlDbType.VarChar, 15) { Value = TextBox4.Text });
                cmd.Parameters.Add(new SqlParameter("@TelefonoCelular", SqlDbType.VarChar, 9) { Value = TextBox5.Text });
                cmd.Parameters.Add(new SqlParameter("@Email", SqlDbType.VarChar, 50) { Value = TextBox6.Text });
                cmd.Parameters.Add(new SqlParameter("@Clave", SqlDbType.VarChar, 50) { Value = TextBox3.Text });
                cmd.Connection = cn;
                cn.Open();
                cmd.ExecuteNonQuery();
                cn.Close();
                cn.Dispose();
                cmd.Dispose();
            }
            catch (Exception ex)
            {
            }
        }

        protected void lbVerificar_Click(object sender, EventArgs e)
        {
            Service1SoapClient obj = new Service1SoapClient();
            PersonaDTO p = obj.buscarpersonaPorDNI(TextBox7.Text, 1);
            if (p != null)
            {
                TextBox1.Text = p.txNomb;
                TextBox6.Text = p.txMail;
                TextBox4.Text = p.txNumDocu;
            }
            else
            {
                Page.ClientScript.RegisterStartupScript(this.GetType(), "mensaje", "mensaje('El usuario no se encuentra registrado');", true);
            }
        }


    }
}