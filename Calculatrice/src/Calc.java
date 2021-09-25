import java.util.Scanner;

public class Calc {

    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Liste des opperations:");
        System.out.println("1: Addition");
        System.out.println("2: Multiplication");
        System.out.println("3: Soustraction");
        System.out.println("Veuillez choisir l'opperation :");
                int op = sc.nextInt();
        System.out.println("NB1: ");
                int nb1 = sc.nextInt();
        System.out.println("Nb2 : ");
                int nb2 = sc.nextInt();
        switch (op) {
            case 1 :
                System.out.println(nb1 + nb2);
                break;
            case 2 :
                System.out.println(nb1 * nb2);
                break;
            case 3 :
                System.out.println(nb1 - nb2);
                break;
            default:
                System.out.println("Erreur de Saisie.");


        }



    }
}
