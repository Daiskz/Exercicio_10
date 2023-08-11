import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite a temperatura em graus celsius: ");
            double celsius = entrada.nextDouble();
            double fahrenheit = ((celsius * 1.8) + 32);
            System.out.print("A temperatura convertida em fahrenheit é: " + fahrenheit);
        }
    }
}
