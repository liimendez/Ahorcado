
import java.util.Scanner;

public class ahorcado {
    public static void main(String[] args) throws Exception {
        //permite que el usuario escriba 
       Scanner scanner = new Scanner(System.in);


//declaraciones y asignaciones 
String palabraSecreta = "rockoso";
int intentos=0;
int intentosMaximos= 10;
boolean palabraAdivinada=false;

//arreglos
char [] letrasAdivinadas = new char[palabraSecreta.length()];

//estructura bucle iterativa 
for (int i = 0; i < letrasAdivinadas.length; i++) {  
 letrasAdivinadas[i] = '_';
System.out.println(letrasAdivinadas[i]);
}

//------------------------------------------------------------------------------
while(!palabraAdivinada && intentos < intentosMaximos){

System.out.println("Palabra a adivinar: "+ String.valueOf(letrasAdivinadas)+""+palabraSecreta.length()+" letras");

System.out.println("introduce una letra por favor: ");

//usamos la clase scanner para pedir una letra 
char letra = Character.toLowerCase( scanner.next().charAt(0));

boolean letraCorrecta = false;

//estructura de control : iterativa (bucle)
for (int i = 0; i < palabraSecreta.length(); i++) {

    //estructura de control condicional 
      if(palabraSecreta.charAt(i) == letra){

               letrasAdivinadas[i] = letra;
               letraCorrecta = true;  
      };


}

if(!letraCorrecta){
intentos++;

 System.out.println("Incorrecto!! te quedan ... "+(intentosMaximos - intentos)+ " intentos.");

}

if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){

palabraAdivinada = true;

System.out.println("Felicidades adivinaste la palabra secreta!! "+palabraSecreta);

};

}
//-----------------------------------------------------------------------------------
if (!palabraAdivinada) {
    
    System.out.println(" Que pena te has quedado sin intentos... GAME OVER ");

}

 scanner.close();

 }

}
