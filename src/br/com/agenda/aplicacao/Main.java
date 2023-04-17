package br.com.agenda.aplicacao;


import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        ContatoDAO contatoDAO = new ContatoDAO();

        Contato contato = new Contato();
        contato.setNome("Khianny");
        contato.setIdade(25);
        contato.setDataCadastro(new Date());

        // Para salvar o contato
        // contatoDAO.save(contato);

        // Atulizar o contato
        Contato c1 = new Contato();
        c1.setNome("Arthur");
        c1.setIdade(14);
        c1.setDataCadastro(new Date());
        c1.setId(1); // Chave primaria, o numero da posicao no banco de dados

        // atualizar o banco
       // contatoDAO.update(c1);
        contatoDAO.deleteByID(1);

        // Deletar o contato pelo numero de id


        // Visualizacao de todos os registros dos bancos de dados
        for( Contato c : contatoDAO.getContatos()){
            System.out.println("Contato: " + c.getNome());
        }
    }
}