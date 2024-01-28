package service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import metier.ICatalogueLocal;
import metier.Produit;
@Stateless
@WebService
public class CatService {
	@EJB
	//public CatService() {
		// TODO Auto-generated constructor stub
	//}
	private ICatalogueLocal metier;
	@WebMethod
	public List<Produit> consulterProduit(@WebParam(name="motCle")String mc){
		return metier.getAlleproduits();
	}

}
