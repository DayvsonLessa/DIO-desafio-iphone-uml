package Smartphone;

import Smartphone.Apple.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // métodos comuns a todos smartphones
        iphone.ligar("98666-0144");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://web.dio.me");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        iphone.selecionarMusica("Gospel");
        iphone.tocar();
        iphone.pausar();

        // métodos exclusivos do iPhone
        iphone.ligarFaceTime("José Dayvson");
        iphone.atenderFaceTime();
    }
}
