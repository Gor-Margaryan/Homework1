public class Task24 {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int c = 4;
        if ((a == 2 && b == 2 && c != 2)||(a == 2 && c == 2 && b != 2) || (b == 2 && c == 2 && a != 2)) {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
