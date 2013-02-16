package pe.gob.minjus.librec.service.test;

import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pe.gob.minjus.librec.dto.ConstanteDTO;
import pe.gob.minjus.librec.dto.PersonaDTO;
import pe.gob.minjus.librec.service.ValidarPersonaService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:pe/gob/minjus/librec/service/test/resources/applicationTest.xml"})
public class ValidarPersonaServiceTest {

	@Autowired
	private ValidarPersonaService validarPersonaService = null;
	
	public ValidarPersonaServiceTest()
	{
		/*ApplicationContext context = 
		 new ClassPathXmlApplicationContext("/pe/gob/minjus/librec/service/test/resources/applicationTest.xml");
this.validarPersonaService = (ValidarPersonaService) context.getBean("validarPersonaCliente");*/
	}
	
	
	@Test
	public void testBuscarPersona(){
		PersonaDTO person =validarPersonaService.buscarPersonaPorDNI("01051213", new Long(5));
		if(person!=null){
			System.out.println("================================================");
			System.out.println("Test -  Buscar Persona");
			System.out.println("Persona-Nombre           : "+person.getTxNomb());
			System.out.println("Persona-Ape. Paterno     : "+person.getTxApePtno());
			System.out.println("Persona-Ape. Materno     : "+person.getTxApeMtno());
			System.out.println("Persona-Estado Civil     : "+person.getNoEstadoCivil());
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			System.out.println("Persona-Fecha Nacimiento : "+sdf.format(person.getFeNaci()));
			System.out.println("================================================");
		}
		
    }
	
	@Test
	public void testBuscarTipoDocumento(){
		
		List<ConstanteDTO> listaConstante = validarPersonaService.buscarTipoDocumento();
		System.out.println("================================================");
		System.out.println("Test -  Buscar Tipo de Documentos");
		for(ConstanteDTO objCons:listaConstante){
			System.out.println("Tipo Documento: "+objCons.getTxDesc()+"-"+objCons.getTxDescPadr());
		}
		System.out.println("================================================");
    }
	
	
}
