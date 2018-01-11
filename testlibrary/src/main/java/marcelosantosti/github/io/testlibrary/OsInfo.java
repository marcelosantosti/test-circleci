package marcelosantosti.github.io.testlibrary;

import android.os.Build;

import java.lang.reflect.Field;

/**
 * Created by marcelosantos on 11/01/18.
 */

public class OsInfo {
    public static String getPlatform() {
        String osName = "";

        try {
            Field[] fields = Build.VERSION_CODES.class.getFields();
            int position = Build.VERSION.SDK_INT;

            //if greater than KitKat, there is an additional version in 'fields' that is not actually used.
            if (position > 20) {
                position += 1;
            }

            osName = fields[position].getName();

            //Log.d("OsInfo", "Gotten Platform: " + osName);

            return osName;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return osName;
    }
}
