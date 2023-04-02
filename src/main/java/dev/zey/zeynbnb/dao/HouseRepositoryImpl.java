package dev.zey.zeynbnb.dao;

import dev.zey.zeynbnb.model.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HouseRepositoryImpl {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public HouseRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @SuppressWarnings("unused")
    public List<House> getHouseWithFilter() {
        final String sql = "SELECT id, city FROM house;";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            String id = (rs.getString("id"));
            String name = rs.getString("city");
            return new House();
        });
    }
}