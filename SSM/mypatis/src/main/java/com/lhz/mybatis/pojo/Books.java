package com.lhz.mybatis.pojo;

import lombok.*;
import org.apache.ibatis.annotations.ConstructorArgs;

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
