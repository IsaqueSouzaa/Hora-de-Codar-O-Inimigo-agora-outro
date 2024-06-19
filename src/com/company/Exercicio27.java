import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Exercicio27{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[12];

        // Ler 12 elementos do usuário
        System.out.println("Informe 12 elementos (letras ou números):");
        for (int i = 0; i < 12; i++) {
            array[i] = scanner.next();
        }

        // Primeira saída: Inverter a posição dos elementos
        System.out.println("Saída 1: ");
        for (int i = 11; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Separar números e letras
        List<String> numeros = new ArrayList<>();
        List<String> letras = new ArrayList<>();
        for (String elemento : array) {
            if (Character.isDigit(elemento.charAt(0))) {
                numeros.add(elemento);
            } else {
                letras.add(elemento);
            }
        }

        // Segunda saída: Inverter a posição dos elementos por tipo
        System.out.println("Saída 2: ");
        for (int i = numeros.size() - 1; i >= 0; i--) {
            System.out.print(numeros.get(i));
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.print(" - ");
        for (int i = letras.size() - 1; i >= 0; i--) {
            System.out.print(letras.get(i));
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        scanner.close();
    }
}