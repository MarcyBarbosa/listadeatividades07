import java.util.Scanner;
public class NomeContrarioMaiusculas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaReverterNome sistemaReverterNome = new SistemaReverterNome();

        System.out.println("\n\t #### Nome ao contrário em Maiúsculas ####");

        System.out.println("Digite um nome: ");
        sistemaReverterNome.setNome(scanner.nextLine());

        System.out.print("" + sistemaReverterNome.getReversor());

        scanner.close();
    }
}
