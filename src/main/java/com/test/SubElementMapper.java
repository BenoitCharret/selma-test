package com.test;

import com.test.from.SubElement;
import com.test.from.SubSubElement;
import com.test.to.AnotherElement;
import com.test.to.AnotherSubElement;
import fr.xebia.extras.selma.Field;
import fr.xebia.extras.selma.Mapper;

@Mapper(withCustomFields = {
        @Field({"idA","idForA"})

})
public interface SubElementMapper {
        AnotherElement asAnotherElement(SubElement subElement);

        AnotherSubElement asAnotherSubElement(SubSubElement subSubElement);
}
