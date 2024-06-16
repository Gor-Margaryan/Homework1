public class Task28 {
    public static void main(String[] args) {
        float a = 1f;
        float b = 2f;
        float c = 3f;
        if (b / a == c / b || c / b == a / c || b / c == a / b || c / a == b / c || a / c == b / a || a / b == c / a){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
