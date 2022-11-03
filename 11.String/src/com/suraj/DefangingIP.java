package com.suraj;

//1108 : https://leetcode.com/problems/defanging-an-ip-address/
public class DefangingIP {
    public static void main(String[] args) {
        String address = "255.100.50.0";
        address = defangIPaddr(address);
        System.out.println(address);;

    }

    static String defangIPaddr(String address){
        address = address.replace(".", "[.]");
        return address;
    }
}
