/**
 *
 */
module third.part {
    requires java.base;
    requires java.management;
    requires jdk.unsupported;

    requires com.google.common;
    requires hutool.core;

    exports cn.az.java.concurrency;
}
