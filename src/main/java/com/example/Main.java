package com.example;

import edu.princeton.cs.algs4.StdOut;

import java.io.*;

public class Main {
    private static UF uf;

    public static void main(String[] args) throws IOException {
//        FileInputStream fileInputStream = new FileInputStream("./src/main/test_data/tinyUF.txt");
        FileInputStream fstream = null;
        fstream = new FileInputStream(args[0].toString());
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
//        int N = StdIn.readInt();

        String strLine;
        while ((strLine = br.readLine()) != null)   {
            // Print the content on the console
            String[] linecontents = strLine.split(" ");
            if (linecontents.length < 2) {
                uf = new UF(Integer.parseInt(linecontents[0]));

            } else if (linecontents.length == 2){
                int p = Integer.parseInt(linecontents[0]);
                int q = Integer.parseInt(linecontents[1]);
               if (!uf.connected(p , q)){

                   uf.union(p , q);
                   StdOut.println(p + " " + q);

               }
            }
        }

//Close the input stream
        br.close();

//        while (!StdIn.isEmpty()){
//           int p = StdIn.readInt();
//           int q = StdIn.readInt();
//
//           if (!uf.connected(p , q)){
//
//               uf.union(p , q);
//               StdOut.println(p + " " + q);
//
//           }
//        }

    }
}
