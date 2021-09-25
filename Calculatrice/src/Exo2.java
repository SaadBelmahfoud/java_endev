import java.util.Scanner;

public class Exo2 {

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int nb;
        do {
            System.out.println("Donner un nombre positif : ");
            nb = sc.nextInt();
            if (nb < 0)
                System.out.println("Veuillez saisr un nombre positif");
            else if(nb >0){
                double res = Math.sqrt(nb);
                System.out.println(res);
            }
        }while(nb != 0);
    }
}
