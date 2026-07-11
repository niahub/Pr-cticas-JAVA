public class Main {
    public static void main(String[] args){
        SubstitutionCipher ejemplo = new SubstitutionCipher();
        String codificada = ejemplo.encode(1, "Hola, me llamo Nia.");
        String decodificada = ejemplo.decode(1, codificada);
        System.out.println(codificada);
        System.out.println(decodificada);
    }
}