
package S10_22;

import java.util.ArrayList;

public class Main_S10_22 {
        public static ArrayList<seleccionFutbol_22> integrantes = new ArrayList<seleccionFutbol_22>();
        
        public static void main(String[] args) {
        // TODO code application logic 

        futbolista_22 futbolista1 = new futbolista_22(9, "arquero", 1, "paolo", "guerrero", 42);
        masajista_22 masajista1  = new masajista_22("si", 15, 2, "raul", "Martines", 50);
        entrenador_22 RicardoGareca = new entrenador_22("uno", 1, "Ricardo", "Gareca", 65);
        
        //ENTRESNAR
        futbolista1.concentrarse();
        futbolista1.entrenar();
        
        masajista1.darMasaje();
        masajista1.concentrarse();

        // CONCENTRACION

    }
}
