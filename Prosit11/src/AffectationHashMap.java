import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class AffectationHashMap {
    private Map<Employe, Departement> affectations;

    public AffectationHashMap() {
        this.affectations = new HashMap<>();
    }

    // Instruction 2 : Ajouter un employé à un département
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        if (!affectations.containsKey(e)) {
            affectations.put(e, d);
        } else {
            System.out.println("Cet employé est déjà affecté à un département.");
        }
    }

    // Instruction 3 : Afficher les employés et leurs départements affectés
    public void afficherEmployesEtDepartements() {
        for (Map.Entry<Employe, Departement> entry : affectations.entrySet()) {
            Employe employe = entry.getKey();
            Departement departement = entry.getValue();
            System.out.println(employe + " est affecté au département " + departement);
        }
    }

    // Instruction 4 : Supprimer un employé de l'affectation
    public void supprimerEmploye(Employe e) {
        affectations.remove(e);
    }

    // Instruction 5 : Supprimer un employé d'un département spécifique
    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (affectations.containsKey(e) && affectations.get(e).equals(d)) {
            affectations.remove(e);
        }
    }

 
    public void afficherEmployes() {
        for (Employe e : affectations.keySet()) {
            System.out.println(e);
        }
    }


    public void afficherDepartements() {
        for (Departement d : affectations.values()) {
            System.out.println(d);
        }
    }


    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }

    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);
    }


    public TreeMap<Employe, Departement> trierMap() {
        TreeMap<Employe, Departement> sortedMap = new TreeMap<>((emp1, emp2) -> {
            return Integer.compare(emp1.getId(), emp2.getId());
        });
        sortedMap.putAll(affectations);
        return sortedMap;
    }
}
