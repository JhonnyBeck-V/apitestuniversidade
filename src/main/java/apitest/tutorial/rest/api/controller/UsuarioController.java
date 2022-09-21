package apitest.tutorial.rest.api.controller;
import apitest.tutorial.rest.api.model.UsuarioModel;
import apitest.tutorial.rest.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;
    @GetMapping(path = "/api/usuario/{codigo}")
    public ResponseEntity consultar(@PathVariable("codigo") Integer codigo){
    return repository.findAllById(codigo)
        .map(record -> ResponseEntity.ok().body(record))
            .orElse(ResponseEntity.notFound().build());

    }
    @PostMapping(path = "/api/usuario/salvar")
    public UsuarioModel salvar(UsuarioModel usuario){
        return repository.save(usuario);

    }
}
