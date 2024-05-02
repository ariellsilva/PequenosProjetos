public class MinhaClasse {
    public static void main(String[]args){
        String primeiroAnimal = "Gato";
        String segundoAnimal = "Cachorro";

        String animais = animais(primeiroAnimal, segundoAnimal);
        System.out.printf("Os animais fornecidos foram: " + animais);

    }
    public static String animais(String primeiroAnimal, String segundoAnimal){
        return primeiroAnimal.concat(" ").concat(segundoAnimal);
    }

}
