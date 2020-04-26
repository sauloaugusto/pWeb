package teladecadastro;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import teladecadastro.model.Produto;

public class TelaDeEntradaDeDados extends JPanel {
	
	private List<Produto> produtos = new ArrayList();
	
	public TelaDeEntradaDeDados() {
		
		//Grid Layout simula tabela
		//Tabela com duas colunas
		this.setLayout(new GridLayout(0,2));

		
			// NOME DO PRODUTO
			JLabel nomeDoProduto = new JLabel("Nome do Produto:");
			this.add(nomeDoProduto); // Adiciona JLabel no Layout
			nomeDoProduto.setHorizontalAlignment(JLabel.CENTER);
			
				JTextField nomeDoProdutoField = new JTextField();
				this.add(nomeDoProdutoField);
			
			JLabel valorUnitario = new JLabel("Valor Unitário");
			this.add(valorUnitario);
			valorUnitario.setHorizontalAlignment(JLabel.CENTER);
			
				JTextField valorUnitarioField = new JTextField();
				this.add(valorUnitarioField);
				
			// Quantidade
			JLabel quantidade = new JLabel("Quantidade:");
			this.add(quantidade); // Adiciona JLabel no Layout
			quantidade.setHorizontalAlignment(JLabel.CENTER);
			
				JTextField quantidadeField = new JTextField();
				this.add(quantidadeField);
				
			
			// BT Adicionar
			JButton btnAdicionar = new JButton("Adicionar");
			this.add(btnAdicionar);
			btnAdicionar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) { 
					
					// ADICIONA ITENS DIGITADOS NO CAMPO NOME
					String nome = nomeDoProdutoField.getText();
					
					//Adiciona Valor Unitário
					int valorUnitario = Integer.parseInt(valorUnitarioField.getText()) ;
					
					//ADICIONA ITENS DIGITADOS NO CAMPO QUANTIDADE (INTERGER.PARSEINT TRANSFORMA EM OPERÇ ÃO)
					int quantidade = Integer.parseInt(quantidadeField.getText());
					
					Produto produto = new Produto(nome, valorUnitario ,quantidade);
					
					produtos.add(produto);
					 
					//Clear Campos
					nomeDoProdutoField.setText("");
					valorUnitarioField.setText("");
					quantidadeField.setText("");
					
				
					System.out.println(" Quantidade Cadastrada " + produtos.size());
						
				
				}
			});
			
			// BT Mostrar Todos
			JButton btnMostrarTodos = new JButton("Mostrar Todos");
			this.add(btnMostrarTodos);
			btnMostrarTodos.addActionListener(new ActionListener() {
				
				private double totalEstoque;
								
				

				@Override
				public void actionPerformed(ActionEvent e) { 
					
					
					 for (int i = 0; i < produtos.size(); i++) {
						 System.out.println(produtos.get(i));
						
					}
					 
					 Object[] titulos = {"Nome", "Quantidade", "Valor Unitário", "Total"};
					 
					 Object[][] linhas = new Object[produtos.size()][];

					 
					 totalEstoque = 0;
					 
					 	for (int i = 0; i < produtos.size(); i++) {
							Object[] linha = new Object[] {
									produtos.get(i).getNome(),
									produtos.get(i).getQuantidade(),
									produtos.get(i).getValorUnitario(),
									produtos.get(i).getValorTotal(),
									totalEstoque = totalEstoque + produtos.get(i).getValorTotal()};
							linhas[i] = linha;
						}
					 	
					 	System.out.println(totalEstoque);
					 	
					 JTable table = new JTable(linhas, titulos );
					 
					 JOptionPane.showMessageDialog(null, new JScrollPane(table), "Seu Estoque", JOptionPane.PLAIN_MESSAGE);
				}
				
			});
			
		
			
		
	}

}
