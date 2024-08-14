package co.com.productos.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.PageElement;
import org.openqa.selenium.By;

public class PaginaDiasPendientesXCerrar {

    public static Target FECHA_POR_CERRAR  = PageElement.located(By.xpath("//div[@id='CP']//td[@class='Content']//div[@class='Item ListViewItem']//tr[@id='Vertical_v1_LE_v2_DXDataRow0']//td[@id='Vertical_v1_LE_v2_tccell0_0']//span[@id='Vertical_v1_LE_v2_cell0_0_xaf_Fecha_View']"));

    public static Target FECHA_POR_CERRAR_SELECCIONAR  = PageElement.locatedBy("//div[@id='CP']//td[@class='Content']//div[@class='Item ListViewItem']//tr[@id='Vertical_v1_LE_v2_DXDataRow0']//td[@id='Vertical_v1_LE_v2_tccell0_0']//span[@id='Vertical_v1_LE_v2_cell0_0_xaf_Fecha_View']");

    public static Target FECHA_SELECCIONAR  = PageElement.locatedBy("//*[@id=\"Vertical_L0\"]");    //"//div[@id='CP']//td[@class='Content']//div[@class='Item ListViewItem']//tr[@id='Vertical_v1_LE_v2_DXDataRow0']//td[@id='Vertical_v1_LE_v2_tccell0_0']");

    public static Target MODIFICAR_DIA_SELECCIONAR = PageElement.locatedBy("//*[@id=\"Vertical_v1_LE_v2_tccell0_4\"]/img");    //"//div[@id='CP']//td[@class='Content']//div[@class='Item ListViewItem']//tr[@id='Vertical_v1_LE_v2_DXDataRow0']//td[@id='Vertical_v1_LE_v2_tccell0_0']");

    public static Target OPC_REPORTE_TIEMPO  = PageElement.locatedBy("//*[@id=\"Vertical_NC_NB_I0i0_\"]");    //"//div[@id='CP']//td[@class='Content']//div[@class='Item ListViewItem']//tr[@id='Vertical_v1_LE_v2_DXDataRow0']//td[@id='Vertical_v1_LE_v2_tccell0_0']");

    public static Target BOTON_FECHA  = PageElement.locatedBy("//*[@id=\"Vertical_v1_LE_v2_tccell0_0\"]");    //"//div[@id='CP']//td[@class='Content']//div[@class='Item ListViewItem']//tr[@id='Vertical_v1_LE_v2_DXDataRow0']//td[@id='Vertical_v1_LE_v2_tccell0_0']");

    public static Target TITULO  = PageElement.locatedBy("//*[@id=\"Vertical_VCC_VSL\"]");


}
