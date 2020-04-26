package teladecadastro.model;

public class Produto {

 	
	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", quantidade=" + quantidade + ", Valor Unitário=" + valorUnitario + ", Total=" + valorTotal +"]";
	}

	private String nome; // Insere nome
	
	private int valorUnitario;
	
	private int quantidade; // Insere Quantidade
	
	private int valorTotal;
	
	private int valorTotalItens;

	//LOWBOK
	
		public Produto(String nome, int quantidade, int valorUnitario) {
			super();
			this.nome = nome;
			this.valorUnitario = valorUnitario;
			this.quantidade = quantidade;
			
		}
		
			public String getNome() {
				return nome;
			}
		
			public void setNome(String nome) {
				this.nome = nome;
			}
			
			public int getValorUnitario() {
				return valorUnitario;
			}

			public void setValorUnitario(int valorUnitario) {
				this.valorUnitario = valorUnitario;
			}
		
			public int getQuantidade() {
				return quantidade;
			}
		
			public void setQuantidade(int quantidade) {
				this.quantidade = quantidade;
			}

			public int getValorTotal() {
				return valorTotal = (valorUnitario * quantidade);
			}

			public void setValorTotal(int valorTotal) {
				this.valorTotal = valorTotal;
			}
			
}
