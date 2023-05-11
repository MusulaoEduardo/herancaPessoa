package Main;

import classe.PessoaFisica;
import classe.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {

        PessoaFisica pf1 = new PessoaFisica("Rocker Itali", "129-299-299-99", 25, "09908855xx", "meuemail@dominio.com",
                "(45) 9999-8888");

        PessoaJuridica pj1 = new PessoaJuridica("Beterraba Cerrot", "123456789", 25, "meuemail@dominio.com",
                "(45) 9999-8888");

        System.out.println(pf1);
        System.out.println();
        System.out.println(pj1);

    }
}
