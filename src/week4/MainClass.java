package week4;

import java.lang.*;
import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        List<Character> dudes = new ArrayList();
        King king = new King();
        king.setWeapon(new SwordBehaviour());
        dudes.add(king);
        
        Queen queen = new Queen();
        queen.setWeapon(new KnifeBehaviour());
        dudes.add(queen);
        
        Troll troll = new Troll();
        troll.setWeapon(new ClubBehaviour());
        dudes.add(troll);
        
        Knight knight = new Knight();
        knight.setWeapon(new AxeBehaviour());
        dudes.add(knight);
        
        dudes.forEach(Character::fight);
    }
}
