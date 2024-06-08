package pe.edu.cibertec.DAAII_T1_Joe_Guerra.service;

import pe.edu.cibertec.DAAII_T1_Joe_Guerra.model.bd.Usuario;

public interface IUsuarioService {

    Usuario buscarUsuarioXNomUsuario(String nomusuario);
    Usuario buscarUsuarioXIdUsuario(Integer idusuario);
}
