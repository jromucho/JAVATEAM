package pe.gob.minjus.librec.bo;

import pe.gob.minjus.librec.dto.PersonaDTO;



public interface PersonaBO {
	public PersonaDTO buscarPersona(PersonaDTO filtroPersona) throws Exception;
	

	
}
