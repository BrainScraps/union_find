package com.example;

import edu.princeton.cs.algs4.StdOut;

public class UF {

    private int[] id;


    public UF(int N) {
        id = new int[N];

        for (int i = 0; i < N ; i++) {
           id[i] = i;
        }
    }

    public boolean connected(int p, int q){
        StdOut.println("p is " + String.valueOf(p) + ": q is " + String.valueOf(q));
        return id[p] == id[q];
    }

    public void union(int p, int q){
        int pId = id[p];
        int qId = id[q];

        for (int i = 0; i < id.length ; i++) {
            if(id[i] == pId) id[i] = qId;
        }

        outputArr();
    }


    private void find(){

    }


    private void count() {

    }

    private void outputArr(){
        String arr = "";

        for (int j = 0; j < id.length; j++) {
            arr = arr.concat(String.valueOf(id[j]));
        }
        StdOut.println(arr);

    }
}
