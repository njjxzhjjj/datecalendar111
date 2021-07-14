package com.hp.DateandCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周
 */
public class DateTest03 {
    public static void main(String[] args) {
        System.out.println("请输入您的生日:(格式为 yyyy-MM-dd)");
        Scanner scanner = new Scanner(System.in);
        String bir = scanner.nextLine();//接收生日
        //修改日期显示格式为"yyyy-MM-dd"
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //matches.regex正则表达式  (\\d表示0-9数字  \\d{1,2}　一到两位数字  \\d{4} 4位数字)
        if (bir.matches("[\\d]{4}-[\\d]{2}-[\\d]{2}")) {
            //（处理parse异常）
            Date parse = null;
            try {
                parse = sdf.parse(bir);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            //定义一个日期
            Date date = new Date();
            //获取出生的时间
            long birlong = parse.getTime();
            //获取今天的时间
            long nowlong = date.getTime();
            //经历了多少周   （用今天的时间-出生的时间）=活了多少时间
            long timelong = nowlong - birlong;//从出生 活了多少时间
            //24*60*60*1000一天的时间
            long week = timelong/(24 * 60 * 60 * 1000)/7;
            System.out.println("到现在为止经过了:" + week + "周");
        }else {
            System.out.println("输入格式错误");
        }
    }
}
