package com.legends.domain;

import lombok.Getter;
import lombok.Setter;
import com.alibaba.fastjson.JSONObject;

/**
 * @author: rookie
 * @date: 2023/3/31 10:56
 * @desc: 基础对象
 */
@Getter
@Setter
public class BaseDomain {

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
