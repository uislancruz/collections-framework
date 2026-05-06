import com.algaworks.agencia.CadastroHotel;
import com.algaworks.agencia.Hotel;

import java.util.ArrayList;

public class PrincipalAgencia {

    static void main(String[] args) {
        CadastroHotel cadastroHotel = new CadastroHotel();

        cadastroHotel.adicionar("Jaguaribe lodge", "Fortim/CE", 1300);
        cadastroHotel.adicionar("Vila Selvagem", "Fortim/CE", 1400);
        cadastroHotel.adicionar("Hotel fazenda Dona Carolina", "Itatiba/SP", 1200);
        cadastroHotel.adicionar("Tivoli Ecoresort", "Praia do Forte/BA", 1400);
        cadastroHotel.adicionar("Mecure", "Uberlândia/MG", 1300);
        cadastroHotel.adicionar("Vila Selvagem", "Fortim/CE", 1400);


       ArrayList<Hotel> hoteis = cadastroHotel.obterTodos();
       imprimirHoteis(hoteis);

    }

    private static void imprimirHoteis(ArrayList<Hotel> hoteis){

        //o que eu fiz for aprimorado eachFor
//        for (Object hotel : hoteis) {
//            System.out.println(hotel.toString());
//        }

        //Exemplo aula

        for (int i = 0; i < hoteis.size(); i++) {

            Hotel hotel = hoteis.get(i);
            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());

        }
    }
}
