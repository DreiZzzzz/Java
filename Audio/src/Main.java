import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        Scanner scanner = new Scanner(System.in);
        File file = new File("northsea.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        String response = "";
// this is a comment from github
        while (!response.equals("Q")) {
            System.out.println("\nP = Play, S = Stop, R = Reset, Q Quit");
            System.out.println("Enter choice: ");
            response = scanner.next();
            response = response.toUpperCase();
// this is a test
            switch(response) {
                case "P":
                    System.out.println("\nMusic starts now");
                    clip.start();
                    break;
                case "S":
                    System.out.println("\nMusic ends now");
                    clip.stop();
                    break;
                case "R":
                    System.out.println("\nMusic resets now");
                    clip.setFramePosition(0);
                    break;
                case "Q":
                    System.out.println("\nQuit!");
                    break;
                default:
                    System.out.println("\nInvalid input!");
            }
        }
    }
}
