import model.IPhone;

public class Main {

    public static void main(String[] args) {

        IPhone iphone = new IPhone();

        System.out.println("=== REPRODUTOR MUSICAL ===");

        iphone.selecionarMusica("Imagine - John Lennon");
        iphone.tocar();
        iphone.pausar();

        System.out.println();

        System.out.println("=== APARELHO TELEFÔNICO ===");

        iphone.ligar("21999999999");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println();

        System.out.println("=== NAVEGADOR NA INTERNET ===");

        iphone.exibirPagina("https://www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
