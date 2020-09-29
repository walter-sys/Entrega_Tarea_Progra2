package modelo;
import Modelo.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
   public class Productos {
    private int id_producto;
    private int id_marca;
    private String producto, descripcion, Precio_costo, precio_venta, existencia; // existencias como int
    private Conexion cn;
   public Productos(){} 
           
    public Productos(int id_producto, int id_marca, String producto, String descripcion, String Precio_costo, String precio_venta, String existencia) {
        this.id_producto = id_producto;
        this.id_marca = id_marca;
        this.producto = producto;
        this.descripcion = descripcion;
        this.Precio_costo = Precio_costo;
        this.precio_venta = precio_venta;
        this.existencia = existencia;
    }

    public Productos(String parameter, String parameter0, String parameter1, String parameter2, String parameter3, String parameter4, String parameter5, String parameter6) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Productos(String parameter, String parameter0, String parameter1, String parameter2, String parameter3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
    

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }
    
    public int getId_marca() {
        return id_marca;
    }

    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }
    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio_costo() {
        return Precio_costo;
    }

    public void setPrecio_costo(String Precio_costo) {
        this.Precio_costo = Precio_costo;
    }

    public String getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(String precio_venta) {
        this.precio_venta = precio_venta;
    }

    public String getExistencia() {
        return existencia;
    }

    public void setExistencia(String existencia) {
        this.existencia = existencia;
    }
    
    
    
    
    
    
    
    
    
   public void agregar(){
       
       try {
           PreparedStatement parametro;
           cn = new Conexion();
          String query="(id_Producto,producto,id_marca,descripcion,precio_costo,precio_venta,existencia)VALUES(?,?,?,?,?,?,?);";
          cn.Abrir_Conexion();
          parametro = (PreparedStatement)cn.conexionBD.prepareStatement(query);
          
          parametro.setInt(1,getId_producto());
          parametro.setString(2,getProducto());
          parametro.setInt(3,getId_marca());
          parametro.setString(4,getDescripcion());
          parametro.setString(5,getPrecio_costo());
          parametro.setString(5,getPrecio_venta());
          parametro.setString(5,getExistencia());
           
         parametro.executeUpdate();
          cn.cerrar_conexion();
       } catch (SQLException e) {
           System.out.println(e.getMessage());
       }
   } 
   public void modifica(){     
   }
    public void eliminar(){     
   } 
    public void mostrar(){
    }
}
