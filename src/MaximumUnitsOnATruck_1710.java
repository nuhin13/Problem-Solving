import java.util.Arrays;

public class MaximumUnitsOnATruck_1710 {

    /// Greedy Approach
    /// First Sort the Array then compare the box count
    public int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1],a[1]));
        int unitCount = 0;

        /// Print data
        /*for (int i = 0; i < boxTypes.length; i++) { //this equals to the row in our matrix.
            for (int j = 0; j < boxTypes[i].length; j++) { //this equals to the column in each row.
                System.out.print(boxTypes[i][j] + " ");
            }
            System.out.println(); //change line on console as row comes to end in the matrix.
        }*/

        for (int i = 0; i< boxTypes.length; i++){
            if(truckSize == 0)
                break;
            int count = boxTypes[i][0];

            if(truckSize > count){
                unitCount =  unitCount + count * boxTypes[i][1];
                truckSize = truckSize - count;
            } else {
                count = truckSize;
                unitCount =  unitCount + count * boxTypes[i][1];
                truckSize = 0;
            }
        }

        //System.out.println(" " + unitCount);

        return unitCount;
    }
}
