<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Login.aspx.cs" Inherits="WebApplication.Login" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
    
    <link rel="Stylesheet" href="Layout/reset.css" />
    <link rel="Stylesheet" href="Layout/typography.css" />
    <link rel="Stylesheet" href="Layout/mem.css" />
    <link rel="Stylesheet" href="Layout/jer.css" />
    <link rel="Stylesheet" href="Layout/960.css" />
    <link rel="Stylesheet" href="Layout/basic.css" />
    <link rel="Stylesheet" href="Layout/jquery-ui.css" />
    <link rel="Stylesheet" href="Layout/fileuploader.css" />
    <link rel="Stylesheet" href="App_Themes/SkinGeneral/Default.css" />
    <link rel="Stylesheet" href="Layout/slickmap.css" />

    <script type="text/javascript" language="javascript">
        function mensaje(msj) {
            alert(msj);
        }
    </script>
</head>
<body>
    <form id="form1" runat="server">
    <div  align="center" >
        <table border="0" cellpadding="0" cellspacing="0" width="100%"  >
            <tr>
                <td>
                    <center><h1>Ingreso al Sistema</h1></center>
                    <hr />
                    <br />
                    <br />
                </td>
            </tr>
            <tr>
                <td>
                    <center>
                    <table border="0" cellpadding="0" cellspacing="0">
                        <tr>
                            <td> 
                                Número Documento :&nbsp;&nbsp;&nbsp; 
                            </td>
                            <td>
                                <asp:TextBox ID="TextBox1" runat="server" />
                            </td>
                        </tr>
                        <tr>
                            <td>
                                Clave :&nbsp;&nbsp;&nbsp;
                            </td>
                            <td>
                                <asp:TextBox ID="TextBox2" runat="server" />
                            </td>
                        </tr>
                    </table> 
                    </center>
                </td>
            </tr>
            <tr>
                <td>
                    <center>
                    <br />                    
                    <br />                    
                    <asp:LinkButton ID="lbIngresar" runat="server" Text="Ingresar" onclick="lbIngresar_Click" />&nbsp;
                    <br />
                    <br />
                    <br />
                    Si no tiene Clave de Acceso o no la recuerda solicitela <a href="RegistroUsuario.aspx" >aquí</a>.
                    </center>
                    <br />
                    <hr />
                </td>
            </tr>
        </table>
    </div>
    </form>
</body>
</html>
