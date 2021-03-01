import player.Player;
import player.PlayerType;

import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        boolean isPlaying = true;
        Scanner scanner = new Scanner(System.in);
        while(isPlaying) {
            System.out.println("Choose an option");
            System.out.println("Start Game 1");
            System.out.println("Quit Game 2");
            int userInput = scanner.nextInt();
            if (userInput == 2) {
                isPlaying = false;
            }
            if (userInput == 1) {
                playGame(scanner);
            }
        }
    }

    private static void playGame(Scanner scanner) {
        System.out.println("Please, enter your name");
        String userName = scanner.nextLine();
        PlayerType playerClass = null;
        boolean madeCorrectChoice = false;
        while(!madeCorrectChoice) {
            madeCorrectChoice = true;
            System.out.println("Please, choose a class");
            System.out.println("1 - Blade Knight");
            System.out.println("2 - Dragon Knight");
            System.out.println("3 - Wizard");
            System.out.println("4 - Shaman");
            System.out.println("5 - Paladin");
            System.out.println("6 - Templar");
            int playerClassChoice = scanner.nextInt();
            if (playerClassChoice == 1) {
                playerClass = PlayerType.BLADE_KNIGHT;
            } else if (playerClassChoice == 2) {
                playerClass = PlayerType.DRAGON_KNIGHT;
            } else if (playerClassChoice == 3) {
                playerClass = PlayerType.WIZARD;
            } else if (playerClassChoice == 4) {
                playerClass = PlayerType.SHAMAN;
            } else if (playerClassChoice == 5) {
                playerClass = PlayerType.PALADIN;
            } else if (playerClassChoice == 6) {
                playerClass = PlayerType.TEMPLAR;
            } else {
                System.out.println("Wrong choice, please choose again");
                madeCorrectChoice = false;
            }
        }
        Player player = new Player(userName, playerClass, 1, 0);
    }
}
