public class Telefone {
  private String numeroTelefone;

  public void setNumero(String novoNumeroTelefone) {
    numeroTelefone = novoNumeroTelefone.replaceAll("-", "");
  }

  public String getNumero() {
    if (numeroTelefone.length() == 9) {
      if (!numeroTelefone.startsWith("9")) {
        String numeroCorrigido = "9" + numeroTelefone;
        System.out.println("Telefone possui 9 dígitos.");
        System.out.println("Vou acrescentar o dígito nove na frente, se necessário.");
        System.out.println("Telefone corrigido com formatação: " + formatarNumero(numeroCorrigido));
        System.out.println("Telefone corrigido sem formatação: " + numeroTelefone);
        return formatarNumero(numeroCorrigido);
      }
      String numeroCorrigido = numeroTelefone;
      System.out.println("Número de telefone correto: " + formatarNumero(numeroCorrigido));
      System.out.println("Telefone corrigido sem formatação: " + numeroTelefone);

      return formatarNumero(numeroCorrigido);
    }
    else if (numeroTelefone.length() == 8) {
      String numeroCorrigido = "9" + numeroTelefone;
      System.out.println("Telefone possui 8 dígitos.");
      System.out.println("Vou acrescentar o dígito nove na frente, se necessário.");
      System.out.println("Telefone corrigido com formatação: " + formatarNumero(numeroCorrigido));
      System.out.println("Telefone corrigido sem formatação: " + numeroTelefone);

      return formatarNumero(numeroCorrigido);
    }

    System.out.println("Número de telefone inválido.");
    return "";
  }

  private String formatarNumero(String numero) {
    if (numero.length() == 9) {
      return numero.substring(0, 5) + "-" + numero.substring(5);
    } else if (numero.length() == 8) {
      return numero.substring(0, 4) + "-" + numero.substring(4);
    }
    return numero;
  }
}
