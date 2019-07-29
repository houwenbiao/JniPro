#include<jni.h>

jstring Java_qtimes_cc_jnipro_JNITest_getStrFromJNI(JNIEnv *env,jobject thiz){
    return (*env)->NewStringUTF(env,"I am Str from jni libs!");
}