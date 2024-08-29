package com.web.apirest.repositories;


import com.web.apirest.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {



}
