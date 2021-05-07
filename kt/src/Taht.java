import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

interface Taht {

    String sona = "Pere";
    Character letter();
    char arr[] = sona.toCharArray();
    Integer sonadeArv();
}



class LetterReader implements Taht {


    public static void main(String[] args)  {
        System.out.println("Sisestage sona");
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();
        System.out.println(answer);

        File log = new File("MyFile.txt");
        try{
            if(log.exists()==false){
                System.out.println("We had to make a new file.");
                log.createNewFile();
            }
            PrintWriter out = new PrintWriter(new FileWriter(log, true));
            out.append(answer + "\n");
            out.close();
        }catch(IOException e){
            System.out.println("COULD NOT LOG!!");
        }

        int totalCharacters = 0;
        int totalCharactersInSentence = 0;
        int counter = 0;
        char temp;
        for (int i = 0; i < answer.length(); i++) {
            temp = answer.charAt(i);
            if (temp == 'a')
                totalCharacters++;
        }
        String[] newAnswer = new String[0];
        for (int i = 0; i < answer.length(); i++) {
            newAnswer = answer.split(" ");
        }
        for (String i : newAnswer) {
            totalCharactersInSentence = 0;
            counter++;
            for (int j = 0; j < i.length(); j++) {
                temp = i.charAt(j);
                if (temp == 'a')
                    totalCharactersInSentence++;
            }

        System.out.println("Terve lause a tähtede arv on: "+totalCharacters);
        System.out.println(counter+ ". lauses on " +" " + totalCharactersInSentence + " a tähte");


        }

    }


    @Override
    public Character letter() {
        for(char i : arr){
            if(i != i+1){
                char taht = i;

                return taht;
            }
        }
        return 0;
    }

    @Override
    public Integer sonadeArv() {
        return null;
    }

    class Lause implements Taht{
        @Override
        public Character letter() {
            return null;
        }

        @Override
        public Integer sonadeArv() {
            return null;

        }


    }
}
