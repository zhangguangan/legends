package com.legends;

import com.googlecode.aviator.AviatorEvaluator;
import com.googlecode.aviator.AviatorEvaluatorInstance;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: rookie
 * @date: 2023/3/31 11:13
 * @desc:
 */
public class test {

    public static void aviatorTest() {
        AviatorEvaluatorInstance aviatorEvaluator = AviatorEvaluator.getInstance();

        Map<String, Object> paramsMap = new HashMap<>();
        paramsMap.put("a", 1);
        paramsMap.put("b", 2);
        Object result = aviatorEvaluator.execute("a + b", paramsMap);
        System.out.println(result);
    }

    public static void main(String[] args) {
        aviatorTest();
    }
}
