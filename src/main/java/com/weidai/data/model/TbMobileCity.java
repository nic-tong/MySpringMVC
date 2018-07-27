package com.weidai.data.model;

import java.util.Date;

public class TbMobileCity {
    private Long id;

    private String provinceCode;

    private String provinceCn;

    private String provinceEn;

    private String paramsPattern;

    private String operator;

    private Integer state;

    private Date createTime;

    private Date updateTime;

    private String operationFlow;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    public String getProvinceCn() {
        return provinceCn;
    }

    public void setProvinceCn(String provinceCn) {
        this.provinceCn = provinceCn == null ? null : provinceCn.trim();
    }

    public String getProvinceEn() {
        return provinceEn;
    }

    public void setProvinceEn(String provinceEn) {
        this.provinceEn = provinceEn == null ? null : provinceEn.trim();
    }

    public String getParamsPattern() {
        return paramsPattern;
    }

    public void setParamsPattern(String paramsPattern) {
        this.paramsPattern = paramsPattern == null ? null : paramsPattern.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getOperationFlow() {
        return operationFlow;
    }

    public void setOperationFlow(String operationFlow) {
        this.operationFlow = operationFlow == null ? null : operationFlow.trim();
    }
}