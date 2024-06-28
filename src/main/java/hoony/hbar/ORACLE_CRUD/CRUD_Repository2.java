package hoony.hbar.ORACLE_CRUD;

import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class CRUD_Repository2 {

    private final DataSource dataSource;

    public CRUD_Repository2(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    // ReadAll




    // DB 연결
    private Connection getConnection() {
        return DataSourceUtils.getConnection(dataSource);
    }

    private void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
        try {
            if (rs != null) rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (pstmt != null) pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (conn != null) {
                conn.close();
//                close(conn);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void close(Connection conn) {
        DataSourceUtils.releaseConnection(conn, dataSource);
    }


}
