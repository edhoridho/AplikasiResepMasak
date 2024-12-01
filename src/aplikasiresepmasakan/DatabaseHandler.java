/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasiresepmasakan;

/**
 *
 * @author ACER A314
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import aplikasiresepmasakan.Recipe;

// Mengelola operasi CRUD pada SQLite
public class DatabaseHandler {
    private static final String DB_URL = "jdbc:sqlite:resepmasakan.db";

    // Membuka koneksi ke database
    public Connection connect() {
        try {
            Connection conn = DriverManager.getConnection(DB_URL);
            createTableIfNotExists(conn); // memastikan tabel dibuat
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    // Membuat tabel jika belum ada
    private void createTableIfNotExists(Connection conn) {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS recipes ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "name TEXT NOT NULL, "
                + "ingredients TEXT NOT NULL, "
                + "steps TEXT NOT NULL, "
                + "image BLOB"
                + ");";
        try (Statement stmt = conn.createStatement()) {
            stmt.execute(createTableSQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    // Menambah resep ke database
    public void insertRecipe(Recipe recipe) {
        String sql = "INSERT INTO recipes(name, ingredients, steps, image) VALUES(?, ?, ?, ?)";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, recipe.getName());
            pstmt.setString(2, recipe.getIngredients());
            pstmt.setString(3, recipe.getSteps());
            pstmt.setBytes(4, recipe.getImage());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Mengambil semua resep
    public List<Recipe> getAllRecipes() {
        List<Recipe> recipes = new ArrayList<>();
        String sql = "SELECT * FROM recipes";
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                recipes.add(new Recipe(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("ingredients"),
                    rs.getString("steps"),
                    rs.getBytes("image")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return recipes;
    }

    // Menghapus resep berdasarkan ID
    public void deleteRecipe(int id) {
        String sql = "DELETE FROM recipes WHERE id = ?";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Memperbarui resep
    public void updateRecipe(Recipe recipe) {
        String sql = "UPDATE recipes SET name = ?, ingredients = ?, steps = ?, image = ? WHERE id = ?";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, recipe.getName());
            pstmt.setString(2, recipe.getIngredients());
            pstmt.setString(3, recipe.getSteps());
            pstmt.setBytes(4, recipe.getImage());
            pstmt.setInt(5, recipe.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
