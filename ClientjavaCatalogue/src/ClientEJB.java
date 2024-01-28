import java.util.List;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import metier.ICatalogueRemote;
import metier.Produit;

public class ClientEJB {

	public static void main(String[] args) {
		try {
			Properties p= new Properties();
			p.put(Context.URL_PKG_PREFIXES,"org.jboss.ejb.client.naming");
			InitialContext ctx = new InitialContext(p);
			ICatalogueRemote stub=(ICatalogueRemote) ctx.lookup("ejb:/Catalogue/CAT!metier.ICatalogueRemote?stateful");
			//stub.addProduit(new Produit("HP",8000));
			//stub.addProduit(new Produit("HP 560",7000));
			//stub.addProduit(new Produit("ASUS",3000));
			stub.removeProduit((long) 11);
			List<Produit> prods=stub.getProduitsMC("H");
			for(Produit pr:prods) {
				System.out.println(pr.getNomProduit());
			}
		}catch (NamingException e) {
			e.printStackTrace();
		}

	}
}

