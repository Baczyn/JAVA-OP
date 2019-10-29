import java.lang.*;

public class lab3string{

    public static int dlugosc(String slowo){
        return slowo.length();
    }

    public static int ile_razy_literka_wystepuje(String slowo,char znak){
        int suma=0;
        for(int i=0;i<slowo.length();i++){
            if(slowo.charAt(i)==znak)
                suma++;
        }
        return suma;
    }

    public static boolean czy_takie_same(String slowo1,String slowo2){
        if(slowo1.compareTo(slowo2)==0)
            return true;
        else
            return false;
    }

    public static boolean czy_plaindrom(String slowo){
        boolean flag=false;
        for(int i=0;i<slowo.length()/2;i++){
            if(slowo.charAt(i)==slowo.charAt(slowo.length()-i-1))
                flag=true;
            else
                flag=false;
        }
        return flag;
        
    }

    public static String wspak(String slowo){
        StringBuilder temp=new StringBuilder();
        for(int i=slowo.length();i>0;i--){
            temp.append(slowo.charAt(i-1));
        }
        return temp.toString();

    }

    public static boolean czy_abecadlowe(String slowo){
        boolean flag=false;
        for(int i=0;i<slowo.length()-1;i++){
            if(slowo.charAt(i)<slowo.charAt(i+1))
                flag = true;
            else 
                flag=false;
            if(flag==false) return flag;
            
        }
        return flag;
    }


    public static String rot13(String zdanie){
        StringBuilder after_rot= new StringBuilder();
        char znak;
        char new_znak;
        for(int i=0;i<zdanie.length();i++){
            znak=zdanie.charAt(i);
            if(znak>64 && znak<91){
                if((znak+13)>90){
                    new_znak=(char)(64+(int)(znak+13)-90);
                    after_rot.append(new_znak);
                }
                else{
                    new_znak=(char)(znak+13);
                    after_rot.append(new_znak);
                }
            }
            else if(znak>96 && znak <123){
                if((znak+13)>122){
                    new_znak=(char)(96+(int)(znak+13)-122);
                    after_rot.append(new_znak);
                 }
                 else{
                    new_znak=(char)(znak+13);
                    after_rot.append(new_znak);
                }   
            }
            else{
                after_rot.append(znak);
            }
        }
    
    return after_rot.toString();
    
}   
}