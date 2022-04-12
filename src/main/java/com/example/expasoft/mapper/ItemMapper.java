package com.example.expasoft.mapper;

import com.example.expasoft.dto.ItemDto;
import com.example.expasoft.entity.Item;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ItemMapper extends EntityMapper<ItemDto, Item> {
    ItemMapper INSTANCE = Mappers.getMapper(ItemMapper.class);
}