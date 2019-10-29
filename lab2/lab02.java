import java.util.Scanner;

class Tools{
    static int length;
    static int temp[];
    static int nm_of_1;
    static void remove_0(int[] tab,int size){
        nm_of_1=0;
        boolean flag = false;
        length=size;
        int i=0;
        while(i<size){
        
            if(tab[i]==1){
                flag=true;
                nm_of_1++;
                i++;}
            else if(flag==true && tab[i]==0){
                 tab[i]=9;
                 length--;
                 i++;}
            else if(flag==false)i++;
            
    }
    temp = new int[length];
    int j=0;i=0;
    while(i<size && j<length){
        if(tab[i]<2){temp[j]=tab[i]; i++;j++;}
        else{i++;}
    }
       
    
    
}
    static void print(int[] tab,int size){
        for(int i=0;i<size;i++) System.out.print(tab[i]+" ");
        if(size==0)System.out.println("nie znalazłem");
        else{System.out.println(" Długosc: "+size);}
    }


}


public class lab02{

    static public void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy 1 ");
        int size1=in.nextInt();
        System.out.println("Podaj rozmiar tablicy 2 ");
        int size2=in.nextInt();
        System.out.println("Podaj ciagi znakow tablic 1");
        int Array1[] = new int[size1];
        int Array2[] = new int[size2];
        for(int i=0;i<size1;i++)
            Array1[i]=in.nextInt();
            System.out.println("Podaj ciagi znakow tablic 2");
        for(int i=0;i<size2;i++)
           Array2[i]=in.nextInt();
            


        Tools.remove_0(Array1, size1);
        size1=Tools.length;
        int num1=Tools.nm_of_1;
        int New_Array1[]=new int[size1];
        for(int i =0;i<size1;i++){
                New_Array1[i]=Tools.temp[i];}

       Tools.remove_0(Array2, size2);
       size2=Tools.length;
       int num2=Tools.nm_of_1;
        int New_Array2[]=new int[size2];
        for(int i =0;i<size2;i++){
            New_Array2[i]=Tools.temp[i];}

             

     
     int zera=0;
     if((size1-num1)<=(size2-num2)) zera= size1-num1;
     if((size1-num1)>(size2-num2)) zera= size2-num2;

     int jedynki=0;
     if(num1<=num2)jedynki=num1;
     else{jedynki=num2;}
    
     int end_tab[] = new int[(jedynki+zera)];
     for(int i=0;i<zera;i++)end_tab[i]=0;
     for(int i=zera;i<(jedynki+zera);i++)end_tab[i]=1;

     Tools.print(end_tab, jedynki+zera);

     in.close();
}
}