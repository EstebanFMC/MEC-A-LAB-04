import java.util.ArrayList;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Lista {
    
    
    LocalTime Hora = LocalTime.now();     
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
    ArrayList <Auto> lista;
    
    
    //CONSTRUCTOR:
    public Lista()
    {
        

    }
    
    //METODOS
    public void crearLista()
    {
        lista = new ArrayList<>();
    }
    
    public void setLista(Auto auto)
    {
        lista.add(auto);
    }
    
    public String getUltimoIngreso()
    {
        return lista.get(lista.size()-1).toString();
    }
    
    public boolean EliminarDato(String numero)
    {
        boolean encontrado = false;
        
        for(int i = 0; i < lista.size(); i++)
        {
           if(lista.get(i).getPlaca().equals(numero)){
               lista.remove(i);
               encontrado = true;
           }
        }
        
        return encontrado;
    }
    
    public boolean isEmpty(){
        return lista.isEmpty();
    }
            
    
       
}
