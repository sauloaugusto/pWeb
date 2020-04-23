package teladecadastro.model;

public class Produto {

 	
	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", quantidade=" + quantidade + "]";
	}

	private String nome; // Insere nome
	
	private int quantidade; // Insere Quantidade

	//LOWBOK
	
		public Produto(String nome, int quantidade) {
			super();
			this.nome = nome;
			this.quantidade = quantidade;
		}
		
			public String getNome() {
				return nome;
			}
		
			public void setNome(String nome) {
				this.nome = nome;
			}
		
			public int getQuantidade() {
				return quantidade;
			}
		
			public void setQuantidade(int quantidade) {
				this.quantidade = quantidade;
			}
	
}
