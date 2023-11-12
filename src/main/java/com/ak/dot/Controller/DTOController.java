package com.ak.dot.Controller;

import com.ak.dot.Entity.DTOEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DTOController {

    @PostMapping("/purchase/{userName}/{productName}/{amount}")
    public String add(@PathVariable String userName,@PathVariable String productName,@PathVariable double amount ){
      //  return "Hi" + dtoEntity.userName + "Thanks for ordering " + dtoEntity.productName + "for price" + dtoEntity.amount;
        return "Hi" + userName + "Thanks for ordering " + productName + "for price" + amount;
    }
}
