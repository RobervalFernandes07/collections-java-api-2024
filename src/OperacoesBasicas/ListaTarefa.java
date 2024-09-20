package OperacoesBasicas;

import  java.util.List;
import java.util.ArrayList;

public class ListaTarefa {

    //Atributo
    private  List<Tarefa> tarefaList;

    //Construtor
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    // Apenas adicionar , void não retorna. (1° método)
    public void adicionarTarefa(String descricao){
      tarefaList.add(new Tarefa(descricao));
    }
    // Irá remover uma tarefa
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) ;
            {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }
    public void obterDescricoesTarefas(){
        System.out.print(tarefaList);
    }



}
