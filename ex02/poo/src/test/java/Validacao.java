import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class Validacao {

    @Test
    public void tempo(){
        Tempo t = new Tempo(26,70,76);
        Tempo t1 = new Tempo(12,30,60);
        Tempo t2 = new Tempo(12,30,59);
        Tempo t3 = new Tempo();
        Tempo t4 = new Tempo(25,60,34);

        assertEquals("Falha no exercício","12:30:59",t2.toString());
        assertEquals("Falha no exercício","0:0:0",t.toString());
        assertEquals("Falha no exercício","12:30:0",t1.toString());
        assertEquals("Falha no exercício","0:0:34",t4.toString());

        // valores corretos
         assertEquals("7:30:0", (new Tempo(7,30,0)).toString());
         assertEquals(3600, (new Tempo(1,0,0)).tempoSegundos());
         assertTrue((new Tempo(1,0,0)).setHora(10));
         assertEquals(0, (new Tempo(1,0,0)).diferenca(new Tempo(1,0,0)));

         // valor errado para hora
         assertEquals("0:15:0", (new Tempo(33,15,0)).toString());
         assertFalse((new Tempo(1,0,0)).setHora(35));

         // valor errado para minuto
         assertEquals("3:0:0", (new Tempo(3,75,0)).toString());
         // valor errado para segundo
         assertEquals("4:15:0", (new Tempo(4,15,80)).toString());
         // valor errado para hora, minuto
         assertEquals("0:0:0", (new Tempo(-1,61,0)).toString());
         // valor errado para hora, minuto, segundo
         assertEquals("0:0:0", (new Tempo(25,60,60)).toString());
    }

}
