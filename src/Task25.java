public class Task25 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("y=1");
        } else {
            System.out.println("y=2");
        }
    }
}
