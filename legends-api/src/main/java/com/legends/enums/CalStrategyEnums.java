package com.legends.enums;

import lombok.Getter;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: rookie
 * @date: 2023/3/31 11:01
 * @desc:
 */
@Getter
public enum CalStrategyEnums {
    EXPRESSION_CALC(1, "表达式计算"),
    SCRIPT_CALC(2, "逻辑引擎"),
    COMBINE_CALC(3, "直接组装"),
    GROUP_EXPRESSION_CALC(4, "自定义分组表达式计算"),
    EXPRESSION_RULE_CALC(5, "规则脚本表达式计算"),
    SQL_SCRIPT_CALC(6, "sql脚本计算"),
    ;

    CalStrategyEnums(Integer strategyType, String desc) {
        this.strategyType = strategyType;
        this.desc = desc;
    }

    private final Integer strategyType;
    private final String desc;

    private static final Map<Integer, CalStrategyEnums> strategyTypeMapping = new HashMap<>();


    public static CalStrategyEnums getEnumsByType(Integer strategyType) {
        if (CollectionUtils.isEmpty(strategyTypeMapping)) {
            for (CalStrategyEnums value : values()) {
                strategyTypeMapping.put(value.getStrategyType(), value);
            }
        }

        return strategyTypeMapping.get(strategyType);
    }
}
