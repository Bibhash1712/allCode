import java.util.*;

public class MaxLengthWIthEqualZeroOne {
    public static void main(String args[]) {
        String s = "1010";
        char c[] = s.toCharArray();
        int A[] = new int[c.length + 1];
        A[0] = 0;
        int max = 0, max_so_far = 0, sum = 0;
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '0')
                sum++;
            else
                sum--;
            if(sum == 0)
                max_so_far = i +1;
            if (h.containsKey(sum)) {
                System.out.println("***** if "+sum + " *** "+h.get(sum));
                if (max_so_far < i - h.get(sum) )
                    max_so_far = i - h.get(sum);
            }
            else {
                System.out.println("***** else "+sum);
                h.put(sum, i);
            }
        }
        System.out.println(max_so_far);
    }
}
