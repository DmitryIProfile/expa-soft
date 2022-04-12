package com.example.expasoft.service;

import com.example.expasoft.dto.ItemDto;

import java.util.List;

public interface ItemService {
    List<ItemDto> getItemList();

    void saveItemList(List<String> names);
}
