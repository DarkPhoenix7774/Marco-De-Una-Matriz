
public class Matriz {
    public static void main(String [] args){
        int matriz[][] = new int[5][15];

        for(int i = 0; i<5;i++){
            for(int j = 0; j<15; j++){
                if(i==0 || i==4){
                    matriz [i][j] = 1;
                }
                else if (j==14 || j==0){
                    matriz[i][j] = 1;
                }
                else {
                    matriz[i][j] = 0;
                }
            }
        }

        System.out.println("La matriz es: \n");
        for (int i=0;i<15;i++){
            for (int j=0;j<15;j++){
                System.out.print(matriz[i][j]+"");
            }
            System.out.println("");
        }


    }
}
