public class Backend {
    private Frontend window;

    public Backend() {
        this.window = new Frontend(this);
    }

    public static void main(String[] args) {
        Backend backend = new Backend();
    }

}
