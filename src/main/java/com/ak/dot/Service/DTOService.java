package com.ak.dot.Service;

import com.ak.dot.Entity.DTOEntity;
import com.ak.dot.Entity.Entity;
import com.ak.dot.Repository.DTORepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DTOService {

    private DTORepo dtoRepo;

    public DTOService(DTORepo dtoRepo) {
        this.dtoRepo = dtoRepo;
    }

    public Entity saveData(Entity entity){
        dtoRepo.save(entity);
        return entity;
    }

    public DTOEntity getData(int userID){
        Optional<Entity> result = dtoRepo.findById(userID);
        if(result.isPresent()){
            Entity entity = result.get();
            return converToDTO(entity);
        }
        return null;
    }

    public DTOEntity converToDTO(Entity entity){
        DTOEntity dtoEntity = new DTOEntity();
        dtoEntity.setUserName(entity.getUserName());
        dtoEntity.setProductName(entity.getProductName());
        dtoEntity.setAmount(entity.getAmount());
        return dtoEntity;
    }
}
