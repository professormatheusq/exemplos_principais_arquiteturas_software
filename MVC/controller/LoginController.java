package mvc.controller;
import mvc.model.Usuario;
public class LoginController {
    private Usuario usuario = new Usuario();
    public boolean autenticar(String senha) {
        return usuario.validarSenha(senha);
    }
}
