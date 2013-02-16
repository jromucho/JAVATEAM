package pe.gob.minjus.librec.bo.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import pe.gob.minjus.librec.bo.ConstanteBO;
import pe.gob.minjus.librec.dao.ConstanteDao;
import pe.gob.minjus.librec.dto.ConstanteDTO;

@Service("constanteBO")
public class ConstanteBOImpl implements ConstanteBO{


	@Resource(name="constanteDao")
	private ConstanteDao constanteDao;
/*
	public UsuarioDTO identificarUsuario(UsuarioDTO usuario) throws Exception{
		UsuarioDTO usu = null;
		try{
			usu = personaDao.identificarUsuario(usuario);
		}catch(Exception e){
			e.printStackTrace();
		}
		return usu;
	}*/


	@Override
	public List<ConstanteDTO> buscarConstantes(ConstanteDTO filtroPersona)
			throws Exception {
		List<ConstanteDTO> lstConstante = null;
		try{
			lstConstante = constanteDao.buscarConstantes(filtroPersona);
		}catch(Exception e){
			e.printStackTrace();
		}
		return lstConstante;
	}


}
