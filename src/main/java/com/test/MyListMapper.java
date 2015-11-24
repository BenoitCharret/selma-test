package com.test;

import com.test.from.SrcString;
import com.test.to.DstString;
import fr.xebia.extras.selma.Field;
import fr.xebia.extras.selma.Mapper;

@Mapper(
        withCustomFields = {@Field({"src", "field"})}
)

public interface MyListMapper extends IListMapper<SrcString,DstString>{
    @Override
    SrcString asEntity(DstString dto);

    @Override
    DstString asDto(SrcString entity);
}
