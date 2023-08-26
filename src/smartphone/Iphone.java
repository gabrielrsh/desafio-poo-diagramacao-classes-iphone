package smartphone;

import navegador.NavegadorInternet;
import reprodutor.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {

    @Override
    public void ligar() {
        System.out.println("Iniciando chamada de voz");
    }

    @Override
    public void atender() {
        System.out.println("Recebendo chamada de voz");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void tocar() {
        System.out.println("|>");
    }

    @Override
    public void pausar() {
        System.out.println("||");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("+ adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizando pagina...");
    }
    
}
