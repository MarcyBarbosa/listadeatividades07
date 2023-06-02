import java.util.Scanner;
import java.util.Arrays;

public class ValidacaoCpf {
    public static void main(String []args) {

        Scanner scanner = new Scanner(System.in);
        SistemaValidarCpf sistemaValidarCpf = new SistemaValidarCpf();

        System.out.println("\nBem-vindo(a) ao validador de CPF!");

        System.out.print("Digite seu CPF conforme o exemplo (xxx.xxx.xxx-xx):");
        sistemaValidarCpf.setCpf(scanner.next());
        

        sistemaValidarCpf.validadorDeCpf();

        scanner.close();
        
    }

    }


