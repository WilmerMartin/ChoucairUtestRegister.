package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class ChoucairRegisterPage extends PageObject {
    //Primera parte del formulario de registro
    public static final Target FIRSTNAME = Target.the("En este input escribimos nuestro nombre").located
            (By.xpath("//input[@id='firstName']"));
    public static final Target LASTNAME = Target.the("En este input escribimos nuestro apellido").located
            (By.xpath("//input[@id='lastName']"));
    public static final Target EMAIL = Target.the("En este input escribimos nuestro Email").located
            (By.xpath("//input[@id='email']"));
    public static final Target MONTH = Target.the("se despliega el selector con los meses").located
            (By.xpath("//select[@id='birthMonth']"));
    public static final Target SETMONTH = Target.the("seleccionamos el mes").located
            (By.xpath("//option[. = 'April']"));
    public static final Target DAY = Target.the("se despliega el selector con los dias").located
            (By.xpath("//select[@id='birthDay']"));
    public static final Target SEDAY = Target.the("seleccionamos el dia").located
            (By.xpath("//option[. = '5']"));
    public static final Target YEAR = Target.the("se despliega el selector con los años").located
            (By.xpath("//select[@id='birthYear']"));
    public static final Target SEYEAR = Target.the("seleccionamos el año").located
            (By.xpath("//option[. = '2000']"));
    public static final Target LANGUAJES = Target.the("se despliega la lista con diferentes idiomas").located
            (By.xpath("//input[@aria-label='Select box']"));
    public static final Target SELANGUAJES = Target.the("Seleccionamos el idioma").located
            (By.xpath("//span[normalize-space()='Spanish']"));
    public static final Target BUTTON_NEXT = Target.the("Es el boton para avanzar al siguiente formulario de registro").located
            (By.xpath("//a[@aria-label='Next step - define your location']"));

    //Segunda parte del formulario de registro
    public static final Target CITY = Target.the("Muestra la ciudad donde se encuentra").located
            (By.xpath("//input[@id='city']"));
    public static final Target POSTALCODE = Target.the("Escribimos el codigo portal").located
            (By.xpath("//input[@id='zip']"));
    public static final Target COUNTRY = Target.the("Muestra las ciudades").located
            (By.xpath("//span[@class='ui-select-match-text pull-left']"));
    public static final Target SECOUNTRY = Target.the("Seleccionamos la ciudad").located
            (By.xpath("//div[contains(text(),'Germany')]"));
    public static final Target BUTTON_NEXT2 = Target.the("Es el boton para avanzar al siguiente formulario de registro").located
            (By.xpath("//span[normalize-space()='Next: Devices']"));

    //Tercera parte del formulario de registro
    public static final Target YOURCOMPUTER = Target.the("desplegamos el select de los diferentes computadores").located
            (By.xpath("//span[normalize-space()='Windows']"));
    public static final Target SEYOURCOMPUTER = Target.the("desplegamos el select de los diferentes computadores").located
            (By.xpath("//span[normalize-space()='macOS']"));
    public static final Target VERSION = Target.the("desplegamos el select de las versiones").located
            (By.xpath("//span[@aria-label='Select a Version']"));
    public static final Target SEVERSION = Target.the("Seleccionamos las versiones").located
            (By.xpath("//span[normalize-space()='OS X 10.11']"));
    public static final Target LANGUAJE = Target.the("desplegamos los idioma").located
            (By.xpath("//span[@aria-label='Select OS language']"));
    public static final Target SELANGUAJE = Target.the("Seleccionamos el idioma").located
            (By.xpath("//span[normalize-space()='Italian']"));
    public static final Target YOURMOBILE = Target.the("desplegamos los diferentes telefonos").located
            (By.xpath("//span[@aria-label='Select Brand']"));
    public static final Target SEYOURMOBILE = Target.the("Seleccionamos el telefono").located
            (By.xpath("//span[normalize-space()='Apple']"));
    public static final Target MODEL = Target.the("desplegamos los diferentes modelos").located
            (By.xpath("//span[@aria-label='Select a Model']"));
    public static final Target SEMODEL = Target.the("Seleccionamos el modelo").located
            (By.xpath("//div[contains(text(),'iPhone 14 Pro Max')]"));
    public static final Target OPERATINGSYSTEM = Target.the("Desplegamos la lista de los sistemas operativos").located
            (By.xpath("//div[@name='handsetOSId']//span[@aria-label='Select OS']"));
    public static final Target SEOPERATINGSYSTEM = Target.the("Seleccionamos el sistema operativo").located
            (By.xpath("//span[normalize-space()='iOS 17.0.3']"));
    public static final Target BUTTON_NEXT3 = Target.the("Es el boton para avanzar al siguiente formulario de registro").located
            (By.xpath("//a[@aria-label='Next - final step']"));

    //Cuarta parte del formulario de registro
    public static final Target UTESTPASSWORD = Target.the("Seleccionamos el sistema operativo").located
            (By.xpath("//input[@id='password']"));
    public static final Target CONFIRMPASSWORD = Target.the("Seleccionamos el sistema operativo").located
            (By.xpath("//input[@id='confirmPassword']"));
    public static final Target STAYINFORMED = Target.the("Seleccionamos el sistema operativo").located
            (By.xpath("//span[@class='checkmark signup-consent__checkbox signup-consent__checkbox--highlight']"));
    public static final Target UTESTTERMS = Target.the("Seleccionamos el sistema operativo").located
            (By.xpath("//span[@ng-class='{error: userForm.termOfUse.$error.required}']"));
    public static final Target PRIVACYYSECURITY = Target.the("Seleccionamos el sistema operativo").located
            (By.xpath("//span[@ng-class='{error: userForm.privacySetting.$error.required}']"));
    }
