import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class Main {
    public static void main(String[] args) {
        AffectationHashMap affectationMap = new AffectationHashMap();

        Employe emp1 = new Employe(1, "rayan");
        Employe emp2 = new Employe(2, "irad");
        Departement dept1 = new Departement(101, "Informatique", 20);
        Departement dept2 = new Departement(102, "Ressources Humaines", 15);

        affectationMap.ajouterEmployeDepartement(emp1, dept1);
        affectationMap.ajouterEmployeDepartement(emp2, dept2);


        System.out.println("Liste des employés et départements affectés :");
        affectationMap.afficherEmployesEtDepartements();


        affectationMap.supprimerEmploye(emp1);

        System.out.println("Liste après suppression d'employé :");
        affectationMap.afficherEmployesEtDepartements();


        System.out.println("Employés triés par identifiant :");
        TreeMap<Employe, Departement> sortedMap = affectationMap.trierMap();
        for (Map.Entry<Employe, Departement> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " est affecté au département " + entry.getValue());
        }
    }
}
