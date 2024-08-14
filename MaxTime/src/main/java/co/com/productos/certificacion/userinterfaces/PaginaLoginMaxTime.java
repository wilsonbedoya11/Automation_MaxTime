package co.com.productos.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.PageElement;

public class PaginaLoginMaxTime {

    public static Target CAMPO_USUARIO  = PageElement.locatedBy("//div[@id='Content']//table//table[@id='Logon_Table1']//table[@class='GroupContent']//td[@class='dxic']/input[@id='Logon_v0_MainLayoutEdit_xaf_l30_xaf_dviUserName_Edit_I']");

    public static Target CAMPO_CONTRASEÑA  = PageElement.locatedBy("//div[@id='Content']//table//table[@id='Logon_Table1']//table[@class='GroupContent']//td[@class='dxic']/input[@type='password']");

    public static Target BOTON_CONECTARSE  = PageElement.locatedBy("//div[@id='Content']//tr[@id='Logon_TableRow3']//div[@id='Logon_PopupActions_Menu_DXI0_T']");
}
