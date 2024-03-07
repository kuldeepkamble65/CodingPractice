package Methods;

public class StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("kuldeep");
        StringBuffer sb1 = new StringBuffer("kuldeep");
        System.out.println(sb.capacity());

//        sb.append("hello");
//        System.out.println(sb.capacity());
//        sb.append("hello java");
//        System.out.println(sb.capacity());

           System.out.println(sb.append(" kamble"));

           System.out.println(sb.charAt(5));

           System.out.println(sb.delete(0,3));

           System.out.println(sb.deleteCharAt(4));

           System.out.println(sb.equals(sb1));

           System.out.println(sb.indexOf("e"));

           System.out.println(sb.insert(4,"  "));

           System.out.println(sb.replace(2,3, "m"));

           System.out.println(sb.reverse());

           // it provide char sequence
        System.out.println(sb.subSequence(3, 6));

        System.out.println(sb.substring(3));
    }
}
