package com.example.expasoft.controller;

import com.example.expasoft.dto.ItemDto;
import com.example.expasoft.service.ItemServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/item")
@RestController
@RequiredArgsConstructor
public class ItemController {
    private final ItemServiceImpl itemService;

    @PostMapping("/save-list")
    public ResponseEntity<Void> saveItemList(@RequestBody @Validated final List<String> names) {
        itemService.saveItemList(names);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<ItemDto>> getItemList() {
        return ResponseEntity.ok(itemService.getItemList());
    }
}