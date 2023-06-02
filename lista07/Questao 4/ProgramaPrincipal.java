import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        GerarNumeros gerarNumeros = new GerarNumeros();
        
        System.out.print("Escolha um número entre 1 e 99: ");
            gerarNumeros.setNumeroEscolhido(scanner.nextInt());

            System.out.println(gerarNumeros.getNumeroEscolhido());
        
        scanner.close();
    }
}
