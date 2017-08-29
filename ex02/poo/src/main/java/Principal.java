public class Principal {

    public static void main(String[] args){

        Tempo t1 = new Tempo();
        Tempo t2 = new Tempo(12);
        Tempo t3 = new Tempo(15,25,56);
        Tempo t4 = new Tempo(3,33);
        Tempo t5 = new Tempo(31,53,70);

        System.out.println("Tempo: " +t1 );
        System.out.println("Tempo: " +t2 );
        System.out.println("Tempo: " +t3 );
        System.out.println("Tempo: " +t4 );
        System.out.println("Tempo: " +t5 );

        System.out.println("Tempo em segundos: " +t1.tempoSegundos());
        System.out.println("Tempo em segundos: " +t2.tempoSegundos());
        System.out.println("Tempo em segundos: " +t3.tempoSegundos());
        System.out.println("Tempo em segundos: " +t4.tempoSegundos());

        System.out.println("Diferença de tempo: " +t3.diferenca(t2));
        System.out.println("Diferença de tempo: " +t3.diferenca(t1));
        System.out.println("Diferença de tempo: " +t1.diferenca(t3));
        System.out.println("Diferença de tempo: " +t4.diferenca(t2));
        System.out.println("Diferença de tempo: " +t2.diferenca(t3));



    }

}
