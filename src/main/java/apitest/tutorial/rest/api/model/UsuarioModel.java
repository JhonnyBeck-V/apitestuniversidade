package apitest.tutorial.rest.api.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "usuario")
public class UsuarioModel {
    @Id

    public Integer ALUNO_CPD;

    @Column(nullable = false)
    public String ENDEREÇO;
    @Column(nullable = false)
    public String TELEFONE;
    @Column(nullable = false)
    public String ALUNO_NOME;

    public Integer getCodigo() {
        return ALUNO_CPD;
    }
}
