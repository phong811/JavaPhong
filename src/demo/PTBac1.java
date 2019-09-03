package demo;

public class PTBac1 {
    int soA;
    int soB;
    int ketQua;

    void giaiPT(){
        if (soA==0 && soB == 0){
            System.out.println("Phuong trinh co vo so nghiem!");
        }else if (soA == 0 && soB =!0){
            System.out.println("phuong trinh vo nghiem!");
        }else {
            ketQua=-soB/soA;
        }
    }
}
