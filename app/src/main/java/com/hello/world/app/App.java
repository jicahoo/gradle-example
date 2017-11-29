package com.hello.world.app;

import com.hello.world.api.Service;

public class App {

    public static void main(String[] args) {
        Service s = new Service();
        int r = s.add(1, 2);
        System.out.println(r);
    }
}
