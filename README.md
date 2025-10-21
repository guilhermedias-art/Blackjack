# Blackjack em Java

## 📋 Descrição do Projeto

Este projeto implementa o clássico jogo de cartas **Blackjack** (também conhecido como "21") em Java, seguindo os princípios de Programação Orientada a Objetos. O jogo permite que dois jogadores humanos compitam contra o dealer (computador) em uma simulação autêntica do Blackjack tradicional.

## 🎯 Regras do Blackjack

### Objetivo do Jogo
- Fazer **mais pontos** que o dealer **sem ultrapassar 21 pontos**
- Se ultrapassar 21 pontos, "estoura" e perde automaticamente

### Valor das Cartas
- **Ás (Ace)**: Vale 1 ou 11 pontos (automaticamente ajustado para o melhor valor)
- **Figuras (Jack, Queen, King)**: Valem 10 pontos cada
- **Cartas numéricas (2-10)**: Valem seu valor facial
- **Naipes**: Não têm influência no jogo

### Fluxo do Jogo
1. **Distribuição inicial**: Cada jogador recebe 2 cartas
2. **Turno dos jogadores**: Cada jogador decide se quer mais cartas ("Hit") ou parar ("Stand")
3. **Turno do dealer**: O dealer joga automaticamente seguindo regras fixas
4. **Resultado**: Comparação das pontuações finais

### Regras Especiais do Dealer
- O dealer **deve pedir carta** enquanto tiver 16 pontos ou menos
- O dealer **deve parar** quando atingir 17 pontos ou mais

## 👥 Configuração de Jogadores

- **2 jogadores humanos** (Jogador 1 e Jogador 2)
- **1 dealer** (computador) que joga automaticamente
- Todos competem individualmente contra o dealer

## 🎮 Interações com o Código

### Durante o Jogo
1. **Decisão "Hit ou Stand"**:
   - Digite `s` (ou "sim") para **pegar mais uma carta**
   - Digite `n` (ou "não") para **parar com as cartas atuais**

2. **Visualização do Estado**:
   - Cartas na mão de cada jogador
   - Pontuação atual em tempo real
   - Cartas recebidas durante o turno

3. **Controle de Partidas**:
   - Jogar múltiplas partidas consecutivas
   - Opção de continuar ou sair ao final de cada rodada


## 🏗️ Estrutura do Código

### Classes Principais

| Classe | Responsabilidade |
|--------|------------------|
| `Game` | Controla o fluxo principal do jogo |
| `Player` | Gerencia jogadores e suas cartas |
| `DeckOfCards` | Gerencia o baralho e distribuição |
| `Card` | Representa uma carta individual |

### Características Técnicas
- **Arrays tradicionais** em vez de Collections
- **Polimorfismo** através de design simples e eficiente
- **Tratamento robusto** de entradas do usuário
- **Algoritmo inteligente** para cálculo de Áses (1 ou 11 pontos)


