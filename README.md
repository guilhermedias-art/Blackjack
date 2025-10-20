Blackjack em Java
📋 Descrição do Projeto
Este projeto implementa o clássico jogo de cartas Blackjack (também conhecido como "21") em Java, seguindo os princípios de Programação Orientada a Objetos. O jogo permite que dois jogadores humanos compitam contra o dealer (computador) em uma simulação autêntica do Blackjack tradicional.

Regras do Blackjack
Objetivo do Jogo
Fazer mais pontos que o dealer sem ultrapassar 21 pontos

Se ultrapassar 21 pontos, "estoura" e perde automaticamente

Valor das Cartas
Ás (Ace): Vale 1 ou 11 pontos (automaticamente ajustado para o melhor valor de acordo com as cartas que o jogador tem)

Figuras (Jack, Queen, King): Valem 10 pontos cada

Cartas numéricas (2-10): Valem seu valor facial

Naipes: Não têm influência no jogo

Fluxo do Jogo
Distribuição inicial: Cada jogador recebe 2 cartas

Turno dos jogadores: Cada jogador decide se quer mais cartas ("Hit") ou parar ("Stand")

Turno do dealer: O dealer joga automaticamente seguindo regras fixas

Resultado: Comparação das pontuações finais

Regras Especiais do Dealer
O dealer deve pedir carta enquanto tiver 16 pontos ou menos

O dealer deve parar quando atingir 17 pontos ou mais













👥 Configuração de Jogadores
2 jogadores humanos (Jogador 1 e Jogador 2)

1 dealer (computador) que joga automaticamente

Todos competem individualmente contra o dealer











🎮 Interações com o Código
Durante o Jogo
Decisão "Hit ou Stand":

Digite s (ou "sim") para pegar mais uma carta

Digite n (ou "não") para parar com as cartas atuais

Visualização do Estado:

Cartas na mão de cada jogador

Pontuação atual em tempo real

Cartas recebidas durante o turno

Controle de Partidas:

Jogar múltiplas partidas consecutivas

Opção de continuar ou sair ao final de cada rodada














Exemplo de Interação
=== Blackjack ===

--- Jogador 1 ---
Jogador 1: Ace of Hearts, Seven of Clubs (18)
Pegar carta? (s/n): n

--- Jogador 2 ---  
Jogador 2: Deuce of Diamonds, Nine of Spades (11)
Pegar carta? (s/n): s
Você pegou: King of Hearts
Jogador 2: Deuce of Diamonds, Nine of Spades, King of Hearts (21)

--- Dealer ---
Dealer pegou: Five of Clubs
Dealer: Ten of Hearts, Five of Clubs (15)

Resultado para Jogador 1:
Jogador 1: 18 vs Dealer: 15
Jogador 1 ganhou!

Jogar novamente? (s/n): s
