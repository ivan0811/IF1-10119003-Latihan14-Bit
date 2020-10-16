package com.bit;

/*
	NAMA = Ivan Faathirza
	KELAS = IF1
	NIM = 10119003
	Deskripsi program = program ini untuk menampilkan bit and, or, not, xor, left shift dan right shift
 */
public class Bit {

    public static void main(String[] args) {
	    int a = 60; //60 = 0011 1100
        int b = 13; //13 = 0000 1101
        int c = 0;

        c = a & b; // 12 = 0000 1100 and
        System.out.println("a & b = "+ c);

        c = a | b; //61 = 0011 1101 or
        System.out.println("a | b = "+c);

        c = a ^ b; //49 = 0011 0001 not
        System.out.println("a ^ b = " +c);

        c = ~a; //-61 = 1100 0011 xor
        System.out.println("~a = "+c);

        c = a << 2; //240 = 1111 0000 left shift
        System.out.println("a << 2 = "+c);

        c = a >> 2; //0000 1111 right shift
        System.out.println("a >> 2 = " + c);
    }
}
