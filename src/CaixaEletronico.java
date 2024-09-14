public class CaixaEletronico {
  public static void main(String[] args) {
    // caixa elertonico
    /*
     * double saldo = 25.0;
     * double valorSolicitado = 17.0;
     * 
     * if (valorSolicitado < saldo) // tem casos que o if é tão simples que nem
     * preisa de chaves
     * saldo = saldo - valorSolicitado;
     * System.out.println(saldo);
     */
    // aula 35

    double saldo = 25.0;
    double valorSolicitado = 29.0;

    if (valorSolicitado < saldo) {
      saldo = saldo - valorSolicitado;
      System.out.println("novo saldo " + saldo);
    } else
      System.out.println("saldo insuficiente");

  }
}
