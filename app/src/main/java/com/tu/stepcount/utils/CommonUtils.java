package com.tu.stepcount.utils;

import com.tu.stepcount.model.Constant;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * create 16/01/2020 by Tu
 * CommonUtils
 * * getKeyToday
 * * getStepNumber
 */
public class CommonUtils {
    public static String getKeyToday() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(Constant.DATE_FORMAT);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static int getStepNumber() {
        return SharedPreferencesUtils.getInstance().get(getKeyToday(),Integer.class);
    }
}
