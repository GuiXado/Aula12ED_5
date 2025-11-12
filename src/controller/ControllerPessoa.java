package controller;

import br.gui.listagenerica.Lista;
import model.Pessoa;

public class ControllerPessoa {
	Lista[] vetor;

	public ControllerPessoa() {
		vetor = new Lista[3];
		inicializarTabelaHash();
	}

	
	private void inicializarTabelaHash() {
		int tamanho = vetor.length;
		for (int i = 0; i < tamanho; i++) {
			vetor[i] = new Lista();
		}
	}
	
	public void inserir(Pessoa p) throws Exception{
		int posicao = p.hashCode();
		vetor[posicao].addFirst(p);
    }

	public void Mostrarbusca(String nomeConsulta) throws Exception {
    	int[] valores = buscar(nomeConsulta);
    	Pessoa p = (Pessoa) vetor[valores[0]].get(valores[1]);
    	System.out.println(p.toString());
    }

    public void excluir(String pessoaRemove) throws Exception {
    	int[] valores = buscar(pessoaRemove);
        vetor[valores[0]].remove(valores[1]);
    }
    
    private int[] buscar(String nomeConsulta) throws Exception {
    	for (int i = 0; i < vetor.length; i++) {
            int tamanho = vetor[i].size();
            for (int j = 0; j < tamanho; j++) {
                Pessoa p = (Pessoa) vetor[i].get(j);
                if (p.nome.equalsIgnoreCase(nomeConsulta)) {
                	return new int[]{i, j};
                }
            }
        }
        throw new Exception("Pessoa não encontrada");
    }

    
}

