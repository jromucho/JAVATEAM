package pe.gob.minjus.librec.dto;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Set;


public class UbigeoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String idDpto;
	private String idProv;
	private String idDist;
	private String txNombUbig;
	private String inEstd;

	private Timestamp feUsuaCrea;
	private Timestamp feUsuaModi;

	private String idUsuaCrea;
	private String idUsuaModi;	
	private String txTermCrea;
	private String txTermModi;

	
    public UbigeoDTO() {
    }


	public String getIdDpto() {
		return idDpto;
	}


	public void setIdDpto(String idDpto) {
		this.idDpto = idDpto;
	}


	public String getIdProv() {
		return idProv;
	}


	public void setIdProv(String idProv) {
		this.idProv = idProv;
	}


	public String getIdDist() {
		return idDist;
	}


	public void setIdDist(String idDist) {
		this.idDist = idDist;
	}


	public String getTxNombUbig() {
		return txNombUbig;
	}


	public void setTxNombUbig(String txNombUbig) {
		this.txNombUbig = txNombUbig;
	}


	public String getInEstd() {
		return inEstd;
	}


	public void setInEstd(String inEstd) {
		this.inEstd = inEstd;
	}


	public Timestamp getFeUsuaCrea() {
		return feUsuaCrea;
	}


	public void setFeUsuaCrea(Timestamp feUsuaCrea) {
		this.feUsuaCrea = feUsuaCrea;
	}


	public Timestamp getFeUsuaModi() {
		return feUsuaModi;
	}


	public void setFeUsuaModi(Timestamp feUsuaModi) {
		this.feUsuaModi = feUsuaModi;
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

	
	
}