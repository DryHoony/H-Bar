package hoony.hbar.ORACLE_CRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@Repository
public class CRUD_Repository {
    private final JdbcTemplate jdbcTemplate;
    private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String DB_USERNAME = "c##BarHoony";
    private static final String DB_PASSWORD = "9074";

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
        List<MENU_DTO> menus = new ArrayList<>();
        String sql = "SELECT * FROM MENU";

        try(Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery()){

            // rs의 갯수 출력
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println("Repository -> findAll() -> rs = " + rs);
            System.out.println("Repository -> findAll() -> rsmd = " + rsmd);

            while (rs.next()){
                MENU_DTO menu = new MENU_DTO();
                menu.setName(rs.getString("name"));
                menu.setBase1(rs.getString("base1"));
                menu.setBase2(rs.getString("base2"));
                menu.setJuice1(rs.getString("juice1"));
                menu.setJuice2(rs.getString("juice2"));
                menu.setJuice3(rs.getString("juice3"));
                menu.setJuice4(rs.getString("juice4"));
                menu.setIngredients(rs.getString("ingredients"));
                menu.setCapacityBase1(rs.getInt("capacity_base1"));
                menu.setCapacityBase2(rs.getInt("capacity_base2"));
                menu.setCapacityJuice1(rs.getInt("capacity_juice1"));
                menu.setCapacityJuice2(rs.getInt("capacity_juice2"));
                menu.setCapacityJuice3(rs.getInt("capacity_juice3"));
                menu.setCapacityJuice4(rs.getInt("capacity_juice4"));
                menu.setCapacityIngredients(rs.getString("capacity_ingredients"));
                menu.setMethod(rs.getString("method"));
                menu.setProof(rs.getInt("proof"));
                menu.setComments(rs.getString("comments"));

                menus.add(menu);
            }

        } catch (SQLException e){
            e.printStackTrace();
        }

        return menus;
    }

    // Update
    public void update(MENU_DTO menu){

    }

    // Delete
    public void delete(MENU_DTO menu){

    }



}
