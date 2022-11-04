package com.mike.taobao.Utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class IdUtils {
    public static String CreateId(String prefix){
        Date now = new Date();
        DateFormat df = new SimpleDateFormat("yyMMddHHmmsss");
        String nowDatetime = df.format(now);
        String suffix = Integer.toString( (int)(Math.random() * (99999 - 10000)) + 10000);
        return prefix+nowDatetime+suffix;
    }
}
