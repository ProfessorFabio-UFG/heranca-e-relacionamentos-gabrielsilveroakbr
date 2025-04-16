public class Fornecedor extends PessoaJuridica {
    private String produtos;

    public Fornecedor(String cnpj, String razaoSocial, String produtos) {
        super(cnpj, razaoSocial);
        this.produtos = produtos;
    }

    // Getters e Setters
    public String getProdutos() {
        return produtos;
    }

    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "Fornecedor [cnpj=" + cnpj + ", razaoSocial=" + razaoSocial + ", produtos=" + produtos + "]";
    }
}