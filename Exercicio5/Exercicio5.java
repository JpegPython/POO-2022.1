package Exercicio5;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int N=teclado.nextInt();
        int soma=1;
        if(N>0){
            for(int i=N;i>0;i--){
                soma=soma*i;
            }
            System.out.println(soma);
        }
        else{
            soma=-1;
            System.out.println("numero negativo");
            System.out.println(soma);
        }
        
    }
}

