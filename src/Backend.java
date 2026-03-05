import java.util.Scanner;

public class Backend {
    Scanner input = new Scanner(System.in);
    private Frontend window;

    public Backend() {
        this.window = new Frontend(this);
    }

    public static void main(String[] args) {
        Backend backend = new Backend();
    }

    public String favMeal(){
        System.out.println("What is your favorite meal?");
        return input.nextLine();
    }
}
