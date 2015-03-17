import java.util.Scanner;
    public class tugas {
         public static void main(String args[]) {
         	String kelamin;
         	String profesi="dosen";
         	System.out.println("Masukan Kelamin Anda:");
         	Scanner masukan1=new Scanner (System.in);
         	kelamin=masukan1.next();






         	if (kelamin=="L" & profesi=="dosen") {
         		System.out.println("Diskon 15%");
         }  
         	else if (kelamin=="L" | kelamin=="P" & profesi=="mahasiswa" | profesi=="mahasiswi") {
         		System.out.println("Diskon 15%");
         }  
         	else if (kelamin=="P") {
         		System.out.println("Diskon 5%");
         }  
         	
         	}
    }