import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Contador c1 = new Contador();
        Contador c2 = new Contador();


        System.out.println("valor contador 1: " +c1.getValorAtual());
        System.out.println("valor contador 2: " +c2.getValorAtual());

        c1.incrementaCont();
        c1.incrementaCont();
        c1.incrementaCont();


        System.out.println("valor contador 1: " +c1.getValorAtual());
        System.out.println("valor contador 2: " +c2.getValorAtual());
    /*
        Dados_Switch d1 = new Dados_Switch();
        Dados_Switch d2 = new Dados_Switch();

        System.out.println("Portas vazias: " +d1.portasVazias());
        d1.atribuirPortas(4);
        System.out.println("Portas ocupadas d2:" +d2.portasOcupadas());
        System.out.println("Quantidade de portas d1:" +d1.quantidadePortas());

        d1.ocupaPorta();
        d1.ocupaPorta();
        d1.ocupaPorta();
        d1.ocupaPorta();
        d1.ocupaPorta();

        System.out.println("Digite a marca do aparelho: ");
        String nome = teclado.nextLine();
        d1.atribuirMarca(nome);

        System.out.println("Marca: "+d1.retornaMarca());


        System.out.println("Portas ocupadas d1: "+ d1.portasOcupadas());
        System.out.println("Portas vazias d1: " + d1.portasVazias());

        d1.desocupaPorta();
        d1.desocupaPorta();
        d1.desocupaPorta();
        d1.desocupaPorta();
        d1.desocupaPorta();


        System.out.println("Portas ocupadas d1: "+ d1.portasOcupadas());
        System.out.println("Portas vazias d1: " + d1.portasVazias());
        */
    }
}
