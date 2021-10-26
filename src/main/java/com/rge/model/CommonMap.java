package com.rge.model;

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
    "type"
})
public class CommonMap {

    @JsonProperty("id")
    private @Setter(AccessLevel.PUBLIC) @Getter(AccessLevel.PUBLIC) String id;

    @JsonProperty("type")
    private @Setter(AccessLevel.PUBLIC) @Getter(AccessLevel.PUBLIC) String type;
}
