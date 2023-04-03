package com.legends.cal;

import com.googlecode.aviator.AviatorEvaluator;
import com.googlecode.aviator.AviatorEvaluatorInstance;
import com.legends.enums.CalStrategyEnums;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author: rookie
 * @date: 2023/3/31 10:58
 * @desc:
 */
@Service
public class ExpressionCalc implements Calculator{
    private final static AviatorEvaluatorInstance AVIATOR_EVALUATOR  = AviatorEvaluator.getInstance();
    @Override
    public Object calc(String expression, Map<String, Object> params) {
        return AVIATOR_EVALUATOR.execute(expression, params, true);
    }

    @Override
    public Integer calStrategy() {
        return CalStrategyEnums.EXPRESSION_CALC.getStrategyType();
    }
}
