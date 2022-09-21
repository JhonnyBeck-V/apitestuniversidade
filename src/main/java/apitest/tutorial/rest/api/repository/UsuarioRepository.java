package apitest.tutorial.rest.api.repository;

import apitest.tutorial.rest.api.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {
    Optional<Object> findAllById(Integer codigo);
}
