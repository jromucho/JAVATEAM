package pe.gob.minjus.librec.service;


import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;



import pe.gob.minjus.librec.bo.ConstanteBO;
import pe.gob.minjus.librec.bo.PersonaBO;
import pe.gob.minjus.librec.dto.ConstanteDTO;
import pe.gob.minjus.librec.dto.PersonaDTO;
import pe.gob.minjus.librec.util.UConstante;

@SuppressWarnings("restriction")
@WebService(endpointInterface="pe.gob.minjus.librec.service.ValidarPersonaService")
public class ValidarPersonaServiceImpl implements ValidarPersonaService {

	
	
	@Autowired
	private PersonaBO personaBO;
	@Autowired
	private ConstanteBO constanteBO;
	
	public PersonaDTO buscarPersonaPorDNI(String pNumDocumento, Long pTipoDocumento) {
		PersonaDTO objResultado = new PersonaDTO();
		PersonaDTO usu = null;
		try{
			PersonaDTO filtroPersona = new PersonaDTO();
			filtroPersona.setTxNumDocu(pNumDocumento);
			filtroPersona.setIdTipoDocumento(pTipoDocumento);
			
			
			usu = personaBO.buscarPersona(filtroPersona);
			
		//	System.out.println("user: "+usu.getTxNomb());
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return usu;
	}
	
	@Override
	public List<ConstanteDTO> buscarTipoDocumento() {
		List<ConstanteDTO> lstConstantes=new ArrayList<ConstanteDTO>();
		try{
			ConstanteDTO filtroConstante = new ConstanteDTO();
			filtroConstante.setIdConsPadr(new Long(UConstante.ID_CONSTANTE_TIPO_DOCUMENTO));
			lstConstantes=constanteBO.buscarConstantes(filtroConstante);
			
		//	System.out.println("user: "+usu.getTxNomb());
		
		}catch(Exception e){
			e.printStackTrace();
		}
		return lstConstantes;
	}
	

}

