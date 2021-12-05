import java.util.ArrayList;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        ArrayList<String> dataMember = new ArrayList<String>();
        int userInput = 0;
        int nomor = 0;
        boolean data = true;
        while(data){
                clearScreen();
                System.out.println("\n================ SELAMAT DATANG DI ================");
                System.out.println("=================== PERTAMINI UB ==================");
                System.out.println("1. Pelanggan");
                System.out.println("2. Tampilkan riwayat pembelian");
                System.out.println("3. Keluar");
                System.out.print("Masukkan pilihan anda : ");
                int pilihan = input.nextInt();
                System.out.println("===================================================");
                switch(pilihan){
                    case 1 :
                    nomor++;
                    System.out.print("Nama pelanggan : ");
                    String nama = input.next();
                    input.nextLine();
                    System.out.println("===================================================");
                    dataMember.add(nama);
                    System.out.println("Daftar Kendaraan");
                    System.out.println("1. Mobil");
                    System.out.println("2. Motor");
                    System.out.print("Masukkan jenis kendaraan anda : ");
                    
                    userInput = input.nextInt();
                    if (userInput == 1){
                        dataMember.add("Mobil");
                    } else if (userInput == 2){
                        dataMember.add("Motor");
                    } else {
                        dataMember.remove(nama);
                    }
        
                        switch(userInput){
                            case 1 :
                            System.out.println("===================================================");
                            System.out.println("====================== MOBIL ======================");
                            System.out.println("Daftar Bensin");
                            System.out.println("1. Pertalite");
                            System.out.println("2. Pertamax");
                            System.out.println("3. Pertamax turbo");
                            System.out.println("4. Dexlite");
                            System.out.println("5. Dex");
                            System.out.print("Masukkan pilihan bensin anda : ");
                            int pilihan1 = input.nextInt();
                            if (pilihan1 == 1){
                                dataMember.add("Pertalite");
                            } else if (pilihan1 == 2){
                                dataMember.add("Pertamax");
                            } else if (pilihan1 == 3){
                                dataMember.add("Pertamax turbo");
                            } else if (pilihan1 == 4){
                                dataMember.add("Dexlite");
                            } else if (pilihan1 == 5){
                                dataMember.add("Dex");
                            }
                            kendaraan(pilihan1);
                            break;
                
                            case 2 :
                            System.out.println("===================================================");
                            System.out.println("====================== MOTOR ======================");
                            System.out.println("Daftar Bensin");
                            System.out.println("1. Pertalite");
                            System.out.println("2. Pertamax");
                            System.out.println("3. Pertamax turbo");
                            System.out.println("4. Dexlite");
                            System.out.println("5. Dex");
                            System.out.print("Masukkan pilihan bensin anda : ");
                            int pilihan2 = input.nextInt();
                            if (pilihan2 == 1){
                                dataMember.add("Pertalite");
                            } else if (pilihan2 == 2){
                                dataMember.add("Pertamax");
                            } else if (pilihan2 == 3){
                                dataMember.add("Pertamax turbo");
                            } else if (pilihan2 == 4){
                                dataMember.add("Dexlite");
                            } else if (pilihan2 == 5){
                                dataMember.add("Dex");
                            }
                            kendaraan(pilihan2);
                            break;
                
                            default :
                            System.out.println("\n===================================================");
                            System.out.println("         PILIHAN ANDA TIDAK ADA DIDALAM MENU");
                            System.out.println("===================================================");
                            break;
                        }
                    break;    
                    case 2 :
                    int count = 1;
                    if (dataMember.size() != 0){
                        System.out.println("========== RIWAYAT PEMBELIAN PERTAMINI UB =========\n");
                        System.out.println("NO  NAMA         KENDARAAN         JENIS BENSIN   ");
                        for (int j = 1; j < 2; j++){
                            System.out.print(j + ".  ");
                            for (int i = 0; i < dataMember.size(); i++){
                                if (count % 3 == 0){
                                    System.out.print(" ");
                                }
                                if (count % 4 == 0){
                                    System.out.println("");
                                    j++;
                                    count = 1;
                                    if (nomor > 1){
                                        System.out.print(j + ".  ");
                                        nomor = 1;
                                        if (dataMember.size() > 4){
                                            nomor++;
                                        }
                                    }
                                }
                                System.out.print(dataMember.get(i) + "\t   ");
                                count++;
                            }
                            System.out.println("\n\n===================================================");
                            break;
                        }
                    } else {
                        System.out.println("========== RIWAYAT PEMBELIAN PERTAMINI UB =========\n");
                        System.out.println("             Belum ada data yang masuk");
                        System.out.println("\n===================================================");
                    }
                    break;
                    case 3 : break;
                    default :
                    System.out.println("        Pilihan anda tidak ada didalam menu");
                    System.out.println("\n===================================================");
                    break;
                }
                if(pilihan == 3){
                    break;
                } 
                data = getChoose("\nApakah anda ingin melanjutkan");
            }
    }

    public static void kendaraan(int pilihan){
        System.out.println("===================================================");

        switch (pilihan){
            case 1 :
            System.out.println("==================== Pertalite ====================");
            pertalite();
            break;

            case 2 :
            System.out.println("===================== Pertamax ====================");
            pertamax();
            break;

            case 3 :
            System.out.println("================= Pertamax turbo ==================");
            pertamaxturbo();
            break;

            case 4 :
            System.out.println("===================== Dexlite =====================");
            dexlite();
            break;

            case 5 :
            System.out.println("======================= Dex =======================");
            dex();
            break;
        }
    }

    //User milih pertalite
    private static void pertalite(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Harga Pertalite = Rp. 7.650/Liter");
        System.out.print("Masukkan nominal uang : Rp. ");
        int nominalUang = input.nextInt();
        double nominalLiter = (double) nominalUang/7650;
        System.out.printf("Total Harga = Rp.%.0f,00\n", member(nominalUang));
        System.out.printf("Total Liter = %.2fL\n", nominalLiter);
        System.out.println("===================================================");
        System.out.println("          TERIMA KASIH TELAH BERBELANJA");
        System.out.println("===================================================");
    }

    //User milih pertamax
    private static void pertamax(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Harga Pertamax = Rp. 9.000/Liter");
        System.out.print("Masukkan nominal uang : Rp. ");
        int nominalUang = input.nextInt();
        double nominalLiter = (double) nominalUang/9000;
        System.out.printf("Total Harga = Rp.%.0f,00\n", member(nominalUang));
        System.out.printf("Total Liter = %.2fL\n", nominalLiter);
        System.out.println("===================================================");
        System.out.println("          TERIMA KASIH TELAH BERBELANJA");
        System.out.println("===================================================");
    }
    
    //User milih pertamax turbo
    private static void pertamaxturbo(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Harga Pertamax Turbo = Rp. 12.300/Liter");
        System.out.print("Masukkan nominal uang : Rp. ");
        int nominalUang = input.nextInt();
        double nominalLiter = (double) nominalUang/12300;
        System.out.printf("Total Harga = Rp.%.0f,00\n", member(nominalUang));
        System.out.printf("Total Liter = %.2fL\n", nominalLiter);
        System.out.println("===================================================");
        System.out.println("          TERIMA KASIH TELAH BERBELANJA");
        System.out.println("===================================================");
    }

    //User milih dexlite
    private static void dexlite(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Harga Dexlite = Rp. 9.500/Liter");
        System.out.print("Masukkan nominal uang : Rp. ");
        int nominalUang = input.nextInt();
        double nominalLiter = (double) nominalUang/9500;
        System.out.printf("Total Harga = Rp.%.0f,00\n", member(nominalUang));
        System.out.printf("Total Liter = %.2fL\n", nominalLiter);
        System.out.println("===================================================");
        System.out.println("          TERIMA KASIH TELAH BERBELANJA");
        System.out.println("===================================================");
        
    }

    //User milih dex
    private static void dex(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Harga Dex = Rp. 11.150/Liter");
        System.out.print("Masukkan nominal uang : Rp. ");
        int nominalUang = input.nextInt();
        double nominalLiter = (double) nominalUang/11150;
        System.out.printf("Total Harga = Rp.%.0f,00\n", member(nominalUang));
        System.out.printf("Total Liter = %.2fL\n", nominalLiter);
        System.out.println("===================================================");
        System.out.println("          TERIMA KASIH TELAH BERBELANJA");
        System.out.println("===================================================");
    }

    //buat kartu member
    private static double member(double nominalUang){
        Scanner input = new Scanner(System.in);

        System.out.println("===================================================");
        double temp = 0;
        boolean tempA = true;
        String member ="";
        
        while(tempA){
            System.out.print("Apakah anda memiliki kartu member (y/n) ? ");
            member = input.nextLine();
            if(member.equalsIgnoreCase("y")||member.equalsIgnoreCase("n")){
                tempA = false;
            }
            System.out.println("===================================================");
        }
        
        if(member.equalsIgnoreCase("y")){
            nominalUang = nominalUang - (nominalUang*10/100);
            return nominalUang;
        }else if(member.equalsIgnoreCase("n")){
            return nominalUang;
        }else{
            return temp;
        }
    }

    //Buat mulai looping lagi
    private static boolean getChoose(String message){
        Scanner input = new Scanner(System.in);
        System.out.print(message + " (y/n) ? ");
        String userInput = input.next();

        while  (!userInput.equalsIgnoreCase("y") && !userInput.equalsIgnoreCase("n")){
            System.out.println("Pilihan anda bukan y atau n");
            System.out.print(message + " (y/n) ? ");
            userInput = input.next();
        }
        return userInput.equalsIgnoreCase("y");
    }

    // agar command yang sebelumnya tidak tampil kembali setelah program selesai
    private static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            } else {
                System.out.println("\033\143");
            }
        } catch (Exception e){
            System.err.println("tidak bisa melakukan clear screen");
        }
    }
}
