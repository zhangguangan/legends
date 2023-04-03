package com.legends.ex;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseException extends RuntimeException {

    private String code;
    private String message;


    public BaseException() {
        super();
        this.code = "00000";
        this.message = "运行时异常";
    }

    public BaseException(String code, String message) {
        super(message);

        this.code = code;
        this.message = message;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
