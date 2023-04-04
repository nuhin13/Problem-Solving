import java.util.Arrays;

public class BoatstoSavePeople_881 {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count = 0, low = 0, high = people.length - 1;
        while (low < high){
            if(people[high] == limit || (people[low] + people[high]) > limit){
                high--;
                count++;
                continue;
            }
            if((people[low] + people[high]) == limit){
                low++;
                high--;
                count++;
            } else if ((people[low] + people[high]) < limit) {
                low++;
            }
        }

        if(low == high)
            count++;

        return count;
    }
}
