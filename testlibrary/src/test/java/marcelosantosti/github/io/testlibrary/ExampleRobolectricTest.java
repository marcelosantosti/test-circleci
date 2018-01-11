package marcelosantosti.github.io.testlibrary;

import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;

import static junit.framework.Assert.assertNotNull;

/**
 * Created by marcelosantos on 11/01/18.
 */
@RunWith(RobolectricTestRunner.class)
public class ExampleRobolectricTest {
    @Test
    public void isRobolectricSetup() {
        Context context = RuntimeEnvironment.application;
        assertNotNull(context);
    }
}
