public class DemoInput
{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);                
 
        System.out.print("Inputkan Nama : ");
        String nama = input.nextLine();
 
        System.out.print("Inputkan Nilai 1 : ");
        int nilai1 = input.nextInt();
        System.out.print("Inputkan Nilai 2 : ");
        int nilai2 = input.nextInt();
 
        System.out.print("Penambahan dari nilai 1 dan nilai 2 : "+(nilai1+nilai2));
        System.out.println("Nama anda adalah: "+nama);
    }
}