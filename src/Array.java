/**
 * Created by GURU on 26/01/2018.
 */
public class Array {
    public static void main(String a[]){
        int[][] table=new int[10][];
        int n=1;
        for(int i=0;i<table.length;i++){
            table[i]=new int[10];
        }

        for(int j=1;j<=10;j++){

            for(int k=1;k<=10;k++){
                System.out.print(n+"\t");
                n++;
            }
            System.out.println("\n");
        }
    }
}
