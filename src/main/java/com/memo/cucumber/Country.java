package com.memo.cucumber;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Country {
    private String name;
    private Integer hab;
    private Integer cases;
}
