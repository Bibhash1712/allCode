import java.util.*;
public class Lcs {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String s1 = "AGGTAB";
        String s2 = "bibhash";
        char A[]=s1.toCharArray();
        char B[]=s2.toCharArray();
        int m = s1.length();
        int n= s2.length();
        Lcs lcs = new Lcs();
        System.out.print(lcs.find_using_dp(A,B,m,n));
    }
    public int find(char A[], char B[], int m,int n)
    {
        if(m == 0 || n ==0)
            return 0;
        if(A[m-1] == B[n-1])

            return 1+ find(A,B,m-1,n-1);
        else
            return Math.max(find(A,B,m-1,n),find(A,B,m,n-1));
    }
    public int find_using_dp(char A[],char B[],int m,int n)
    {
        int C[][] = new int[m+1][n+1];
        for (int i=1;i<=m;i++)
        {
            for (int j=1;j<=n;j++)
            {
                if(A[i-1] == B[j-1])
                    C[i][j] = C[i-1][j-1] +1;
                else
                    C[i][j] = Math.max(C[i][j-1],C[i-1][j]);
            }
        }
        return C[m][n];
    }
}
