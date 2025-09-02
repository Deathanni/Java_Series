package Lecture_13;

public class string_builder_set {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello banana");
        sb.setCharAt(3, 'p');
        System.out.println(sb);
        sb.insert(5,'k');
        System.out.println(sb);
        sb.append('c');
        System.out.println(sb);
        sb.delete(3, 6);
        System.out.println(sb);
        sb.setCharAt(1, 'p');
        System.out.println(sb);
        sb.replace(0, 3, "poa");
        System.out.println(sb);
    }
}
