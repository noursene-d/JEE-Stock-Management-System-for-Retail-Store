package metier;

import java.util.List;

import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
@Stateless(name="CAT")
public class CatalogueEJBImpl implements ICatalogueRemote,ICatalogueLocal{
	@PersistenceContext(unitName="Catalogue")
	private EntityManager em;

	@Override
	public void addProduit(Produit p) {
		em.persist(p);
		
	}

	@Override
	public List<Produit> getAlleproduits() {
		Query req=em.createQuery("select p from Produit p");
		return req.getResultList();
	}

	@Override
	public List<Produit> getProduitsMC(String mc) {
		Query req=em.createQuery("select p from Produit p where p.nomProduit like :x ");
		req.setParameter("x", "%"+mc+"%");
		return req.getResultList();
	}

	@Override
	public Produit getProduit(Long idP) {
		Produit p=em.find(Produit.class, idP);
		return p;
	}

	@Override
	public void removeProduit(Produit p) {
		Produit p1=em.find(Produit.class, p.getIdProduit());
		if(p1==null) throw new RuntimeException("Product does not exist!!");
		em.remove(p1);
		
	}

	@Override
	public void updateProduit(Produit p) {
		Produit p1=em.find(Produit.class, p.getIdProduit());
		p1.setNomProduit(p.getNomProduit());
		p1.setPrix(p1.getPrix());
		p1.setTaille(p1.getTaille());
		em.persist(p1);
		
	}

}
