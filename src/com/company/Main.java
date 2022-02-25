package com.company;

public class Main {

//-e "First Programming Task at QA" -o 3
    public static void main(String[] args)  {
        String income = args [1];
        StringBuilder sb = new StringBuilder();
        int offset = Integer.parseInt(args [3]);
        //String codeFlag = args [0];
        String offsetFlag = args [3];

        switch (args[0]){
            case "-e":
                if (income.isEmpty()){
                    System.out.println("Придумайте текст для шифрования и попробуйте ещё раз");
                } else {
                    switch (args[2]){
                        case "-o":
                            for (char c: income.toCharArray()) {
                                if (c == ' ') {
                                    sb.append(' ');
                                } else {
                                    sb.append((char) (c + offset));
                                }
                                String encoding = sb.toString();
                                if (encoding.length() == income.length()){
                                System.out.println(encoding);
                                }
                            }
                            break;
                            default:
                                System.out.println("Не указано смещение");
                                break;
                }
                }
                break;
            case "-d":
                if (income.isEmpty()){
                    System.out.println("Придумайте текст для дешифрования и попробуйте ещё раз");
                } else {
                    switch (args[2]){
                        case "-o":
                            for (char c: income.toCharArray()) {
                                if (c == ' ') {
                                    sb.append(' ');
                                } else {
                                    sb.append((char) (c - offset));
                                }
                                String decoding = sb.toString();
                                if (decoding.length() == income.length()){
                                    System.out.println(decoding);
                                }
                            }
                            break;
                        default:
                            System.out.println("Не указано смещение");
                            break;
                    }
                }
                break;
            default:
                System.out.println("Что будем делать?");
                System.out.println("-e шифровать");
                System.out.println("-d дешифровать");
                break;
        }

    }
}
