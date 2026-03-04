import java.util.Scanner;

public class Backend {
    private Frontend window;

    public Backend() {
        this.window = new Frontend(this);
    }

    public static void main(String[] args) {
        Backend backend = new Backend();
    }
    public String getUserName(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        return scan.nextLine();
    }


}
