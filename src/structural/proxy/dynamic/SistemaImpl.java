package structural.proxy.dynamic;

import structural.proxy.dynamic.Usuario.Permissao;

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
