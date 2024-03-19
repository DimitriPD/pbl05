public class Pessoa {

    private String nome;
    private TipoPessoa tipoPessoa;

    public Pessoa() {
    }

    public Pessoa(String _nome, TipoPessoa _tipoPessoa, String _cpf) {
        this.nome = _nome;
        this.tipoPessoa = _tipoPessoa;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String _nome) {
        this.nome = _nome;
    }

    public TipoPessoa getTipoPessoa() {
        return this.tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa _tipoPessoa) {
        this.tipoPessoa = _tipoPessoa;
    }
}
