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

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 * Esta clase contiene metodos que generan pdf para las clases Cotizacion ,
 * Factura y produccion
 *
 * @author john
 */
public class GeneradorPDF {

    String[] meses = new String[]{"Enero", "Febebro", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public GeneradorPDF() {
    }

    /**
     * @param cotizacion // trae los datos a mostrar en el pdf
     *
     * Metodo que genera un archivo pdf con los datos de la cotizacion recibe un
     * objeto cotizacion
     */
    public void PdfCotizacion(Cotizacion cotizacion) {

        Document document = new Document();
        Calendar fecha = new GregorianCalendar();
        cotizacion.setRutaArchivo("src/Archivos/cotizacion" + cotizacion.getIdCotizacion() + ".pdf" );
        cotizacion.GuardarRuta();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(cotizacion.getRutaArchivo()));
            document.open();
            Image image1 = Image.getInstance("encabezado.png");
            image1.scaleAbsolute(550f, 100f);
            document.add(image1);
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Bucaramanga, " + fecha.get(Calendar.DAY_OF_MONTH) + " " + meses[fecha.get(Calendar.MONTH)] + " " + fecha.get(Calendar.YEAR)));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Cordial Saludo"));
            document.add(new Paragraph(cotizacion.getCliente().getNombres() + " " + cotizacion.getCliente().getApellidos()));
            document.add(new Paragraph(" "));
            document.add(new Paragraph("De acuerdo a su solicitud adjunto la siguiente cotización."));
            document.add(new Paragraph(" "));
            Paragraph titulo1 = new Paragraph("COTIZACION");
            titulo1.setAlignment(Element.ALIGN_CENTER);
            document.add(titulo1);
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Todos nuestros productos tienen garantia de 36 meses por defectos de fabricacion."
                    + "Se realiza un pago inicial del 50% , el resto del dinero se cancela al entregar el producto. "));
            document.add(new Paragraph("\nProductos: \n"));
            for (Producto prod : cotizacion.getProductos()) {
                document.add(new Paragraph(prod.detalles()));
            }
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Valor Total : $" + cotizacion.getValorTotal()));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            Image image2 = Image.getInstance("pie.png");
            image2.scaleAbsolute(550f, 100f);
            document.add(image2);
            document.close();
            cotizacion.setRutaArchivo(cotizacion.getRutaArchivo());
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void PdfFactura(Factura f1){
        Document document = new Document();
        String ruta = "src/Archivos/cotizacion" + f1.getCliente().getNombres()+" "+f1.getFechaFactura() + ".pdf";
        f1.setRutaArchivo(ruta);
        f1.GuardarRuta();
    try {
             
            
            PdfWriter.getInstance(document, new FileOutputStream(ruta ));
            document.open();
            Image image1 = Image.getInstance("encabezado.png");
            image1.scaleAbsolute(550f, 100f);
            document.add(image1);
            Paragraph titulo = new Paragraph("FACTURA DE VENTA - N°"+f1.getIdFactura()); 
            titulo.setAlignment(Element.ALIGN_CENTER);
             document.add(new Paragraph(" "));
            document.add(titulo);
             document.add(new Paragraph(" "));
           
            PdfPTable tabla = new PdfPTable(1);
            PdfPCell celda1 = new PdfPCell(new Paragraph("Cliente : "+ f1.getCliente().getNombres() +" "+ f1.getCliente().getApellidos()));
            PdfPCell celda2 = new PdfPCell(new Paragraph("Direccion : "+ f1.getCliente().getDireccion() ));
            PdfPCell celda3 = new PdfPCell(new Paragraph("Telefono : " + f1.getCliente().getTelefono()));
            tabla.addCell(celda1);
            tabla.addCell(celda2);
            tabla.addCell(celda3);
            
            document.add(tabla);
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            PdfPTable tabla2 = new PdfPTable(6);
            PdfPCell celda4 = new PdfPCell(new Paragraph("Item"));
            PdfPCell celda5 = new PdfPCell(new Paragraph("Descripcion"));
            PdfPCell celda6 = new PdfPCell(new Paragraph("Valor"));
            celda4.setColspan(1);
            celda5.setColspan(4);
            celda6.setColspan(2);
            tabla2.addCell(celda4);
            tabla2.addCell(celda5);
            tabla2.addCell(celda6);
            int i = 0;
            for (Producto p : f1.getProductos()) {
                i++;
            PdfPCell item = new PdfPCell(new Paragraph(""+i));
            PdfPCell descrip = new PdfPCell(new Paragraph(p.detalles()));
            PdfPCell valor = new PdfPCell(new Paragraph("$"+p.getValor()));
            item.setColspan(1);
            descrip.setColspan(4);
            valor.setColspan(2);
            tabla2.addCell(item);
            tabla2.addCell(descrip);
            tabla2.addCell(valor);
            }
            document.add(tabla2);
            
            document.add(new Paragraph(" "));

            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            Image image2 = Image.getInstance("pie.png");
            image2.scaleAbsolute(550f, 100f);
            document.add(image2);
            document.close();
//            cotizacion.setRutaArchivo(cotizacion.getRutaArchivo());
//           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void abrirPdf(String ruta) {
 try{ 
 
   File path = new File (ruta);
   Desktop.getDesktop().open(path);
  
  }catch(IOException e){
     e.printStackTrace();
  }catch(IllegalArgumentException e){
     JOptionPane.showMessageDialog(null, "No se pudo encontrar el archivo","Error",JOptionPane.ERROR_MESSAGE);
     e.printStackTrace();
 } 
    }

}
