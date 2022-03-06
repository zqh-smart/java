package 蓝桥杯.规律;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/*
* 小蓝要和朋友合作开发一个时间显示的网站。
在服务器上，朋友已经获取了当前的时间，用一个整数表示，
* 值为从 1970 年 1 月 1 日 00:00:00 到当前时刻经过的毫秒数。
现在，小蓝要在客户端显示出这个时间。小蓝不用显示出年月日,
* 只需要显示出时分秒即可，毫秒也不用显示，直接舍去即可。
给定一个用整数表示的时间，请将这个时间对应的时分秒输出。
输入描述
输入一行包含一个整数，表示时间。
输出描述
输出时分秒表示的当前时间，格式形如 HH:MM:SS，其中 HH 表示时，值为 0 到 23
* ，MM 表示分，值为 0 到 59，S 表示秒，值为 0 到 59。
* 时、分、秒 不足两位时补前导 0。
输入输出样例
示例 1
输入
46800999
输出
13:00:00
* */
public class 时间显示 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        Long n=scan.nextLong();
        long hours= TimeUnit.MILLISECONDS.toHours(n);
        long minutes= TimeUnit.MILLISECONDS.toMinutes(n);
        long second= TimeUnit.MILLISECONDS.toSeconds(n);
        hours=hours%24;
        minutes=minutes%60;
        second=second%60;
        String str1 = null;
        String str2 = null;
        String str3=null;
        if(hours<10){
            str3="0"+hours;
        }else{
            str3=""+hours;
        }
        if(minutes<10)
            str1="0"+minutes;
        else{
            str1=""+minutes;
        }
        if(second<10)
            str2="0"+second;
        else{
            str2=""+second;
        }
        System.out.println(str3+":"+str1+":"+str2);
        scan.close();
    }
}
