import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        Personne p1 = new Personne("test","test2",15);
        Personne p2 = new Personne("test1","pre2",15);
        Personne p3 = new Personne("test2","test2",15);
        Personne p4 = new Personne("test3","test2",15);
        Personne p5 = new Personne("test4","test2",15);


        Etudiant et1 = new Etudiant("test","test2",14,15);

        ArrayList<Personne> arrayPers = new ArrayList<>();
        arrayPers.add(p1);

        for (int i=0; i<5; i++){
            Personne pTest = new Personne("Nom"+i,"Prenom"+i,18+i);
            arrayPers.add(pTest);
        }

        for(Personne p : arrayPers){
            System.out.println(p.getNom());
        }

    }
}
