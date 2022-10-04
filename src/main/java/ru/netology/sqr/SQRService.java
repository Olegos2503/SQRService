package ru.netology.sqr;

public class SQRService {
    public static void main(String[] args) {
        int x = 0;
        for (int i = 10; i < 100; i++){
            if (i*i < 200) continue;
            if (i*i > 300) break;
            x++;


            System.out.println(x);


        }
    }

}
