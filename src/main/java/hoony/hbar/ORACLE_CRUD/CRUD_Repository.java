package hoony.hbar.ORACLE_CRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class CRUD_Repository {


    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public CRUD_Repository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Create
    public void save(MENU_DTO menu){
//        String sql = "INSERT INTO MENU VALUES(?, ?, ?)";
//        jdbcTemplate.update(sql, menu.getMenu_id(), menu.getMenu_name(), menu.getMenu_price());
    }

    // ReadAll
    public List<MENU_DTO> findAll(){
        String sql = "SELECT * FROM MENU";

        RowMapper<MENU_DTO> rowMapper = new RowMapper<MENU_DTO>() {
            @Override
            public MENU_DTO mapRow(ResultSet rs, int rowNum) throws SQLException {
                MENU_DTO menu = new MENU_DTO();
                menu.setName(rs.getString("NAME"));
                menu.setBase1(rs.getString("BASE1"));
                menu.setBase2(rs.getString("BASE2"));
                menu.setJuice1(rs.getString("JUICE1"));
                menu.setJuice2(rs.getString("JUICE2"));
                menu.setJuice3(rs.getString("JUICE3"));
                menu.setJuice4(rs.getString("JUICE4"));
                menu.setIngredients(rs.getString("INGREDIENTS"));
                menu.setCapacityBase1(rs.getInt("CAPACITY_BASE1"));
                menu.setCapacityBase2(rs.getInt("CAPACITY_BASE"));
                menu.setCapacityJuice1(rs.getInt("CAPACITY_JUICE1"));
                menu.setCapacityJuice2(rs.getInt("CAPACITY_JUICE2"));
                menu.setCapacityJuice3(rs.getInt("CAPACITY_JUICE3"));
                menu.setCapacityJuice4(rs.getInt("CAPACITY_JUICE4"));
                menu.setCapacityIngredients(rs.getString("CAPACITY_INGREDIENTS"));
                menu.setMethod(rs.getString("METHOD"));
                menu.setProof(rs.getInt("PROOF"));
                menu.setComments(rs.getString("COMMENTS"));

                return menu;
            }
        };

        return jdbcTemplate.query(sql, rowMapper);
    }

    // Update
    public void update(MENU_DTO menu){

    }

    // Delete
    public void delete(MENU_DTO menu){

    }

}
