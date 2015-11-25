public class Roman {
    public static String convert(int arabic) {
        int[] ARABIC = {100, 10, 5, 1};
        String[] ROMAN = {"C", "X", "V", "I"};

        String roman = "";
        for (int i = 0; i < ARABIC.length; i++) {
            while (arabic >= ARABIC[i]) {
                roman += ROMAN[i];
                arabic -= ARABIC[i];
            }
        }
        return roman;
    }
}
