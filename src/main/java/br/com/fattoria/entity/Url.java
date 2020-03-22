package br.com.fattoria.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Entity
@Table (name="url")
public class Url implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idurl;
	@Column(length=200)
	@NotNull(message = "O campo não pode ser nulo")
	@NotEmpty(message = "O campo não pode ser vazio")
	@NotBlank
	private String url;
	@Column(length=200)
	@NotBlank
	@NotNull(message = "O campo não pode ser nulo")
	@NotEmpty(message = "O campo não pode ser vazio")
	private String urlencurtada;
	
	@Override
	public String toString() {
		return "Url [idurl=" + idurl + ", url=" + url + ", urlencurtada=" + urlencurtada + "]";
	}

	public Url(Long idurl,
			@NotNull(message = "O campo não pode ser nulo") @NotEmpty(message = "O campo não pode ser vazio") @NotBlank String url,
			@NotBlank @NotNull(message = "O campo não pode ser nulo") @NotEmpty(message = "O campo não pode ser vazio") String urlencurtada) {
		super();
		this.idurl = idurl;
		this.url = url;
		this.urlencurtada = urlencurtada;
	}

	public Url(Long idurl,
			@NotNull(message = "O campo não pode ser nulo") @NotEmpty(message = "O campo não pode ser vazio") @NotBlank String url) {
		super();
		this.idurl = idurl;
		this.url = url;
	}

	public Url() {
	}
	
	public Long getIdurl() {
		return idurl;
	}
	public void setIdurl(Long idurl) {
		this.idurl = idurl;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrlencurtada() {
		return urlencurtada;
	}
	public void setUrlencurtada(String urlencurtada) {
		this.urlencurtada = urlencurtada;
	}	
	
}
