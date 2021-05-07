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

        //READING SYSTEM IN
        System.out.println("Sisestage sona");
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();
        System.out.println(answer);
        //WRITING TO FILE WITHOUT OVERWRITING
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


        //COUNTING A-s IN WORDS
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
            //COUNTING A-s IN SENTENCES
        }
        for (String i : newAnswer) {
            totalCharactersInSentence = 0;
            counter++;
            for (int j = 0; j < i.length(); j++) {
                temp = i.charAt(j);
                if (temp == 'a')
                    totalCharactersInSentence++;
            }
            //DELETING LINES THAT ARE THE SAME
            try {
                PrintWriter pw = new PrintWriter("Output.txt");

                // BufferedReader object for input.txt
                BufferedReader br1 = new BufferedReader(new FileReader("MyFile.txt"));
// TODO: 07.05.2021 TEHA JUURDE DELETE.TXT (FAILI SISUKS ON IGAKORD ÜLEKIRJUTATAV TEKST SYSTEM.IN POOLT) 
                String line1 = br1.readLine();

                while(line1 != null)
                {
                    boolean flag = false;

                    // BufferedReader object for delete.txt
                    BufferedReader br2 = new BufferedReader(new FileReader("delete.txt"));

                    String line2 = br2.readLine();

                    // loop for each line of delete.txt
                    while(line2 != null)
                    {
                        if(line1.equals(line2))
                        {
                            flag = true;
                            break;
                        }

                        line2 = br2.readLine();
                    }

                    // if flag = false
                    // write line of input.txt to output.txt
                    if(!flag)
                        pw.println(line1);

                    line1 = br1.readLine();

                }
            }
            catch (Exception e){
                System.out.println("Exeption");
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
