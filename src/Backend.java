import java.util.Scanner;

public class Backend {
    Scanner s = new Scanner(System.in);
    private Frontend window;

    public Backend() {
        this.window = new Frontend(this);
    }

    public static void main(String[] args) {
        Backend backend = new Backend();
    }

    public String favMeal(){
        System.out.print("What is your favorite meal?");
        String favmeal = s.nextLine();
        return favmeal;
    }

}
