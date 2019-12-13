package app;

import java.util.Scanner;

public class App {
    // static variables
    public static Scanner scanner = new Scanner(System.in);
    public static Player player;

    public static void main(String[] args) throws Exception {
        System.out.println("----------------------------");
        System.out.println("------- ~~blo0dLiNe~~ ------");
        System.out.println("----------------------------");
        Thread.sleep(2000);
        // TODO: Load / new player option

        System.out.print("\n What is your name?: ");

        player = new Player(scanner.nextLine());

        
    }

    public static void savePlayer(){
        // TODO: export serialized Player object
    }

    public static boolean loadPlayer(){
        // TODO: import serialized Player file
        return false;
    }

}