package proxy.dynamic;

import proxy.dynamic.Usuario.Permissao;

/**
 * classe usada no proxy
 * @author mario
 *
 */
public class SistemaImpl implements Sistema {

	@Override
	public String executaAcao(Permissao permissao){
		return "ok";
	}
}
