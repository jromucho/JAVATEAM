package pe.gob.minjus.librec.entidad;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;


/**
 * The persistent class for the persona database table.
 * 
 */
@Entity
@Table(name="persona")
public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_pers")
	private Long idPers;

	@Column(name="fe_naci")
	private Timestamp feNaci;

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

	@Column(name="in_sexo")
	private String inSexo;

	@Column(name="tx_ape_mtno")
	private String txApeMtno;

	@Column(name="tx_ape_ptno")
	private String txApePtno;

	@Column(name="tx_dire")
	private String txDire;

	@Column(name="tx_mail")
	private String txMail;

	@Column(name="tx_nomb")
	private String txNomb;

	@Column(name="tx_num_docu")
	private String txNumDocu;

	@Column(name="tx_term_crea")
	private String txTermCrea;

	@Column(name="tx_term_modi")
	private String txTermModi;

	//bi-directional many-to-one association to Constante
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_tipo_pers", referencedColumnName="id_cons", nullable=false, insertable = false, updatable = false)
	private Constante tipoPersona;

	//bi-directional many-to-one association to Constante
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_tipo_docu", referencedColumnName="id_cons", nullable=false, insertable = false, updatable = false)
	private Constante tipoDocumento;

	//bi-directional many-to-one association to Constante
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_estd_civl", referencedColumnName="id_cons", nullable=false, insertable = false, updatable = false)
	private Constante estadoCivil;

	//bi-directional many-to-one association to Ubigeo
    @ManyToOne
	@JoinColumns({
		@JoinColumn(name="id_dist", referencedColumnName="id_dist"),
		@JoinColumn(name="id_dpto", referencedColumnName="id_dpto"),
		@JoinColumn(name="id_prov", referencedColumnName="id_prov")
		})
	private Ubigeo ubigeo;

    public Persona() {
    }

	public Long getIdPers() {
		return this.idPers;
	}

	public void setIdPers(Long idPers) {
		this.idPers = idPers;
	}

	public Timestamp getFeNaci() {
		return this.feNaci;
	}

	public void setFeNaci(Timestamp feNaci) {
		this.feNaci = feNaci;
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

	public String getInSexo() {
		return this.inSexo;
	}

	public void setInSexo(String inSexo) {
		this.inSexo = inSexo;
	}

	public String getTxApeMtno() {
		return this.txApeMtno;
	}

	public void setTxApeMtno(String txApeMtno) {
		this.txApeMtno = txApeMtno;
	}

	public String getTxApePtno() {
		return this.txApePtno;
	}

	public void setTxApePtno(String txApePtno) {
		this.txApePtno = txApePtno;
	}

	public String getTxDire() {
		return this.txDire;
	}

	public void setTxDire(String txDire) {
		this.txDire = txDire;
	}

	public String getTxMail() {
		return this.txMail;
	}

	public void setTxMail(String txMail) {
		this.txMail = txMail;
	}

	public String getTxNomb() {
		return this.txNomb;
	}

	public void setTxNomb(String txNomb) {
		this.txNomb = txNomb;
	}

	public String getTxNumDocu() {
		return this.txNumDocu;
	}

	public void setTxNumDocu(String txNumDocu) {
		this.txNumDocu = txNumDocu;
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

	public Constante getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(Constante tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	public Constante getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(Constante tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public Constante getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(Constante estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Ubigeo getUbigeo() {
		return ubigeo;
	}

	public void setUbigeo(Ubigeo ubigeo) {
		this.ubigeo = ubigeo;
	}

	
	
}