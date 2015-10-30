package com.test;

import com.test.to.AnotherSubElement;

import java.util.Arrays;
import java.util.List;

public class MySubMapper {

    public List<AnotherSubElement> anotherSubElements(String element){
        AnotherSubElement sub=new AnotherSubElement();
        sub.setIdElement(element);
        return Arrays.asList(sub);
    }

    public List<AnotherSubElement> anotherSubElements(String element,List<AnotherSubElement> elements){
        return anotherSubElements(element);
    }

}
