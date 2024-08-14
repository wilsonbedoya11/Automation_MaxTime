package co.com.productos.certificacion.utils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class Fecha {

    public static int VerificarDia(String fechaString)
    {
        int diaSemana=0;

        String[] festivos = {"1/1/2024", "8/1/2024", "25/3/2024", "28/3/2024", "29/3/2024", "1/5/2024",
                "13/5/2024", "3/6/2024", "10/6/2024", "1/7/2024", "20/7/2024", "7/8/2024", "19/8/2024",
                "14/10/2024", "4/11/2024", "11/11/2024", "8/11/2024", "25/12/2024"};


        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            Date fecha = sdf.parse(fechaString);

            Calendar calendario = Calendar.getInstance();
            calendario.setTime(fecha);

            diaSemana = calendario.get(Calendar.DAY_OF_WEEK);



            switch (diaSemana) {
                case Calendar.SATURDAY:
                    System.out.println("La fecha " + fechaString + " es sábado.");
                    break;
                case Calendar.SUNDAY:
                    System.out.println("La fecha " + fechaString + " es domingo.");
                    break;
                default:
                    System.out.println("La fecha " + fechaString + " es un día laboral.");
                    for (String d : festivos){
                        if(d.equals(fechaString))
                        {
                            diaSemana=1;
                            break;
                        }
                    }
            }



            // Aquí podrías agregar lógica para verificar si la fecha es un día festivo en Colombia
            // Por ejemplo, puedes consultar una lista de días festivos en Colombia y comparar la fecha dada con esa lista

        } catch (Exception e) {
            e.printStackTrace();
        }

        return diaSemana;
    }

    public static int Vacaciones(String fecha, String fecha_vacaciones_inicio, String fecha_vacaciones_fin)
    {
        int vacaciones=0;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        try {
            Date fechaAverificar = sdf.parse(fecha);
            Date fechaInicial = sdf.parse(fecha_vacaciones_inicio);
            Date fechaFinal = sdf.parse(fecha_vacaciones_fin);


            // Verificar si la fecha está dentro del rango
            if (fechaAverificar.compareTo(fechaInicial)==0 || (fechaAverificar.compareTo(fechaInicial)>0 && fechaAverificar.compareTo(fechaFinal)<0 ||
                    fechaAverificar.compareTo(fechaFinal)==0 ))
            {
                vacaciones=1;
            } else {
                vacaciones=0;
            }


        } catch (Exception e) {
            e.printStackTrace();
        }




        return vacaciones;
    }


}
