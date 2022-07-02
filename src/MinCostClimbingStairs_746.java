public class MinCostClimbingStairs_746 {
    public int minCostClimbingStairs(int[] cost) {

        if(cost.length == 2)
            return cost[0];

        int[] costRemap = new int[cost.length + 1];

        System.arraycopy(cost, 0, costRemap, 0, cost.length);
        costRemap[cost.length] = -1;

        int minCont = cost[0];
        int i = 0;
        if(cost[0] > cost[1]){
            minCont = cost[1];
            i = 1;
        }

        while (costRemap[i] != - 1){
            if(cost[i+1] > cost[i+2]){
                minCont = minCont + cost[i+2];
                i++;
            } else {
                minCont = minCont + cost[i+1];
                i = i + 2;
            }
        }


        return 1;
    }
}
