import java.util.Random;
import java.util.Scanner;

public class AtividadeDeAdivinhacao {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        Random geradorAleatorio = new Random();
        int numeroEscolhido= geradorAleatorio.nextInt(100);
        String texto = "Bem vindo(a) ao Adivinhe o Número! \nNesse jogo, você deve escolher um número entre 0 e 100 \nSe você acertar dentro de 10 tentavias, no final do jogo ganhará um prêmio";
        System.out.println(texto); 
        int tentativas= 0;
        boolean acertou = false;
        for (; tentativas <10; tentativas++) {
            System.out.println("Tentaviva " + tentativas + " de 10 tentativas");
            int numeroDoJogador = lerTeclado.nextInt();
            if(numeroDoJogador == numeroEscolhido){
                acertou = true;
                break;

            } if (numeroDoJogador < numeroEscolhido){
                System.out.println("O número digitado é menor que o número escolhido");
            } else
                System.out.println("O número digitado é maior que o número escolhido");  
        }
        System.out.println("O número escolhido era " + numeroEscolhido);
        if(acertou){
            System.out.println("Parabéns! Você acertou! Seu prêmio é: UM LITRÃO NO ZÉ!!!");
            System.out.println("Você acertou em " + tentativas + " tentativas");

        } else{
            System.out.println("Não foi dessa vez que você ganhou um prêmio... Jogue novamente para descobrir o que você poderá ganhar!");
            System.out.println("Você errou em " + tentativas + " tentativas");
    
        }

    }
}
