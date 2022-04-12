package com.example.expasoft.service;

import com.example.expasoft.dto.ItemDto;
import com.example.expasoft.entity.Item;
import com.example.expasoft.mapper.ItemMapper;
import com.example.expasoft.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {
    private final ItemRepository repository;

    private final ItemMapper itemMapper;

    @Override
    public List<ItemDto> getItemList() {
        return itemMapper.toDto(repository.findAll());
    }

    @Override
    @Transactional
    public void saveItemList(List<String> itemNames) {
        Set<String> storedNames = repository.findAll().stream().map(Item::getItemName).collect(Collectors.toSet());

        Set<String> filteredNames = itemNames.stream().filter(e -> !storedNames.contains(e)).collect(Collectors.toSet());

        repository.saveAll(filteredNames.stream().map(e -> new Item(null, e)).collect(Collectors.toList()));
    }
}