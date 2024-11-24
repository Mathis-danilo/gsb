/*
 * Crééé le 17 nov. 2021
 *
 * TODO Pour changer le modele de ce fichier genere allez :
 * Fenetre - Preferences - Java - Style de code - Modeles de code
 */
package gsb.service;

import gsb.modele.Medicament;
import gsb.modele.dao.MedicamentDao;

/**
 * @author Isabelle
 * 17 nov. 2021
 * TODO Pour changer le modeele de ce commentaire de type genere, allez :
 * Fenetre - Preferences - Java - Style de code - Modeles de code
 */
public class MedicamentService {
	
	public static Medicament rechercherMedicament(String unCodeMedicament){
		Medicament unMedicament = null;
		try{
		if (unCodeMedicament==null) {
            throw new Exception("Donnee obligatoire : code");
        }
		unMedicament = MedicamentDao.rechercher(unCodeMedicament);
		}
		catch(Exception e){
			System.out.println( e.getMessage());
		}
		return unMedicament;
	}
	
}

