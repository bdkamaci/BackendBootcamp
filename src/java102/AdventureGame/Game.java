package java102.AdventureGame;

import java102.AdventureGame.Zones.*;

import java.util.Scanner;

public class Game {
    private Scanner scanner = new Scanner(System.in);
    public void start() {
        System.out.println("Welcome to the Adventure Game!");
        System.out.print("Please enter your name: ");
        String playerName = scanner.nextLine();

        Player player = new Player(playerName);
        System.out.println("Dear " + player.getName() + ", Welcome!");
        System.out.println();
        System.out.println("Please select a character!");
        player.selectCharacter();

        while(true) {
            player.printInfo();
            System.out.println("Please select a location!");
            Location[] locationList = {new SafeHouse(player), new ToolStore(player), new Cave(player), new Forest(player), new River(player), new Mine(player)};
            Location location = null;

            System.out.println("==========================================================================");

            for(Location loc : locationList) {
                System.out.println("Id: " + loc.getId() +
                        "\t Location: " + loc.getName());
            }
            System.out.println("To exit the game please enter 0!");

            System.out.println("==========================================================================");
            System.out.print("Please select your location: ");
            int selectLocation = scanner.nextInt();
            switch (selectLocation){
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    System.out.println();
                    break;
                case 2:
                    location = new ToolStore(player);
                    System.out.println();
                    break;
                case 3:
                    location = new Cave(player);
                    System.out.println();
                    break;
                case 4:
                    location = new Forest(player);
                    System.out.println();
                    break;
                case 5:
                    location = new River(player);
                    System.out.println();
                    break;
                case 6:
                    location = new Mine(player);
                    System.out.println();
                default:
                    System.out.println("Please enter a valid zone id!");
                    System.out.println();
            }

            if(location == null) {
                System.out.println("Exiting the game, until next time!");
                break;
            }

            if(!location.onLocation()) {
                System.out.println("Game Over!");
                break;
            }
        }

    }
}
