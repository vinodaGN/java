import java.util.*;

class Guesser
{
    int gnum;
    int guessingNum(){
        System.out.println("Guesser, Kindly please Guess the Number : ");
        Scanner sc = new Scanner(System.in);
        gnum = sc.nextInt();
        return gnum; 
    }
}
class Player
{
    int pnum;
    int predictingNum(){
        System.out.println("Player, kindly please predict the number : ");
        Scanner sc = new Scanner(System.in);
        pnum = sc.nextInt();
        return pnum;
    }
}
class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    void collectingNumFromGuesser(){
        Guesser g = new Guesser();
        numFromGuesser=g.guessingNum();
    }
    void collectingNumFromPlayer(){
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numFromPlayer1 = p1.predictingNum();
        numFromPlayer2 = p2.predictingNum();
        numFromPlayer3 = p3.predictingNum();
    }
    void comparing()
    {
        if(numFromGuesser==numFromPlayer1)
        {
            System.out.println("Player1 is the winner...");
        }else if(numFromGuesser==numFromPlayer2){
            System.out.println("Player2 is the winner...");
        }else if(numFromGuesser==numFromPlayer3){
            System.out.println("Player3 is the winner...");
        }else {
            System.out.println("Game Lost, Try Again!");
        }
    }
}
class GuessGame {
    public static void main(String[] args){
        Umpire u = new Umpire();
        u.collectingNumFromGuesser();
        u.collectingNumFromPlayer();
        u.comparing();
    }
}