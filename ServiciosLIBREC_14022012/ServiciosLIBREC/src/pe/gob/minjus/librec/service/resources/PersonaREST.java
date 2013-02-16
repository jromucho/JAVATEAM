package pe.gob.minjus.librec.service.resources;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.access.BeanFactoryLocator;
import org.springframework.beans.factory.access.BeanFactoryReference;
import org.springframework.beans.factory.access.SingletonBeanFactoryLocator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ContextResource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.ContextLoaderListener;

import pe.gob.minjus.librec.bo.ConstanteBO;
import pe.gob.minjus.librec.bo.PersonaBO;
import pe.gob.minjus.librec.contexto.AppContexto;
import pe.gob.minjus.librec.dto.PersonaDTO;
@Path("/personas")
@Component
public class PersonaREST {

	
	
	private PersonaBO personaBO;
	
	private ConstanteBO constanteBO;
	
	public PersonaREST(){
		try {
			ApplicationContext context = AppContexto.getApplicationContext();
			personaBO = (PersonaBO) context.getBean("personaBO");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
    @GET
    @Produces({"application/xml", "application/json"})
	public List<PersonaDTO> getPersonas(){
		List<PersonaDTO> lstPersonas=null;
    	try {

    		lstPersonas=personaBO.buscarPersonas(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lstPersonas;
	}
    
    @GET
    @Path("{tipodocu}/{nrodocumento}")
    @Produces({"application/xml", "application/json"})
	public PersonaDTO getPersona(@PathParam("tipodocu") String tipodocu, @PathParam("nrodocumento") String nrodocumento){
		PersonaDTO lstPersonas=null;
    	try {
    		PersonaDTO persona = new PersonaDTO();
    		persona.setIdTipoDocumento(new Long(tipodocu));
    		persona.setTxNumDocu(nrodocumento);
    		lstPersonas=personaBO.buscarPersona(persona);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lstPersonas;
	}
    
	@GET
	@Produces( { MediaType.TEXT_HTML })
	@Path("/antecedente/{tipodocu}/{nrodocumento}")
	public String getAntecedente(@PathParam("tipodocu") String tipodocu, @PathParam("nrodocumento") String nrodocumento) {
		PersonaDTO objPersona=null;
    	try {
    		PersonaDTO persona = new PersonaDTO();
    		persona.setIdTipoDocumento(new Long(tipodocu));
    		persona.setTxNumDocu(nrodocumento);
    		objPersona=personaBO.buscarPersona(persona);
		} catch (Exception e) {
			e.printStackTrace();
		}
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
    	StringBuffer sfb=new StringBuffer();
    	
    	sfb.append("<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>");
    	sfb.append("<html xmlns='http://www.w3.org/1999/xhtml'>");
    	sfb.append("<head><style>.general{font-size:10px;font-family:Arial;}");
    	sfb.append(".txtLabel{font-weight:bold;} .txtTitulo{color:#FFFFFF;font-weight:bold;background-color:#B50226;}");
    	sfb.append(" .txtResultado{font-weight:bold;font-size:11px;text-transform:uppercase;}</style>");
    	sfb.append("<title>Antecedentes Judiciales</title>");
    	sfb.append("</head>");

		sfb.append("<body class='general'>");
		sfb.append("<table width='650px' border='0'>");
		sfb.append(" <tr>");
		sfb.append("  <td colspan='4' height='25' align='center' class='txtTitulo'>ANTECEDENTE JUDICIAL</td>");
		sfb.append("</tr>");
		sfb.append("<tr>");
		sfb.append("  <td colspan='4'>&nbsp;</td>");
		sfb.append("</tr>");
		sfb.append(" <tr>");
		sfb.append("  <td colspan='4'>&nbsp;</td>");
		sfb.append(" </tr>");
		sfb.append(" <tr>");
		sfb.append("  <td width='124' class='txtLabel'>NOMBRES</td>");
		sfb.append(" <td width='19' align='center' class='txtLabel'>:</td>");
		sfb.append(" <td width='309'>"+objPersona.getTxNomb()+"</td>");
		sfb.append("<td width='230' rowspan='12'>&nbsp;</td>");
		sfb.append("</tr>");
		sfb.append(" <tr>");
		sfb.append("  <td class='txtLabel'>APELLIDO PATERNO</td>");
		sfb.append("  <td align='center' class='txtLabel'>:</td>");
		sfb.append("  <td>"+objPersona.getTxApePtno()+"</td>");
		sfb.append("</tr>");
		sfb.append(" <tr>");
		sfb.append("  <td class='txtLabel'>APELLIDO MATERNO</td>");
		sfb.append("  <td align='center' class='txtLabel'>:</td>");
		sfb.append(" <td>"+objPersona.getTxApeMtno()+"</td>");
		sfb.append("</tr>");
		sfb.append("<tr>");
		sfb.append(" <td class='txtLabel'>TIPO DOCUMENTO</td>");
		sfb.append("<td align='center' class='txtLabel'>:</td>");
		sfb.append("<td>"+objPersona.getNoTipoDocumento()+"</td>");
		sfb.append(" </tr>");
		sfb.append("<tr>");
		sfb.append(" <td class='txtLabel'>NUM. DOCUMENTO</td>");
		sfb.append("<td align='center' class='txtLabel'>:</td>");
		sfb.append("<td>"+objPersona.getTxNumDocu()+"</td>");
		sfb.append(" </tr>");
		sfb.append("<tr>");
		sfb.append("  <td class='txtLabel'>ESTADO CIVIL</td>");
		sfb.append(" <td align='center' class='txtLabel'>:</td>");
		sfb.append("<td>"+objPersona.getNoEstadoCivil()+"</td>");
		sfb.append("</tr>");
		sfb.append("<tr>");
		sfb.append(" <td class='txtLabel'>SEXO</td>");
		sfb.append(" <td align='center' class='txtLabel'>:</td>");
		String sexo=(objPersona.getInSexo()=="M"?"MASCULINO":"FEMENINO");
		sfb.append(" <td>"+sexo+"</td>");
		sfb.append("</tr>");
		sfb.append(" <tr>");
		sfb.append("  <td class='txtLabel'>FECHA NACIMIENTO</td>");
		sfb.append(" <td align='center' class='txtLabel'>:</td>");
		sfb.append(" <td>"+sdf.format(objPersona.getFeNaci())+"</td>");
		sfb.append(" </tr>");
		sfb.append(" <tr>");
		sfb.append("  <td class='txtLabel'>DIRECCION</td>");
		sfb.append(" <td align='center' class='txtLabel'>:</td>");
		sfb.append(" <td>"+objPersona.getTxDire()+"</td>");
		sfb.append(" </tr>");
		sfb.append(" <tr>");
		sfb.append("  <td>&nbsp;</td>");
		sfb.append("  <td align='center' class='txtLabel'>:</td>");
		sfb.append(" <td>&nbsp;</td>");
		sfb.append(" </tr>");
		sfb.append(" <tr>");
		sfb.append("  <td>&nbsp;</td>");
		sfb.append(" <td align='center' class='txtLabel'>:</td>");
		sfb.append(" <td>&nbsp;</td>");
		sfb.append(" </tr>");
		sfb.append(" <tr>");
		sfb.append("  <td>&nbsp;</td>");
		sfb.append(" <td align='center' class='txtLabel'>:</td>");
		sfb.append("<td>&nbsp;</td>");
		  
		sfb.append(" </tr>");
		sfb.append("<tr>");
		sfb.append(" <td>&nbsp;</td>");
		sfb.append(" <td align='center' class='txtLabel'>:</td>");
		sfb.append("  <td>&nbsp;</td>");
		sfb.append("  <td>&nbsp;</td>");
		sfb.append(" </tr>");
		sfb.append(" <tr>");
		sfb.append("  <td class='txtTitulo'>RESULTADO</td>");
		sfb.append("   <td align='center' class='txtLabel'>:</td>");
		sfb.append("  <td colspan='2' class='txtResultado'>&nbsp;</td>");
		sfb.append("</tr>");
		sfb.append("</table>");
		sfb.append("</body>");
		sfb.append("</html>");
    	
		
		return sfb.toString();
	}
    
    
    
}
