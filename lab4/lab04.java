
public class lab04{ 
    public static void main(String[] args)  throws InterruptedException{
        myArray.x_size = Integer.parseInt(args[0]) + 2;
        myArray.y_size = Integer.parseInt(args[1]) + 2;
        int steps  = Integer.parseInt(args[2]);
        int preset = Integer.parseInt(args[3]);

        myArray array = new myArray(preset);

         for(int i=0;i<steps;i++){
             System.out.print("----"+(i+1)+"----\n");
             array.print_array();
             array.next_step();
            
          }
        //  int i=0;
        //  while(i<steps){
        //     array.print_array();
        //     Thread.sleep(100);
        //     array.next_step();
        //     Thread.sleep(100);
        //     System.out.print("\033[H\033[2J");
        //     System.out.flush();
        //      i++;
        //  }
    }
}