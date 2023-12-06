package Main;

public class Hw2 {
    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            for (int j=0;j<4;j++){
                if (i==0||i==4||j==0||j==3){
                    System.out.print("*"+"\t");
                }else {
                    System.out.print(""+"\t");
                }
            }
            System.out.println("");
        }
    }
}
