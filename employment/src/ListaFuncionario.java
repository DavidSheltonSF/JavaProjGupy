public class ListaFuncionario {
  NodeLista head = null;

  public Boolean listaVazia() {
    if (this.head == null){
      return true;
    } 
    return false;
  }


  public void adicionarFuncionario(Funcionario func){
    System.out.println(func.nome);
    if (this.head == null) {
      System.out.println("first node");
      this.head = new NodeLista();
      this.head.data = func;

    } else {
      System.out.println("second node");
      NodeLista current = this.head;

      while(current.next != null){
        current = current.next;
      }

      current.next = new NodeLista();
      current.next.data = func;
      System.out.println("execution");
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
}
