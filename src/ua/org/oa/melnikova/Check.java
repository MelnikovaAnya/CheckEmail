package ua.org.oa.melnikova;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check {
    private static final Pattern pt = Pattern.compile
            ("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    public  static Boolean email(String adress){
        Matcher mt = pt.matcher(adress);
        return mt.matches();
    }
}
