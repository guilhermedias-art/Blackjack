import java.util.Scanner;

public class Game {
    private DeckOfCards deck;

    public Game() {
        deck = new DeckOfCards();
    }

    public static void main(String[] args) {
        new Game().run();
    }

    private void run() {
        Scanner in = new Scanner(System.in);
        System.out.println("=== Blackjack  ===");

        boolean playAgain = true;
        while (playAgain) {
            deck.shuffle();

            // Criar jogadores
            Player player1 = new Player("Jogador 1");
            Player player2 = new Player("Jogador 2");
            Player dealer = new Player("Dealer");

            // Distribuir cartas iniciais
            darCartasIniciais(player1, player2, dealer);

            // Turno do Jogador 1
            jogarTurno(in, player1);
            
            // Turno do Jogador 2
            jogarTurno(in, player2);

            // Turno do Dealer (automático)
            System.out.println("\n--- Dealer ---");
            while (dealer.getPontuacao() < 17) {
                Card carta = deck.dealCard();
                if (carta != null) {
                    dealer.adicionarCarta(carta);
                    System.out.println("Dealer pegou: " + carta);
                } else {
                    break;
                }
            }
            System.out.println("Dealer: " + mostrarMao(dealer) + " (" + dealer.getPontuacao() + ")");

            // Mostrar resultados
            mostrarResultado(player1, dealer);
            mostrarResultado(player2, dealer);

            System.out.print("\nJogar novamente? (s/n): ");
            playAgain = in.nextLine().trim().toLowerCase().startsWith("s");
        }
        in.close();
        
    }

    private void darCartasIniciais(Player p1, Player p2, Player dealer) {
        // Duas cartas para cada
        p1.adicionarCarta(deck.dealCard());
        p2.adicionarCarta(deck.dealCard());
        dealer.adicionarCarta(deck.dealCard());
        
        p1.adicionarCarta(deck.dealCard());
        p2.adicionarCarta(deck.dealCard());
        dealer.adicionarCarta(deck.dealCard());
    }

    private void jogarTurno(Scanner in, Player jogador) {
        System.out.println("\n--- " + jogador.getNome() + " ---");
        
        while (true) {
            System.out.println(jogador.getNome() + ": " + mostrarMao(jogador) + " (" + jogador.getPontuacao() + ")");
            
            if (jogador.getPontuacao() >= 21) {
                break;
            }
            
            System.out.print("Pegar carta? (s/n): ");
            String resposta = in.nextLine().trim().toLowerCase();
            
            if (resposta.startsWith("s")) {
                Card novaCarta = deck.dealCard();
                if (novaCarta != null) {
                    jogador.adicionarCarta(novaCarta);
                    System.out.println("Você pegou: " + novaCarta);
                    
                    if (jogador.getPontuacao() > 21) {
                        System.out.println("Estourou! Pontuação: " + jogador.getPontuacao());
                        break;
                    }
                } else {
                    System.out.println("Acabaram as cartas!");
                    break;
                }
            } else {
                break;
            }
        }
    }

    private String mostrarMao(Player jogador) {
        Card[] cartas = jogador.getMao();
        String resultado = "";
        for (int i = 0; i < jogador.getQuantidadeCartas(); i++) {
            resultado += cartas[i] + (i < jogador.getQuantidadeCartas() - 1 ? ", " : "");
        }
        return resultado;
    }

    private void mostrarResultado(Player jogador, Player dealer) {
        int pontosJogador = jogador.getPontuacao();
        int pontosDealer = dealer.getPontuacao();
        
        System.out.println("\n" + jogador.getNome() + ": " + pontosJogador + " vs Dealer: " + pontosDealer);
        
        if (pontosJogador > 21) {
            System.out.println(jogador.getNome() + " perdeu (estourou)");
        } else if (pontosDealer > 21) {
            System.out.println(jogador.getNome() + " ganhou (dealer estourou)");
        } else if (pontosJogador > pontosDealer) {
            System.out.println(jogador.getNome() + " ganhou!");
        } else if (pontosJogador == pontosDealer) {
            System.out.println(jogador.getNome() + " empatou");
        } else {
            System.out.println(jogador.getNome() + " perdeu");
        }
    }
}