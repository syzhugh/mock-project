package com.sunladder.mock.bean;

import com.sunladder.mock.anno.Parser;

import java.lang.reflect.Field;

abstract class BaseBean {

    BaseBean() {
        for (Field field : this.getClass().getDeclaredFields()) {
            Parser.parseInstance(this, field);
        }
    }
}
