package web;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.ICatalogueLocal;
import metier.Produit;
@WebServlet(name="cs",urlPatterns= {"/controleur"})
public class ControleurServlet extends HttpServlet{
	@EJB
	private ICatalogueLocal metier;
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.getRequestDispatcher("welcome.jsp").forward(request, response);
}

@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Long id = Long.parseLong(request.getParameter("id"));
		String nom = request.getParameter("nom");
		double prix = Double.parseDouble(request.getParameter("prix"));
		String taille = request.getParameter("taille");
		
		
		String action = request.getParameter("action");
		Produit p = new Produit(id,nom,prix,taille);
		if(action.equals("Add Product"))
			metier.addProduit(p);
		else if(action.equals("Remove Product"))
			metier.removeProduit(p);
		else if(action.equals("Update Product"))
			metier.updateProduit(p);
		else if(action.equals("Search Product")) 
			metier.getProduitsMC(nom);
			

		List<Produit> prod = metier.getAlleproduits();
		request.setAttribute("produits", prod);
		doGet(request,response);
		
	
}

}
