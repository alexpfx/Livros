package livros.ocaocpstudyguide.cap1;

import java.math.BigDecimal;
import
        java.util.ArrayList;
import java.util.*;

//pode importar staticamente todos os métodos de uma classe.
import static java.lang.String.*;
//import static java.lang.Integer.*;
import static java.lang.System.exit;
//pode importar um atributo da classe tambem.
import static java.lang.Integer.MAX_VALUE;
import static livros.ocaocpstudyguide.cap1.Imports.campoEstaticoNaoConstante;

//isso esta errado embora compile
import java.math.BigDecimal.*;
//isso ta errado
//static import;

/**
 * Created by alex on 09/04/2015.
 */
public class Imports {

    static final String campoEstaticoNaoConstante = "";

    public static void main(String... args) {
        BigDecimal sx;
        ArrayList<String> l = new ArrayList<>();
        //não tem problema usar assim mesmo quando classe foi importada.
        java.util.ArrayList l1 = new ArrayList();
        Timer t = new Timer();

        Integer x = Integer.valueOf(1);
        String s = format("");
        System.out.println(MAX_VALUE);
        exit(2);
        System.out.println(campoEstaticoNaoConstante);

    }

}
