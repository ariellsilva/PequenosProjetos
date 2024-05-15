import java.util.Scanner;

public class Lampadas {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        boolean Eu1 = false;
        boolean Eu2 = false;

        int n;

        System.out.println("Digite 1 ou 2 pata ligar uma das lâmpadas");

        System.out.println("Lâmpada: ");
        n = scan.nextInt();

        if (n == 1) {
            System.out.println("Lâmpada EU1 ligada: 1");
            System.out.println("Lâmpada EU2 desligada: 0");
        }else if(n == 2){
                System.out.println("Lâmpada EU2 ligada: 1");
                System.out.println("Lâmpada EU1 desligada: 0");
        }else if(n >2){
            System.out.println("Apenas 1 ou 2");
            
        }else{
            System.out.println("Número nulo não é aceito");
}
scan.close();
    
}
}
