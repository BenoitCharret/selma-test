package com.test;

import com.test.from.SubSubElement;
import com.test.to.AnotherSubElement;
import fr.xebia.extras.selma.Field;
import fr.xebia.extras.selma.Mapper;

@Mapper(
        withCustomFields = {
                @Field({"id","idelement"})
        }
)
public interface SubSubElementMapper {


    AnotherSubElement asAnotherSubElement(SubSubElement subSubElement);
}
