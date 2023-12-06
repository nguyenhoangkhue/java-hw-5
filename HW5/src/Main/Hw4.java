package Main;

public class Hw4 {
    public static void main(String[] args) {
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                if (j==0||i==3||i==j||i==2&&j==1){
                    System.out.print("*"+"\t");
                }else {
                    System.out.print(""+"\t");
                }
            }
            System.out.println("");
        }
    }
}
