package marcelosantosti.github.io.testcircleci;

import android.content.Context;
import android.os.Build;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.lang.reflect.Field;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("marcelosantosti.github.io.testcircleci", appContext.getPackageName());
    }

//    @Test
//    public void useAppContextFail() throws Exception {
//        // Context of the app under test.
//        Context appContext = InstrumentationRegistry.getTargetContext();
//
//        assertEquals("marcelosantosti.github.io.testcircleci", "test");
//    }

//    @Test
//    public void getPlatform_shouldNotBeEmpty() {
//        String platform = getPlatform();
//
//        assertTrue(platform != "");
//    }


}
