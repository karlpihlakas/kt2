import java.util.Scanner;

interface Taht {

    String sona = "Pere";
    Character letter();
    char arr[] = sona.toCharArray();
    Integer sonadeArv();
}



class LetterReader implements Taht{


    public static void main(String[] args) {
        System.out.println("Sisestage sona");
        Scanner scan = new Scanner(System.in);

        String answer = scan.nextLine();

        System.out.println(answer);

        int totalCharacters = 0;
        char temp;
        for (int i = 0; i < answer.length(); i++) {

            temp = answer.charAt(i);
            if (temp == 'a')
                totalCharacters++;
        }
        System.out.println(totalCharacters);
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
