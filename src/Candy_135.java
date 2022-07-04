public class Candy_135 {
    public int candy(int[] ratings) {
        int[] candy = new int[ratings.length];
        for (int i = 0; i < ratings.length; i++) {
            candy[i] = 1;
        }

        int count = ratings.length;
        for (int i = 0; i < ratings.length; i++) {
            for (int j = i; j > 0; j--) {
                if((ratings[j-1] > ratings[j]) && (candy[j-1] <= candy[j])){
                    count++;
                    candy[j-1]++;
                } else
                    break;
            }

            for (int j = i; j < ratings.length - 1; j++) {
                if((ratings[j+1] > ratings[j]) && (candy[j+1] <= candy[j])){
                    count++;
                    candy[j+1]++;
                } else
                    break;
            }
        }

        System.out.println(count);
        return count;
    }
}
