package it.unirc.pwm.EntityMappingHB;
// Generated 22 mar 2022, 17:25:01 by Hibernate Tools 5.5.7.Final

/**
 * CatalogoCategoriaId generated by hbm2java
 */
public class CatalogoCategoriaId implements java.io.Serializable {

	private int catalogo;
	private int categoria;

	public CatalogoCategoriaId() {
	}

	public CatalogoCategoriaId(int catalogo, int categoria) {
		this.catalogo = catalogo;
		this.categoria = categoria;
	}

	public int getCatalogo() {
		return this.catalogo;
	}

	public void setCatalogo(int catalogo) {
		this.catalogo = catalogo;
	}

	public int getCategoria() {
		return this.categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CatalogoCategoriaId))
			return false;
		CatalogoCategoriaId castOther = (CatalogoCategoriaId) other;

		return (this.getCatalogo() == castOther.getCatalogo()) && (this.getCategoria() == castOther.getCategoria());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCatalogo();
		result = 37 * result + this.getCategoria();
		return result;
	}

}
