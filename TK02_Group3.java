package com.binus.learnprogrammingForAssignment;

import java.util.Scanner;

public class TK02_Group3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Awal program dijalankan, minta user untuk menginput nama
        String nama;
        do {
            System.out.print("Masukkan nama Anda: ");
            nama = input.nextLine();
        } while (nama.length() < 1 || nama.length() > 25);

        // Minta user untuk menginput NIM
        String nim;
        do {
            System.out.print("Masukkan NIM Anda: ");
            nim = input.nextLine();
        } while (nim.length() != 10);

        System.out.println(" ");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println(" ");
        System.out.println("Regristrasi Sukses......");
        System.out.println("Selamat Datang " + nama + " [NIM : " + nim + "].....");
        System.out.println(" ");
        System.out.println("Mari belajar macam-macam deret bilangan.....");
        System.out.println(" ");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println(" ");

        // Minta user untuk menginput jumlah angka
        String ulang;
        do {
        int jumlahAngka;
        do {
            System.out.print("Masukkan jumlah angka [5-20]: ");
            jumlahAngka = input.nextInt();
        } while (jumlahAngka < 5 || jumlahAngka > 20);

            System.out.println(" ");
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println(" ");
            System.out.println("Deret Bilangan");
            System.out.println("###############");
            System.out.println(" ");
        // Tampilkan deret bilangan genap
        System.out.println(jumlahAngka + " Deret bilangan genap: ");
        int sumGenap = 0;
        for (int i = 0; i < jumlahAngka; i++) {
            int bilangan = i * 2;
            System.out.print(bilangan + " ");
            sumGenap += bilangan;
        }
        System.out.println("\nHasil Penjumlahan: " + sumGenap);
            System.out.println(" ");

        // Tampilkan deret bilangan ganjil
        System.out.println(jumlahAngka + " Deret bilangan ganjil: ");
        int sumGanjil = 0;
        for (int i = 0; i < jumlahAngka; i++) {
            int bilangan = i * 2 + 1;
            System.out.print(bilangan + " ");
            sumGanjil += bilangan;
        }
        System.out.println("\nHasil Penjumlahan: " + sumGanjil);
            System.out.println(" ");

        // Tampilkan deret bilangan Fibonacci
        System.out.println(jumlahAngka + " Deret bilangan Fibonacci:");
        int sumFibonacci = 0;
        int a = 0, b = 1;
        for (int i = 0; i < jumlahAngka; i++) {
            int bilangan = a + b;
            System.out.print(bilangan + " ");
            sumFibonacci += bilangan;
            a = b;
            b = bilangan;
        }
        System.out.println("\nHasil Penjumlahan: " + sumFibonacci);
            System.out.println(" ");

        // Pertanyaan untuk mengulang perhitungan

            System.out.print("Apakah Anda ingin mengulang perhitungan? (y/t) ");
            ulang = input.next();

            // Validasi input
            if (ulang.equals("Y") || ulang.equals("y")) {
                // Program akan berulang
            } else if (ulang.equals("T") || ulang.equals("t")) {
                // Program akan berakhir
                break;
            } else {
                // Input tidak valid, tampilkan pesan error dan ulangi pertanyaan
                System.out.println("Input tidak valid, silakan masukkan Y atau T.");
            }
        } while (true);
    }
}
