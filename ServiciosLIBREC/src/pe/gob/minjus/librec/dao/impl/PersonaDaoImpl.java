package pe.gob.minjus.librec.dao.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import pe.gob.minjus.librec.dao.PersonaDao;
import pe.gob.minjus.librec.dto.PersonaDTO;
import pe.gob.minjus.librec.util.UConstante;

@Repository(value="personaDao")
public class PersonaDaoImpl implements PersonaDao {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public PersonaDTO buscarPersona(PersonaDTO filtroPersona) throws Exception {
		PersonaDTO objPersona =null;
		try {
			StringBuffer sql = new StringBuffer();
			sql.append(" SELECT p.idPers,p.txNomb, p.txApePtno, p.txApeMtno, p.txNumDocu, p.feNaci, p.inSexo, p.txDire,p.txMail,  ");
			sql.append(" tp.idCons, tp.txDesc, td.idCons, td.txDesc, ec.idCons, ec.txDesc ");
			
			sql.append(" FROM Persona p ");
			sql.append(" LEFT JOIN p.tipoPersona tp");
			sql.append(" LEFT JOIN p.tipoDocumento td");
			sql.append(" LEFT JOIN p.estadoCivil ec");
			sql.append(" WHERE p.inEstd = :idEstd AND p.txNumDocu = :nuDocu_ AND td.idCons = :idTipoDocu_ ");
			Query query = em.createQuery(sql.toString());
			query.setParameter("idEstd", UConstante.IN_ESTADO_ACTIVO);
			query.setParameter("nuDocu_", filtroPersona.getTxNumDocu());
			query.setParameter("idTipoDocu_", filtroPersona.getIdTipoDocumento());
			
			
			
			//Object[] obj = query.getSingleResult() == null ? null : (Object[])query.getSingleResult();
			List<Object[]> listObj = query.getResultList();
			if(listObj != null && listObj.size()>0){
				Object[] obj = listObj.get(0);
				objPersona = new PersonaDTO();
				objPersona.setIdPers(new Long(obj[0].toString()));
				objPersona.setTxNomb(obj[1] == null ? "" : obj[1].toString());
				objPersona.setTxApePtno(obj[2] == null ? "" : obj[2].toString());
				objPersona.setTxApeMtno(obj[3] == null ? "" : obj[3].toString());
				objPersona.setTxNumDocu(obj[4] == null ? "" : obj[4].toString());
				
				Timestamp feNaciT=(Timestamp)obj[5];
				if(feNaciT!=null){
					objPersona.setFeNaci(new Date(feNaciT.getTime()));
				}
				objPersona.setInSexo(obj[6] == null ? "" : obj[6].toString());
				objPersona.setTxDire(obj[7] == null ? "" : obj[7].toString());
				objPersona.setTxMail(obj[8] == null ? "" : obj[8].toString());
				
				objPersona.setIdTipoPersona(obj[9] == null ? new Long(0) : new Long(obj[9].toString()));
				objPersona.setNoTipoPersona(obj[10] == null ? "" : obj[10].toString());
				
				objPersona.setIdTipoDocumento(obj[11] == null ? new Long(0) :new Long( obj[11].toString()));
				objPersona.setNoTipoDocumento(obj[12] == null ? "" : obj[12].toString());
				
				objPersona.setIdEstadoCivil(obj[13] == null ? new Long(0) : new Long(obj[13].toString()));
				objPersona.setNoEstadoCivil(obj[14] == null ? "" : obj[14].toString());
				
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return objPersona;
	}
	
	
	
	/*
	@Override
	public UsuarioDTO identificarUsuario(UsuarioDTO usu) throws Exception {
		UsuarioDTO usuario = null;
		try{
			StringBuffer sql = new StringBuffer();
			sql.append(" SELECT u.idUsua, u.noUsua, e.noEmpl, e.apPateEmpl, e.apMateEmpl, ");
			sql.append("		e.idTipoDocu, c.noCons, c.val1Cons, e.nuDocu, e.telfEmpl, ");
			sql.append("		e.direEmpl, e.emailEmpl ");
			sql.append(" FROM Usuario u ");
			sql.append("	LEFT JOIN u.empleado e ");
			sql.append(" 	LEFT JOIN e.constante c ");
			sql.append(" WHERE u.idEstd = :idEstd AND u.noUsua = :noUsua AND u.passUsua = :passUsua ");
			
			Query query = em.createQuery(sql.toString());
			query.setParameter("idEstd", UConstante.IN_ID_ESTD_ACTIVO);
			query.setParameter("noUsua", usu.getNoUsuario());
			query.setParameter("passUsua", usu.getTxtPass());
			
			//Object[] obj = query.getSingleResult() == null ? null : (Object[])query.getSingleResult();
			List<Object[]> listObj = query.getResultList();
			if(listObj != null){
				Object[] obj = listObj.get(0);
				usuario = new UsuarioDTO();
				EmpleadoDTO empleado = new EmpleadoDTO();
				usuario.setIdUsuario(obj[0].toString());
				usuario.setNoUsuario(obj[1].toString());
				empleado.setNoEmpleado(obj[2] == null ? "" : obj[2].toString());
				empleado.setApPateEmpleado(obj[3] == null ? "" : obj[3].toString());
				empleado.setApMateEmpleado(obj[4] == null ? "" : obj[4].toString());
				empleado.setIdTipoDocumento(obj[5] == null ? "" : obj[5].toString());
				empleado.setDescTipoDocumeto(obj[7] == null ? "" : obj[7].toString());
				empleado.setNuDocumento(obj[8] == null ? "" : obj[8].toString());
				empleado.setTelfEmpleado(obj[9] == null ? "" : obj[9].toString());
				empleado.setDireEmpleado(obj[10] == null ? "" : obj[10].toString());
				empleado.setEmailEmpleado(obj[11] == null ? "" : obj[11].toString());
				empleado.setNombCompleto(empleado.getNoEmpleado() + " " + empleado.getApPateEmpleado() + " " + empleado.getApMateEmpleado());
				usuario.setEmpleado(empleado);				
			}
		}catch(NoResultException ne){
			ne.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
		return usuario;
	}

	@Override
	public List<OpcionDTO> obtenerOpcionesUsuario(PerfilDTO perfil) throws Exception {
		List<OpcionDTO> lista = null;
		try{
			StringBuffer sql = new StringBuffer();
			sql.append(" SELECT op.idOpciPerf, op.idOpci, o.descOpci, o.idTipoOpci, ");
			sql.append("		o.noOpci, o.rutaOpci, op.inOrden ");
			sql.append(" FROM OpcionPerfil op ");
			sql.append("	LEFT JOIN op.opcion o ");
			sql.append(" WHERE op.idEstd = :idEstd AND op.idPerf = :idPerf ");
			sql.append(" ORDER BY op.inOrden ");
			
			Query query = em.createQuery(sql.toString());
			query.setParameter("idEstd", UConstante.IN_ID_ESTD_ACTIVO);
			query.setParameter("idPerf", Long.parseLong(perfil.getIdPerfil()));
			
			List<Object[]> listObj = query.getResultList();
			lista = new ArrayList<OpcionDTO>();
			for(Object[] obj : listObj){
				OpcionDTO opcion = new OpcionDTO();
				opcion.setIdOpcion(obj[1].toString());
				opcion.setDescOpcion(obj[2] == null ? null : obj[2].toString());
				opcion.setIdTipoOpcion(obj[3] == null ? null : obj[3].toString());
				opcion.setNoOpcion(obj[4] == null ? null : obj[4].toString());
				opcion.setRutaOpcion(obj[5] == null ? null : obj[5].toString());
				opcion.setInOrden(obj[6] == null ? 0 : Integer.parseInt(obj[6].toString()));
				lista.add(opcion);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public PerfilDTO obtenerPerfilUsuario(UsuarioDTO usu) throws Exception {
		PerfilDTO perfil = null;
		try{
			StringBuffer sql = new StringBuffer();
			sql.append(" SELECT up.idPerf, up.idUsua, p.noPerf, p.descPerf ");
			sql.append(" FROM UsuarioPerfil up ");
			sql.append("	LEFT JOIN up.perfil p ");
			sql.append(" WHERE up.idEstd = :idEstd AND up.idUsua = :idUsua ");
			
			Query query = em.createQuery(sql.toString());
			query.setParameter("idEstd", UConstante.IN_ID_ESTD_ACTIVO);
			query.setParameter("idUsua", Long.parseLong(usu.getIdUsuario()));
			
			List<Object[]> listObj = query.getResultList();
			
			if(listObj != null){
				Object[] obj = listObj.get(0);
				perfil = new PerfilDTO();
				perfil.setIdPerfil(obj[0].toString());
				perfil.setNoPerfil(obj[2] == null ? "" : obj[2].toString());
				perfil.setDescPerfil(obj[3] == null ? "" : obj[3].toString());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return perfil;
	}
*/
}
