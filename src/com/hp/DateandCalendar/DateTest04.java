package com.hp.DateandCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 */
public class DateTest04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入生产日期:(格式为 yyyy-MM-dd)");
        String data = scanner.nextLine();//接收日期

        System.out.println("请输入保质期的天数");
        int number = scanner.nextInt();//接收保质期天数
        //修改日期显示格式为"yyyy-MM-dd"
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //matches.regex正则表达式  (\\d表示0-9数字  \\d{1,2}　一到两位数字  \\d{4} 4位数字 )
        if (data.matches("[\\d]{4}-[\\d]{2}-[\\d]{2}")) {
        //处理parse异常
            Date date = null;
            try {
                date = sdf.parse(data);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            //创建日历对象  不仅仅只有new，还有类的实例方法
        Calendar calendar = Calendar.getInstance();

        //设置日期时间
        calendar.setTime(date);

        //给保质期添加天数
        calendar.add(Calendar.DAY_OF_YEAR, number);

        //减去2周    或者 减去14天（calendar.DAY_OF_YEAR, -14）
        calendar.add(Calendar.WEEK_OF_YEAR, -2);
        //calendar.add(Calendar.DAY_OF_YEAR, -14);

        //设置确定的日期周几(当前的周三日期 )
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
        //获取时间
        date = calendar.getTime();
        String number1 = sdf.format(date);
        System.out.println("促销日期为"+number1);
        }else{
            System.out.println("输入格式错误！！！！请输入正确的格式！！！");
        }

    }
}
