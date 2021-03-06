package 回溯.练习;

public class 单词搜索 {
    public static void main(String[] args) {
        char[][] array = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word="ABCCED";
        boolean res=exist(array,word);
        System.out.println(res);
    }
    public static boolean exist(char[][] board, String word) {
        int h=board.length;
        int w=board[0].length;
        boolean[][] visited=new boolean[h][w];
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                boolean flag=check(board,visited,i,j,word,0);
                if(flag){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean check(char[][] board, boolean[][] visited, int i, int j, String word, int k) {
    if(board[i][j]!=word.charAt(k)){
        return false;
    }else if(k==word.length()-1){
        return true;
    }
    visited[i][j]=true;
    int[][] direction= {{0,1},{0,-1},{1,0},{-1,0}};
    boolean result=false;
    for(int[] digit:direction){
        int newi=i+digit[0];
        int newj=j+digit[1];
        if(newi>=0&&newi< board.length&&newj>=0&&newj<board[0].length){
            if(!visited[newi][newj]){
                boolean flag=check(board,visited,newi,newj,word,k+1);
                if(flag){
                    result=true;
                   break;
                }
            }
        }
    }
    visited[i][j]=false;
    return result;
    }
}
