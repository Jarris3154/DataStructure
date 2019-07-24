package com.jia.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Jarris
 */
public class Doudizhu {
    public static void main(String[] args) {
        List<String> poker = new ArrayList<>();
        String[] colors = new String[]{"♠", "♥", "♣", "♦"};
        String[] numbers = new String[]{"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        poker.add("大王");
        poker.add("小王");
        for (String color : colors) {
            for (String number : numbers) {
                poker.add(color + number);
            }
        }

        //洗牌
        Collections.shuffle(poker);

        List<String> player1 = new ArrayList<>();
        List<String> player2 = new ArrayList<>();
        List<String> player3 = new ArrayList<>();
        List<String> diPai = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            String pai = poker.get(i);

            if (i >= 51) {
                diPai.add(pai);
            }else if(i%3==0){
                player1.add(pai);
            }else if(i%3==1){
                player2.add(pai);
            }else if(i%3==2){
                player3.add(pai);
            }
        }
        System.out.println(diPai);
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
    }
}