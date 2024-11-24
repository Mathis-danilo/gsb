package gsb.modele.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import gsb.modele.Medicament;

public class VisiteurDao {

	public static boolean RechercheMatriculeVisiteur(String codevisiteur){
		
		boolean fTrouve = false;
		
	    ResultSet reqSelection = ConnexionMySql.execReqSelection(
	        "SELECT MATRICULE FROM VISITEUR where MATRICULE= '"+codevisiteur+"'"
	    );

	    try {
	        if (reqSelection.next()) {
	        	fTrouve = true;
	        	// matricule trouvé
	        	//getLastNumVisite = reqSelection.getString("dernierNumVisite");
	        }
	    } catch (SQLException e) {
	    	// matricule non trouve
	    	fTrouve = false;
	        //e.printStackTrace();
	        //System.out.println("Erreur dans lastNumVisite()");
	        //getLastNumVisite = null;
	    }
	    return fTrouve;
	}
	
	
}
