package esercizio_2;
import java.util.Scanner;
public class numeriPercentuale {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n;
        int numero;
        float percentualep = 0;
        float percentualen = 0;
        do{
            System.out.println("Quanti numeri vuoi inserire? ");
            n = input.nextInt();
            if(n<=0){
                System.out.println("ERRORE inserire una quantita > 0");
            }
        }while(n <= 0);
        for(int x = 1; x<=n; x++){
            System.out.println("Inserire  numero: ");
            numero = input.nextInt();
            if(numero >= 0){
                percentualep += 1;
            }else{
                percentualen += 1;
            }
        }
        percentualep = (float) (percentualep * 100) / n;
        percentualen = (float) (percentualen * 100) / n;
        System.out.println("La percentuale dei numeri positivi e' : %" + percentualep);
        System.out.println("La percentuale dei numeri negativi e' : %" + percentualen);
    }
}
