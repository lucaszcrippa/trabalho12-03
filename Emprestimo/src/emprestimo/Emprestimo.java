
package emprestimo;


public class Emprestimo {

   
    public static void main(String[] args) {
         Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");

  
        livro1.exibirEstado();
       
        System.out.println(livro1.emprestar()); 
        livro1.exibirEstado(); 

        System.out.println(livro1.emprestar()); 

        livro1.devolver();
        livro1.exibirEstado(); 

       
        System.out.println(livro1.emprestar()); 
        livro1.exibirEstado(); 
    }
}