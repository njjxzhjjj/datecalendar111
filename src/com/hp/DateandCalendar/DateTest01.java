package com.hp.DateandCalendar;
import java.util.Date;
/**
 * 使用Date输出当前系统时间，以及3天后这一刻的时间
 */
public class DateTest01 {
    public static void main(String[] args) {
        //定义一个日期
        Date date = new Date();
        System.out.println("当前时间为 " + date);//当前时间
        long time = date.getTime();//获得真实的时间  long值
        System.out.println("time = " + time);//time = 1626243730298
        //3天后这一刻的时间    1000为一秒 *60为一分钟 再*60为一小时   *24为一天  *3是三天后
        time +=1000*60*60*24*3l;
        date.setTime(time);
        System.out.println("3天后的时间为 " + date);
    }
}
