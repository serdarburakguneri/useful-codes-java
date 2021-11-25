package com.sbg.factorywithannotations.export;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*

Retention Types;

SOURCE -> exists in source file, discarded by compiler

CLASS -> compiled into class file, discarded by runtime

RUNTIME -> loaded into runtime, accessible with reflection

TARGET;

By default, can be applied to any target

ElementType.TYPE -> can be used with types
ElementType.METHOD -> can be used with methods
...

 */

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface ExporterType {
  String value();
}
