/*
 * Escribe un programa que reciba un texto y transforme lenguaje natural a
 * "lenguaje hacker" (conocido realmente como "leet" o "1337"). Este lenguaje
 *  se caracteriza por sustituir caracteres alfanuméricos.
 * - Utiliza esta tabla (https://www.gamehouse.com/blog/leet-speak-cheat-sheet/)
 *   con el alfabeto y los números en "leet".
 *   (Usa la primera opción de cada transformación. Por ejemplo "4" para la "a")
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Leet Speak Translator. Type END to close the program.");

        System.out.print("Text to translate:");
        String input = sc.nextLine().toUpperCase();
        while (!input.equals("END")){

        String result = readValue(input);
        System.out.println("Translation: " + result);
        System.out.print("Text to translate:");
        input = sc.nextLine().toUpperCase();
        }
    }


    public static String readValue(String input){
        //TODO: TRY HASMAP
        String rst = "";
        for (int i = 0; i < input.length(); i++){
            char letter = input.charAt(i);
            switch (letter){
                case 'A':
                    rst += "4";
                    break;
                case 'B':
                    rst += "13";
                    break;
                case 'C':
                    rst += "[";
                    break;
                case 'D':
                    rst += ")";
                    break;
                case 'E':
                    rst += "3";
                    break;
                case 'F':
                    rst += "|=";
                    break;
                case 'G':
                    rst += "&";
                    break;
                case 'H':
                    rst += "#";
                    break;
                case 'I':
                    rst += "1";
                    break;
                case 'J':
                    rst += ",_|";
                    break;
                case 'K':
                    rst += ">|";
                    break;
                case 'L':
                    rst += "1";
                    break;
                case 'M':
                    rst += "/\\/\\";
                    break;
                case 'N':
                    rst += "^/";
                    break;
                case 'O':
                    rst += "0";
                    break;
                case 'P':
                    rst += "|*";
                    break;
                case 'Q':
                    rst += "(_,)";
                    break;
                case 'R':
                    rst += "I2";
                    break;
                case 'S':
                    rst += "5";
                    break;
                case 'T':
                    rst += "7";
                    break;
                case 'U':
                    rst += "(_)";
                    break;
                case 'V':
                    rst += "\\/";
                    break;
                case 'W':
                    rst += "\\/\\/";
                    break;
                case 'X':
                    rst += "><";
                    break;
                case 'Y':
                    rst += "j";
                    break;
                case 'Z':
                    rst += "2";
                    break;
                case '1':
                    rst += "L";
                    break;
                case '2':
                    rst += "R";
                    break;
                case '3':
                    rst += "E";
                    break;
                case '4':
                    rst += "A";
                    break;
                case '5':
                    rst += "S";
                    break;
                case '6':
                    rst += "b";
                    break;
                case '7':
                    rst += "T";
                    break;
                case '8':
                    rst += "B";
                    break;
                case '9':
                    rst += "g";
                    break;
                case '0':
                    rst += "o";
                    break;
                default:
                    rst += letter;
                    break;
            }
        }
        return  rst;
    }
}
