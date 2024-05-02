import java.util.Scanner;

public class Calculando {

            public static void main(String[] args) {
                Scanner numero = new Scanner(System.in);
        
                int numero1;
                int numero2;
                String operacao;
        
                System.out.println("Digite o primeiro número: ");
                numero1 = numero.nextInt();
                System.out.println("Digite um segundo número: ");
                numero2 = numero.nextInt();
        
                numero.nextLine();
        
                System.out.println("Digite o símbolo da operação desejada: ");
                operacao = numero.nextLine();
        
                if (operacao.equals("+")) {
                    int mais = (numero1 + numero2);
                    System.out.println(mais);
        
                } else if (operacao.equals("-")) {
                    int menos = (numero1 - numero2);
                    System.out.println(menos);
        
                } else if (operacao.equals("*")) {
                    int multiplicando = (numero1 * numero2);
                    System.out.println(multiplicando);
        
                } else if (operacao.equals("/")) {
                    // Verificar se o divisor é zero
                    if (numero2 != 0) {
                        int dividir = (numero1 / numero2);
                        System.out.println(dividir);
                    } else {
                        System.out.println("Não é possível dividir por zero");
                    }
                } else
                    System.out.println("Operação não encontrada");
        
            }
        
        }
        