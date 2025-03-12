
package exercicio44;


public class Exercicio44 {

    
    public static void main(String[] args) {
         Projeto filme = new Filme("O Grande Filme", "01/04/2025", 500000.0, 120);  // Duração de 120 minutos
        Projeto musica = new Musica("A Canção Inesquecível", "01/04/2025", 5000.0, 200);  // 200 notas musicais

        // Exibindo os prazos
        System.out.println("Prazo do projeto '" + filme.getTitulo() + "': " + filme.calcularPrazo() + " dias");
        System.out.println("Prazo do projeto '" + musica.getTitulo() + "': " + musica.calcularPrazo() + " dias");
    }
}
