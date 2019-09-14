import java.util.HashSet;
import java.util.Set;

public class TestaLista {

	public static void main(String[] args) {
		
		 Set<Usuario> usuarios = new HashSet<Usuario>();
		
		 usuarios.add(new Usuario("Glener", "04695926130"));
		 usuarios.add(new Usuario("Glener", "04695926130"));
		 usuarios.add(new Usuario("Glauber", "04695926130"));
		 usuarios.add(new Usuario("Rosarita", "04695926130"));
		 usuarios.add(new Usuario("Gessi", "04695926130"));
		 usuarios.add(new Usuario("Patricia", "04695926130"));
		 usuarios.add(new Usuario("Izabela", "04695926130"));
		 usuarios.add(new Usuario("Amor", "04695926130"));
		 usuarios.add(new Usuario("Teste", "04695926130"));
		 usuarios.add(new Usuario("para apagar", "04695926130"));
		 usuarios.add(new Usuario("Mais um teste", "04695926130"));
		 usuarios.add(new Usuario("Chimenes", "04695926130"));
		 usuarios.add(new Usuario("Rocha", "04695926130"));
		 usuarios.add(new Usuario("Mariano", "04695926130"));
		 usuarios.add(new Usuario("Jesus", "04695926130"));
		 usuarios.add(new Usuario("Maria", "04695926130"));
		 
		 
		// usuarios.forEach(u -> System.out.println(u));
		 
		 usuarios.stream()
		 	.filter(u -> u.getNome() == "Glener" || u.getCpf() == "04695926130")
		 	.forEach(u -> System.out.println(u));
		 
	}
	
}
