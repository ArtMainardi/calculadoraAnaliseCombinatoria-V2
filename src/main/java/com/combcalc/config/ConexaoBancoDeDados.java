package com.combcalc.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBancoDeDados {
    // Credenciais:
    private static final String url = "jdbc:h2:./arquivoH2Database";
    private static final String user = "sa";
    private static final String password = "";

    public Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}