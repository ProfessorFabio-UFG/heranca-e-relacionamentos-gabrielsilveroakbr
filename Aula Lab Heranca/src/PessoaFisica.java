public class PessoaFisica {
    protected String cpf;
    protected char sexo;
    protected int estadoCivil;

    public PessoaFisica(String cpf, char sexo, int estadoCivil) {
        this.cpf = cpf;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
    }

    // Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(int estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
}
