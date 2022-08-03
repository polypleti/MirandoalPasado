package cl.fsj.infoclub;

import java.util.Set;
import java.util.TreeSet;

public class InvitadosSet {
	private Set <String> invitados = new TreeSet <>();
	private Set <String> posiblesInvitados = new TreeSet <>();
	
	
	
	public InvitadosSet() {
		super();
	}
	
	public InvitadosSet(Set<String> invitados, Set<String> posiblesInvitados) {
		super();
		this.invitados = invitados;
		this.posiblesInvitados = posiblesInvitados;
	}

	
	
	public Set<String> getInvitados() {
		return invitados;
	}

	public void setInvitados(Set<String> invitados) {
		this.invitados = invitados;
	}

	public Set<String> getPosiblesInvitados() {
		return posiblesInvitados;
	}

	public void setPosiblesInvitados(Set<String> posiblesInvitados) {
		this.posiblesInvitados = posiblesInvitados;
	}

	
	public void agregarInvitados() {
		invitados.add("Daniel");
		invitados.add("Paola");
		invitados.add("Facundo");
		invitados.add("Pedro");
		invitados.add("Jacinta");
		invitados.add("Florencia");
		invitados.add("Juan Pablo");
	}
	
	public void posiblesInvitados() {
		posiblesInvitados.add("Jorge");
		posiblesInvitados.add("Francisco");
		posiblesInvitados.add("Marcos");
	}
	
	public void mostrarInvitados() {
		System.out.println("Los invitados son:\n" + this.toString());
	}

	@Override
	public String toString() {
		return "Invitados: " + invitados + "\nPosiblesInvitados: " + posiblesInvitados;
	}
	
	
	
}
