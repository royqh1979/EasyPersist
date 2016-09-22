package net.royqh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Roy on 2016/8/29.
 */
public final  class SqlTools
{
    private static Pattern identifierPattern=Pattern.compile("^[A-Za-z]\\w+$");
    public static boolean isValidColumnName(String columnName) {
        Matcher matcher=identifierPattern.matcher(columnName);
        return matcher.matches();
    }

}
