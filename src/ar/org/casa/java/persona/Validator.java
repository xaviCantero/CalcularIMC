package ar.org.casa.java.persona;

import java.util.Scanner;

public class Validator {
    static Scanner entrada = new Scanner(System.in);
    
    //validar texto
    public static String isString(){
        String texto = "";
        while(texto.isEmpty()){
            texto = entrada.next();
            if(!texto.matches("^[A-Za-z ]*$")){
                texto = "";
                System.out.println("Introducir texto valido");
            }
            
        }
        return texto;
    }
    
    public static String esLenght(){
        int max = 10;
        int min = 3;
        boolean cond = false;
        String texto="";
        while(cond==false){
            texto = isString();
            if(texto.length()>max || texto.length()<min){
            System.out.println("ingresar cantidad de caracteres");
            }else{cond = true;}
        }
        return texto;
    }
    //validar entero
    public static int esEntero() {
        int numero = 0;
        do {
            try {
                numero = entrada.nextInt();
                Integer.parseInt(String.valueOf(numero));
            } catch (Exception e) {System.out.println("formato no valido");}
            if (numero <= 0 ) {
                System.out.println("Ingrese numeros enteros y positivos");
                numero = 0;
            }
            entrada.nextLine();
            //System.out.println();
        } while (numero == 0);
        return numero;
    }
    
    //validar edad
    public static int edadValida() {
        final int max =130;
        int edad;
        do{
        edad = esEntero();
        if(edad>max) System.out.println("Ingrese una edad valida");
        
        }while(edad>max);
        return edad;
    }
    //validar Sexo
    public static String generoSelect(){
        boolean validar = true;
        String genero="";
        int sexo; 
        
        do{
            System.out.println("Ingrese: \nSi es Hombre 1"+"\nSi es Mujer 2");
            sexo = esEntero();
            if(sexo ==0 || sexo >2) System.out.println("Ingrese un opcion correcta");
            switch(sexo){
                case 1: genero = "Hombre";
                validar = false;
                break;
                case 2: genero = "Mujer";
                validar = false;
                break;
            }
        }while(validar);
        
        return genero;
    }
    
    //validar altura
    public static double esDouble(){
        double valor=0;
        boolean cond = true;
        do{
        
        try{
            valor = entrada.nextDouble();
            Double.parseDouble(String.valueOf(valor));
        }catch(Exception e){System.out.println("Ingrese formato valido");}
                    if (valor <= 0 ) {
                System.out.println("Ingrese valor mayor a 0");
            }else{cond = false;}
        entrada.nextLine();
        }while(cond);
        return valor;
    }
    
    //validar altura
    public static double alturaValida(){
        final double maxAltura = 2.99;
        final double minAltura = 0.50;
        double altura=0;
        do{
            altura = esDouble();
            if(altura >maxAltura || altura<minAltura){
            System.out.println("Ingrese una altura valida");}
        }while(altura >maxAltura || altura<minAltura);
        return altura;
    }
    
    //validar peso
    public static double pesoValido(){
        final double maxPeso = 499.9;
        final double minPeso = 0.100;
        boolean cond = false;
        double peso = 0;
        
        do{
            peso = esDouble();
        if(peso>maxPeso || peso <minPeso){
            System.out.println("Ingrese peso valido");
        }else{cond = true;}
        //entrada.nextLine();
        //System.out.println();
        }while(cond==false);
        
        return peso;
        }
}
