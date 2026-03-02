package api.payload;

import java.util.Map;

public class UserPayLoader {
    private String tcN0;
    private String testDesc;
    private Integer stCode;
    private Map<String, Object> payload;
    private Map<String, Object> validation;
    private Map<String, Object> pathParam;
    private Map<String, Object> queryParam;

    public Map<String, Object> getPathParam() {
        return pathParam;
    }

    public void setPathParam(Map<String, Object> pathParam) {
        this.pathParam = pathParam;
    }

    public Map<String, Object> getQueryParam() {
        return queryParam;
    }

    public void setQueryParam(Map<String, Object> queryParam) {
        this.queryParam = queryParam;
    }


    public Map<String, Object> getValidation() {
        return validation;
    }

    public void setValidation(Map<String, Object> validation) {
        this.validation = validation;
    }


    public String getTcN0() {
        return tcN0;
    }

    public void setTcN0(String tcN0) {
        this.tcN0 = tcN0;
    }

    public String getTestDesc() {
        return testDesc;
    }

    public void setTestDesc(String testDesc) {
        this.testDesc = testDesc;
    }

    public Integer getStCode() {
        return stCode;
    }

    public void setStCode(Integer stCode) {
        this.stCode = stCode;
    }

    public Map<String, Object> getPayload() {
        return payload;
    }

    public void setPayload(Map<String, Object> payload) {
        this.payload = payload;
    }


}
