package Interfaces;
import java.util.Scanner;

interface Playable {
    void play();
    void pause();
    void stop();
}

class MP3Player implements Playable {
    public void play() {
        System.out.println("MP3 Player is playing music...");
    }
    public void pause() {
        System.out.println("MP3 Player is paused.");
    }
    public void stop() {
        System.out.println("MP3 Player has stopped playing.");
    }
}

class CDPlayer implements Playable {
    public void play() {
        System.out.println("CD Player is playing music...");
    }
    public void pause() {
        System.out.println("CD Player is paused.");
    }
    public void stop() {
        System.out.println("CD Player has stopped playing.");
    }
}

class StreamingPlayer implements Playable {
    public void play() {
        System.out.println("Streaming Player is playing music...");
    }
    public void pause() {
        System.out.println("Streaming Player is paused.");
    }
    public void stop() {
        System.out.println("Streaming Player has stopped playing.");
    }
}

//Factory Pattern
class PlayerFactory {
    public static Playable getPlayer(String type) {
        if (type.equalsIgnoreCase("MP3")) {
            return new MP3Player();
        } 
        else if (type.equalsIgnoreCase("CD")) {
            return new CDPlayer();
        } 
        else if (type.equalsIgnoreCase("Streaming")) {
            return new StreamingPlayer();
        }
        return null;
    }
}

public class MusicPlayerController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Player (MP3, CD, Streaming): ");
        String choice = sc.next();
        
        Playable player = PlayerFactory.getPlayer(choice);
        
        if (player == null) {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }
        
        while (true) {
            System.out.println("1. Play\n2. Pause\n3. Stop\n4. Exit");
            System.out.print("Enter your choice: ");
            int option = sc.nextInt();
            
            switch (option) {
                case 1:
                    player.play();
                    break;
                case 2:
                    player.pause();
                    break;
                case 3:
                    player.stop();
                    break;
                case 4:
                    System.out.println("Exiting player...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
