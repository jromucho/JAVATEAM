package pe.gob.minjus.librec.entidad;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the ubigeo database table.
 * 
 */
@Entity
@Table(name="ubigeo")
public class Ubigeo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UbigeoPK id;

	@Column(name="fe_usua_crea")
	private Timestamp feUsuaCrea;

	@Column(name="fe_usua_modi")
	private Timestamp feUsuaModi;

	@Column(name="id_usua_crea")
	private String idUsuaCrea;

	@Column(name="id_usua_modi")
	private String idUsuaModi;

	@Column(name="in_estd")
	private String inEstd;

	@Column(name="tx_nomb_ubig")
	private String txNombUbig;

	@Column(name="tx_term_crea")
	private String txTermCrea;

	@Column(name="tx_term_modi")
	private String txTermModi;

	
    public Ubigeo() {
    }

	public UbigeoPK getId() {
		return this.id;
	}

	public void setId(UbigeoPK id) {
		this.id = id;
	}
	
	public Timestamp getFeUsuaCrea() {
		return this.feUsuaCrea;
	}

	public void setFeUsuaCrea(Timestamp feUsuaCrea) {
		this.feUsuaCrea = feUsuaCrea;
	}

	public Timestamp getFeUsuaModi() {
		return this.feUsuaModi;
	}

	public void setFeUsuaModi(Timestamp feUsuaModi) {
		this.feUsuaModi = feUsuaModi;
	}

	public String getIdUsuaCrea() {
		return this.idUsuaCrea;
	}

	public void setIdUsuaCrea(String idUsuaCrea) {
		this.idUsuaCrea = idUsuaCrea;
	}

	public String getIdUsuaModi() {
		return this.idUsuaModi;
	}

	public void setIdUsuaModi(String idUsuaModi) {
		this.idUsuaModi = idUsuaModi;
	}

	public String getInEstd() {
		return this.inEstd;
	}

	public void setInEstd(String inEstd) {
		this.inEstd = inEstd;
	}

	public String getTxNombUbig() {
		return this.txNombUbig;
	}

	public void setTxNombUbig(String txNombUbig) {
		this.txNombUbig = txNombUbig;
	}

	public String getTxTermCrea() {
		return this.txTermCrea;
	}

	public void setTxTermCrea(String txTermCrea) {
		this.txTermCrea = txTermCrea;
	}

	public String getTxTermModi() {
		return this.txTermModi;
	}

	public void setTxTermModi(String txTermModi) {
		this.txTermModi = txTermModi;
	}

	
	
}