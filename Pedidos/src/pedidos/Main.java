/*
 * Proyecto final para la asignatura Principios y Practicas del desarrollo de Software Orientado a Objetos.
 * @author John Reyes Celis
 * @author Nicolas Gamboa Agredo
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
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author john
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        Document document = new Document();
        Calendar fecha = new GregorianCalendar();
         Cotizacion c1 = new Cotizacion();
        c1.ObtenerCotizacion("2");
        Factura f1= new Factura(c1); 
        
        try {
            PdfWriter.getInstance(document, new FileOutputStream("prueba.pdf"));
            document.open();
            PdfPTable tabla = new PdfPTable(1);
            PdfPCell celda1 = new PdfPCell(new Paragraph("Cliente : "+ f1.getCliente().getNombres() +" "+ f1.getCliente().getApellidos()));
            PdfPCell celda2 = new PdfPCell(new Paragraph("Direccion : "+ f1.getCliente().getDireccion() ));
            PdfPCell celda3 = new PdfPCell(new Paragraph("Celda 1"));
            tabla.addCell(celda1);
            tabla.addCell(celda2);
            tabla.addCell(celda3);
            document.add(tabla);
            Image image1 = Image.getInstance("encabezado.png");
            image1.scaleAbsolute(550f, 100f);
            document.add(image1);
            document.add(new Paragraph(" "));
//            document.add(new Paragraph("Bucaramanga, " + fecha.get(Calendar.DAY_OF_MONTH) + " " + meses[fecha.get(Calendar.MONTH)] + " " + fecha.get(Calendar.YEAR)));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Cordial Saludo"));
//            document.add(new Paragraph(cotizacion.getCliente().getNombres() + " " + cotizacion.getCliente().getApellidos()));
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
//            for (Producto prod : cotizacion.getProductos()) {
//                document.add(new Paragraph(prod.detalles()));
//            }
            document.add(new Paragraph(" "));
//            document.add(new Paragraph("Valor Total : $" + cotizacion.getValorTotal()));
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
        
}
