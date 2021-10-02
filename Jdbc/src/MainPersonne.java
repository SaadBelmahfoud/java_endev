import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

public class MainPersonne {

    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Gestion de Personne");
        System.out.println("1 : Ajouter une Personne");
        System.out.println("2 : Visualiser toutes les personnes");
        System.out.println("3 : Visualiser par Id");
        System.out.println("4 : Supprimer Personne");
        System.out.println("Veuillez selectionner votre choix : ");

        int op = sc.nextInt();
        int id;
        String nom;
        String prenom;
        int age;
        ArrayList<Personne> listPers;
        DbMethods db = new DbMethods();
        switch (op) {
            case 1 :
                System.out.println("Id: ");
                id = sc.nextInt();
                System.out.println("Nom: ");
                nom = sc.next();
                System.out.println("Prenom: ");
                prenom = sc.next();
                System.out.println("Age: ");
                age = sc.nextInt();
                Personne p1 = new Personne(id,nom,prenom,age);

                db.createPersonne(p1);
                break;
            case 2 :
                System.out.println("Liste des personnes : ");
                listPers = db.selectAll();
                for(Personne p : listPers){
                    System.out.println(p.toString());
                }

                break;
            case 3 :
                System.out.println("Saisir Id à afficher : ");
                id = sc.nextInt();
                Personne p = db.selectById(id);
                System.out.println(p.toString());
                break;
            case 4 :
                System.out.println("Saisir Id à supprimer : ");
                id = sc.nextInt();
                db.deleteById(id);
                System.out.println("Liste des personnes apres suppression");
                listPers = db.selectAll();
                for(Personne ps : listPers){
                    System.out.println(ps.toString());
                }

                break;
            default:
                System.out.println("Erreur de Saisie.");


        }

    }
}
