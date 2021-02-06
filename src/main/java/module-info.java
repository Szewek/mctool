module mctool.main {
    requires kotlin.stdlib;
    requires kotlin.reflect;
    requires tornadofx;
    requires javafx.base;
    requires javafx.controls;
    requires fuel;
    requires java.sql;
    requires fuel.gson;
    requires result;
    requires org.objectweb.asm;
    requires toml;
    requires core;
    requires java.json;
    requires org.objectweb.asm.tree;
    requires kotlin.stdlib.jdk8;
	requires org.objectweb.asm.util;
	requires annotations;
	requires com.google.gson;

	exports szewek.mctool;
    exports szewek.mctool.app;

    opens szewek.mctool.cfapi to com.google.gson;
    opens szewek.mctool.mcdata to com.google.gson;
}