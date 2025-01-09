package esercizio_1;
import java.util.Scanner;

public class mediaAltezza {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double media = 0;
        int numero;
        int na = 0;
        double altezza = 0;
        do{
            System.out.print("Quanti atleti ci sono? ");
            numero = input.nextInt();
            if(numero <= 0){
                System.out.println("ATTENZIONE : inserire almeno 1 o piu atleti");
            }
        }while(numero <= 0);
        for(int x=1; x<=numero;x++){
            System.out.println("Inserire altezza atleta "+ x);
            altezza = input.nextDouble();
            if(altezza < 1.75){
                na= na + 1;
            }
            media = (media + altezza);
        }
        media = media/numero;
        System.out.println("La media delle altezze di tutti gli atleti e' di : " + media);
        System.out.println("Gli atleti con l'altezza più bassa di 1,70 sono : " + na);
    }
}
