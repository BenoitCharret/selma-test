package com.test;

import com.test.from.FromA;
import com.test.to.ToA;
import fr.xebia.extras.selma.Field;
import fr.xebia.extras.selma.Mapper;

@Mapper(
        withCustomFields = {
                @Field({"subElements", "infos"})}
        ,
        withCustom = {MyListMapper.class}
)

public interface MyMapper {

    ToA asA(FromA fromA);

    ToA asA(FromA fromA,ToA toA);

}
