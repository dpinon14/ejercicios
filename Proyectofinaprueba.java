
package proyectofinaprueba;
import javax.swing.JOptionPane;

public class Proyectofinaprueba {

   
    public static void main(String[] args) {
        
        int v;
      int p, opc = 0;
      int anb=0, annb=0;
      int enec=0,febc=0,marc=0,abrc=0,mayc=0,junc=0,julc=0,agoc=0,sepc=0,octc=0,novc=0,dicc=0;
      String usuario,contraseña, op,mes,año,us,alu;
      String veces;
        
      JOptionPane.showMessageDialog(null,"PROYECTO FINAL\n Fundamentos de programacion\n");
      do{  
      usuario=JOptionPane.showInputDialog("Usuario:\n");
      
         contraseña=JOptionPane.showInputDialog("\nContraseña:\n");
        p=Integer.parseInt( contraseña);
        
        if((p==28)&&(usuario.equals("DPP")) ){
        
        JOptionPane.showMessageDialog(null,"Acceso permitido");
               }
        
     else {
         JOptionPane.showMessageDialog(null,"Acceso denegado");
                 }   
      }while( true );
      
        
        
        
        
        
        
        
        
        
        
    }
    
}
