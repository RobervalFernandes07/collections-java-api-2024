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

    public static void main(String[] args){
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O número total de elemento na lista é : " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        System.out.println("O número total de elementos na lista é :" + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 2");
        System.out.println("O número total de elementos na lista é :" + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }

}
