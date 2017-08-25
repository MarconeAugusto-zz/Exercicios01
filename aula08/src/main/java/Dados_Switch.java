public class Dados_Switch {

    //Atributos
    private int portas;
    private String marca;
    private int portas_ocup;

    //Metodos
    public void atribuirPortas(int quantidade){
        portas = quantidade;
    }

    public void atribuirMarca(String nome){
        marca = nome;
    }

    public String retornaMarca(){
        return marca;
    }

    public void ocupaPorta(){
        String possibilidade = new String();
        if(portas_ocup < portas){
            portas_ocup ++;
            possibilidade = "Porta ocupada";
            System.out.println(possibilidade);
        }
        else {
            possibilidade ="Não existem mais portas disponíveis no Switch";
            System.out.println(possibilidade);
        }
    }

    public void desocupaPorta(){
        String possibilidade = new String();
        if(portas_ocup >= 1){
            portas_ocup --;
            possibilidade = "Porta desocupada";
            System.out.println(possibilidade);
        }
        else{
            possibilidade = "Não existe nenhuma porta ocupada";
            System.out.println(possibilidade);
        }
    }

    public int quantidadePortas(){
        return portas;
    }

    public int portasVazias(){
            return (portas - portas_ocup);
    }

    public int portasOcupadas(){
        return portas_ocup;
    }

}
