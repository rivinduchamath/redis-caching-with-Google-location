package com.cloudofgoods.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StructuredFormatting{
    @JsonProperty("main_text")
    public String mainText;
    @JsonProperty("main_text_matched_substrings")
    public ArrayList<MainTextMatchedSubstring> mainTextMatchedSubstrings;
    @JsonProperty("secondary_text")
    public String secondaryText;
}
