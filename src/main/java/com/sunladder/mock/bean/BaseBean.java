package com.sunladder.mock.bean;

import com.sunladder.mock.anno.Parser;
import com.sunladder.mock.interfaces.JsonConversion;

import java.lang.reflect.Field;

abstract class BaseBean implements JsonConversion {

    BaseBean() {
        for (Field field : this.getClass().getDeclaredFields()) {
        Parser.parseInstance(this, field);
        }
    }
}
