public class Task28 {
    public static void main(String[] args) {
        boolean result;
        result = isPlural("changes");
        System.out.println(result);
        result = isPlural("change");
        System.out.println(result);
        result = isPlural("dudes");
        System.out.println(result);
        result = isPlural("magic");
        System.out.println(result);


    }
    private static boolean isPlural(String a){
        return a.endsWith("s");
    }
}
