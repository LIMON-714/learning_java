package com.mycompany.learning__java;

public class StringBuffer1__Class71 {

    public static void main(String[] args) {
        
        String s1 = "Limon";
        StringBuffer sb = new StringBuffer(s1);
        System.out.println(sb);

        sb.append(" Rahman ");
        sb.append(714);
        System.out.println(sb);
        
        
//        sb.reverse();
//        System.out.println(sb);
        
        sb.delete(0, 5);
        System.out.println(sb);
        
        sb.setLength(5);
        System.out.println(sb);

    }
}
