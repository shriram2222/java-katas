public class Roman {

    public static String convert(int arabic) {
        String roman = "";
        for (int i=0; i < arabic; i++) {
            roman += "I";
        }
        return roman;
    }
}
