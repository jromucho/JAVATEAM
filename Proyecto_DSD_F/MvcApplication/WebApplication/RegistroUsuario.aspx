<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="RegistroUsuario.aspx.cs" Inherits="WebApplication.RegistroUsuario" %>

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
    <div >
        <center><h1>Registro de Usuario</h1></center>
        <hr />
        <h1>Verificar Usuario</h1>
        <br />
        <table border="0" cellpadding="0" cellspacing="0">
            <tr>
                <td>
                    <h2>Tipo Documento :&nbsp;&nbsp;&nbsp;</h2>
                </td>
                <td>
                    <asp:DropDownList ID="DropDownList1" runat="server" class="stlCajaTexto slrequired" >
                        <asp:ListItem Text="DNI" Value="DNI" />
                        <asp:ListItem Text="LE" Value="LE" />
                        <asp:ListItem Text="PASAPORTE" Value="P" />
                    </asp:DropDownList> 
                </td>
            </tr>
            <tr>
                <td>
                    <h2>Número Documento :&nbsp;&nbsp;&nbsp;</h2>
                </td>
                <td>
                    <asp:TextBox ID="TextBox7" runat="server" CssClass="stlCajaTexto" />
                </td>
            </tr>
            <tr>
                <td style="text-align : right" colspan="2" >
                    <br />
                    <asp:LinkButton ID="lbVerificar" runat="server" Text="Verificar" 
                        onclick="lbVerificar_Click" />
                </td>
            </tr>
        </table>
        <hr />
        <br />
        <br />
        <h1>Registrar Usuario</h1>
        <br />
        <table border="0" cellpadding="0" cellspacing="0">
            <tr>
                <td>
                    <h2>
                    Tipo Usuario :&nbsp;&nbsp;&nbsp;</h2>
                </td>
                <td>
                    <asp:DropDownList ID="ddlTipoPersona" runat="server" class="stlCajaTexto slrequired" >
                        <asp:ListItem Text="Persona Natural" Value="N" />
                        <asp:ListItem Text="Persona Juridica" Value="J" />
                    </asp:DropDownList>
                </td>
            </tr>
            <tr>
                <td>
                    <h2>
                    Nombres y Apellidos :&nbsp;&nbsp;&nbsp;
                    </h2>
                </td>
                <td>
                    <asp:TextBox ID="TextBox1" runat="server" Width="350px" CssClass="stlPaginaTexto" />
                </td>
            </tr>
            <tr>
                <td>
                    <h2>
                    Razón Social :&nbsp;&nbsp;&nbsp;
                    </h2>
                </td>
                <td>
                    <asp:TextBox ID="TextBox2" runat="server" Width="350px" CssClass="stlPaginaTexto" />
                </td>
            </tr>
            <tr>
                <td>
                    <h2>
                    Tipo Documento :&nbsp;&nbsp;&nbsp;
                    </h2>
                </td>
                <td>
                    <asp:DropDownList ID="ddlTipoDocumento" runat="server" class="stlCajaTexto slrequired" >
                        <asp:ListItem Text="DNI" Value="DNI" />
                        <asp:ListItem Text="LE" Value="LE" />
                        <asp:ListItem Text="PASAPORTE" Value="P" />
                    </asp:DropDownList>
                </td>
            </tr>
            <tr>
                <td>
                    <h2>
                    Número Documento :&nbsp;&nbsp;&nbsp;
                    </h2>
                </td>
                <td>
                    <asp:TextBox ID="TextBox4" runat="server" CssClass="stlPaginaTexto" />
                </td>
            </tr>
            <tr>
                <td>
                    <h2>
                    Teléfono :&nbsp;&nbsp;&nbsp;
                    </h2>
                </td>
                <td>
                    <asp:TextBox ID="TextBox5" runat="server" CssClass="stlPaginaTexto" />
                </td>
            </tr>
            <tr>
                <td>
                    <h2>
                    Email :&nbsp;&nbsp;&nbsp;
                    </h2>
                </td>
                <td>
                    <asp:TextBox ID="TextBox6" runat="server" Width="350px" CssClass="stlPaginaTexto" />
                </td>
            </tr>
            <tr>
                <td>
                    <h2>
                    Clave :&nbsp;&nbsp;&nbsp;
                    </h2>
                </td>
                <td>
                    <asp:TextBox ID="TextBox3" runat="server"  CssClass="stlPaginaTexto" />
                </td>
            </tr>
            <tr>
                <td colspan="2" style="text-align : right" >
                    <br />
                    <asp:LinkButton ID="lbGrabar" Text="Crear Usuario" runat="server" 
                        onclick="lbGrabar_Click" />
                </td>
            </tr>
        </table>
    </div>
    </form>
</body>
</html>
