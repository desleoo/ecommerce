package it.unirc.pwm.EntityMappingHB;
// Generated 22 mar 2022, 17:25:01 by Hibernate Tools 5.5.7.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Categoria generated by hbm2java
 */
public class Categoria implements java.io.Serializable {

	private Integer idcategoria;
	private String nomec;
	private String descrizionec;
	private Set prodottos = new HashSet(0);
	private Set catalogoCategorias = new HashSet(0);

	public Categoria() {
	}

	public Categoria(String nomec, String descrizionec) {
		this.nomec = nomec;
		this.descrizionec = descrizionec;
	}

	public Categoria(String nomec, String descrizionec, Set prodottos, Set catalogoCategorias) {
		this.nomec = nomec;
		this.descrizionec = descrizionec;
		this.prodottos = prodottos;
		this.catalogoCategorias = catalogoCategorias;
	}

	public Integer getIdcategoria() {
		return this.idcategoria;
	}

	public void setIdcategoria(Integer idcategoria) {
		this.idcategoria = idcategoria;
	}

	public String getNomec() {
		return this.nomec;
	}

	public void setNomec(String nomec) {
		this.nomec = nomec;
	}

	public String getDescrizionec() {
		return this.descrizionec;
	}

	public void setDescrizionec(String descrizionec) {
		this.descrizionec = descrizionec;
	}

	public Set getProdottos() {
		return this.prodottos;
	}

	public void setProdottos(Set prodottos) {
		this.prodottos = prodottos;
	}

	public Set getCatalogoCategorias() {
		return this.catalogoCategorias;
	}

	public void setCatalogoCategorias(Set catalogoCategorias) {
		this.catalogoCategorias = catalogoCategorias;
	}

}
