//--------> 50. Pow(x, n) <---------
public class Main {
    //leetcode function
    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        return calculatePower(x, n );
        // return n % 2 == 0 ? power * power : power * power * x;
    }

    public static double calculatePower(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        double half = calculatePower(x, n / 2);
        return n % 2 == 0 ? half * half : half * half * x;
    }
    public static void main(String[] args) {
        double x =2.0000;
        int n = 10;
        System.out.println(calculatePower(x,n));
    }
}