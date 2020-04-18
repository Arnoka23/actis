package application;

public class Acti {
// TODO feladatok pontozása!
    static String[] rajzol = {
            "ködlámpa", "faág", "éjjeliszekrény", "gondolatolvasás", "esőkabát",
            "túristajelzés", "madártoll", "téliálom", "fenyőillat",
            "kenyérpirító", "családfa", "kutatócsoport", "rakott krumpli", "befőttesüveg",
            "villámcsapás", "elnökválasztás", "vizipóló", "aranyeső", "gumilbda",
            "madártej", "parikajancsi", "tőkehal", "dobverő", "fűszál", "csínytevő", "konyhanyelv"
    };

    static String[] beszel = {
            "közellenség", "tejszínhab", "mestermű", "csavarhúzó", "egyirányú utca",
            "lakat", "satufék", "függöny karnis", "gondolatolvasó", "gyerekzár",
            "ruháskosár", "bundás kenyér", "bakkecske", "gyapjúszőnyeg", "babágy",
            "szelyemhernyó", "alamafa", "borbély", "tükörtojás", "elemlámpa",
            "pásztorkutya", "széldzseki", "jobbkézszabály", "kerékpártároló",
            "kilométeróra", "körjorgalom"
    };

    static String[] mutogat = {
            "kulcstartó", "tricikli", "lemezlovas", "szolgasors", "ütvefúró",
            "szorítókötés", "önkritika", "fakír", "repülőtér", "költőpénz",
            "gyerekjáték", "borospince", "számlatömb", "tűznyelő", "lótetű",
            "fagyáspont", "télapó", "ádámkosztüm", "visszajátszás", "tojástartó",
            "távcső", "családtag", "alagút", "jelszó", "szivargyujtó", "varródoboz",
            "boroshordó"
    };

    public static int randomnum() {
        int min = 1;
        int max = mutogat.length; //26 helyett length, hogy igazodjon a tömb hosszához
        int range = max - min + 1;
        return (int) (Math.random() * range) + min;
    }
// ennek működnie kéne... talán XD
    /*public void kartya() {
        System.out.println(rajzol[randomnum()]);
        System.out.println(beszel[randomnum()]);
        System.out.println(mutogat[randomnum()]);
    }*/

}
