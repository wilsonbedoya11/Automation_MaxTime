package co.com.productos.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.PageElement;

public class PaginaReporteDetalleDia {

    //proyecto
    public static Target CAMPO_LISTA_PROYECTO  = PageElement.locatedBy("//*[@id=\"Vertical_v6_MainLayoutEdit_xaf_l128_xaf_dviProyecto_Edit_Find_BImg\"]");


    //tipo hora
    public static Target CAMPO_LISTA_TIPO_HORA_SELECCIONAR  = PageElement.locatedBy("//*[@id=\"Vertical_v6_MainLayoutEdit_xaf_l148_xaf_dviTipoHora_Edit_DD_B-1\"]");

    public static Target LISTA_DESPLEGABLE = PageElement.locatedBy("//td[text()='{0}']");

    //servicio
    public static Target CAMPO_LISTA_SERVICIO  = PageElement.locatedBy("//*[@id=\"Vertical_v6_MainLayoutEdit_xaf_l153_xaf_dviServicio_Edit_Find_BImg\"]");

    //tipo hora
    public static Target CAMPO_LISTA_TIPO_HORA_ACTIVIDAD  = PageElement.locatedBy("//*[@id=\"Vertical_v6_MainLayoutEdit_xaf_l158_xaf_dviActividad_Edit_DD_B-1Img\"]");


    public static Target CAMPO_CANTIDAD_HORAS  = PageElement.locatedBy("//*[@id=\"Vertical_v6_MainLayoutEdit_xaf_l182_xaf_dviHoras_Edit_I\"]");

    public static Target CAMPO_COMENTARIO = PageElement.locatedBy("//*[@id=\"Vertical_v6_MainLayoutEdit_xaf_l207_xaf_dviComentario_Edit_I\"]");

    public static Target BOTON_GUARDAR_CERRAR = PageElement.locatedBy("//*[@id=\"Vertical_EditModeActions2_Menu_DXI1_T\"]/a");




}
