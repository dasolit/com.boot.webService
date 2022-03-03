package com.jojo.admin.boot.web;

import com.jojo.admin.boot.web.dto.HelloResponseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//JSON을 반환하는 컨트롤러를 만들어준다.
//@ResponseBody를 각 메소드마다 만들었는데 이를 한번에 사용할 수 있게 해준다.
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDTO helloDto(@RequestParam("name") String name,
                                     @RequestParam("amount") int amount){
        return new HelloResponseDTO(name, amount);
    }
}
