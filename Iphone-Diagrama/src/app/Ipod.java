package app;

import model.Musica;
import model.Video;

public class Ipod implements IorientacaoInterface{
    
    public void tocarMusica(Musica musica){
        System.out.println("Musica " + musica.getTitulo() + "tocando");
    }
    public void tocarVideo(Video video){
        System.out.println("Tocando Vídeo " + video.getTitulo());

    }
    public void selecionarMusica(Musica musica){
        System.out.println("Musica " + musica.getTitulo() + "selecionada");
    }
    @Override
    public void landscape() {
        System.out.println("Mudar para modo Paisagem");
    }
    @Override
    public void portrait() {
       System.out.println("Mudar para Modo Retrato");
    }
}
