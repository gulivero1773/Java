package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public class Test {

        public void main(String[] args) {

            List<String> myArrayList = new ArrayList<String>();

            myArrayList.add("Hey!");

            for (int i = 0; i < myArrayList.size(); i++)
                System.out.println(myArrayList.get(i));
        }
    }
}
