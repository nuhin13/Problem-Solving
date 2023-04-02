import java.util.Arrays;

public class SuccessfulPairsofSpellsandPotions_2300 {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] result = new int[spells.length];
        Arrays.sort(potions);
        for (int i = 0; i < spells.length; i++) {
            int low = 0, high = potions.length - 1, previousIndex = 0;

            while(low <= high){
                int mid = low + (high - low) / 2 ;
                long product = (long) spells[i] * potions[mid] ;
                if (product >= success){
                    high = (mid - 1);
                    previousIndex =  mid;
                } else {
                    low = (mid + 1);
                }
            }

            result[i] = potions.length - previousIndex;
        }

        return result;
    }
}
