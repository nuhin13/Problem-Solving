public class DailyTemperatures_739 {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] temp = new int[temperatures.length];

        for (int i = 0; i < temperatures.length - 1; i++) {
            int b = i;
            int count = 0;
            while (true){
                if(b>=temperatures.length){
                    count = 0;
                    break;
                }

                if(temperatures[b++]>temperatures[i])
                    break;
                count++;
            }

            temp[i] = count;
        }

        return temp;
    }
}
