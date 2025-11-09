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

    public Pessoa buscar(String nomeConsulta) throws Exception {
    	for (int i = 0; i < vetor.length; i++) {
            int tamanho = vetor[i].size();
            for (int j = 0; j < tamanho; j++) {
                Pessoa p = (Pessoa) vetor[i].get(j);
                if (p.nome.equalsIgnoreCase(nomeConsulta)) {
                    return p;
                }
            }
        }
        throw new Exception("Pessoa não encontrada");
    }

    public void excluir(String pessoaRemove) throws Exception {
    	for (int i = 0; i < vetor.length; i++) {
            int tamanho = vetor[i].size();
            for (int j = 0; j < tamanho; j++) {
                Pessoa p = (Pessoa) vetor[i].get(j);
                if (p.nome.equalsIgnoreCase(pessoaRemove)) {
                    vetor[i].remove(j);
                    return;
                }
            }
        }
        throw new Exception("Pessoa não encontrada para exclusão");
    }
    
}
