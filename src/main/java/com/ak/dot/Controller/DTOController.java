package com.ak.dot.Controller;

import com.ak.dot.Entity.DTOEntity;
import com.ak.dot.Entity.Entity;
import com.ak.dot.Service.DTOService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class DTOController {

    private DTOService dtoservice;

    public DTOController(DTOService dtoservice){
        this.dtoservice = dtoservice;
    }

    @PostMapping("/purchase/save")
    public Entity saveData(@RequestBody Entity entity){
        dtoservice.saveData(entity);
        return entity;
    }

    @GetMapping("/purchase/{userID}")
    public DTOEntity getData (@PathVariable int userID){
        return dtoservice.getData(userID);


    }
    @GetMapping("/purchase/getdata/{userID}")
    public Optional<Entity> getEntData(@PathVariable int userID) {
    return dtoservice.getEntData(userID);
    }
}
