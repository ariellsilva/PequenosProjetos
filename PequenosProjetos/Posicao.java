import java.util.Scanner;

public class Posicao {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int minhaPosicao;

        System.out.println("Digite a sua posição na corrida: ");
        minhaPosicao = teclado.nextInt();

        switch (minhaPosicao) {
            case 1:
            System.out.println("Medalha de ouro");
            break;

            case 2:
            System.out.println("Medalha de prata");
            break;

            case 3:
            System.out.println("Medalha de bonze");
            break;
        
            default:
            System.out.println("Infelizmente você não vai receber uma medalha");
                break;
        }
    }

}
