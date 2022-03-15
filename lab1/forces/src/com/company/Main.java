package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean equilibrium (int Fx[] ,int Fy[] , int Fz[]) {
        int sum = 0;
        for(int i=0;i<Fx.length;i++) {
            sum += Fx[i];
        }
        if(sum != 0) return false;
        for(int i=0;i<Fy.length;i++) {
            sum += Fy[i];
        }
        if(sum != 0) return false;
        for(int i=0;i<Fz.length;i++) {
            sum += Fz[i];
        }
        if(sum != 0) return false;
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader( new InputStreamReader( System.in));
        int num_of_forces = Integer.parseInt(in.readLine());
        int fx[] = new int[num_of_forces] , fy[] = new int[num_of_forces] ,  fz[] = new int[num_of_forces];

        String split[];
        for(int i = 0 ;i<num_of_forces;i++) {
            split = in.readLine().split(" ");

            fx[i] =Integer.parseInt(split[0]);
            fy[i] =Integer.parseInt(split[1]);
            fz[i] =Integer.parseInt(split[2]);
        }
        System.out.println( equilibrium(fx,fy,fz)? "YES":"NO");

    }
}
