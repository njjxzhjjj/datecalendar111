package com.hp.DateandCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 将当前系统时间以"yyyy-MM-dd HH:mm:ss"格式输出
 */
public class DateTest02 {
    public static void main(String[] args) {
        Date date = new Date();
        //修改日期显示格式   改为"yyyy-MM-dd HH:mm:ss"
        String pattern="yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String cd = sdf.format(date);
        System.out.println("当前系统时间为 " + cd);
    }
}
