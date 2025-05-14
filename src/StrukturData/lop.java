package StrukturData;

public class lop {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                for(int k=1;k<=10;k++){
                    continue;
                }
            }
        }
        long hasil = System.nanoTime();
        System.out.println(startTime - hasil / 1e6 + " ms");
    }
}
