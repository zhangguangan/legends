package com.legends.cal;

import java.util.Map;

public interface SqlCalculator {
    Map<String, Object> cal(Map<String, Object> sqlConfigMap);
}
