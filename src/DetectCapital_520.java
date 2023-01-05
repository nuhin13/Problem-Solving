public class DetectCapital_520 {
    public boolean detectCapitalUse(String word) {

        if (word.length() == 1) return true;
        boolean isPreviousItem = isCaps(word.charAt(0));

        for (int i = 1; i < word.length(); i++) {
            //System.out.println(isPreviousItem);
            boolean currentItem = isCaps(word.charAt(i));
            if (i == 1) {
                if (!isPreviousItem && currentItem) {
                    return false;
                }
                isPreviousItem = currentItem;
            } else {
                if ((isPreviousItem && currentItem) || (!isPreviousItem && !currentItem)) {
                    isPreviousItem = currentItem;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean isCaps(char word) {
        return word >= 65 && word <= 90;
    }

}
