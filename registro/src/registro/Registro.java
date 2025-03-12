
package registro;


public class Registro {

  
    public static void main(String[] args) {
           // Criando participantes com os dois construtores
        Participante participante1 = new Participante("Nathan Benedetto");
        Participante participante2 = new Participante("Lucas Crippa", "lucascrippa15@gmail.com", "12/03/2025");

        // Exibindo informações dos participantes
        System.out.println("Informações do Participante 1:");
        participante1.exibirInformacoes();
        System.out.println("\nInformações do Participante 2:");
        participante2.exibirInformacoes();
    }
}