package com.example.nonblocking.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class DescriptionWrapper {
    @JsonProperty("count")
    private String count;
    @JsonProperty("entries")
    private List<Description> descriptionList;
}
