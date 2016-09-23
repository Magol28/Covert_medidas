/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter.measures;

/**
 *
 * @author Miguel_Angel
 */
public class Converter_Measures {
    
    public static final  Float[ ]   equivalences = new  Float[7];
    static {
        equivalences[0]=1000f;//kilo
        equivalences[1]=100f;//hecto
        equivalences[2]=10f;//deca
        equivalences[3]=1f;//m
        equivalences[4]=0.1f;//deci
        equivalences[5]=0.01f;//centi
        equivalences[6]=0.001f;//mili
    }
     public static final  String[ ]   names = new  String[7];
    static {
        names[0]="Kilometro";//kilo
        names[1]="Hectometro";//hecto
        names[2]="Decametro";//deca
        names[3]="Metro";//m
        names[4]="Decimetro";//deci
        names[5]="Centimetro";//centi
        names[6]="Milimetro";//mili
    }
    
    public static Float   Convert(Float number,int index){
        Float ingres=0f;
    
        ingres=number*equivalences[index];
        
      return ingres;  
    }
       public static Float  Convertto(Float number,int index){
        Float ingres=0f;
        
        ingres=number/equivalences[index];
        
      return ingres;  
    }
}
