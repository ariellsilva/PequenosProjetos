import java.util.Scanner;

public class BoletimEscolar {
    public static void main(String[] args) {
        
        Scanner digite = new Scanner(System.in);

        int nota;
        System.out.println("Digite a sua nota: ");
        nota = digite.nextInt();

    if(nota >= 6){
        System.out.println("APROVADO");
    }else if(nota == 5){
        System.out.println("RECUPERAÇÃO");
    }else
        System.out.println("REPROVADO");

 }
}
