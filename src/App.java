import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um número:");
        float numeral = entrada.nextFloat();

        System.out.print("O número informado foi:" + numeral);

    }
}