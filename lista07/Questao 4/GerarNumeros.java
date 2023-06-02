public class GerarNumeros {
    private int numeroEscolhido;

    public void setNumeroEscolhido(int novoNumeroEscolhido) {
        numeroEscolhido = novoNumeroEscolhido;
    }
    public int getNumeroEscolhido() {
        if (numeroEscolhido < 0 || numeroEscolhido > 99) {
            System.out.println("Número inválido.");
            System.exit(numeroEscolhido);
        } 
        else {
            String[] numeroAteDezenove = {
                "zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze", "catorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove" 
            };
            String[] dezenas = {
                "", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"
            };

            if (numeroEscolhido <= 19) {
                System.out.println(numeroAteDezenove[numeroEscolhido]);
            } 
            else {
                int unidade = numeroEscolhido % 10;
                int dezena = numeroEscolhido / 10;
                if (unidade == 0) {
                    System.out.println(dezenas[dezena]);
                } else {
                    System.out.println(dezenas[dezena] + " e " + numeroAteDezenove[unidade]);
                }
            }
        }
        return numeroEscolhido;
    }
}
