package 动态规划.练习;
/*
* 给你一个整数 n ，返回 和为 n 的完全平方数的最少数量 。
完全平方数 是一个整数，其值等于另一个整数的平方；
* 换句话说，其值等于一个整数自乘的积。
* 例如，1、4、9 和 16 都是完全平方数，而 3 和 11 不是。
示例1：
输入：n = 12
输出：3
解释：12 = 4 + 4 + 4
示例 2：
输入：n = 13
输出：2
解释：13 = 4 + 9
* */
public class wanquanpingfangshu {
    public static void main(String[] args) {
        int n=12;
        int res=numSquares(n);
        System.out.println(res);
    }
    public static int numSquares(int n) {
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=1;i<=n;i++){
            int minn=Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++){
                minn=Math.min(minn,dp[i-j*j]);
            }
            dp[i]=minn+1;

        }
        return dp[n];
    }
}
/*
* 我们可以依据题目的要求写出状态表达式：f[i] 表示最少需要多少个数的平方来表示整数i。
* 这些数必然落在区间 [1,根号n]。我们可以枚举这些数，假设当前枚举到j，那么我们还需要取若干数的平方，构成 i-j^2
* 。此时我们发现该子问题和原问题类似，只是规模变小了。这符合了动态规划的要求，于是我们可以写出状态转移方程。
* dp[i]=1+dp[i-j*j]
* */