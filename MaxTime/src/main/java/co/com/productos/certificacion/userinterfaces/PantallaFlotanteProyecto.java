package co.com.productos.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.PageElement;

public class PantallaFlotanteProyecto {

    public static Target CAMPO_INGRESAR = PageElement.locatedBy("//*[@id=\"Dialog_SearchActionContainer_Menu_ITCNT0_xaf_a0_Ed_I\"]");

    public static Target CHECK_BOX_PRIMER_ELEMENTO_LISTA_PROYECTO = PageElement.locatedBy("//*[@id=\"Dialog_v7_LE_v8_DXSelBtn0_D\"]");

    public static Target BOTON_ACEPTAR  = PageElement.locatedBy("//*[@id=\"Dialog_actionContainerHolder_Menu_DXI0_\"]");


    public static Target CHECK_BOX_PRIMER_ELEMENTO_LISTA_SERVICIO = PageElement.locatedBy("//tr[@id=\"Dialog_v9_LE_v10_DXDataRow0\"]//td[1]//input");

    public static Target BOTON_ACEPTAR_MENSAJE_CERRAR_DIA = PageElement.locatedBy("//*[@id=\"Dialog_actionContainerHolder_Menu_DXI0_T\"]/a");
}
