
import java.util.Scanner;
import java.util.Random;

class Player{
    int health;
    int strength;
    int attack;
    Player(int health,int strength,int attack){
        this.health=health;
        this.strength=strength;
        this.attack=attack;

    }
}
class Game{
    public void PlayGame(Player playerA,Player playerB){
        int attacker = determineInitialAttacker(playerA, playerB);
        int defender = (attacker == 1) ? 2 : 1;
        while(isAlive(playerA) && isAlive(playerB)){
            playRound(playerA, playerB, attacker, defender);
            int temp = attacker;
            attacker = defender;
            defender = temp;
        }
        determineWinner(playerA, playerB);
    }


    public int determineInitialAttacker(Player playerA, Player playerB) {
        return (playerA.health <= playerB.health) ? 1 : 2;
    }
    public int rollDice(){
        Random rand = new Random();
        return rand.nextInt(6)+1;

    }
    public boolean isAlive(Player player){
        return player.health>0;

    }
    public void playRound(Player attacker, Player defender, int attackerNum, int defenderNum) {
        int attackerDie = rollDice();
        int defenderDie = rollDice();
        if (attackerNum == 1) {
            calculateDamage(attacker, defender, attackerDie, defenderDie);
        } else {
            calculateDamage(defender, attacker, attackerDie, defenderDie);
        }
    }
    public void calculateDamage(Player attacker, Player defender, int attackerDie, int defenderDie) {
        int attackDamage = attackerDie * attacker.attack;
        int defendingStrength = defenderDie * defender.strength;
        defender.health = defender.health - attackDamage + defendingStrength;
    }
    public void determineWinner(Player playerA, Player playerB) {
        if (playerA.health <= 0) {
            System.out.println("Player B wins match " + playerB.health);
        } else {
            System.out.println("Player A wins match " + playerA.health);
        }
    }

}


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter health of PlayerA: ");
        int healthA = scanner.nextInt();
        System.out.print("Enter strength of PlayerA: ");
        int strengthA = scanner.nextInt();
        System.out.print("Enter attack of PlayerA: ");
        int attackA = scanner.nextInt();
        Player playerA=new Player(healthA,strengthA,attackA);
        System.out.print("Enter health of PlayerB: ");
        int healthB = scanner.nextInt();
        System.out.print("Enter strength of PlayerB: ");
        int strengthB = scanner.nextInt();
        System.out.print("Enter attack of PlayerB: ");
        int attackB = scanner.nextInt();
        Player playerB=new Player(healthB,strengthB,attackB);
        Game game=new Game();
        game.PlayGame(playerA,playerB);

    }
}