package main;

import client.Client;
import server.Server;

import java.util.Scanner;

/**
 * Created by Admin on 31.05.2015.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Start program as client or as server? (S(erver) / C(lient))");

        while (true) {
            char answer = Character.toLowerCase(in.nextLine().charAt(0));
            if (answer == 's') {
                new Server();
                break;
            } else if (answer == 'c') {
                new Client();
                break;
            } else {
                System.out.println("Invalid input.");
            }
        }
    }
}
