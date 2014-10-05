package packECP1;

public class ClaseB {
	

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Semana dia;

	public void mostrar(){
		System.out.println("this.name" + " this.dia");
	}

	public void mostrarDia(){
		System.out.println("Día de la semana: " + this.dia);
	}

}
