module mctool.main {
    requires kotlin.stdlib;
    requires tornadofx;
    requires javafx.base;
    requires javafx.controls;
    requires kotlinx.coroutines.core.jvm;
    requires fuel;
    requires fuel.gson;
    requires result;
    requires org.objectweb.asm;

    exports szewek.mctool;
    exports szewek.mctool.app;
}