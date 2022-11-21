package com.lhz.spring.pojo;

import org.springframework.stereotype.Service;

@Service("as")
public class A  implements AS{
    public String ASR(){

        return "AA";
    }

    public void hell() {
        System.out.println("aaa");
    }
}
