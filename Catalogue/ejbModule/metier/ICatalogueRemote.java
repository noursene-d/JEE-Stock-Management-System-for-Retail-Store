package metier;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface ICatalogueRemote {
	public void addProduit(Produit p);
	public List<Produit> getAlleproduits();
	public List<Produit> getProduitsMC(String mc);
	public Produit getProduit(Long idP);
	public void removeProduit(Produit p);
	public void updateProduit(Produit p);
}
