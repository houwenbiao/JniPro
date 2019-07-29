package qtimes.cc.jnipro;

/**
 * Author: JackHou
 * Date: 2019/7/29.
 */
public class JNITest {

    static {
        System.loadLibrary("jni-demo");
    }

    public native static String getStrFromJNI();
}
