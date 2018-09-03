package com.example.demo.repository;

import com.example.demo.model.Obiekty;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface AirconditionerRepository extends CrudRepository<Obiekty,Long> {

    List<Obiekty> findByIdobiektu(int idobiektu);

}
