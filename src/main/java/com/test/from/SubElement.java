package com.test.from;

import java.util.List;

public class SubElement {
    private String idA;

    private List<SubSubElement> subElementList;

    public String getIdA() {
        return idA;
    }

    public void setIdA(String idA) {
        this.idA = idA;
    }

    public List<SubSubElement> getSubElementList() {
        return subElementList;
    }

    public void setSubElementList(List<SubSubElement> subElementList) {
        this.subElementList = subElementList;
    }
}
