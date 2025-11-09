package view;

import controller.ControllerPessoa;
import model.Pessoa;

public class Principal {

	public static void main(String[] args) {
		try {
            ControllerPessoa c = new ControllerPessoa();

            Pessoa p1 = new Pessoa("Renata", 15);
            Pessoa p2 = new Pessoa("Guilherme", 30);
            Pessoa p3 = new Pessoa("Raimundo", 50);
            Pessoa p4 = new Pessoa("Duda", 18);
            Pessoa p5 = new Pessoa("Nick", 45);

            c.inserir(p1);
            c.inserir(p2);
            c.inserir(p3);
            c.inserir(p4);
            c.inserir(p5);

            
            Pessoa resultado = c.buscar("Guilherme");
            System.out.println("Encontrado: " + resultado);

            c.excluir("Guilherme");
            
            System.out.println("Encontrado: " + c.buscar("Guilherme"));
          

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

	}

}
