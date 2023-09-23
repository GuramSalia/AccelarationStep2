package ge.mycompany;

/**
 * Hello world!
 */
public class AccelerationTaskSolution {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";

        System.out.println(sumTwoBinaryStrings(a, b));

    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static int minSplit(int amount) {
        int[] coins = {50, 20, 10, 5, 1};
        int numCoins = 0;

        for (int i = 0; i < coins.length; i++) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                numCoins++;
            }
        }
        return numCoins;
    }

    public static int notContains(int[] array) {
        int smallestPositive = 1;

        for (int num : array) {
            if (num == smallestPositive) {
                smallestPositive++;
            }
        }

        return smallestPositive;
    }

    public static String sumTwoBinaryStrings(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;

        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            result.insert(0, sum % 2);
            carry = sum / 2;
        }
        return result.toString();
    }

    public static int countVariants(int stairsCount) {
        if (stairsCount <= 2) {
            return stairsCount;
        }

        int[] dp = new int[stairsCount + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= stairsCount; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[stairsCount];
    }


}
