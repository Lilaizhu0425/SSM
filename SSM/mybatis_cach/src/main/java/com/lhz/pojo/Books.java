package com.lhz.pojo;

import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Books  implements Serializable {

    private Integer id;
    private String type;
    private String name;
    private  String description;
}
