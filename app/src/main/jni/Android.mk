LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE := jni-demo
LOCAL_SRC_FILES := demo.c

include $(BUILD_SHARED_LIBRARY)