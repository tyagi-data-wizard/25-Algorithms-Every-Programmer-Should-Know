public class EuclideanAlgorithm {

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int a = 48, b = 18;
        int gcdResult = gcd(a, b);
        System.out.println("GCD of " + a + " and " + b + " is " + gcdResult);
    }
}

/*This Java program implements the Euclidean Algorithm to find the greatest common divisor (GCD) of two integers. 
    The `gcd` method is a recursive function that efficiently calculates the GCD by repeatedly taking the remainder of the division until the remainder is zero. 
    The `main` method demonstrates the usage by finding and printing the GCD of two predefined integers, 48 and 18.*/
