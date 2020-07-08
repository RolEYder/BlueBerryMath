package BlueBerryMath.Other;

public class Other {

    /**
     * Computes the factorial of the number n.
     * @param n The number for which to calculate the factorial.
     * @return The factorial of the number n. (n!).
     */
    public static long factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }


    /**
     * Computes the binomial combination of the arguments n and k.
     * @param n The number of elements in the sample space.
     * @param k The number of elements to chose from the sample space n.
     * @return The number of ways, disregarding order, that k elements can be chosen from among n elements.
     */
    public static long choose(int n, int k) {
        // The argument n must be greater than or equal to k.
        if (n < k) throw new Error("Integer 'n' must be greater than or equal to integer 'k'.");

        return factorial(n) / (factorial(k) * factorial(n - k));
    }
}