package com.jojo.admin.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//JPA Auditing 활성화

//스프링 부트의 자동설정, 스프링 bean 생성, 읽기 가능

@SpringBootApplication
public class Application {

    //부트는 main을 부트가 가지고 있음. 톰캣이 내장되는데
    public static void main(String args[]){
        //내장되는 코드는 이쪽
        //내장 was(Web Application Server
        //때문에 언제 어디서나 같은 환경에서 스프링 부트를 배포할 수 있다.
       SpringApplication.run(Application.class, args);
    }
}
