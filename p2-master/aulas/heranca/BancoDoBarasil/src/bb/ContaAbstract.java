package bb;

public abstract class ContaAbstract implements ContaInterface{
	private String cpf;
	protected int valor;

	public ContaAbstract(String cpf) {
		this.cpf = cpf;
		this.valor = 0;
		
	}
	public abstract int saca(int valor);
	public void depositar(int valor) {
		this.valor += valor;
		
	}
}
