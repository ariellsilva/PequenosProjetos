import java.util.Scanner;

public class PositivoOrNegativo{
    public static void main(String[] args) {
        
        int numeros;

        System.out.println("Informe números váriaveis, senod negativo, positivo ou nulo");

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número");
        numeros = scan.nextInt();

        if(numeros <0){
            System.out.println(numeros + " é um número negativo");

        }else if(numeros >0){
            System.out.println(numeros + " é um número positivo");

        }else{
            System.out.println(numeros + " é nulo");
        }
    }
}