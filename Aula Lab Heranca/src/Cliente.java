public class Cliente extends PessoaFisica {
    private double renda;
    private String interesses;
    private String profissao;

    public Cliente(String cpf, char sexo, int estadoCivil, double renda, String interesses, String profissao) {
        super(cpf, sexo, estadoCivil);
        this.renda = renda;
        this.interesses = interesses;
        this.profissao = profissao;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public String getInteresses() {
        return interesses;
    }

    public void setInteresses(String interesses) {
        this.interesses = interesses;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return "Cliente [cpf=" + cpf + ", sexo=" + sexo + ", estadoCivil=" + estadoCivil +
                ", renda=" + renda + ", interesses=" + interesses + ", profissao=" + profissao + "]";
    }
}
