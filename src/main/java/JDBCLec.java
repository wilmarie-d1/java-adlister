import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;


public class JDBCLec {
    public static String main(String[] args) {

        String selectQuery = "SELECT * FROM albums";

        try {
            // ...
            Config config = new Config();
            Connection connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );


            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(selectQuery);

            List<Album> albums = new ArrayList<>();

            while (rs.next()) {
                albums.add(
                        new Album(
                                rs.getLong("id"),
                                rs.getString("artist_name"),
                                rs.getString("album_name"),
                                rs.getInt("release_date"),
                                rs.getDouble("sales"),
                                rs.getString("genre")

                        ));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to database.", e);
        }
    }

