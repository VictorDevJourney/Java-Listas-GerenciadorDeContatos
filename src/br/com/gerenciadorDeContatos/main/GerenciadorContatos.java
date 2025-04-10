package br.com.gerenciadorDeContatos.main;

import br.com.gerenciadorDeContatos.estrutura.Contato;

import java.util.ArrayList;

public class GerenciadorContatos {
        private ArrayList<Contato> contatos;

        public GerenciadorContatos() {
            contatos = new ArrayList<>();
        }

        public void adicionarContato(Contato contato) {
            contatos.add(contato);
        }

        public void listarContato(){
            for (Contato contato : contatos){
                System.out.println("Nome: " + contato.getNome() + " ----- Telefone: " + contato.getTelefone());
            }
        }

        public void removeContato(String nome){
            for (int i = 0; i < contatos.size(); i++) {
                if (contatos.get(i).getNome().equals(nome)){
                    contatos.remove(i);
                    break;
                }

            }
        }

    public static void main(String[] args) {
        GerenciadorContatos gerenciador = new GerenciadorContatos();
        Contato contato = new Contato("Victor", "123");
        gerenciador.adicionarContato(contato);
        Contato contato1 = new Contato("Eduardo", "456");
        gerenciador.adicionarContato(contato1);
        Contato contato2 = new Contato("Ana", "789");
        gerenciador.adicionarContato(contato2);
        Contato contato3 = new Contato("João", "000");
        gerenciador.adicionarContato(contato3);
        gerenciador.listarContato();

        gerenciador.removeContato("João");
        System.out.println("\nApós remoção");
        gerenciador.listarContato();
    }
}
