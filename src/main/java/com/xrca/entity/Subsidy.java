/*
 *    Copyright 2009-2022 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.xrca.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author xrca
 * @description 补贴
 * @date 2020-07-22 23:10
 */
@Data
public class Subsidy {
    // Id
    private Long recordId;

    // 补贴人
    private String personName;

    // 补贴人所在公司
    private String companyName;

    // 补贴人所在区
    private String area;

    // 第一个月是否收到补贴 1-是 0-否
    private Integer firstMonth;

    // 第二个月是否收到补贴 1-是 0-否
    private Integer secondMonth;

    // 第三个月是否收到补贴 1-是 0-否
    private Integer thirdMonth;

    // 当季的补贴总额
    private BigDecimal totalMoney;

    // 年份
    private String year;

    // 季度
    private String quarter;
}
