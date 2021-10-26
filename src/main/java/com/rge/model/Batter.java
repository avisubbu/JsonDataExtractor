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
    "batter"
})
public class Batter {
    
    @JsonProperty("batter")
    private @Setter(AccessLevel.PUBLIC) @Getter(AccessLevel.PUBLIC) List<CommonMap> batter;
}
