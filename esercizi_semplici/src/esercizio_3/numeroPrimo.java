package esercizio_3;
import java.util.Scanner;
public class numeroPrimo {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        int numero;
        do{
            System.out.print("Inserire numero: ");
            numero  = input.nextInt();
            if(numero <= 0){
                System.out.println("Errore inserire numero > 0");
            }
        }while(numero <= 0);
        int div = 0;
        for(int x=1; x<=numero; x++){
            if(numero  %x == 0){
                div +=1;
            }
        }
        if(div == 2){
            System.out.println(numero + " E' un numero primo");
        }else{
            System.out.println(numero + " Non e' un numero primo");
        }
    }
}
