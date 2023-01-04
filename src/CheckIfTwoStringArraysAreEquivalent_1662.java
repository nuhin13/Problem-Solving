public class CheckIfTwoStringArraysAreEquivalent_1662 {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w1 = "", w2 = "";
        for (String value : word1) {
            w1 += value;
        }
        for (String s : word2) {
            w2 += s;
        }
        System.out.println(w1 + " " + w2);
        return w1.equals(w2);
    }
}
