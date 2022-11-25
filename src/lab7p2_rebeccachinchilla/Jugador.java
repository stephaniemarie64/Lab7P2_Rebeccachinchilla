/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_rebeccachinchilla;

/**
 *
 * @author Dell
 */
public class Jugador {
    /*
    Contará con un nombre, dorsal, goles, asistencia, partidos jugados, tarjetas amarillas, 
    tarjetas  rojas, faltas cometidas, faltas recibidas y posición (en caso de ser portero 
    tendrá un atributo extra  que son las porterías imbatidas). 
VALIDACIONES NECESARIAS:  
o No se pueden asignar números mayores a 26 o menores a 1.  
o Los números 1, 13 y 26 están reservados para porteros.

    
    */
    String Nombre; 
    int dorsal, goles, asistencia, partidosjugados, tarjetasamarillas, tarjetasrojas, 
            faltascometidas, faltasrecibidas, posición, porteriasimbatidas = 0;
    boolean ESPORTER = false;

    public Jugador(String Nombre, int dorsal, int goles, int asistencia, int partidosjugados,
            int tarjetasamarillas, int tarjetasrojas, int faltascometidas, int faltasrecibidas, int posición) {
        this.Nombre = Nombre;
        this.dorsal = dorsal;
        this.goles = goles;
        this.asistencia = asistencia;
        this.partidosjugados = partidosjugados;
        this.tarjetasamarillas = tarjetasamarillas;
        this.tarjetasrojas = tarjetasrojas;
        this.faltascometidas = faltascometidas;
        this.faltasrecibidas = faltasrecibidas;
        this.posición = posición;
    }
    
    
    
    
    
    //GETTERS

