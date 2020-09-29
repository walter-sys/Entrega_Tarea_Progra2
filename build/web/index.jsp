<%-- 
    Document   : index
    Created on : 21/09/2020, 21:16:56
    Author     : Walter Anibal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>producto</h1>
         <div class="container">
            
            <form action="sr_producto" method="get" class="form-group">
                
                <label for="lbl_idproducto">id_producto</label>
                <input type="text" name="txt_idproducto" id="txt_idproducto" class="form-control" placeholder="Ejemplo: 0001" required="" >
                
                
                <label for="lbl_producto">producto</label>
                <input type="text" name="txt_producto" id="txt_producto" class="form-control" placeholder="Ejemplo: nombres del producto" >
                
                <label for="lbl_marca">id Marca</label>
                <input type="text" name="txt_marca" id="txt_marca" class="form-control" placeholder="Ejemplo: Truper" required="" >
                
                <label for="lbl_descripcion"> Descripcion</label>
                <input type="text" name="txt_descripcion" id="txt_descripcion" class="form-control" required="" >
                
                <label for="lbl_precio_costo">Precio_Costo</label>
                <input type="text" name="txt_precio_costo" id="txt_precio_costo" class="form-control" placeholder="Ejemplo: Truper" required="" >
                
                <label for="lbl_precio_venta">Precio_venta</label>
                <input type="text" name="txt_precio_venta" id="txt_precio_costo" class="form-control"  required="" >
                
                <label for="lbl_existencia">existencia</label>
                <input type="text" name="txt_existencia" id="txt_existencia" class="form-control"  required="" >
                <br>
                <button type="submit" value ="agregar" class="btn btn-primary">Agregar</button>
                <button type="submit" value ="agregar" class="btn btn-primary">modificar</button>
                
 
                
            </form>
        </div>
    </body>
</html>
