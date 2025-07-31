public class SimpleSystemInfo {
    public static void main(String[] args) {
        System.out.println("OS: " + System.getProperty("os.name"));
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("User: " + System.getProperty("user.name"));
    }
}
