package com.sunladder.mock.interfaces;

import com.sunladder.mock.utils.JsonConvertUtil;

public interface JsonConversion {

    default String getJsonString(){
        return JsonConvertUtil.toJson(this);
    }
}
