package com.binus.learnprogramming;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LuasSawah {

    public static void main(String[] args) throws IOException {

    Scanner in = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out, true);

    out.println("Enter a number for Height (meter):  ");
    out.println("Enter a number for Width (meter):  ");
    double Height = 0.0;
    double Width = 0.0;
    try

    {
        Height = in.nextDouble();
        Width = in.nextDouble();
    } catch(Exception e) {
        try {
            throw new IOException("Input must a double");
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    double area = Height * Width;

    String result = String.format("result from calculated of Area Sawah: %s", area);
    out.println(result);
    }
}
