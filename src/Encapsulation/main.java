package Encapsulation;

import javax.swing.*;

public class main {

    public static void main(String[] args) {
        player p = new player();
        p.health = 200; //This is a problem as W/o encap class control of attributes is lost
    }
}