    public String getNombre() {
        return Nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public int getGoles() {
        return goles;
    }

    public int getAsistencia() {
        return asistencia;
    }

    public int getPartidosjugados() {
        return partidosjugados;
    }

    public int getTarjetasamarillas() {
        return tarjetasamarillas;
    }

    public int getTarjetasrojas() {
        return tarjetasrojas;
    }

    public int getFaltascometidas() {
        return faltascometidas;
    }

    public int getFaltasrecibidas() {
        return faltasrecibidas;
    }

    public int getPosición() {
        return posición;
    }

    public boolean isESPORTER() {
        return ESPORTER;
    }

    public int getPorteriasimbatidas() {
        return porteriasimbatidas;
    }

    
    
    //SETTERS
    
    
    public void setNombre(String Nombre) {
       
        
        this.Nombre = Nombre;
    }

    public void setDorsal(int dorsal) {
        
        
        if(dorsal > 0 || dorsal < 27){
            
            
            if(dorsal == 1 || dorsal == 13 || dorsal == 26){
                 if(ESPORTER){
                 this.dorsal = dorsal;
            }else{
                     System.out.println("DEBE SER PORTERO PARA INGRESAR ESOS NUMEROS");
                 }
            }else{
                this.dorsal = dorsal;
            }
           
            
            
            
            
        }else{
              System.out.println("Numeros no validos");
        }
        
       
    }

    public void setGoles(int goles) {
    
        
        
          if(dorsal > 0 || dorsal < 27){
            if(dorsal == 1 || dorsal == 13 || dorsal == 26){
                 if(ESPORTER){
                    this.goles = goles;
            }else{
                     System.out.println("DEBE SER PORTERO PARA INGRESAR ESOS NUMEROS");
                 }
            }else{
                   this.goles = goles;
            }
        }else{
              System.out.println("Numeros no validos");
        }
        
        
        
        
    }

    public void setAsistencia(int asistencia) {

        
        
        
           if(dorsal > 0 || dorsal < 27){
            if(dorsal == 1 || dorsal == 13 || dorsal == 26){
                 if(ESPORTER){
                          this.asistencia = asistencia;
            }else{
                     System.out.println("DEBE SER PORTERO PARA INGRESAR ESOS NUMEROS");
                 }
            }else{
                          this.asistencia = asistencia;
            }
        }else{
              System.out.println("Numeros no validos");
        }
        
        
        
    }

    public void setPartidosjugados(int partidosjugados) {
       
        
        
           if(dorsal > 0 || dorsal < 27){
            if(dorsal == 1 || dorsal == 13 || dorsal == 26){
                 if(ESPORTER){
                         this.partidosjugados = partidosjugados;
            }else{
                     System.out.println("DEBE SER PORTERO PARA INGRESAR ESOS NUMEROS");
                 }
            }else{
                          this.partidosjugados = partidosjugados;
            }
        }else{
              System.out.println("Numeros no validos");
        }
        
        
        
    }

    public void setTarjetasamarillas(int tarjetasamarillas) {
   
        
        
          if(dorsal > 0 || dorsal < 27){
            if(dorsal == 1 || dorsal == 13 || dorsal == 26){
                 if(ESPORTER){
                          this.tarjetasamarillas = tarjetasamarillas;
            }else{
                     System.out.println("DEBE SER PORTERO PARA INGRESAR ESOS NUMEROS");
                 }
            }else{
                             this.tarjetasamarillas = tarjetasamarillas;
            }
        }else{
              System.out.println("Numeros no validos");
        }
        
        
    }

    public void setTarjetasrojas(int tarjetasrojas) {
   
        
        
             if(dorsal > 0 || dorsal < 27){
            if(dorsal == 1 || dorsal == 13 || dorsal == 26){
                 if(ESPORTER){
                         this.tarjetasrojas = tarjetasrojas;
            }else{
                     System.out.println("DEBE SER PORTERO PARA INGRESAR ESOS NUMEROS");
                 }
            }else{
                                this.tarjetasrojas = tarjetasrojas;
            }
        }else{
              System.out.println("Numeros no validos");
        }
        
        
    }

    public void setFaltascometidas(int faltascometidas) {
      
        
        
        
             if(dorsal > 0 || dorsal < 27){
            if(dorsal == 1 || dorsal == 13 || dorsal == 26){
                 if(ESPORTER){
                        this.faltascometidas = faltascometidas;
            }else{
                     System.out.println("DEBE SER PORTERO PARA INGRESAR ESOS NUMEROS");
                 }
            }else{
                             this.faltascometidas = faltascometidas;
            }
        }else{
              System.out.println("Numeros no validos");
        }
        
    }

    public void setFaltasrecibidas(int faltasrecibidas) {
  
        
        
         
             if(dorsal > 0 || dorsal < 27){
            if(dorsal == 1 || dorsal == 13 || dorsal == 26){
                 if(ESPORTER){
                             this.faltasrecibidas = faltasrecibidas;
            }else{
                     System.out.println("DEBE SER PORTERO PARA INGRESAR ESOS NUMEROS");
                 }
            }else{
                               this.faltasrecibidas = faltasrecibidas;
            }
        }else{
              System.out.println("Numeros no validos");
        }
        
    }

    public void setPosición(int posición) {
       
        
         
             if(dorsal > 0 || dorsal < 27){
            if(dorsal == 1 || dorsal == 13 || dorsal == 26){
                 if(ESPORTER){
                         this.posición = posición;
            }else{
                     System.out.println("DEBE SER PORTERO PARA INGRESAR ESOS NUMEROS");
                 }
            }else{
                            this.posición = posición;
            }
        }else{
              System.out.println("Numeros no validos");
        }
        
        
    }

    public void setESPORTER(boolean ESPORTER) {
        this.ESPORTER = ESPORTER;
        
        
        
         
        
    }

    public void setPorteriasimbatidas(int porteriasimbatidas) {
    
        
        
        if(ESPORTER){
             if(dorsal > 0 || dorsal < 27){
            if(dorsal == 1 || dorsal == 13 || dorsal == 26){
                 if(ESPORTER){
                          this.porteriasimbatidas = porteriasimbatidas;
            }else{
                     System.out.println("DEBE SER PORTERO PARA INGRESAR ESOS NUMEROS");
                 }
            }else{
                            this.porteriasimbatidas = porteriasimbatidas;
            }
        }else{
              System.out.println("Numeros no validos");
        }
        }else{
            System.out.println("Debe ser portero para ingresar el dato");
        }
        
         
            
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
