
public class Auto {
  private String placa, tipo, hora;
  private int numero = 0, precio;

    public Auto(String placa, String tipo, String hora, int numero, int precio) {
        this.placa = placa;
        this.tipo = tipo;
        this.hora = hora;
        this.numero = numero;
        this.precio = precio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "{" + "Placa = " + placa + ". Tipo = " + tipo + ". Hora = " + hora + ". Numero = " + numero + ". Precio = " + precio + " COP/min }";
    }
    
    
    
    
    
  
  
  
  
  
  
  
  
}
