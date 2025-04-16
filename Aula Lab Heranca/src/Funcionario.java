public class Funcionario extends PessoaFisica {
    private int matricula;
    private double salario;
    private String cargo;
    private boolean empregado;

    public Funcionario(String cpf, char sexo, int estadoCivil, int matricula, double salario, String cargo) {
        super(cpf, sexo, estadoCivil);
        this.matricula = matricula;
        this.salario = salario;
        this.cargo = cargo;
        this.empregado = false; // Inicialmente não empregado
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isEmpregado() {
        return empregado;
    }

    // Método para gerenciar quem está ou não empregado
    public void contratar() {
        if (!this.empregado) {
            this.empregado = true;
            System.out.println("Funcionário " + this.cpf + " contratado com sucesso!");
        } else {
            System.out.println("Funcionário já está empregado!");
        }
    }

    public void demitir() {
        if (this.empregado) {
            this.empregado = false;
            System.out.println("Funcionário " + this.cpf + " foi demitido.");
        } else {
            System.out.println("Funcionário já está desempregado!");//jogar sal na ferida
        }
    }

    @Override
    public String toString() {
        return "Funcionario [cpf=" + cpf + ", sexo=" + sexo + ", estadoCivil=" + estadoCivil +
                ", matricula=" + matricula + ", salario=" + salario + ", cargo=" + cargo +
                ", empregado=" + empregado + "]";
    }
}
