package 回溯.练习;

import java.util.ArrayList;
import java.util.List;

/*
* 给定一个字符串S，通过将字符串S中的每个字母转变大小写，
* 我们可以获得一个新的字符串。返回所有可能得到的字符串集合。
示例：
输入：S = "a1b2"
输出：["a1b2", "a1B2", "A1b2", "A1B2"]
输入：S = "3z4"
输出：["3z4", "3Z4"]
输入：S = "12345"
输出：["12345"]
* */
public class 字母大小写全排列 {
    public static void main(String[] args) {
        String str="a1b2";
        List<String> list=letterCasePermutation(str);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    public static List<String> letterCasePermutation(String s) {
        List<String> result=new ArrayList<>();

        return result;
    }

}
