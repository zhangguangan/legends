package com.legends.indicator;

import java.util.List;
import java.util.Map;

/**
 * @author: rookie
 * @date: 2023/3/31 10:56
 * @desc: 指标收集器
 */
public interface IndicatorCollectors {
    /**
     * 是否存在指标口径
     *
     * @param indicatorType 指标类型
     * @param caliberConfig 指标的口径
     * @return true-存在/false-不存在
     */
    boolean existsIndicatorCaliber(String indicatorType, Map<String, Object> caliberConfig);

    List<Map<String, Object>> queryIndicatorCaliberList(String indicatorType, Map<String, Object> caliberConfig);
}
