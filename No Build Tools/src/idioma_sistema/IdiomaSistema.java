package idioma_sistema;

import java.util.Locale;

public class IdiomaSistema {
    public static void main(String[] args) {
        Locale localização = Locale.getDefault();

        System.out.print("Localização do sistema: ");
        System.out.println(localização);
    }
}
