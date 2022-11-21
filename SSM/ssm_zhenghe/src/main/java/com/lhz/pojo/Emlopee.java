package com.lhz.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Emlopee implements Serializable {

    private int empId;
    private String empName;
    private int age;
    private String gender;
    private String email;


}
