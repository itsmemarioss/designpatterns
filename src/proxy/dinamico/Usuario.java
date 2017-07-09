package proxy.dinamico;

public class Usuario {
	
	public enum Permissao{ ADMIN, COMUM}
	
	private String nome;
	private Permissao permissao;
	private Sistema acesso;
	
	public Usuario(String nome, Permissao permissao) {
		super();
		this.nome = nome;
		this.permissao = permissao;
	}

	public String getNome() {
		return nome;
	}

	public Permissao getPermissao() {
		return permissao;
	}

	public Sistema getAcesso() {
		return acesso;
	}

	public void setAcesso(Sistema acesso) {
		this.acesso = acesso;
	}

	public void usaSistema() {
		System.out.println(acesso.executaAcao(permissao));
		
	}

}
