package Test;

import awcward.hero.Diana;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = Main.getHeroName();
        if (name.equals("Diana")){
            Diana diana = new Diana();
            diana.q();
        }
    }

    private static String getHeroName(){
        System.out.println("请输入一个英雄的名字");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        return name;
    }
}
