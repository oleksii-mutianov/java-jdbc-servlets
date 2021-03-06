package com.jdbcservlets.data.queries;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ClientsSqlQueries {

    public static String SELECT_ALL_QUERY = "SELECT * FROM clients";

    public static String SELECT_BY_ID_QUERY = "SELECT * FROM clients WHERE id = ?";

    public static String INSERT_QUERY = """
            INSERT INTO clients(first_name, last_name, email, password, phone_number)
               VALUES (?, ?, ?, ?, ?)
            """;

    public static String UPDATE_QUERY = """
            UPDATE clients SET
                first_name = ?,
                last_name = ?,
                email = ?,
                phone_number = ?
            WHERE (id = ?)
            """;

    public static String DELETE_BY_ID = "DELETE FROM clients WHERE id = ?";

}
