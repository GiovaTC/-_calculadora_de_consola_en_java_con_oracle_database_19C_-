import oracle.jdbc.proxy.annotation.Pre;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OperacionDAO {

    public void guardarOperacion(Operacion op) {
        String sql = """    
                INSERT INTO operaciones_calculadora
                (numero1, numero2, operacion, resultado)
                VALUES (?, ?, ?, ?)
                """;

        try (Connection con = ConexionOracle.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setDouble(1, op.getNumero1());
            ps.setDouble(2, op.getNumero2());
            ps.setString(3, op.getTipo());
            ps.setDouble(4, op.getResultado());

            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("error al guardar operacion: " + e.getMessage());
        }   
    }
}
