package numletras66131;

import java.util.Scanner;

public class NumLetras66131 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
	int num = 0, dec = 0, uni = 0, resp = 1;
        
	String[] unid = {"cero" , "uno" ,"dos" , "tres" , "cuatro" , "cinco" , "seis" , "siete" , "ocho" , "nueve" };
	String[] dece = { "diez" , "veinte" , "treinta" , "cuarenta" , "cincuenta" , "sesenta" , "setenta", "ochenta" , "noventa" };
        String[] special = {"once", "doce", "trece", "catorce", "quince"};
        
        while(resp==1){
            System.out.println("Ingrese un número dentro del rango 0-99");
            num = ent.nextInt();
        
            dec = num / 10;
            uni = num % 10;
                   
            if (num<=9){
                System.out.println("El número " + num + " escrito en letras es: " + unid[num]);
            }
            else if(uni == 0){
                System.out.println("El número " + num + " escrito en letras es: " + dece[dec-1]);
            }
            else if(num>10 && num<=15){
                System.out.println("El número " + num + " escrito en letras es: " + special[num-11]);
            }
            else{
                System.out.println("El número " + num + " escrito en letras es: " + dece[dec-1] + " y " + unid[uni]);
            }
            System.out.println("Sí desea ingresar otro número presione la tecla 1(uno), de lo contrario presione cualquier tecla numérica");
            resp = ent.nextInt();
        }
    }
}


