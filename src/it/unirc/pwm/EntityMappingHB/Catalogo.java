package it.unirc.pwm.EntityMappingHB;
// Generated 22 mar 2022, 17:25:01 by Hibernate Tools 5.5.7.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Catalogo generated by hbm2java
 */
public class Catalogo implements java.io.Serializable {

	private Integer idcatalogo;
	private String nomecat;
	private String descrizionecat;
	private Set catalogoCategorias = new HashSet(0);

	public Catalogo() {
	}

	public Catalogo(String nomecat, String descrizionecat) {
		this.nomecat = nomecat;
		this.descrizionecat = descrizionecat;
	}

	public Catalogo(String nomecat, String descrizionecat, Set catalogoCategorias) {
		this.nomecat = nomecat;
		this.descrizionecat = descrizionecat;
		this.catalogoCategorias = catalogoCategorias;
	}

	public Integer getIdcatalogo() {
		return this.idcatalogo;
	}

	public void setIdcatalogo(Integer idcatalogo) {
		this.idcatalogo = idcatalogo;
	}

	public String getNomecat() {
		return this.nomecat;
	}

	public void setNomecat(String nomecat) {
		this.nomecat = nomecat;
	}

	public String getDescrizionecat() {
		return this.descrizionecat;
	}

	public void setDescrizionecat(String descrizionecat) {
		this.descrizionecat = descrizionecat;
	}

	public Set getCatalogoCategorias() {
		return this.catalogoCategorias;
	}

	public void setCatalogoCategorias(Set catalogoCategorias) {
		this.catalogoCategorias = catalogoCategorias;
	}

}
