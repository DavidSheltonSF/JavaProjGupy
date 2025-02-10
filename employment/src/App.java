public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Funcionario func1 = new Funcionario();
        Funcionario func2 = new Funcionario();
        Funcionario func3 = new Funcionario();

        func1.nome =  "Maria";
        func1.dataDeNascimento = "18/10/2000";
        func1.salario = 2009.44;
        func1.funcao = "operador";

        func2.nome =  "João";
        func2.dataDeNascimento = "12/05/1990";
        func2.salario = 2284.38;
        func2.funcao = "operador";
      
        func3.nome =  "teste";
        func3.dataDeNascimento = "12/05/1990";
        func3.salario = 2284.38;
        func3.funcao = "operador";

        ListaFuncionario funcionarios = new ListaFuncionario();

        funcionarios.adicionarFuncionario((func1));
        funcionarios.adicionarFuncionario((func2));
        funcionarios.adicionarFuncionario((func3));

        funcionarios.printar();

        funcionarios.removerFuncionario("João");

        funcionarios.printar();

        funcionarios.aumentarSalarios(0.1);

        funcionarios.printar();
    }
}
