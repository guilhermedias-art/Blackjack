public class Player 
{   // informaçõe sobre o player, utilizando tambem do arquivo Card 
    private String nome;
    private Card[] mao;
    private int quantidadeCartas;
    
    public Player(String nome) {
        this.nome = nome;
        this.mao = new Card[12]; // Máximo de cartas possível
        this.quantidadeCartas = 0;
    }
    
    public void adicionarCarta(Card carta) {
        if (carta != null && quantidadeCartas < mao.length) {
            mao[quantidadeCartas++] = carta;
        }
    }
    
    public int getPontuacao() {
        int pontuacao = 0;
        int ases = 0;
        
        for (int i = 0; i < quantidadeCartas; i++) {
            String face = mao[i].toString().split(" ")[0];
            
            switch (face) {
                case "Ace":
                    pontuacao += 11;
                    ases++;
                    break;
                case "Deuce": pontuacao += 2; break;
                case "Three": pontuacao += 3; break;
                case "Four": pontuacao += 4; break;
                case "Five": pontuacao += 5; break;
                case "Six": pontuacao += 6; break;
                case "Seven": pontuacao += 7; break;
                case "Eight": pontuacao += 8; break;
                case "Nine": pontuacao += 9; break;
                default: pontuacao += 10; break; // Ten, Jack, Queen, King
            }
        }
        
        // Ajustar Áses se necessário
        while (pontuacao > 21 && ases > 0) {
            pontuacao -= 10;
            ases--;
        }
        
        return pontuacao;
    }
    
    public String getNome() {
        return nome;
    }
    
    public Card[] getMao() {
        return mao;
    }
    
    public int getQuantidadeCartas() {
        return quantidadeCartas;
    }
}