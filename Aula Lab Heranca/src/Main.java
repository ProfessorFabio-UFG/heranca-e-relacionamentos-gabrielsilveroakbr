public class Main {
    public static void main(String[] args) {
        Loja minhaLoja = new Loja();

        // Criando funcionários
        Funcionario func1 = new Funcionario("111.111.111-11", 'M', 1, 1001, 2500.00, "Vendedor");
        Funcionario func2 = new Funcionario("222.222.222-22", 'F', 2, 1002, 3500.00, "Gerente");

        // Contratando funcionários
        func1.contratar();
        func2.contratar();

        // Adicionando funcionários à loja
        minhaLoja.adicionarFuncionario(func1);
        minhaLoja.adicionarFuncionario(func2);

        // Cadastrando clientes
        minhaLoja.cadastrarCliente(new Cliente("333.333.333-33", 'F', 1, 5000.00, "Eletrônicos", "Engenheira"));
        minhaLoja.cadastrarCliente(new Cliente("444.444.444-44", 'M', 3, 3000.00, "Roupas", "Designer"));

        // Cadastrando fornecedores
        minhaLoja.cadastrarFornecedor(new Fornecedor("11.111.111/0001-11", "Eletrônicos Ltda", "Celulares, TVs, Notebooks"));
        minhaLoja.cadastrarFornecedor(new Fornecedor("22.222.222/0001-22", "Moda S/A", "Roupas, Calçados, Acessórios"));

        // Listando todos
        minhaLoja.listarFuncionarios();
        minhaLoja.listarClientes();
        minhaLoja.listarFornecedores();

        // Demitindo um funcionário
        func1.demitir();
        minhaLoja.removerFuncionario(func1.getCpf());
        minhaLoja.listarFuncionarios();
    }
}