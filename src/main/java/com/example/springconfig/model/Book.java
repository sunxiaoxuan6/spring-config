package com.example.springconfig.model;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;


@Data
@Controller
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Component
@ConfigurationProperties(prefix = "book")
public class Book {
    private String isdn;
    private String name;
    private String author;
    private Float price;
    private String desc;

    private List<String> fans;
    private Map<String ,Integer> ranks;
}
