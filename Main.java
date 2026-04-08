/**
_   _      _ _            _           ___
| | | | ___| | | ___      / \   __  __/ _ \
| |_| |/ _ \ | |/ _ \    / _ \  \ \/ / (_) |
|  _  |  __/ | | (_) |  / ___ \  >  < \__, |
|_| |_|\___|_|_|\___/  /_/   \_\/_/\_\  /_/

made by Gigef ;)
**/
import java.util.*;
import java.io.*;


public class Main{
  public static void main(String[] args){
        String Encrpath = "text.txt";
        String Alf = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        File file = new File(Encrpath);

        try(Scanner myreader = new Scanner(file)){

          while(myreader.hasNext()){

            String frase = myreader.nextLine();
            String[] parola = frase.split(" ");

            System.out.println(Alf.charAt(2));
            System.out.println(frase.charAt(2));

            for(int i = 0 ; i < parola.length ; i++){

              System.out.println(parola[i] + " " + i + " " + parola.length);
            }

          }

      }catch(Exception e){
          System.out.println("vabbeh");

      }
  }
}
