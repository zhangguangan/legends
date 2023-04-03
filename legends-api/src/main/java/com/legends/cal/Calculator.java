package com.legends.cal;

import java.util.Map;

public interface Calculator {
    Object calc(String expression, Map<String, Object> params);

    Integer calStrategy();
}
