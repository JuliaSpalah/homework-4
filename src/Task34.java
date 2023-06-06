public class Task34 {
    public static void main(String[] args) {
        String result;
        result = nameShuffle("Donald Trump");
        System.out.println(result);
        result = nameShuffle("Rosie O'Donnell");
        System.out.println(result);
        result = nameShuffle("Seymour Butts");
        System.out.println(result);

    }
    private static String nameShuffle(String a){

        String[] nameSurname = a.split(" ");
        return nameSurname[1]+" " +nameSurname[0];
    }
}
