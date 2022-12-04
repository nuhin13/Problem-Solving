import java.util.List;

public class DetermineifStringHalvesAreAlike_1704 {
    public boolean halvesAreAlike(String s) {
        String a = s.substring(0, s.length()/2);
        String b = s.substring(s.length()/2);
        List<Character> vowels = List.of('a','e','i','o','u', 'A', 'E', 'I', 'O', 'U');

        int aCount = 0;
        int bCount = 0;
        for (int i = 0; i<s.length()/2; i++){
            if(vowels.contains(a.charAt(i))) {
                aCount++;
            }
            if(vowels.contains(b.charAt(i))) {
                bCount++;
            }
        }

        System.out.println(aCount + " " + bCount);
        return aCount == bCount;
    }
}
