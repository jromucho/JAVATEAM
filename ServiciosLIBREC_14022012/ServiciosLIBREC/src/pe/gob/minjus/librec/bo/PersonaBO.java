package pe.gob.minjus.librec.bo;

import java.util.List;

import pe.gob.minjus.librec.dto.PersonaDTO;



public interface PersonaBO {
	public PersonaDTO buscarPersona(PersonaDTO filtroPersona) throws Exception;
	public List<PersonaDTO> buscarPersonas(PersonaDTO filtroPersona) throws Exception;

	
}
