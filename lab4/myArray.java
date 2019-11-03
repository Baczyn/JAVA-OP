import java.util.Random;

public class myArray{
    static int x_size;
    static int y_size;
    int tab[][];
    int next_tab[][];
    myArray(int preset){
        tab = new int[y_size][x_size];
        next_tab = new int[y_size][x_size];
        if(preset == 0){
            Random rand = new Random();
            int x,y;
            int numbers = rand.nextInt((y_size-2)*(x_size-2)); //ilosc wylosowanych 1
            for(int i=0;i<numbers;i++){
                x=rand.nextInt(x_size-2)+1;
                y=rand.nextInt(y_size-2)+1;
                tab[y][x]=1;
            }
        }
        if(preset == 1){
            tab[(y_size/2)-1][(x_size/2)-1]=1;
            tab[(y_size/2)][(x_size/2)-1]=1;
            tab[(y_size/2)][(x_size/2)+1]=1;
            tab[(y_size/2)+1][(x_size/2)]=1;
            tab[(y_size/2)-1][(x_size/2)]=1;
        }
        if(preset == 2){
            tab[(y_size/2)-1][(x_size/2)]=1;
            tab[(y_size/2)][(x_size/2)]=1;
            tab[(y_size/2)+1][(x_size/2)]=1;
        }
        if(preset == 3){
            tab[(y_size/2)-1][(x_size/2)]=1;
            tab[(y_size/2)-1][(x_size/2)-1]=1;
            tab[(y_size/2)-1][(x_size/2)+1]=1;
            tab[(y_size/2)][(x_size/2)-1]=1;
            tab[(y_size/2)+1][(x_size/2)]=1;
        }
    }


    public void print_array(){
        for(int i=1;i<y_size-1;i++){
            for(int j=1;j<x_size-1;j++){
                if(tab[i][j]==1)
                    System.out.print("x");
                else
                    System.out.print(".");
            }
            System.out.println("");
        }
    }

    public void next_step(){
        int neighbour=0;
        next_tab = new int[y_size][x_size];
        for(int i=1;i<y_size-1;i++){
            for(int j=1;j<x_size-1;j++){

                for(int k=i-1;k<=i+1;k++){
                    for(int l=j-1;l<=j+1;l++){
                        if(tab[k][l]==1) neighbour++;
                    }
                }
                if(tab[i][j]==1){
                    neighbour--;
                    if(neighbour == 2 || neighbour == 3 )
                        next_tab[i][j]=1;
                }
                else if(tab[i][j]== 0 && neighbour==3)
                    next_tab[i][j]=1;

                neighbour=0;
                    
            }
        }
        tab=next_tab;
    }
    

}
