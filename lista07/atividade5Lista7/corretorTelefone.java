import java.util.Scanner;

public class corretorTelefone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Telefone telefone = new Telefone();

        System.out.println("Corretor de numeros de telefone");
        System.out.println("digite seu numero de telefone");

        telefone.setNumero(scanner.nextLine());
        telefone.getNumero();

        scanner.close();

    }
}


