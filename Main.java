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
        String alf = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] hex = {"41","42","43","44","45","46","46","47","48", "49" , "4A" , "4B" , "4C" , "4D" , "4E" , "4F" , "50", "51" , "52" , "53" , "54" , "55" , "56" , "57" , "58" , "59" , "5A"};

        File file = new File(Encrpath);

        try(Scanner myreader = new Scanner(file)){
            while(myreader.hasNext()){

            String frase = myreader.nextLine();
            String[] parola = frase.split(" ");

            // System.out.println(Alf.length());
            ArrayList<String> lettere = new ArrayList<String>();
            String prova = "prova";

            for(int i = 0 ; i < prova.length() ;  i++){
              lettere.add(i , Character.toString(prova.charAt(i)));
            }
            System.out.println(prova.charAt(0) == alf.charAt(0));
            /**
            for(int i = 0 ; i < prova.length() ; i++){
                for (int j = 0 ; j < alf.length() ; j++ ){
                    if(prova.charAt(i) == alf.charAt(j)){
                        // lettere.set(i , hex[j]);
                        System.out.println("Si!" + prova.charAt(i) + " " + alf.charAt(j));
                    }
                }
            }

            System.out.println(lettere);
            **/
          }
        }catch(Exception e){
            System.out.println("vabbeh");

        }
  }
}
