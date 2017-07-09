package proxy.dinamico;

import proxy.dinamico.Usuario.Permissao;

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
