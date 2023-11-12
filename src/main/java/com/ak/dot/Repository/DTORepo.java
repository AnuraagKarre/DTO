package com.ak.dot.Repository;

import com.ak.dot.Entity.DTOEntity;
import com.ak.dot.Entity.Entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DTORepo extends JpaRepository<Entity, Integer> {
    void save(DTOEntity dtoEntity);


}
