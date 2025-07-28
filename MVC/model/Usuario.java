package mvc.model;
public class Usuario {
    private String senha = "123";
    public boolean validarSenha(String senha) {
        return this.senha.equals(senha);
    }
}
