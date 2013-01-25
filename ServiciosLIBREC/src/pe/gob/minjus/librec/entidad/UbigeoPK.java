package pe.gob.minjus.librec.entidad;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ubigeo database table.
 * 
 */
@Embeddable
public class UbigeoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_dpto")
	private String idDpto;

	@Column(name="id_prov")
	private String idProv;

	@Column(name="id_dist")
	private String idDist;

    public UbigeoPK() {
    }
	public String getIdDpto() {
		return this.idDpto;
	}
	public void setIdDpto(String idDpto) {
		this.idDpto = idDpto;
	}
	public String getIdProv() {
		return this.idProv;
	}
	public void setIdProv(String idProv) {
		this.idProv = idProv;
	}
	public String getIdDist() {
		return this.idDist;
	}
	public void setIdDist(String idDist) {
		this.idDist = idDist;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UbigeoPK)) {
			return false;
		}
		UbigeoPK castOther = (UbigeoPK)other;
		return 
			this.idDpto.equals(castOther.idDpto)
			&& this.idProv.equals(castOther.idProv)
			&& this.idDist.equals(castOther.idDist);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idDpto.hashCode();
		hash = hash * prime + this.idProv.hashCode();
		hash = hash * prime + this.idDist.hashCode();
		
		return hash;
    }
}