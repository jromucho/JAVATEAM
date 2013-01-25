package pe.gob.minjus.librec.dao;

import pe.gob.minjus.librec.dto.PersonaDTO;





public interface PersonaDao {

	public PersonaDTO buscarPersona(PersonaDTO filtroPersona) throws Exception;
	
	
}
