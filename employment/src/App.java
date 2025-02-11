public class App {
    public static void main(String[] args) throws Exception {

        Funcionario func1 = new Funcionario();
        Funcionario func2 = new Funcionario();
        Funcionario func3 = new Funcionario();
        Funcionario func4 = new Funcionario();
        Funcionario func5 = new Funcionario();
        Funcionario func6 = new Funcionario();
        Funcionario func7 = new Funcionario();
        Funcionario func8 = new Funcionario();
        Funcionario func9 = new Funcionario();
        Funcionario func10 = new Funcionario();

        func1.nome =  "Maria";
        func1.dataDeNascimento = "18/10/2000";
        func1.salario = 2009.44;
        func1.funcao = "operador";

        func2.nome =  "João";
        func2.dataDeNascimento = "12/05/1990";
        func2.salario = 2284.38;
        func2.funcao = "operador";
      
        func3.nome =  "Caio";
        func3.dataDeNascimento = "02/05/1961";
        func3.salario = 9836.14;
        func3.funcao = "coordenador";

        func4.nome =  "Miguel";
        func4.dataDeNascimento = "14/10/1988";
        func4.salario = 19119.88;
        func4.funcao = "diretor";
      
        func5.nome =  "Alice";
        func5.dataDeNascimento = "05/01/1995";
        func5.salario = 2234.68;
        func5.funcao = "recepcionista";

        func6.nome =  "Heitor";
        func6.dataDeNascimento = "19/11/1999";
        func6.salario = 1582.72;
        func6.funcao = "operador";

        func7.nome =  "Arthur";
        func7.dataDeNascimento = "31/03/1993";
        func7.salario = 4071.84;
        func7.funcao = "contador";
      
        func8.nome =  "Laura";
        func8.dataDeNascimento = "08/07/1994";
        func8.salario = 3017.45;
        func8.funcao = "gerente";

        func9.nome =  "Heloísa";
        func9.dataDeNascimento = "24/05/2003";
        func9.salario = 1606.85;
        func9.funcao = "eletricista";

        func10.nome =  "Helena";
        func10.dataDeNascimento = "16/06/1996";
        func10.salario = 2799.93;
        func10.funcao = "gerente";

        ListaFuncionario funcionarios = new ListaFuncionario();

        funcionarios.adicionarFuncionario((func1));
        funcionarios.adicionarFuncionario((func2));
        funcionarios.adicionarFuncionario((func3));

        //funcionarios.printar();

        // funcionarios.removerFuncionario("João");

        // funcionarios.printar();

        // funcionarios.aumentarSalarios(0.1);

        // funcionarios.printar();

        ListaFuncionario operadores = funcionarios.agruparPorFuncao("operador");
        operadores.printar();

        System.out.println("Salário Total dos Funcionários");
        System.out.println(funcionarios.totalSalarios());

        funcionarios.salariosMinimos();
    }
}
