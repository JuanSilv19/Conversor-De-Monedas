package conversores;

import java.util.List;

public class ListaCodigos {

        private static final List<String> ordenDeseado = List.of("ARS", "USD", "BRL", "EUR", "GBP", "JPY");

        public static List<String> obtenerCodigos(){
            return ordenDeseado;
        }

}
