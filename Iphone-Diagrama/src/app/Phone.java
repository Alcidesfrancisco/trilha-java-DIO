package app;
import java.util.List;
import java.util.Set;

import model.Chamada;
import model.Contato;

public class Phone extends Iphone{
    
    private Set<Contato> favoritos;
    private List<Chamada> registroDeChamadas;

    public void atenderChamada(Chamada chamada){
        System.out.println("Atendendo chamada de " + chamada.getContato().getNomeContato());
    }
    public void fazerChamada(Chamada chamada){
        System.out.println("realizando chamada");
        registroDeChamadas.add(chamada);
    } 
    public void iniciarCorrerioVoz(){
        System.out.println("Visualizar voice mails");
    }
    public void fazerConferencia(Chamada chamada1, Chamada chamada2) {
        System.out.println("Realizando conferência");
    }
    public void chamadaEmEspera(Chamada chamada){
        System.out.println("Chamada em modo de espera");
    }
    public void favoritarContato(Contato contato){
        favoritos.add(contato);
    }

}
