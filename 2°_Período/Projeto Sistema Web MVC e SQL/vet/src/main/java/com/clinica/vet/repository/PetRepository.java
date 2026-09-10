package com.clinica.vet.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.clinica.vet.model.Pet;

@Repository // Avisa o Spring que esta classe mexe com o banco de dados
public class PetRepository {

    @Autowired // O Spring injeta a ferramenta de banco de dados automaticamente aqui
    private JdbcTemplate jdbcTemplate;

    // Método para SALVAR no banco
    public void salvar(Pet pet) {
        String sql = "INSERT INTO pet (nome, raca) VALUES (?, ?)";
        jdbcTemplate.update(sql, pet.getNome(), pet.getRaca());
    }

    // Método para BUSCAR do banco
    public List<Pet> buscarTodos() {
        String sql = "SELECT * FROM pet";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            // Converte o resultado do banco (rs) em um objeto Pet
            return new Pet(
                rs.getLong("id"), 
                rs.getString("nome"), 
                rs.getString("raca")
            );
        });
    }

    // Método para DELETAR do banco
    public void deletar(Long id) {
        String sql = "DELETE FROM pet WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}