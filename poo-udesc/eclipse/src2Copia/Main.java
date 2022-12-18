import redesocial.dados.Usuario;
import redesocial.negocio.Sistema;

public class Main {
    public static void main(String[] args) {
    	System.out.println("Ola");
    	TelaPrincipal tela = new TelaPrincipal();
    	Sistema sistema = new Sistema();
    	Usuario usuario = new Usuario();
    	System.out.println(usuario.getNome());
    	System.out.println(usuario.getUsername());
    }
}