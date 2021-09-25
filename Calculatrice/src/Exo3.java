import java.util.Scanner;

public class Exo3 {

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int tab[] = new int[5];
        int somme = 0,max =0,min = 0;
        float moy;
        for(int i=0 ; i<5 ; i++) {
            System.out.print("Veuillez saisir l'element "+ i +" :");
            tab[i] = sc.nextInt();
            somme = tab[i] + somme;
            if(i==0) {
                min = tab[i];
                max = tab[i];
            }
            else {
                if (tab[i] < min )
                    min = tab[i];
                 else if (tab[i] > max)
                    max = tab[i];
            }
        }
        System.out.println("Le max est: "+max);
        System.out.println("le min est: "+min);
        System.out.println("La somme est : "+somme);
        System.out.println(("La moyenne est : "+ somme/5));
    }
}
