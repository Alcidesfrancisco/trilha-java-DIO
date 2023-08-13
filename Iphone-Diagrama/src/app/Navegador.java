package app;
import java.util.ArrayList;
import java.util.List;

public class Navegador extends Iphone implements IorientacaoInterface{
    private static final String PAGINA_EM_BRANCO = "www.navegador.com";
    private List<String > abas = new ArrayList<String>();

    public void exibirPagina(String pagina){
        System.out.println("Abrindo Navegador na Página "+ pagina);
        abas.add(pagina);
    }
    public void adicionarAba(){
        System.out.println("Aba adicionada");
        abas.add(PAGINA_EM_BRANCO);
    }
    public void atualizarPagina(int paginaIndex){
        System.out.println("pagina "+ abas.get(paginaIndex)+ "atualizada");
    }
    @Override
    public void landscape() {
       System.out.println("Modo LandScape");
    }
    @Override
    public void portrait() {
        System.out.println("Modo Portrait");
    }

}
