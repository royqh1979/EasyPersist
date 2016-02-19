package net.royqh.codegenerator.orm.model.jpa;

import javax.persistence.FetchType;

/**
 * Created by Roy on 2016/2/12.
 */
public class ElementCollection {
    private String targetClassName="java.lang.Object";
    private FetchType fetchType=FetchType.LAZY;

    public String getTargetClassName() {
        return targetClassName;
    }

    public void setTargetClassName(String targetClassName) {
        this.targetClassName = targetClassName;
    }

    public FetchType getFetchType() {
        return fetchType;
    }

    public void setFetchType(FetchType fetchType) {
        this.fetchType = fetchType;
    }
}
