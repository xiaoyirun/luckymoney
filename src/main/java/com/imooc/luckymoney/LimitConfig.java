package com.imooc.luckymoney;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @description:
 * @author: aster
 * @createDate: 2019/6/21
 */
@ConfigurationProperties(prefix = "limit")
@Component
public class LimitConfig {
    private BigDecimal minMoney;
    private String description;

    public BigDecimal getMinMoney() {
        return minMoney;
    }

    public void setMinMoney(BigDecimal minMoney) {
        this.minMoney = minMoney;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
