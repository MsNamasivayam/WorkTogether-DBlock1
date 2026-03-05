
import java.util.Scanner;

public class Backend {
    private Frontend window;
    private String joke;

    public Backend() {
        joke = "";
        this.window = new Frontend(this);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your favorite joke: ");
        this.joke = s.nextLine();
        window.repaint();

    }

    public void setJoke() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your favorite joke: ");
        this.joke = s.nextLine();
        window.repaint();
    }

    public String getJoke() {
        return joke;
    }

    public static void main(String[] args) {
        Backend backend = new Backend();


    }



}
