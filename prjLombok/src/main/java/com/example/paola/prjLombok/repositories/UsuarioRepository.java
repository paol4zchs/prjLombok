package com.example.paola.prjLombok.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.paola.prjLombok.entities.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
