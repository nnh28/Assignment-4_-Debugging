public class DiceRepetition {
    public static void main(String[] args) {
        int playerBet = 5;
        int initialPlayerBalance = 100;
        int expectedPlayerBalance;
        Player player = new Player("Fred", initialPlayerBalance);
        System.out.println("Initial player balance: " + initialPlayerBalance);
        for (int i = 0; i < 10; i++ ) {
            Dice dice1 = new Dice();
            Dice dice2 = new Dice();
            Dice dice3 = new Dice();
            Game game = new Game(dice1,dice2,dice3);
            DiceValue playerPick = DiceValue.getRandom();
            game.playRound(player,playerPick,playerBet);
            System.out.println("\nPlayer bet: " + playerBet);
            System.out.println("Player pick: " + playerPick.toString());
            System.out.println("Dice values: " + dice1.getValue() + " " + dice2.getValue() + " " + dice3.getValue());
            System.out.println("Player balance: " + player.getBalance());
        }
    }
}