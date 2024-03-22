package quiz;

	class Empleado extends Persona {
		 private double salario;
		    private String cargo;

		    public Empleado(String nombre, int edad, String cargo, double salario) {
		        super(nombre, edad);
		        this.cargo = cargo;
		        this.salario = salario;
		    }
		    public void mostrarinformacion() {
		        super.mostrarinformacion(); 
		        System.out.println("Cargo: " + cargo);
		        System.out.println("Salario: " + salario);
		    }
	}