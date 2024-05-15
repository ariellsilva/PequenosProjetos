import java.util.Scanner;

public class ParOrImpa{
    public static void main(String[] args) throws InterruptedException{
        
        Scanner scan = new Scanner(System.in);
        int impa;
        int par;
        int total;

        System.out.println("Joâo e Chico estão jogando");
        Thread.sleep(1000);

        System.out.println("------------");

        System.out.println("Carregando");
        Thread.sleep(1000);
        System.out.println("-----------");



        System.out.println("Selecione números impares para João e pares para Chico");
        System.out.println("João: ");
        impa = scan.nextInt();

        System.out.println("Chico: ");
        par = scan.nextInt();

        total = impa  + par;

        if (total %2 ==0) {
            System.out.println("Deu PAR! Chico ganhou");

            
        }else{
            System.out.println("Deu IMPAR! João ganhou");

        }
    }
}