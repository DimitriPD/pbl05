public enum TipoPessoa {
  CLIENTE(1),
  FUNCIONARIO(2),
  GERENTE(3);

  private final int valor;

  TipoPessoa(int valor) {
    this.valor = valor;
  }

  public int getValor() {
    return valor;
  }

  public static TipoPessoa valueOf(int valor) {
    for (TipoPessoa tipo : values()) {
      if (tipo.getValor() == valor) {
        return tipo;
      }
    }
    throw new IllegalArgumentException("Tipo de pessoa inválido.");
  }
}