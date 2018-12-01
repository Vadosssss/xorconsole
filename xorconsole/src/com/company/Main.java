package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter message:");
        String msg = in.nextLine();
        String encmsg = "";
        String decmsg = "";
        System.out.print("Enter key:");
        String key = in.nextLine();
        int keylen = key.length();
        int msglen = msg.length();
        int j;
        System.out.println("Original message: "+msg);
        j = 0;
        for(int i = 0; i < msglen; i++) {
            encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(j));
            j++;
            if(j == keylen) {
                j = 0;
            }
        }
        System.out.println("Encoded message: "+encmsg);
        j = 0;
        for(int i = 0; i < msglen; i++) {
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(j));
            j++;
            if(j==keylen) {
                j=0;
            }
        }
        System.out.println("Decoded message: "+decmsg);
    }
    }
