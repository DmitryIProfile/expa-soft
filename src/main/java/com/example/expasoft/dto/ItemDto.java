package com.example.expasoft.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ItemDto {

    @JsonProperty("ИД")
    private Long id;

    @JsonProperty("Наименование")
    private String itemName;
}