import java.util.Scanner;

public class Backend {
    private Frontend window;
    private String birthMonth;
    private String birthDay;
    private String birthYear;

    Scanner scanner = new Scanner(System.in);

    public Backend(String birthMonth) {
        this.window = new Frontend(this);
    }



    public String toString() {
        return (birthMonth + ", " + birthDay + ", " + birthYear);
    }

    public static void main(String[] args) {
        Backend backend = new Backend();
    }


    public Object toString(Frontend frontend) {
    }
}
