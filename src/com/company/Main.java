package com.company;

import com.company.motorDepot.dao.JsonIO;

public class Main {

    public static void main(String[] args) {
	// write your code here
        JsonIO.getTrucks().forEach(System.out::println);
    }
}
