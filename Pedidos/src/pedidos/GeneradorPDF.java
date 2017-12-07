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
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;

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
     * Metodo que genera un archivo pdf con los datos de la cotizacion recibe un objeto cotizacion 
     */
    public void PdfCotizacion(Cotizacion cotizacion) {

        Document document = new Document();
        Calendar fecha = new GregorianCalendar();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("Image2.pdf"));
            document.open();
            Image image1 = Image.getInstance("encabezado.png");
            image1.scaleAbsolute(550f, 100f);
            document.add(image1);
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Bucaramanga, " + fecha.get(Calendar.DAY_OF_MONTH) + " " + meses[fecha.get(Calendar.MONTH)] + " " + fecha.get(Calendar.YEAR)));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Cordial Saludo"));
            document.add(new Paragraph(cotizacion.getCliente().getNombres() + cotizacion.getCliente().getApellidos()));
            document.add(new Paragraph(" "));
            document.add(new Paragraph("De acuerdo a su solicitud adjunto la siguiente cotización."));
            document.add(new Paragraph(" "));
            Paragraph titulo1 = new Paragraph("COTIZACION");
            titulo1.setAlignment(Element.ALIGN_CENTER);
            document.add(titulo1);
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Productos: "));
            document.add(new Paragraph("Especificaciones: "));
            document.add(new Paragraph(" Elaboracion de logotipos de acrilicos, con los siguientes diametros .100 "
                    + "80 – 70, letras PANADERIA con un calibre de 11 mm sobre puesta en una base en acrilico"
                    + "cristal 8m para dar efecto 3D o de volumen, la letra M y la hoja con un volumen de 4 cm."));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Valor Total : "));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Tiempo de Entrega : "));
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
