package br.univille.poo.app;

import br.univille.poo.app.entidade.Tarefa;
import br.univille.poo.app.persistencia.CriarTabelas;
import br.univille.poo.app.servico.ConcluirTarefa;
import br.univille.poo.app.servico.CriarTarefa;
import br.univille.poo.app.servico.ListarTarefas;

public class Main {

    public static void main(String[] args) {

        CriarTabelas.criarTabelas();

        Tarefa tarefa = new Tarefa();
        tarefa.setDescricao("Sexta tarefa");

        CriarTarefa criarTarefa = new CriarTarefa();
        try {
            criarTarefa.criar(tarefa);
        }catch (Exception e){
            e.printStackTrace();
        }

        ListarTarefas listarTarefas = new ListarTarefas();
        for(Tarefa t : listarTarefas.obterTodos()){
            System.out.println(t);
        }

    }

}
