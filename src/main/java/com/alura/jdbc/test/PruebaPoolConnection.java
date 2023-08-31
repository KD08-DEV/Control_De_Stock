package com.alura.jdbc.test;

import com.alura.jdbc.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class PruebaPoolConnection {
    public static void main(String[] args) throws SQLException {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        for(int i=0; i<20;i++){
            Connection con = connectionFactory.recuperaConexion();
            System.out.println("Abriendo la conexion " + (i++));
        }

    }
}
