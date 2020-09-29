package modelo;

public class Marcas extends Productos{
 public int id_marca;
    public String marca;

    public Marcas(int id_marca, String marca) {
        this.id_marca = id_marca;
        this.marca = marca;
    }
    
    
    public int getId_marca() {
        return id_marca;
    }

    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
   

    public Marcas() {
    }

   
    
    @Override
   public void agregar(){
   } 
    
}
