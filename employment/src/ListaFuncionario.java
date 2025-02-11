public class ListaFuncionario {
  Node head = null;

  public Boolean listaVazia() {
    if (this.head == null){
      return true;
    } 
    return false;
  }


  public void adicionarFuncionario(Funcionario func){
    if (this.head == null) {
      this.head = new Node();
      this.head.data = func;

    } else {
      Node current = this.head;

      while(current.next != null){
        current = current.next;
      }

      current.next = new Node();
      current.next.data = func;
    }
  }

  public void removerFuncionario(String nome){
    if (this.listaVazia()){
      return;
    }
    Node current = this.head;
    Node ant = null;

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
    
    Node current = this.head;
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

    Node current = this.head;

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

    Node current = this.head;
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
    Node current = new Node();
    while(current.next != null){
      current = current.next;
    }
  }

  public Double totalSalarios(){
    if(this.listaVazia()){
      System.out.println("void");
      return 0.0;
    }
    Node current = new Node();
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
    Node current = new Node();
    current = this.head;
    Double salarioMinmo = 1212.00;
    System.out.println("======= Salários Mínimos =======");
    while(current != null){
      Double total = current.data.salario / salarioMinmo;

      System.out.print(current.data.nome);
      System.out.print(": ");
      System.out.println(total);
      System.out.println("================================");
      current = current.next;
    }
  }
}
