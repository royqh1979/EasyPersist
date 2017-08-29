package net.royqh.easypersist.entity.model.jpa;

import javax.persistence.*;

/**
 * Created by Roy on 2016/2/10.
 */
public class RelationShip {
    private String targetEntity;
    private CascadeType[] cascadeTypes={};
    private FetchType fetchType=FetchType.EAGER;
    private net.royqh.easypersist.entity.model.jpa.JoinColumn joinColumn=null;
    private net.royqh.easypersist.entity.model.jpa.JoinTable joinTable=null;

    public RelationShip(String targetEntity) {
        this.targetEntity = targetEntity;
    }

    public String getTargetEntity() {
        return targetEntity;
    }

    public CascadeType[] getCascadeTypes() {
        return cascadeTypes;
    }

    public void setCascadeTypes(CascadeType[] cascadeTypes) {
        this.cascadeTypes = cascadeTypes;
    }

    public FetchType getFetchType() {
        return fetchType;
    }

    public void setFetchType(FetchType fetchType) {
        this.fetchType = fetchType;
    }

    public void setTargetEntity(String targetEntity) {
        this.targetEntity = targetEntity;
    }

    public net.royqh.easypersist.entity.model.jpa.JoinColumn getJoinColumn() {
        return joinColumn;
    }

    public void setJoinColumn(net.royqh.easypersist.entity.model.jpa.JoinColumn joinColumn) {
        this.joinColumn = joinColumn;
    }

    public net.royqh.easypersist.entity.model.jpa.JoinTable getJoinTable() {
        return joinTable;
    }

    public void setJoinTable(net.royqh.easypersist.entity.model.jpa.JoinTable joinTable) {
        this.joinTable = joinTable;
    }
}
