// DANIELA PIÑON POLANCO 22550343 INGIENERIA EN SISTEMAS COMPUTACIONALES NO.LISTA:28
package proyectofinal;

//HOLA BBY


import javax.swing.JOptionPane;
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int p, opc = 0, contm=0,conta=0;
        int enec =0 , febc =0 , marc =0 , abrc =0 , mayc =0 , junc=0 , julc=0 , agoc=0 , sepc=0 , octc=0 , novc=0 , dicc = 0;
      
      String usuario,contraseña, op,mes,año,us;
        JOptionPane.showMessageDialog(null,"PROYECTO FINAL\n Fundamentos de programacion\n");
         usuario=JOptionPane.showInputDialog("Usuario:\n");
      
         contraseña=JOptionPane.showInputDialog("\nContraseña:\n");
        p=Integer.parseInt( contraseña);
       
               
        if((p==28)&&(usuario.equals("DPP")) ){
            
        JOptionPane.showMessageDialog(null,"Acceso permitido");
        do{
         op=JOptionPane.showInputDialog(null,"MENU PRINCIPAL\n 1) Meses \n 2) Alumnos\n 3) Numeros \n4) Salir  ");
        opc=Integer.parseInt(op);
        int o=opc;
        if (opc==1){
        switch(opc){
            case 1:
               
        mes=JOptionPane.showInputDialog(null,"Ingresa el mes(1-2):  ");
        int m=Integer.parseInt( mes);
       
        año=JOptionPane.showInputDialog(null,"Ingresa el año  ");
        int a=Integer.parseInt( año);
        if((a% 400==0 && a% 100 != 0) ||(a % 4== 0) ){
             
        switch(m){
                 case 1:
                     
                     JOptionPane.showMessageDialog(null, "Enero tine 30 dias \n El año "+a+ " es Bisiesto");
                     
                     break;
                 case  2:
                      JOptionPane.showMessageDialog(null, "Febrero tiene 28 dias \n El año "+a+ " es Bisiesto  ");
                      
                      break;
                 case 3:
                      JOptionPane.showMessageDialog(null, "Marzo tiene 31 dias \n El año "+a+ " es Bisiesto");
                   
                      break;
                 case 4:
                      JOptionPane.showMessageDialog(null, "Abril tiene 30 dias \n El año "+a+ " es Bisiesto");
                  
                      break;
                 case 5:
                      JOptionPane.showMessageDialog(null, "Mayo tiene 31 dias \n El año "+a+ " es Bisiesto");
                      
                      break;
                 case 6:
                      JOptionPane.showMessageDialog(null, "Junio tiene 30 dias \n El año "+a+ " es Bisiesto ");
                   
                      break;
                 case 7:    
                      JOptionPane.showMessageDialog(null, "Julio tiene 31 dias \n El año "+a+ " es Bisiesto");
                      
                      break;
                 case 8:   
                      JOptionPane.showMessageDialog(null, "Agosto tiene 31 dias \n El año "+a+ " es Bisiesto ");
                    
                      break;
                 case 9:   
                      JOptionPane.showMessageDialog(null, "Septiembre tiene 30 dias \n El año "+a+ " es Bisiesto"); 
                      
                      break;
                 case 10:   
                      JOptionPane.showMessageDialog(null, "Octubre tiene 31 dias \n El año "+a+ " es Bisiesto");
                    
                      break;
                  case 11:   
                      JOptionPane.showMessageDialog(null, "Noviembre tiene  30 dias \n El año "+a+ " es Bisiesto");
                 
                      break;
                 case 12:   
                      JOptionPane.showMessageDialog(null, "Diciembre tiene 31 dias \n El año "+a+ " es Bisiesto");  
                     
                      break;
                      
                  
        }    
       
 
        }
        else { 
        switch(m){
                 case 1:
                     
                     JOptionPane.showMessageDialog(null, "Enero tine 30 dias \n El año "+a+ " es Bisiesto");
                    
                     break;
                 case  2:
                      JOptionPane.showMessageDialog(null, "Febrero tiene 29 dias \n El año "+a+ " es Bisiesto  ");
                      
                      break;
                 case 3:
                      JOptionPane.showMessageDialog(null, "Marzo tiene 31 dias \n El año "+a+ " es Bisiesto");
                   
                      break;
                 case 4:
                      JOptionPane.showMessageDialog(null, "Abril tiene 30 dias \n El año "+a+ " es Bisiesto");
                  
                      break;
                 case 5:
                      JOptionPane.showMessageDialog(null, "Mayo tiene 31 dias \n El año "+a+ " es Bisiesto");
                      
                      break;
                 case 6:
                      JOptionPane.showMessageDialog(null, "Junio tiene 30 dias \n El año "+a+ " es Bisiesto ");
                   
                      break;
                 case 7:    
                      JOptionPane.showMessageDialog(null, "Julio tiene 31 dias \n El año "+a+ " es Bisiesto");
                      
                      break;
                 case 8:   
                      JOptionPane.showMessageDialog(null, "Agosto tiene 31 dias \n El año "+a+ " es Bisiesto ");
                    
                      break;
                 case 9:   
                      JOptionPane.showMessageDialog(null, "Septiembre tiene 30 dias \n El año "+a+ " es Bisiesto"); 
                      
                      break;
                 case 10:   
                      JOptionPane.showMessageDialog(null, "Octubre tiene 31 dias \n El año "+a+ " es Bisiesto");
                    
                      break;
                  case 11:   
                      JOptionPane.showMessageDialog(null, "Noviembre tiene  30 dias \n El año "+a+ " es Bisiesto");
                 
                      break;
                 case 12:   
                      JOptionPane.showMessageDialog(null, "Diciembre tiene 31 dias \n El año "+a+ " es Bisiesto");  
                     
                      break;
        }    
        }
                    
     
        }
       
   
        }
            
        
     
        } while(opc!=4);
            JOptionPane.showMessageDialog(null, "Seleccionaste salir ");  
        
        }
        
         else{
            JOptionPane.showMessageDialog(null,"Acceso denegado");

        }
       
                            
   
       
       
    }
}
