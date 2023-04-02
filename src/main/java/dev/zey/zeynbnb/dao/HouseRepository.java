package dev.zey.zeynbnb.dao;

import dev.zey.zeynbnb.model.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("postgres")
public interface HouseRepository extends JpaRepository<House,String> {

    List<House> getHouseWithFilter();

}
