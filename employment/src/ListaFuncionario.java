import java.math.RoundingMode;

public class ListaFuncionario {
  NodeLista head = null;

  public Boolean listaVazia() {
    if (this.head == null){
      return true;
    } 
    return false;
  }


  public void adicionarFuncionario(Funcionario func){
    if (this.head == null) {
      this.head = new NodeLista();
      this.head.data = func;

    } else {
      NodeLista current = this.head;

      while(current.next != null){
        current = current.next;
      }

      current.next = new NodeLista();
      current.next.data = func;
    }
  }

  public void removerFuncionario(String nome){
    if (this.listaVazia()){
      return;
    }
    NodeLista current = this.head;
    NodeLista ant = null;

    while (current.next != null) {
      ant = current;
      current = current.next;

      if (current.data.nome == nome) {
        ant.next = current.next;
        current.next = null;
        return;
      }
    }
    
  }

  public void aumentarSalarios(Double percentual) {
    if (this.listaVazia()) {
      return;
    }
    
    NodeLista current = this.head;
    while(current != null){
      Double salario = current.data.salario;
      Double acrescimo = percentual * salario;
      current.data.salario = salario + acrescimo;
      current = current.next;
    }
  }

  public void printar() {
    System.out.println("++++++++++++++++");
    System.out.println("---------------------------");
    if (this.listaVazia()){
      System.out.println("Lista Vazia");
    }

    NodeLista current = this.head;

    while(current != null){
      System.out.println(current.data.nome);
      System.out.println(current.data.dataDeNascimento);
      System.out.println(current.data.salario);
      System.out.println(current.data.funcao);
      current = current.next;
      System.out.println("---------------------------");
    }
    
  }

  // Não consegui compreender como utilizar o MAP
  public ListaFuncionario agruparPorFuncao(String funcao){
    ListaFuncionario novaLista = new ListaFuncionario();

    NodeLista current = this.head;
    while(current != null){
      if (current.data.funcao == funcao){
        novaLista.adicionarFuncionario(current.data);
      }
      current = current.next;
    }
    return novaLista;
  }

  public void printarFuncMaisVelho(){
    if(this.listaVazia()){
      return;
    }
    NodeLista current = new NodeLista();
    while(current.next != null){
      current = current.next;
    }
  }

  public Double totalSalarios(){
    if(this.listaVazia()){
      System.out.println("void");
      return 0.0;
    }
    NodeLista current = new NodeLista();
    current = this.head;
    Double total = 0.0;
    while(current != null){
      total = total + current.data.salario;
      current = current.next;
    }
    return total;
  }

  public void salariosMinimos(){
    if(this.listaVazia()){
      System.out.println("void");
      return;
    }
    NodeLista current = new NodeLista();
    current = this.head;
    Double salarioMinmo = 1212.00;
    System.out.println("======== Salários Mínimos ======== ");
    while(current != null){
      Double total = current.data.salario / salarioMinmo;

      System.out.print(current.data.nome);
      System.out.print(": ");
      System.out.println(total);
      current = current.next;
    }
  }
}
