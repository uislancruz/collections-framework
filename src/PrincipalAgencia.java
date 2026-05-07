import com.algaworks.agencia.CadastroHotel;
import com.algaworks.agencia.Hotel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class PrincipalAgencia {

    static void main(String[] args) {
        CadastroHotel cadastroHotel = new CadastroHotel();
        cadastroHotel.adicionar("Jaguaribe lodge", "Fortim/CE", 1300);
        cadastroHotel.adicionar("Vila Selvagem", "Fortim/CE", 1400);
        cadastroHotel.adicionar("Hotel fazenda Dona Carolina", "Itatiba/SP", 1200);
        cadastroHotel.adicionar("Tivoli Ecoresort", "Praia do Forte/BA", 1400);
        cadastroHotel.adicionar("Mecure", "Uberlândia/MG", 1300);

        //cadastroHotel.removerPorCidade("Fortim/CE");


        ArrayList<Hotel> hoteis = cadastroHotel.obterTodos();
        imprimirHoteis(hoteis);

    }

    private static void imprimirHoteis(ArrayList<Hotel> hoteis) {
        ListIterator<Hotel> hotelIterator = hoteis.listIterator(hoteis.size());
        while (hotelIterator.hasPrevious()) {
            Hotel hotel = hotelIterator.previous();
            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());

//        Iterator<Hotel> hotelIterator = hoteis.iterator();
//        while(hotelIterator.hasNext()){
//            Hotel hotel = hotelIterator.next();
//            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
//        }

        }
    }
}
