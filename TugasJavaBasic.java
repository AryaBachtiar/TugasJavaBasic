import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TugasJavaBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama;
        int password;
        String pin;
        int menusoal = 1;
        int Tugas1 = 1;
        int menutugas1 = 1;
        int menusoal3 = 1;
        System.out.println("   Silahkan Login Terlebih Dahulu");
        System.out.print("Nama: ");
        nama = sc.next();

        System.out.print("Password: ");
        password = sc.nextInt();

        System.out.print("Pin: ");
        pin = sc.next();
        if (nama.equals("Administrator") && password >= 00000 && pin.equals(123456789)) {
            System.out.println("Akses Di Terima, Selamat Datang!!!  \n");
        } 
        do {

            if (nama.equals("Administrator") && password >= 5 && pin.equals("123456789")) {
                System.out.println("\n Akses Di Terima, Selamat Datang!!!  \n");
                System.out
                        .println("Silahkan Pilih Menu : \n 1. Bangun Ruang/Datar \n 2. Konversi \n 3. Secret \n 4. Exit");
                System.out.print("Pilih Nomor :");
                menusoal = sc.nextInt();
                System.out.println("Anda Memilih Nomor: " + menusoal);
                switch (menusoal) {
                    case 1:
                        // Tugas 1
                        System.out.println(" Bangun Ruang/Datar ");
                        do {
                            System.out.println("Pilih : \n1. Luas (Meter Kuadrat) \n2. Volume (Liter) \n3. Exit ");
                            System.out.print("Pilih Nomor :");
                            menutugas1 = sc.nextInt();
                            System.out.println("Anda Memilih Nomor: " + menutugas1);
                            switch (menutugas1) {
                                case 1:
                                    int menu = 1;
                                    int panjang;
                                    int lebar;
                                    int tinggi;
                                    int sisi;
                                    int alas;
                                    int rusuk;

                                    do {
                                        System.out.println(
                                                "Silahkan Pilih : \n 1.Persegi Panjang \n 2.Persegi \n 3.Segitiga \n 4.Lingkaran \n 5.Exit");
                                        System.out.print("Silahkan Pilih : ");
                                        menu = sc.nextInt();
                                        System.out.println("Anda Memilih Nomor: " + menu);
                                        switch (menu) {
                                            case 1:
                                                System.out.print("Panjang : ");
                                                panjang = sc.nextInt();
                                                System.out.print("Lebar : ");
                                                lebar = sc.nextInt();
                                                System.out.print("Tinggi : ");
                                                tinggi = sc.nextInt();
                                                System.out.println(
                                                        "Luas Persegi Panjang = " + (panjang * lebar * tinggi + "cm²"));
                                                break;
                                            case 2:
                                                System.out.print("Sisi : ");
                                                sisi = sc.nextInt();
                                                System.out.println("Luas Persegi  = " + (sisi * sisi + "cm²"));
                                                break;
                                            case 3:
                                                System.out.print("Alas: ");
                                                alas = sc.nextInt();
                                                System.out.print("Tinggi : ");
                                                tinggi = sc.nextInt();
                                                System.out.println("Luas Segitiga = " + (alas * tinggi * 1/2   + " cm²"));
                                                System.out.println("Rumus Luas Segitiga 1/2 x alas x tinggi");
                                                break;
                                            case 4:
                                                System.out.print("R : ");
                                                rusuk = sc.nextInt();
                                                System.out.println("Luas Lingkaran = " + (22 * rusuk * rusuk / 7 + "cm²"));
                                                break;
                                            default:
                                        }
                                    } while (menu < 5);
                                    break;
                                case 2:
                                    int menu2 = 0;
                                    int p;
                                    int l;
                                    int t;
                                    int s;
                                    float r;
                                    Float phi;

                                    do {
                                        System.out.println(
                                                "Silahkan Pilih : \n 1.Balok \n 2.Kubus \n 3.Bola \n 4.Exit");
                                        System.out.print("Silahkan Pilih : ");
                                        menu2 = sc.nextInt();
                                        System.out.println("Anda Memilih Nomor: " + menu2);
                                        switch (menu2) {
                                            case 1:
                                                System.out.print("Panjang : ");
                                                p = sc.nextInt();
                                                System.out.print("Lebar : ");
                                                l = sc.nextInt();
                                                System.out.print("Tinggi : ");
                                                t = sc.nextInt();
                                                System.out.println(
                                                        "Volume Balok = " + (p * l * t + "liter"));
                                                break;
                                            case 2:
                                                System.out.print("Sisi : ");
                                                s = sc.nextInt();
                                                System.out.println("Volume Kubus = " + (s * s * s + "Liter"));
                                                break;
                                            case 3:
                                               
                                                System.out.print("Jari-Jari : ");
                                                r = sc.nextInt();
                                                System.out.println(
                                                     "Volume Bola = " + (4 * r * r * r / 3 *22/7)  + " Liter");
                                                break;
                                            default:
                                        }
                                    } while (menu2 < 4);

                            }
                        } while (menutugas1 <= 2);
                        break;
                    case 2:
                        // Tugas 2
                        System.out.println(" Konversi ");
                        int Kon = 1;

                        do {
                            System.out.println("Konversion");
                            System.out.println(" 1.Derajat \n 2.Panjang \n 3.Berat \n 4.Exit");
                            System.out.println("Masukkan Nomor : ");
                            Kon = sc.nextInt();
                            switch (Kon) {
                                case 1:
                                    int D1 = 1;
                                    do {
                                        System.out.println("Derajat : ");
                                        System.out.println(" 1.Celcius \n 2.Farenhait \n 3.Reamur \n 4.Exit");
                                        System.out.println("Masukkan Nomor : ");
                                        D1 = sc.nextInt();
                                        switch (D1) {

                                            case 1:
                                               
                                                int celcius;
                                                System.out.println("Suhu Celcius");
                                                System.out.println(" 1.Celcius ke Farenheit \n 2.Celcius ke Reamur \n 3.Exit");
                                                System.out.println("Masukkan Angka : ");
                                                celcius = sc.nextInt();
                                                switch (celcius) {
                                                    case 1:
                                                    int Cf;
                                                    Cf = sc.nextInt();
                                                    System.out.println("Celcius ke Farenheit");
                                                    System.out.println(Cf + " di ubah ke "
                                                    + ( (9 * Cf/5) + 32) + " °F");
                                                        break;
                                                    case 2:
                                                    int Cr;
                                                    Cr = sc.nextInt();
                                                    System.out.println(
                                                        Cr + " di ubah ke " + (Cr  * 4 / 5) + " °R");
                                                break;

                                                    default:
                                                        break;
                                                }
                                                while (celcius < 3) {
                                                    break;
                                                }
                                                break;
                                                

                                            case 2:
                                                int fahrenheit;
                                         
                                                System.out.println("Farenheit");
                                                System.out.println(" 1.Farenheit ke Celcius \n 2.Farenheit ke Reamur \n 3.Exit");
                                                System.out.print("Masukkan angka : ");
                                                fahrenheit = sc.nextInt();
                                                switch (fahrenheit) {
                                                    case 1:
                                                    int Fc;
                                                    Fc = sc.nextInt();
                                                    System.out.println(Fc + " di ubah ke "
                                                    + ( (Fc-32) * 5/9) + " °C");
                                                        break;
                                                    case 2:
                                                    int Fr;
                                                    Fr = sc.nextInt();
                                                    System.out.println(
                                                        Fr + " di ubah ke " + (Fr - 32) * 4/9 + " °R");
                                                break;

                                                    default:
                                                        break;
                                                }
                                                while (fahrenheit < 3) {
                                                    break;
                                                }
                                                break;
                                            case 3:
                                            int Reamur;
                                            
                                            System.out.println("Reamur");
                                            System.out.println(" 1.Reamur ke Celcius \n 2.Reamur ke Farenheit \n 3.Exit");
                                            System.out.print("Masukkan angka : ");
                                            Reamur = sc.nextInt();
                                            switch (Reamur) {
                                                case 1:
                                                int Rc;
                                                Rc = sc.nextInt();
                                                System.out.println(Rc + " di ubah ke "
                                                + ( (Rc-32 * 5/4) + " °C"));
                                                    break;
                                                case 2:
                                                int Rf;
                                                Rf = sc.nextInt();
                                                System.out.println(
                                                    Rf + " di ubah ke " + (Rf * 9/4 + 32 + " °R"));
                                            break;

                                                default:
                                                    break;
                                            }
                                            while (Reamur < 3) {
                                                break;
                                            }
                                               

                                            default:
                                                break;
                                        }
                                    } while (D1 < 3);
                                    break;
                                // End Konversi

                                // Panjang
                                case 2:
                                    int jarak = 1;
                                    do {
                                        System.out.println("Panjang (meter)");

                                        System.out.println(
                                                " 1.Kilometer\n 2.Hektometer\n 3.Dekameter \n 4.Desimeter\n 5.Centimeter\n 6.Milimeter\n 7.Exit");
                                        System.out.println("Masukkkan Nomor : ");
                                        jarak = sc.nextInt();
                                        switch (jarak) {
                                            case 1:
                                                float km;
                                                System.out.println("Kilometer");
                                                System.out.println("Masukkan angka Meter : ");
                                                km = sc.nextFloat();
                                                System.out.println("jadi " + km + "meter di ubah ke Km hasilnya: "
                                                        + (km / 1000) + "Km²");
                                                break;
                                            case 2:
                                                float hm;
                                                System.out.println("Hektometer");
                                                System.out.println("Masukkan angka Meter : ");
                                                hm = sc.nextFloat();
                                                System.out.println("jadi " + hm + "meter di ubah ke hm hasilnya: "
                                                        + (hm / 100) + "hm");
                                                break;
                                            case 3:
                                                float dam;
                                                System.out.println("Hektometer");
                                                System.out.println("Masukkan angka Meter : ");
                                                dam = sc.nextFloat();
                                                System.out.println("jadi " + dam + "meter di ubah ke dam hasilnya: "
                                                        + (dam / 10) + "dam");
                                                break;
                                            case 4:
                                                float dm;
                                                System.out.println("Desimeter");
                                                System.out.println("Masukkan angka Meter : ");
                                                dm = sc.nextFloat();
                                                System.out.println("jadi " + dm + "meter di ubah ke dm hasilnya: "
                                                        + (dm * 10) + "dm");
                                                break;
                                            case 5:
                                                float cm;
                                                System.out.println("Centimeter");
                                                System.out.println("Masukkan angka Meter : ");
                                                cm = sc.nextFloat();
                                                System.out.println("jadi " + cm + "meter di ubah ke cm hasilnya: "
                                                        + (cm * 100) + "cm");
                                                break;
                                            case 6:
                                                float mm;
                                                System.out.println("Milimeter");
                                                System.out.println("Masukkan angka Meter : ");
                                                mm = sc.nextFloat();
                                                System.out.println("jadi " + mm + "meter di ubah ke mm hasilnya: "
                                                        + (mm * 1000) + "mm");
                                                break;

                                            default:
                                                break;
                                        }
                                    } while (jarak < 7);
                                    break;
                                case 3:
                                    int berat = 1;
                                    do {
                                        System.out.println("Berat");
                                        System.out.println(
                                                " 1.Kilogram \n 2.Hektogram \n 3.Dekagram\n 4.Desigram \n 5.Centigram \n 6.Miligram \n 7.Exit");
                                        System.out.println("Masukkan Berat : ");
                                        berat = sc.nextInt();
                                        switch (berat) {
                                            case 1:
                                                float kg;
                                                System.out.println("Kilogram");
                                                System.out.println("Masukkan Gram : ");
                                                kg = sc.nextFloat();

                                                System.out.println("jadi " + kg + "gram di ubah ke Kg hasilnya: "
                                                        + (kg / 1000) + "Kg");
                                                break;
                                            case 2:
                                                float hg;
                                                System.out.println("Hektogram");
                                                System.out.println("Masukkan Gram : ");
                                                hg = sc.nextFloat();

                                                System.out.println("jadi " + hg + "gram di ubah ke hg hasilnya: "
                                                        + (hg / 100) + "hg");
                                                break;
                                            case 3:
                                                float dag;
                                                System.out.println("Dekagram");
                                                System.out.println("Masukkan Gram : ");
                                                dag = sc.nextFloat();

                                                System.out.println("jadi " + dag + "gram di ubah ke dag hasilnya: "
                                                        + (dag / 10) + "dag²");
                                                break;
                                            case 4:
                                                float dg;
                                                System.out.println("DesiGram");
                                                System.out.println("Masukkan Gram : ");
                                                dg = sc.nextFloat();

                                                System.out.println("jadi " + dg + "gram di ubah ke cg hasilnya: "
                                                        + (dg * 100) + "dg²");
                                                break;
                                            case 5:
                                                float cg;
                                                System.out.println("CentiGram");
                                                System.out.println("Masukkan Gram : ");
                                                cg = sc.nextFloat();

                                                System.out.println("jadi " + cg + "gram di ubah ke cg hasilnya: "
                                                        + (cg * 1000) + "cg²");
                                                break;
                                            case 6:
                                                float mg;
                                                System.out.println("Miligram");
                                                System.out.println("Masukkan Gram : ");
                                                mg = sc.nextFloat();

                                                System.out.println("jadi " + mg + "gram di ubah ke mg hasilnya: "
                                                        + (mg * 10) + "mg²");
                                                break;

                                            default:
                                                break;
                                        }
                                    } while (berat < 7);

                                default:
                                    break;
                            }
                        } while (Kon < 4);
                        break;
                    case 3:
                        // Tugas 3
                        String unik2 = "sayangkamu";

                        System.out.print("Masukan kode unik: ");
                        unik2 = sc.next();
                        if (unik2.equals("sayangkamu") && unik2.length() == 10) {
                            System.out.println(" \n Selamat Datang VIP!! \n ");

                            int vip;

                            do {
                                System.out.println("Silahkan Pilih Menu Rahasia");
                                System.out.println(" 1. Uppercase \n 2. Lowercase \n 3. Reverse \n 4.Exit");
                                System.out.print("Pilih Nomor : ");
                                vip = sc.nextInt();
                                switch (vip) {
                                    case 1:
                                    String uppercase ;
                                    System.out.println("Ketik apa yang ingin dijadikan Uppercase : ");
                                    uppercase = sc.nextLine();
                                    uppercase = sc.nextLine().toUpperCase();
                                    List<String> Lost = Arrays.asList(uppercase.split(" "));
                                    System.out.print("Uppercase : ");
                          
                                    System.out.println(String.join(" ",Lost ));
                                        break;
                                    case 2:
                                    String lowercase ;
                                    System.out.println("Ketik apa yang ingin dijadikan Uppercase : ");
                                    lowercase = sc.nextLine();
                                    lowercase = sc.nextLine().toLowerCase();
                                    List<String> Last = Arrays.asList(lowercase.split(" "));
                                    System.out.print("LowerCase : ");
                          
                                    System.out.println(String.join(" ",Last ));
                                        
                                        break;
                                    case 3:
                                        String revese;
                                        System.out.println("Ketik apa yang ingin dijadikan Reverse : ");
                                         sc.nextLine();
                                        revese = sc.nextLine();

                                            List<String> List = Arrays.asList(revese.split(" "));
                                            System.out.print("Reversed : ");
                                            Collections.reverse(List);
                                            System.out.println(String.join(" ",List )); 
                                        break;

                                    default:
                                        break;

                                }
                            } while (vip < 3);
                            break;

                        } else {
                            System.out.println("Akses Di tolak");
                            break;
                        }
                }
            } else {
                System.out.println("Akses Di tolak");
                break;
            }

        } while (menusoal < 4 && nama.equals("Administrator") && password >= 00000 && pin.equals("123456789"));
        System.out.println("Sistem OFF harus Run Ulang");
 
        sc.close();

    }
}
