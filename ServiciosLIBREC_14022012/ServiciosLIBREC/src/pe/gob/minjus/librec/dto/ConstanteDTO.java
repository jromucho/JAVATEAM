package pe.gob.minjus.librec.dto;

import java.io.Serializable;

import java.util.Date;



public class ConstanteDTO implements Serializable {
	private static final long serialVersionUID = 1L;


	private Long idCons;
	private String txDesc;
	
	private Date feUsuaCrea;


	private Date feUsuaModi;

	private Long idConsPadr;
	private String txDescPadr;

	private String idUsuaCrea;


	private String idUsuaModi;


	private String inEstd;




	
	private String txTermCrea;

	
	private String txTermModi;

	
	private String txVal1;

	
	private String txVal2;

	
	private String txVal3;

	
    public ConstanteDTO() {
    }


	public Long getIdCons() {
		return idCons;
	}


	public void setIdCons(Long idCons) {
		this.idCons = idCons;
	}


	public String getTxDesc() {
		return txDesc;
	}


	public void setTxDesc(String txDesc) {
		this.txDesc = txDesc;
	}


	public Date getFeUsuaCrea() {
		return feUsuaCrea;
	}


	public void setFeUsuaCrea(Date feUsuaCrea) {
		this.feUsuaCrea = feUsuaCrea;
	}


	public Date getFeUsuaModi() {
		return feUsuaModi;
	}


	public void setFeUsuaModi(Date feUsuaModi) {
		this.feUsuaModi = feUsuaModi;
	}


	public Long getIdConsPadr() {
		return idConsPadr;
	}


	public void setIdConsPadr(Long idConsPadr) {
		this.idConsPadr = idConsPadr;
	}


	

	public String getTxDescPadr() {
		return txDescPadr;
	}


	public void setTxDescPadr(String txDescPadr) {
		this.txDescPadr = txDescPadr;
	}


	public String getIdUsuaCrea() {
		return idUsuaCrea;
	}


	public void setIdUsuaCrea(String idUsuaCrea) {
		this.idUsuaCrea = idUsuaCrea;
	}


	public String getIdUsuaModi() {
		return idUsuaModi;
	}


	public void setIdUsuaModi(String idUsuaModi) {
		this.idUsuaModi = idUsuaModi;
	}


	public String getInEstd() {
		return inEstd;
	}


	public void setInEstd(String inEstd) {
		this.inEstd = inEstd;
	}


	public String getTxTermCrea() {
		return txTermCrea;
	}


	public void setTxTermCrea(String txTermCrea) {
		this.txTermCrea = txTermCrea;
	}


	public String getTxTermModi() {
		return txTermModi;
	}


	public void setTxTermModi(String txTermModi) {
		this.txTermModi = txTermModi;
	}


	public String getTxVal1() {
		return txVal1;
	}


	public void setTxVal1(String txVal1) {
		this.txVal1 = txVal1;
	}


	public String getTxVal2() {
		return txVal2;
	}


	public void setTxVal2(String txVal2) {
		this.txVal2 = txVal2;
	}


	public String getTxVal3() {
		return txVal3;
	}


	public void setTxVal3(String txVal3) {
		this.txVal3 = txVal3;
	}

	

	
}