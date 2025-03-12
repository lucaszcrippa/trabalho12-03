
package simulacao;


public class Simulacao {

    
    public static void main(String[] args) {
      Equipamento bicicleta = new Bicicleta("Bicicleta de Montanha", 30.0, "Montanha");
        Equipamento bola = new Bola("Bola de Futebol", 15.0, "Couro");

        // Exibindo as durabilidades
        System.out.println("Durabilidade da " + bicicleta.getNome() + ": " + bicicleta.definirDurabilidade() + " horas");
        System.out.println("Durabilidade da " + bola.getNome() + ": " + bola.definirDurabilidade() + " horas");
    }
}