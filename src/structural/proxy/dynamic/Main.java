package structural.proxy.dynamic;

import java.lang.reflect.Proxy;

import structural.proxy.dynamic.Usuario.Permissao;

/**
 * Proxy dinâmico usado cara conferir permissão de excutar ação.
 * O proxy é criado via reflection
 * @author mario
 *
 */
public class Main {
	
	private static Sistema sistema = new SistemaImpl();
	
	public static void main(String[] args) {
		Sistema proxy = getAcessoSistema();
		System.out.println("É proxy?" +Proxy.isProxyClass(proxy.getClass()));
		
		Usuario admin = new Usuario("Gerente", Permissao.ADMIN);
		admin.setAcesso(proxy);
		
		Usuario outro = new Usuario("outro", Permissao.COMUM);
		outro.setAcesso(proxy);
		
		System.out.println("Executando com admin");
		admin.usaSistema();
		System.out.println("Executando com outro");
		outro.usaSistema();

	}
	
	public static Sistema getAcessoSistema(){
		
		return (Sistema) Proxy.newProxyInstance(
						sistema.getClass().getClassLoader(), 
						sistema.getClass().getInterfaces(),
						new ProcessadorPermissaoUsuario(sistema));
	}
	
	

}
