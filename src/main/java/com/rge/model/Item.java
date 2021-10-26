package com.rge.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonPropertyOrder({
    "id",
    "type",
    "name",
    "ppu",
    "batters",
    "topping"
})
public class Item implements Comparable<Item>{

    @JsonProperty("id")
    private @Setter(AccessLevel.PUBLIC) @Getter(AccessLevel.PUBLIC) String id;

    @JsonProperty("type")
    private @Setter(AccessLevel.PUBLIC) @Getter(AccessLevel.PUBLIC) String type;

    @JsonProperty("name")
    private @Setter(AccessLevel.PUBLIC) @Getter(AccessLevel.PUBLIC) String name;

    @JsonProperty("ppu")
    private @Setter(AccessLevel.PUBLIC) @Getter(AccessLevel.PUBLIC) float ppu;

    @JsonProperty("batters")
    private @Setter(AccessLevel.PUBLIC) @Getter(AccessLevel.PUBLIC) Batter batters;

    @JsonProperty("topping")
    private @Setter(AccessLevel.PUBLIC) @Getter(AccessLevel.PUBLIC) List<CommonMap> topping;

    @Override
    public int compareTo(Item o) {
        return Integer.parseInt(this.id) - Integer.parseInt(o.getId());
    }
}
