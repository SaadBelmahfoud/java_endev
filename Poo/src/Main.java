import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){

        Personne p1 = new Personne("test","test2",15);
        Personne p2 = new Personne("test1","pre2",15);
        Personne p3 = new Personne("test2","test2",15);
        Personne p4 = new Personne("test3","test2",15);
        Personne p5 = new Personne("test4","test2",15);


        Etudiant et1 = new Etudiant("test","test2",14,15);
/*
        ArrayList<Personne> arrayPers = new ArrayList<>();
        arrayPers.add(p1);

        for (int i=0; i<5; i++){
            Personne pTest = new Personne("Nom"+i,"Prenom"+i,18+i);
            arrayPers.add(pTest);
        }

        for(Personne p : arrayPers){
            System.out.println(p.getNom());
        }

       TreeSet<String> al=new TreeSet<String>();
        al.add("test");
        al.add("test1");
        al.add("test");
        al.add("test");

        TreeSet<Integer> al2=new TreeSet<Integer>();
        al2.add(1);
        al2.add(2);
        al2.add(1);
        al2.add(5);

        for(Integer tes : al2) {
            System.out.println("value: "+ tes);
        }

        HashMap<Integer,Personne> mapPers = new HashMap<Integer, Personne>();
        mapPers.put(1,p1);
        mapPers.put(2,p2);

        for(int i=1; i<=mapPers.size(); i++){
            System.out.println( mapPers.get(i));
        } */

        System.out.println("Count: " + Personne.getCount());

    }
}
