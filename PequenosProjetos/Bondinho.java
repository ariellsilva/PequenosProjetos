import java.util.Scanner;

public class Bondinho {
    public static void main(String[] args) throws InterruptedException{

        int bondinho;
        int alunos;
        int professores;

        String [] estacao = new String[5];

        estacao [0] = "Largo do Guimarães";
        estacao [1] = "Pão de Açúcar";
        estacao [2] = "Serra do Mar";
        estacao [3] = "Baía de Guanabara";
        estacao [4] = "Corcovado"; 

        Scanner scan = new Scanner(System.in);

        System.out.println("Olá, bem-vindos a estação Paulita");
        System.out.println("---------------------------------");

        Thread.sleep(1000);

        System.out.println("Digite abaixo o número da estação de 1 a 5 desejada");

        for(int i=0; i<estacao.length;i++){
            System.out.println("Estacao "+i+":"+estacao[i]);

        }

        System.out.println("Digite a estação:");
        bondinho = scan.nextInt(); 

        Thread.sleep(1000);
        System.out.println("------------------------------------");

        System.out.println("Certo!");

        System.out.println("Agota digite a quantidade de alunos");
        alunos = scan.nextInt();

        System.out.println("Digite a quantidade de professores: ");
        professores = scan.nextInt();

        System.out.println("------------------------------------");

        if(alunos >=50 && professores >=50 ){
            System.out.println("Número máximo de peso ultrapassado, escolha mais um vagão");

        }else if(alunos<=25 && professores <=25){
            System.out.println("Embarque aceito!");

        }else if(alunos <=50 || professores <=50){
            System.out.println("Embarque autorizado!");

        }else if(alunos>=50){
            System.out.println("Embarque não autorizado");
        }else if(professores>=50){
            System.out.println("Embarque não autorizado");
        }
    }
}
