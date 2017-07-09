package proxy.dinamico;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import proxy.dinamico.Usuario.Permissao;

/**
 * Processaor utilizado no proxy dinâmico.
 * Aqui é onde é verificada as permissões de acesso.
 * @author mario
 *
 */
public class ProcessadorPermissaoUsuario implements InvocationHandler {

	private Sistema sistema;
	
	public ProcessadorPermissaoUsuario(Sistema sistema) {
		this.sistema = sistema;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if (method.getName().equals("executaAcao")) {
			Permissao p = (Permissao) args[0];
			if(p.equals(Permissao.ADMIN)){
				return method.invoke(sistema, args);
			}else {
				throw new IllegalStateException("Apenas usuários admins podem chamar o método executa ação!");
			}
		}
		return null;
	}

}
