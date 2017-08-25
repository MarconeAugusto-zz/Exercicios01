public class Contador {

    //atributos
    private int valorAtual;

    //metodos
    public void atribuirValor(int valor){
        valorAtual = valor;
    }

    public void incrementaCont(){
        valorAtual++;
    }

    public int getValorAtual(){
        return valorAtual;
    }
}
