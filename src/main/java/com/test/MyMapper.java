package com.test;

import com.test.from.FromA;
import com.test.to.ToA;
import fr.xebia.extras.selma.Field;
import fr.xebia.extras.selma.Mapper;

@Mapper(
        withCustomFields = {
                @Field({"element.subelementlist", "infos"})
        },
        withCustom = {SubSubElementMapper.class}
)

public interface MyMapper {

    ToA asA(FromA fromA);

}
