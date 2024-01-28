package metier;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="PRODUIT")
public class Produit implements Serializable {
	@Id 
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_PRODUIT")
	private Long idProduit;
	@Column(name="NOM_PRODUIT")
	private String nomProduit;
	private double prix;
	private String taille;
	public Long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getTaille() {
		return taille;
	}
	public void setTaille(String taille) {
		this.taille = taille;
	}
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produit(String nomProduit, double prix, String taille) {
		super();
		this.nomProduit = nomProduit;
		this.prix = prix;
		this.taille = taille;
	}
	public Produit(Long idProduit, String nomProduit, double prix, String taille) {
		super();
		this.idProduit = idProduit;
		this.nomProduit = nomProduit;
		this.prix = prix;
		this.taille = taille;
	}
	
}
	


