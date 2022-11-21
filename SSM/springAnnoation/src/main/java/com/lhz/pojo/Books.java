package com.lhz.pojo;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Books {

    private Integer id;
    private String type;
    private String name;
    private  String description;
}