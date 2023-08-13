package app;
import java.util.ArrayList;
import java.util.List;

import model.Contato;

public class Iphone {
    private List<Contato> contatos = new ArrayList<Contato>();
    

    public Ipod abrirReprodutor(){
        System.out.println("Abrir Reprodutor");
        return new Ipod();
    }
    public Phone abrirPhone(){
        System.out.println("Abrir Telefone");
        return new Phone();
    }
    public Navegador abrirNavegador(){
        System.out.println("Abrir Navegador");
        return new Navegador();
    }
    public void abrirContatos(){
        System.out.println("Abrir lista de Contatos" + contatos);
    }
    public void desbloquear(){
        System.out.println("Telefone Desbloqureado");
    }
    public void alterarVolume(String updow){
        if(updow=="up"){
            System.out.println("Aumentando Volume");
        }else{
            System.out.println("Baixando volume");
        }
    }

    public void sicronizar(){
        System.out.println("Sincronizando Iphone com dispositivo externo");
    }


}
