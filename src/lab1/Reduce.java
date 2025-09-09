package lab1;

public class Reduce {
    public static void main(String[] args) {
        System.out.println(reduce(2));
    }

    public static int reduce(int n){
        if (n == 0) {
            return 0;
        }
        if (n % 2 == 0){
            return reduce(n / 2) + 1;
        }
        return reduce(n - 1) + 1;
    }
}
