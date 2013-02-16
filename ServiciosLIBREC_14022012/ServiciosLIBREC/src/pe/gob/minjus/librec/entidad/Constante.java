package pe.gob.minjus.librec.entidad;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the constante database table.
 * 
 */
@Entity
@Table(name="constante")
public class Constante implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_cons")
	private Long idCons;

	@Column(name="fe_usua_crea")
	private Timestamp feUsuaCrea;

	@Column(name="fe_usua_modi")
	private Timestamp feUsuaModi;

	@Column(name="id_cons_padr")
	private Long idConsPadr;

	@Column(name="id_usua_crea")
	private String idUsuaCrea;

	@Column(name="id_usua_modi")
	private String idUsuaModi;

	@Column(name="in_estd")
	private String inEstd;

	@Column(name="tx_desc")
	private String txDesc;

	@Column(name="tx_term_crea")
	private String txTermCrea;

	@Column(name="tx_term_modi")
	private String txTermModi;

	@Column(name="tx_val1")
	private String txVal1;

	@Column(name="tx_val2")
	private String txVal2;

	@Column(name="tx_val3")
	private String txVal3;

	//bi-directional many-to-one association to Constante
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_cons_padr", referencedColumnName="id_cons", nullable=false, insertable = false, updatable = false)
	private Constante padre;
	
    public Constante() {
    }

	public Long getIdCons() {
		return this.idCons;
	}

	public void setIdCons(Long idCons) {
		this.idCons = idCons;
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

	public Long getIdConsPadr() {
		return this.idConsPadr;
	}

	public void setIdConsPadr(Long idConsPadr) {
		this.idConsPadr = idConsPadr;
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

	public String getTxDesc() {
		return this.txDesc;
	}

	public void setTxDesc(String txDesc) {
		this.txDesc = txDesc;
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

	public String getTxVal1() {
		return this.txVal1;
	}

	public void setTxVal1(String txVal1) {
		this.txVal1 = txVal1;
	}

	public String getTxVal2() {
		return this.txVal2;
	}

	public void setTxVal2(String txVal2) {
		this.txVal2 = txVal2;
	}

	public String getTxVal3() {
		return this.txVal3;
	}

	public void setTxVal3(String txVal3) {
		this.txVal3 = txVal3;
	}

	public Constante getPadre() {
		return padre;
	}

	public void setPadre(Constante padre) {
		this.padre = padre;
	}

	
}