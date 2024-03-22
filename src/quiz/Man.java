package quiz;
import java.util.Scanner;

public class Man {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    	
   	 

        System.out.println("Ingrese el nombre de la persona:");
        String nombrePersona = scanner.nextLine();
        System.out.println("Ingrese la edad de la persona:");
        int edadPersona = scanner.nextInt();
        scanner.nextLine();

        Persona persona1 = new Persona(nombrePersona, edadPersona);
        System.out.println("Información de la persona:");
        persona1.mostrarinformacion();
        System.out.println();

        System.out.println("Ingrese el nombre del empleado:");
        String nombreEmpleado = scanner.nextLine();
        System.out.println("Ingrese la edad del empleado:");
        int edadEmpleado = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Ingrese el cargo del empleado:");
        String cargoEmpleado = scanner.nextLine();
        System.out.println("Ingrese el salario del empleado:");
        double salarioEmpleado = scanner.nextDouble();

        Empleado empleado1 = new Empleado(nombreEmpleado, edadEmpleado, cargoEmpleado, salarioEmpleado);
        System.out.println("Información del empleado:");
        empleado1.mostrarinformacion();
        
    	System.out.println("¿Cuál es la diferencia entre una clase `Persona` y una clase `Empleado` en términos de atributos y métodos?");
    	 
   	 System.out.println("Los atributos: Son las propiedades que poseen los objetos de esa clase. Los Métodos: Son las acciones que los objetos de la clase pueden realizar.");

   	 System.out.println("¿Cómo se establece la relación de herencia entre `Empleado` y `Persona` en Java?");
   	
    System.out.println("En Java, para implementar la herencia, usamos la palabra clave extends . Al utilizar esta palabra clave, la clase hija hereda los atributos y métodos de la clase padre.");

   	System.out.println("¿Qué es un constructor en Java y cuál es su propósito?");
  
 	 System.out.println("En la programación orientada a objetos (y en Java), un constructor es un método especial que se utiliza para inicializar un objeto recién creado y asignarle valores iniciales a sus variables de instancia.");

 	System.out.println("¿Por qué es útil utilizar la herencia en la programación orientada a objetos?");
 	
 	 System.out.println("a herencia, junto con la encapsulación y el polimorfismo, es una de las tres características principales de la programación orientada a objetos. La herencia permite crear clases que reutilizan, extienden y modifican el comportamiento definido en otras clases.");

 	System.out.println("¿Cómo se llama el proceso de crear un objeto a partir de una clase en Java?");
 	
 	 System.out.println("Un objeto de una clase se crea llamando a una función especial denominada constructor de la clase. El constructor se llama de forma automática cuando se crea un objeto, para situarlo en memoria e inicializar los miembros dato declarados en la clase. El constructor tiene el mismo nombre que la clase.");

        scanner.close();
        
    }
    
  
}