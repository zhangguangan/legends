package com.legends.cal.func;

import com.legends.cal.ExpressionCalc;
import com.legends.enums.CalStrategyEnums;

import java.util.Map;

/**
 * @author: rookie
 * @date: 2023/3/31 11:20
 * @desc: 多个list通过公式计算
 */
public class groupExpressionCalc extends ExpressionCalc {
    @Override
    public Object calc(String expression, Map<String, Object> params) {

        return 1;
    }
    @Override
    public Integer calStrategy () {
        return CalStrategyEnums.GROUP_EXPRESSION_CALC.getStrategyType();
    }
}
