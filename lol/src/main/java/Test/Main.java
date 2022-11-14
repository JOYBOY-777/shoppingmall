package Test;

import awcward.hero.Camille;
import awcward.hero.Diana;
import awcward.hero.Irelia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = Main.getHeroName();
        switch (name){
            case "Diana":
                Diana diana = new Diana();
                diana.r();
            case "Irelia":
                Irelia irelia = new Irelia();
                irelia.r();
            case "Camille":
                Camille camille = new Camille();
                camille.r();
        }
    }

    private static String getHeroName(){
        System.out.println("请输入一个英雄的名字");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
