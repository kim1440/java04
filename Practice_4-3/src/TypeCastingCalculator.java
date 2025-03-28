public class TypeCastingCalculator {
    public static void main(String[] args) {
        double doubleValue = 2.71828;

        System.out.println("\n== double 형변환");
        System.out.print("1. double -> byte: " + (byte)doubleValue);
        System.out.print("2. double -> short: " + (short)doubleValue);
        System.out.print("3. double -> int: " + (int)doubleValue);
        System.out.print("4. double -> long: " + (long)doubleValue);
        System.out.print("5. double -> float: " + (float)doubleValue);
    }
}