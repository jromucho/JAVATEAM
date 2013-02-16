package pe.gob.minjus.librec.bo.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


import pe.gob.minjus.librec.bo.PersonaBO;
import pe.gob.minjus.librec.dao.PersonaDao;
import pe.gob.minjus.librec.dto.PersonaDTO;

@Service("personaBO")
public class PersonaBOImpl implements PersonaBO{


	@Resource(name="personaDao")
	private PersonaDao personaDao;
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
	public PersonaDTO buscarPersona(PersonaDTO filtroPersona) throws Exception {
		PersonaDTO person = null;
		try{
			 person = personaDao.buscarPersona(filtroPersona);
		}catch(Exception e){
			e.printStackTrace();
		}
		return  person;
	}

	@Override
	public List<PersonaDTO> buscarPersonas(PersonaDTO filtroPersona) throws Exception {
		List<PersonaDTO> lstPersonas=null;
		try{
			lstPersonas = personaDao.buscarPersonas(filtroPersona);
		}catch(Exception e){
			e.printStackTrace();
		}
		return lstPersonas;
	}


}
