public class LambdaExample {
    public static void main(String[] args) {
        OddnumberCheck oddnumberCheck = (int number) -> number % 2 != 0;
        int num = 32;
        System.out.println("is " + num + " odd? " + oddnumberCheck.check(num));


        PrimeNumber primeNumber = (int number) -> {
            if (number < 2) {
                return false;
            }
            for (int i = 2; i*i <= number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        };

        int pnum = 3;
        System.out.println("is "+pnum+" prime? "+primeNumber.check(pnum));

        Palindrome palindrome = (String str) ->{
            StringBuilder sb = new StringBuilder(str);
            String reversed = sb.reverse().toString();
            return str.equals(reversed);
        };
            System.out.println("is "+"amar"+" palindrome? " +palindrome.check("amar"));
    }
}
