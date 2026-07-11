public class SubstitutionCipher {


    String encode(int key, String text){
        int length = text.length();
        String frase = "";
        for(int i=0; i<length; i++){
            char letra = text.charAt(i);
            int ascii = (int) letra;

            if(ascii>=97 && ascii<=122){ // Letra minúscula
                int help = ascii + key;
                if(help>122){
                    help -= 26;
                }
                char newChar = (char) help;
                frase = frase + newChar;
            }

            else if(ascii>=65 && ascii<=90){ // Letra mayúscula
                int help = ascii + key;
                if(help>90){
                    help -= 26;
                }
                char newChar = (char) help;
                frase = frase + newChar;
            }
            else{ // En caso opuesto, se conserva la letra tal cual
                frase = frase + letra;
            }
        }
        return frase;
    }

    String decode(int key, String text){
        int length = text.length();
        String frase = "";
        for(int i=0; i<length; i++){
            char letra = text.charAt(i);
            int ascii = (int) letra;

            if(ascii>=97 && ascii<=122){ // Letra minúscula
                int help = ascii - key;
                if(help<97){
                    help += 26;
                }
                char newChar = (char) help;
                frase = frase + newChar;
            }
            else if(ascii>=65 && ascii<=90){ // Letra mayúscula
                int help = ascii - key;
                if(help<65){
                    help += 26;
                }
                char newChar = (char) help;
                frase = frase + newChar;
            }
            else{ // En caso opuesto, se conserva la letra tal cual
                frase = frase + letra;
            }
        }
        return frase;
    }
}
