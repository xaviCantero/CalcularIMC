package ar.org.casa.java.persona;


public class Test {
 
    public static void main(String[] args) {
        System.out.println("Introduce el nombre");
        String nombre = Validator.esLenght();
        
        System.out.println("Introduce la edad");
        int edad = Validator.edadValida();
 
        System.out.println("Introduce su genero");
        String sexo = Validator.generoSelect();
 
        System.out.println("Introduce el peso");
        double peso = Validator.pesoValido();
        
        System.out.println("Introduce la altura");
        double altura = Validator.alturaValida();
 
        Persona persona = new Persona(nombre,edad,sexo,peso,altura);
        
        System.out.println(persona.toString());
        persona.mensajePeso();
 }

}
