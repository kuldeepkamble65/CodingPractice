package JavaPractice;

public class StringBuilderPractice {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("kuldeep");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        sb.setCharAt(0, 'j');
        System.out.println(sb);

        sb.insert(2,'s');
        System.out.println(sb);

        sb.delete(2,3);
        System.out.println(sb);
    }
}
