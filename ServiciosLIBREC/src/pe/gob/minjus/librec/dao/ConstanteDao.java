package pe.gob.minjus.librec.dao;

import java.util.List;

import pe.gob.minjus.librec.dto.ConstanteDTO;





public interface ConstanteDao {

	public List<ConstanteDTO> buscarConstantes(ConstanteDTO filtroPersona) throws Exception;
	
	
}
