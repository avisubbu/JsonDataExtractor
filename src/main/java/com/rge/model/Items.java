package com.rge.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Items {

    @JsonProperty("item")
    private @Setter(AccessLevel.PUBLIC) @Getter(AccessLevel.PUBLIC) List<Item> item;
}
