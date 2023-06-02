import java.util.Scanner;
public class TamanhoStrings {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        ComparadorString comparadorString = new ComparadorString();

        System.out.println("\n\t #### Comparados de duas Strings ####");

        System.out.println("Digtite a 1° string:");
        comparadorString.setString1(scanner.nextLine());        
        System.out.println("\nDigtite a 2° string:");
        comparadorString.setString2(scanner.nextLine());

        System.out.printf("O tamanho de '%s': %d caracteres", comparadorString.getString1(), comparadorString.getString1().length());
        System.out.printf("\nO tamanho de '%s': %d caracteres", comparadorString.getString2(), comparadorString.getString2().length());

        if(comparadorString.getString1().length()== comparadorString.getString2().length()){
            System.out.println("\nAs duas strings são de tamanhos iguais.");            
        } else {
            System.out.println("\nAs duas strings são de tamanhos diferentes.");
        }
        
        if (comparadorString.getString1().equals(comparadorString.getString2())){
            System.out.println("As duas strings possuem o mesmo conteúdo.");
        } else {
            System.out.println("As duas strings possuem conteúdo diferente.");
        }
        scanner.close();
    }    
}