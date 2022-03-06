package 动态规划.子序列.不连续;
/*
* 给定两个字符串text1 和text2，
* 返回这两个字符串的最长公共子序列的长度。如果不存在 公共子序列 ，返回 0 。
一个字符串的子序列是指这样一个新的字符串：
* 它是由原字符串在不改变字符的相对顺序的情况下删除某些字符
* （也可以不删除任何字符）后组成的新字符串。
例如，"ace" 是 "abcde" 的子序列，但 "aec" 不是 "abcde" 的子序列。
两个字符串的 公共子序列 是这两个字符串所共同拥有的子序列。
示例 1：
输入：text1 = "abcde", text2 = "ace"
输出：3
解释：最长公共子序列是 "ace" ，它的长度为 3 。
示例 2：
输入：text1 = "abc", text2 = "abc"
输出：3
解释：最长公共子序列是 "abc" ，它的长度为 3 。
* */
public class 最长公共子序列 {
    public static void main(String[] args) {
        String str1="abc";
        String str2="abc";
        int res=longestCommonSubsequence(str1,str2);
        System.out.println(res);
    }
    public static int longestCommonSubsequence(String text1, String text2) {
        int[][] dp=new int[text1.length()+1][text2.length()+1];
        for(int i=0;i<text1.length();i++){
            dp[i][0]=0;
        }
        for(int i=0;i<text2.length();i++){
            dp[0][i]=0;
        }
        int result=0;
        for(int i=1;i<=text1.length();i++){
            for(int j=1;j<=text2.length();j++){
                if(text1.charAt(i-1)==text2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1]+1;
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }
}
