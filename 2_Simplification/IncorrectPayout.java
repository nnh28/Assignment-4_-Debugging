public class IncorrectPayout {
    public static void main(String[] args) {
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        Dice dice3 = new Dice();
        while ((dice1.getValue() != DiceValue.CROWN) || (dice2.getValue() != DiceValue.DIAMOND) || (dice3.getValue() != DiceValue.HEART)) {
            dice1 = new Dice();
            dice2 = new Dice();
            dice3 = new Dice();
        }
        int playerBet = 5;
        int initialPlayerBalance = 100;
        Player player = new Player("Fred", initialPlayerBalance);
        Game game = new Game(dice1,dice2,dice3);

        DiceValue playerPick = DiceValue.CROWN;

        int expectedPlayerBalance = initialPlayerBalance + playerBet;
        game.playRound(player,playerPick,playerBet);
        System.out.println("Initial player balance: " + initialPlayerBalance);
        System.out.println("Player bet: " + playerBet);
        System.out.println("Player pick: " + playerPick.toString());
        System.out.println("Dice values: " + dice1.getValue() + " " + dice2.getValue() + " " + dice3.getValue());
        System.out.println("Exptected player balance: " + expectedPlayerBalance);
        System.out.println("Real game player balance: " + player.getBalance());
    }
}