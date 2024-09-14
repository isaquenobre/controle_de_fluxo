public class ResultadoEscolar {
  public static void main(String[] args) {
    int nota = 8;
    // aula 35
    /*
     * if (nota >= 7)
     * System.out.println("Aprovado");
     * else
     * System.out.println("Reprovado");
     */

    // aula 36
    if (nota >= 7)
      System.out.println("Aprovado");

    else if (nota > 5 && nota < 7)
      System.out.println("Prova de Recuperação");

    else
      System.out.println("Reprovado");

  }
}
