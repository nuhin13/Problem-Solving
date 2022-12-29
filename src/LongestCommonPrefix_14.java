public class LongestCommonPrefix_14 {

    public String longestCommonPrefix(String[] strs) {

        String s = "0";
        System.out.println(Integer.parseInt(s));

        if (strs.length == 0)
            return "";
        if (strs.length == 1)
            return strs[0];

        String st = strs[0];

        for (int i = 1; i < strs.length; i++) {
            for (int j = 0; j < st.length(); j++) {
                System.out.println(st + " " + j + " "+  strs[i].length());
                if (j == strs[i].length()) {
                    st = st.substring(0, j);
                    break;
                }
                if (st.charAt(j) != strs[i].charAt(j)) {
                    st = st.substring(0, j);
                    break;
                }
            }
        }

        System.out.println(st);
        return st;

    }
}
