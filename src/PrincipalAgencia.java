import com.algaworks.agencia.CadastroHotel;
import com.algaworks.agencia.Hotel;

public class PrincipalAgencia {

    static void main(String[] args) {
        CadastroHotel cadastroHotel = new CadastroHotel();

        cadastroHotel.adicionar("Jaguaribe lodge", "Fortim/CE", 1300);
        cadastroHotel.adicionar("Vila Selvagem", "Fortim/CE", 1400);
        cadastroHotel.adicionar("Hotel fazenda Dona Carolina", "Itatiba/SP", 1200);
        cadastroHotel.adicionar("Tivoli Ecoresort", "Praia do Forte/BA", 1400);
        cadastroHotel.adicionar("Mecure", "Uberlândia/MG", 1300);

        //System.out.println(cadastroHotel.obterTodos());

        Hotel hotel = (Hotel) cadastroHotel.obterTodos().get(10);
        System.out.println(hotel.getNome());
    }
}
