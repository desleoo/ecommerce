package it.unirc.pwm.EntityMappingHB;
// Generated 22 mar 2022, 17:25:01 by Hibernate Tools 5.5.7.Final

/**
 * CatalogoCategoria generated by hbm2java
 */
public class CatalogoCategoria implements java.io.Serializable {

	private CatalogoCategoriaId id;
	private Catalogo catalogo;
	private Categoria categoria;

	public CatalogoCategoria() {
	}

	public CatalogoCategoria(CatalogoCategoriaId id, Catalogo catalogo, Categoria categoria) {
		this.id = id;
		this.catalogo = catalogo;
		this.categoria = categoria;
	}

	public CatalogoCategoriaId getId() {
		return this.id;
	}

	public void setId(CatalogoCategoriaId id) {
		this.id = id;
	}

	public Catalogo getCatalogo() {
		return this.catalogo;
	}

	public void setCatalogo(Catalogo catalogo) {
		this.catalogo = catalogo;
	}

	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
