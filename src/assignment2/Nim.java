import java.util.Scanner;

public class Nim {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int round = 0;
    System.out.println("Number of stick at start: ");
    int numberStart = in.nextInt();
    int numberRemain = numberStart;
    while(numberStart > 0 && numberRemain > 0){
        System.out.println("How many sticks do you want to remove?");
        int numberHuman = in.nextInt();
        numberRemain = numberStart - numberHuman;
        System.out.println("Round " + round + ": " + numberStart + " at start human takes " + numberHuman + ", so " + numberRemain + " remain");
        numberStart = numberRemain;
        round++;
        if(numberRemain <= 0){
            System.out.println("You win, the computer loses");
            break;
        }
        int numberComputer = (int)(Math.random()*2)+1;
        numberRemain = numberStart - numberComputer;
        System.out.println("Round " + round + ": " + numberStart + " at start computer takes " + numberComputer + ", so " + numberRemain + " remain");
        numberStart = numberRemain;
        round++;
        if(numberRemain <= 0){
            System.out.println("You lose, the computer wins");
        }
    }
    

}
}