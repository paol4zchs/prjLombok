package prjLombok.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import prjLombok.demo.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
