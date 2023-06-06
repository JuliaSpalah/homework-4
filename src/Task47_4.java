public class Task47_4 {
    public static void main(String[] args) {
        System.out.println(matchLastItem(new String[]{"i", "love", "tesh", "ilovetesh"}));
        System.out.println(matchLastItem(new String[]{"i", "am", "into", "her", "world", "iamintoherworld"}));
        System.out.println(matchLastItem(new String[]{"1", "1", "1", "11"}));
        System.out.println(matchLastItem(new String[]{"12", "13", "17", "19", "20", "40", "121317192040"}));
        /* System.out.println(matchLastItem(null));
        System.out.println(matchLastItem(new String[]{}));
        System.out.println(matchLastItem(new String[]{"love"}));
        System.out.println(matchLastItem(new String[]{"love", "love"}));*/
    }

    private static boolean matchLastItem(String[] items) {
        /*if (items == null || items.length < 2) {
            return false;
        }*/
        StringBuilder result = new StringBuilder();
        String lastWord = items[items.length - 1];
        for (int i = 0; i < items.length - 1; i++) {
            result.append(items[i]);
        }
        return lastWord.equals(result.toString());
    }

    public static boolean matchLastItem2(String[] arr) {
        StringBuilder newStr = new StringBuilder();
        StringBuilder lastWord = new StringBuilder(arr[arr.length - 1]);
        for (int i = 0; i < arr.length - 1; i++) {
            newStr.append(arr[i]);
        }
        return newStr.toString().equals(lastWord.toString());
    }
}


