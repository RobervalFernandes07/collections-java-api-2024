package PesquisaSet;

import java.util.HashSet;
import java.util.Set;

public class Agendacontatos {
    // Atributo
    private Set<contato> contatoSet;

    public Agendacontatos() {
        this.contatoSet = new HashSet<>();
    }
    public void adicionarContato(String nome, int numero){
        contatoSet.add(new contato(nome,numero));
    }
    public void exibirContato(){
        System.out.println(contatoSet);
    }
    public Set<contato> pesquisarPorNome(String nome) {
        Set<contato> contatosPorNome = new HashSet<>();
        for (contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }
    public contato atualizarNumeroContato(String nome , int novoNumero){
        contato contatoAtualizado = null;
        for (contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
    public static void main(String[] args){
        Agendacontatos agendacontatos = new Agendacontatos();

        agendacontatos.exibirContato();

        agendacontatos.adicionarContato("Camila",123456);
        agendacontatos.adicionarContato("Camila", 0);
        agendacontatos.adicionarContato("Camila Cavalcante", 1111111);
        agendacontatos.adicionarContato("Camila DIO", 654987);

        agendacontatos.exibirContato();

        System.out.println(agendacontatos.pesquisarPorNome("Camila"));

        System.out.println("Contato atualizado:" + agendacontatos.atualizarNumeroContato("Maria Silva",55555));

    }

}