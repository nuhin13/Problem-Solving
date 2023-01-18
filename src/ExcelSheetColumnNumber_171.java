public class ExcelSheetColumnNumber_171 {
    public int titleToNumber(String columnTitle) {
        int power = 0;
        int sum = 0;

        for (int i = columnTitle.length() - 1; i >= 0; i--) {

            System.out.println((columnTitle.charAt(i) - 64));
            System.out.println((int)(Math.pow(26, power)));

            sum = sum + ((columnTitle.charAt(i) - 64) * (int)(Math.pow(26, power)));
            power++;
        }

        return sum;
    }
}
