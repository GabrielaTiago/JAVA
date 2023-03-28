package systemproperties;

import java.util.Locale;

public class SystemLanguage {
    public static void main(String[] args) {
        Locale languageLocale = Locale.getDefault();
        String language =  languageLocale.getDisplayLanguage();

        System.out.println("O idioma do seu sistema está em " + language);
    }
}
