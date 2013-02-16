package pe.gob.minjus.librec.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import pe.gob.minjus.librec.dto.ConstanteDTO;
import pe.gob.minjus.librec.dto.PersonaDTO;


@SuppressWarnings("restriction")
@WebService
public interface ValidarPersonaService {
	
	public PersonaDTO buscarPersonaPorDNI(
			@WebParam(name="pNumDocumento") String pNumDocumento,
			@WebParam(name="pTipoDocumento") Long pTipoDocumento);
	
	public List<ConstanteDTO> buscarTipoDocumento();
	

}
