import java.util.Scanner;

public class Backend {
    private Frontend window;

    public Backend() {
        this.window = new Frontend(this);
    }

    public static void main(String[] args) {
        Backend backend = new Backend();
    }

    public String favMeal(){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your favorite meal?");
        return input.nextLine();
    }

    public String favAnimal(){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your favorite meal?");
        return input.nextLine();
    }
}
