public class RomantoInteger_13 {
    public int romanToInt(String s) {
        int sum = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            System.out.println(i);
            System.out.println(sum);

            if (s.charAt(i) == 'I') {
                if (i + 1 <= length) {
                    if (s.charAt(i) == 'V') {
                        sum = sum + 4;
                        i++;
                    } else if (s.charAt(i) == 'X') {
                        sum = sum + 9;
                        i++;
                    } else {
                        sum = sum + 1;
                    }
                } else {
                    sum = sum + 1;
                }
            } else if (s.charAt(i) == 'V') {
                sum = sum + 5;
            } else if (s.charAt(i) == 'X') {
                if (i + 1 <= length) {
                    if (s.charAt(i + 1) == 'L') {
                        sum = sum + 40;
                        i++;
                    } else if (s.charAt(i + 1) == 'C') {
                        sum = sum + 90;
                        i++;
                    } else {
                        sum = sum + 10;
                    }
                } else {
                    sum = sum + 10;
                }
            } else if (s.charAt(i) == 'L') {
                sum = sum + 50;
            } else if (s.charAt(i) == 'C') {
                if (i + 1 <= length) {
                    if (s.charAt(i + 1) == 'D') {
                        sum = sum + 400;
                        i++;
                    } else if (s.charAt(i + 1) == 'M') {
                        sum = sum + 900;
                        i++;
                    } else {
                        sum = sum + 100;
                    }
                } else {
                    sum = sum + 100;
                }
            } else if (s.charAt(i) == 'D') {
                sum = sum + 500;
            } else if (s.charAt(i) == 'M') {
                sum = sum + 1000;
            }
        }

        return sum;
    }
}
