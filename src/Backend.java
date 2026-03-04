import java.util.Scanner;

public class Backend {
    private Frontend window;
    private static String favorite;

    public Backend() {
        this.window = new Frontend(this);
    }

    public static void main(String[] args) {
        System.out.println("Please enter your favorite animal: ");
        Scanner scanner = new Scanner(System.in);
        favorite = scanner.nextLine();
        Backend backend = new Backend();

    }

    public String getFavorite() {
        return favorite;
    }
}
