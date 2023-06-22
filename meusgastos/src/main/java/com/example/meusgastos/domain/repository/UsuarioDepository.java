package com.example.meusgastos.domain.repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.meusgastos.domain.model.Usuario;

public interface UsuarioDepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);
    

}
