package am.iguan.taskmanager.util;

/**
 * Created by Admin on 15.12.2014.
 */
public class Validator {

    public static boolean isEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }
}
