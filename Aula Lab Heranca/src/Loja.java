public class Loja {
    private Funcionario[] funcionarios;
    private Cliente[] clientes;
    private Fornecedor[] fornecedores;
    private int numFuncionarios;
    private int numClientes;
    private int numFornecedores;
    private static final int maximo_fornecedor = 10;
    private static final int max_funcionarios = 20;
    private static final int max_clientes = 100; // algumas limitações pq precisa iniciar

    public Loja() {
        this.funcionarios = new Funcionario[max_funcionarios];
        this.clientes = new Cliente[max_clientes];
        this.fornecedores = new Fornecedor[maximo_fornecedor];
        this.numFuncionarios = 0;
        this.numClientes = 0;
        this.numFornecedores = 0;
    }

    // Método para adicionar funcionário (agora apenas gerencia o array)
    public void adicionarFuncionario(Funcionario funcionario) {
        if (numFuncionarios < max_funcionarios) {
            funcionarios[numFuncionarios++] = funcionario;
            System.out.println("Funcionário adicionado à loja com sucesso!");
        } else {
            System.out.println("Não é possível adicionar mais funcionários. Limite atingido.");
        }
    }

    // Método para remover funcionário (agora apenas gerencia o array)
    public void removerFuncionario(String cpf) {
        boolean encontrado = false;
        for (int i = 0; i < numFuncionarios; i++) {
            if (funcionarios[i].getCpf().equals(cpf)) {
                // Move todos os elementos após o funcionário removido uma posição para trás
                for (int j = i; j < numFuncionarios - 1; j++) {
                    funcionarios[j] = funcionarios[j + 1];
                }
                funcionarios[numFuncionarios - 1] = null;
                numFuncionarios--;
                encontrado = true;
                System.out.println("Funcionário removido da loja com sucesso!");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Funcionário com CPF " + cpf + " não encontrado.");
        }
    }

    // Métodos para cadastrar cliente e fornecedor (mantidos como antes)
    public void cadastrarCliente(Cliente cliente) {
        if (numClientes < max_clientes) {
            clientes[numClientes++] = cliente;
            System.out.println("Cliente cadastrado com sucesso!");
        } else {
            System.out.println("Não é possível cadastrar mais clientes. Limite atingido.");
        }
    }

    public void cadastrarFornecedor(Fornecedor fornecedor) {
        if (numFornecedores < maximo_fornecedor) {
            fornecedores[numFornecedores++] = fornecedor;
            System.out.println("Fornecedor cadastrado com sucesso!");
        } else {
            System.out.println("Não é possível cadastrar mais fornecedores. Limite atingido.");
        }
    }

    // Métodos para listar
    public void listarClientes() {
        System.out.println("\nLista de Clientes:");
        for (int i = 0; i < numClientes; i++) {
            System.out.println(clientes[i]);
        }
    }

    public void listarFuncionarios() {
        System.out.println("\nLista de Funcionários:");
        for (int i = 0; i < numFuncionarios; i++) {
            System.out.println(funcionarios[i]);
        }
    }

    public void listarFornecedores() {
        System.out.println("\nLista de Fornecedores:");
        for (int i = 0; i < numFornecedores; i++) {
            System.out.println(fornecedores[i]);
        }
    }

    // Getters para os contadores
    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public int getNumClientes() {
        return numClientes;
    }

    public int getNumFornecedores() {
        return numFornecedores;
    }
}
