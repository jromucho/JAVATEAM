package pe.gob.minjus.librec.bo;

import java.util.List;

import pe.gob.minjus.librec.dto.ConstanteDTO;



public interface ConstanteBO {
	public List<ConstanteDTO> buscarConstantes(ConstanteDTO filtroPersona) throws Exception;
	

	
}
