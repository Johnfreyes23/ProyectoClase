/*
 * Copyright (C) 2017 john
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package pedidos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author john
 */
public class RegistroVentas extends Registro{
    
    private String descripcion;
    private double valorTotal;
    private ArrayList<Producto> productos = new ArrayList();
    
    /**
* Metodo que calcula el valor total de los productos agregados a la factura
* @param Productos
* @return suma total del valor de cada producto.
*/
    public double CalculoValorTotal(ArrayList Productos){
        valorTotal=0;
        for(Producto prod : getProductos()) {
            valorTotal = prod.getValor()+ valorTotal;
        }
        setValorTotal(valorTotal) ;
        return valorTotal;
    }
    
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
}
