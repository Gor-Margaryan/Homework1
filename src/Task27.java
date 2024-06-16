public class Task27 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        if (b - a == c - b || c - b == a - c || b - c == a - b || c - a == b - c || a - c == b - a||
        a - b == c - a){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
