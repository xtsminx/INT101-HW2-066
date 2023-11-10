package work01;
public class Utilitor {
    public static String testString(String value){
        if (value == null) {
            throw new NullPointerException("Value cannot be null");
        }
        if (value.isBlank()) {
            throw new IllegalArgumentException("Value cannot be a blank string");
        }
        return value;
    }
    public static double testPositive(double value){
        if (value > 0) {
            return value;
        } else {
            throw new IllegalArgumentException("Value must be a positive number");
        }
    }
    public static long computeIsbn10(long isbn10) {
        if (isbn10 < 0 || isbn10 > 1000000000) {
            throw new IllegalArgumentException("ISBN-10 must be a 9-digit positive number");
        }
        int result = 0;
        for (int i = 2; i <= 10; i++) {
            int digit = (int) isbn10 % 10;
            result += digit*i;
            isbn10/=10;
        }
        return (11-(result%11))%11;
    }
}
