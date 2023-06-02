

public class SistemaValidarCpf {
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void validadorDeCpf() {
        
    if (cpf.length() == 14) {
    
        if (cpf.charAt(3) == '.' && cpf.charAt(7) == '.' && cpf.charAt(11) == '-') {
        System.out.println("\nCPF válido");}
        
        else {
        System.out.println("CPF inválido.");}

        }
    }
}