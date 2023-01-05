public class DeleteColumnstoMakeSorted_944 {
    public int minDeletionSize(String[] strs) {

        if (strs.length == 1)
            return 0;

        int m = strs.length;
        int n = strs[0].length();

        int i = 0, j = 0, count = 0;

        while ((i < m) && (j < n)) {
            System.out.println(i + " " + j + " " + strs[i].charAt(j));

            if ((i + 1) <= m && strs[i].charAt(j) <= strs[i + 1].charAt(j)) {
                i++;

                if (i+1 == m) {
                    j++;
                    i = 0;
                    System.out.println(i + " " + j + " " + "ddd");
                } else{

                    System.out.println(i + " " + j + " ");
                }

            } else{
                count++;
                i =0 ;
                j++;
            }


        }

        System.out.println(count);

        return count;
    }
}
