import java.util.Arrays;

public class Ordenacao {
    public static void main(String[] args) {
        int numeros[] = new int[] {10, 50, 1, 90, 2, 7, 3, 60};
        String letras[] = new String[] {"A", "F", "J", "B", "P", "L", "T", "W"};

        Arrays.sort(numeros);
        Arrays.sort(letras);

        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(letras));
    }
}
