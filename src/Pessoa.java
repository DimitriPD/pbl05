public class Pessoa {
    private String nome;
    private String tipoPessoa;
    private String cpf;

    public Pessoa(String _nome, String _tipoPessoa, String _cpf) {
        this.nome = _nome;
        this.tipoPessoa = _tipoPessoa;
        this.cpf = _cpf;
    }

    public String getNome() {
        return this.nome;
    }
    public String setNome (String _nome){
        this.nome = _nome;
        return this.nome;
    }
    public String getTipoPessoa (){
        return this.tipoPessoa;
    }

    public String setTipoPessoa(String _tipoPessoa){
        this.tipoPessoa=_tipoPessoa;
        return this.tipoPessoa;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String setCpf(String _Cpf){
        this.cpf = _Cpf;
        return this.cpf;
    }
}
