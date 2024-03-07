public class RepatedCharacter {
    public static void main(String[] args) {
        String a = "abcagrcb";
        for (int i = 0; i < a.length(); i++) {
            char currentChar = a.charAt(i);
            int count = 0;

            for (int j = 0; j < a.length(); j++) {
                if (currentChar == a.charAt(j)) {
                    count++;
                }
                if (count > 1) {
                    break;
                }
            }
            if (count == 1) {
                System.out.println("Non-repeating characters: "+currentChar);
            }
        }
    }
}