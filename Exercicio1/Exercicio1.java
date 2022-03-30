package Exercicio1;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int n;
        n=teclado.nextInt();
        int v;
        for(int i=0;i<n;i++){
            v=teclado.nextInt();
            if(v<0){
                System.out.println("Eh negativo");
            }
            else{
                System.out.println("Eh posiivo");
            }
        }
    }
    
}