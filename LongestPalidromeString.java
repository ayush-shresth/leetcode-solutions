public class LongestPalidromeString {
    public static void main(String[] args) {
        String s = "aabababb";
        int i = 0;
        int j = s.length();
       
        int arrr[] = new int[2];
        int a[] = solve(s, i, j, arrr);
       
        System.out.println(s.substring(a[0], a[1]));
    }

    static int[] solve(String s, int i, int j, int arr[]) {
        // base
        if (j == i)
            return arr;

        if (isPalindrome(s.substring(i, j)) && Math.abs(arr[1] - arr[0]) < Math.abs(j - i)) {

            arr[0] = i;
            arr[1] = j;

        }
        solve(s, i + 1, j, arr);
        solve(s, i, j - 1, arr);
        return arr;

    }

    static boolean isPalindrome(String s) {
        String a = s;
        StringBuilder sb = new StringBuilder(s);
        return (a.equals(sb.reverse().toString()));

    }
    
}
