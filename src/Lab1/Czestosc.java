package Lab1;

import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Czestosc {

    public static void main(String[] args) {

//        try(Scanner scan = new Scanner(new File("tekst.txt"));) {
//
//            Map<String,Integer>
//
//
//
//        } catch (Exception ex) {
//            System.out.println(ex);
//        }

        String st="Internet, który powstał z myślą o wymianie rozkazów pomiędzy jednostkami wojskowymi, w szybkim tempie przeniknął do środowisk naukowych, gdzie umożliwiał szybką wymianę odkryć pomiędzy uczelniami. Opracowanie protokołu HTTP i języka znaczników HTML otwarło globalną sieć dla przeciętnego człowieka. Użytkownicy dzięki stronom internetowym mogą wyszukać praktycznie każdą informację. Gwałtowny rozwój telekomunikacji pod koniec dwudziestego wieku zaowocował tym, że Internet przestał być tylko zbiorem stron internetowych.\n" +
                "Wzrost mocy obliczeniowej serwerów i prędkości wymiany danych spowodował, iż aplikacje z komputerów stacjonarnych zaczęły przenosić się „do sieci”. Narodziły się aplikacje internetowe.\n" +
                "Dzisiejszy świat opiera się na aplikacjach wykonywanych za pośrednictwem Internetu.  Za każdym razem, gdy dokonywana jest operacja bankowa za pomocą strony internetowej banku, czy rezerwacja biletu na film mamy do czynienia z działającą w tle aplikacją internetową. \n" +
                "Oczywiście programy takie nie są wykorzystywane tylko i wyłącznie w celach biznesowych. Naukowcy bardzo szybko dostrzegli zalety jakie niesie za sobą praca przy tego typu aplikacjach. Przy projekcie badawczym może pracować nie tylko kadra naukowa jednej uczelni ale za pośrednictwem odpowiedniej aplikacji   w czasie rzeczywistym pracują naukowcy z różnych placówek badawczych. \n" +
                "Przyszłość niesie ze sobą coraz  większy rozwój aplikacji internetowych. Już dzisiaj niektóre firmy oferują użytkownikom za pośrednictwem sieci dostęp do programów, które do niedawna były kojarzone tylko z komputerami stacjonarnymi. Edytory tekstu, arkusze kalkulacyjne, programy graficzne to tylko nieliczne z nich. Łatwa dostępność aplikacji internetowych wpłynęła na decyzję o stworzeniu programu udostępniającego bibliotekę Infosel++ za pośrednictwem Internetu.\n" +
                "\t\n" +
                "Cel i zakres pracy\n" +
                "\n" +
                "Celem niniejszej pracy było stworzenie aplikacji internetowej umożliwiającej dostęp do zasobów biblioteki Infosel++ z wykorzystaniem technologii sieciowych zaimplementowanych w języku Java. \n" +
                "\t\n" +
                "Założenia pracy\n" +
                "Stworzenie portalu internetowego poświeconego bibliotece Infosel++, udostępniającego możliwość pobrania biblioteki, pobrania dokumentacji. Portal ma zawierać podstawowe informacje o bibliotece.\n" +
                "Głównym elementem portalu ma być aplikacja umożliwiająca  użytkownikowi korzystanie z biblioteki za pośrednictwem Internetu. \n" +
                "Stworzenie interfejsu graficznego dzięki, któremu użytkownik będzie się komunikował z biblioteką. \n" +
                "Użytkownik ma otrzymać dostęp do  panelu z poziomu, którego będzie mógł umieszczać pliki danych a także pobierać i przeglądać pliki wynikowe. \n" +
                "Aplikacja ma udostępniać użytkownikowi możliwość tworzenia zadań, polegających na zapisie ustawień parametrów biblioteki.\n" +
                "Aplikacja ma udostępniać panel administracyjny za pośrednictwem, którego administrator może edytować zarejestrowanych użytkowników. Dodawać, usuwać i modyfikować zaimplementowane algorytmy. \n" +
                "Biblioteka ma być udostępniona zdalnie za pośrednictwem serwera obliczeniowego, do którego aplikacja ma mieć zdalny dostęp.\n" +
                "Pliki użytkownika mają być składowane na serwerze obliczeniowym. \n" +
                "Do budowy aplikacji wykorzystać rozwiązania udostępnione przez środowisko Java.  \n" +
                "\n" +
                "Infosel\n" +
                "Biblioteka Infosel\n" +
                "\n" +
                "Jest to biblioteka, w której zawarto szereg algorytmów umożliwiających  przeprowadzenie selekcji, cech na wskazanym zbiorze danych. Dzięki temu możliwy jest wybór istotnych zmiennych, niezbędnych w dalszym procesie eksploracji  danych, w  tym  do  realizacji  problemów  klasyfikacji  i  regresji. Biblioteka posiada także zaimplementowane algorytmy pozwalające na dyskretyzację zmiennych. Główną cechą biblioteki jest możliwość porównywania wyników otrzymanych z wykorzystaniem różnych algorytmów i różnych typów danych. Jednym z podstawowych zadań biblioteki Infosel jest możliwość przygotowania danych przed wykorzystaniem ich jako danych wejściowych w sieciach neuronowych. Algorytmy, które wchodzą w skład biblioteki opierają się na metodach wywodzących się z teorii informacji, współczynnikach korelacji czy testach statystycznych . Zaimplementowane algorytmy znajdują szerokie zastosowanie głównie w dziedzinach zajmujących się uczeniem maszynowym czy sieciami neuronowymi.[9]\n" +
                "\n" +
                "Selekcja cech\n" +
                "\t\n" +
                "Selekcja cech ma za zadanie określanie najbardziej optymalnego zbioru cech   dla opisujących badany obiekt. Może się okazać, iż w zbiorze danych występują cechy nie wpływające znacząco na proces klasyfikacji. Przykładowo zbiór może posiadać cechy redundantne – posiadające identyczną informację jak istniejące już cechy. Przez zbiór cech najbardziej optymalnych rozumie się takie, które umożliwiają najlepszą klasyfikację lub regresję. \n" +
                "Metody selekcji cech można podzielić ze względu na charakter problemu na: metody nadzorowane i nie nadzorowane, jednakże biblioteka Infosel++ dotyczy jedynie zagadnień selekcji cech dla problemów nadzorowanych, a w szczególności problemów klasyfikacji danych. Innym kryterium podziału metod selekcji cech jest podział ze względu na relację z innymi algorytmami. Możemy tutaj wyróżnić:";
        String []ar = st.split("\\s");
        Map<String, Integer> mp= new LinkedHashMap<String, Integer>();
        int count=0;

        for(int i=0;i<ar.length;i++){
            count=0;

            for(int j=0;j<ar.length;j++){
                if(ar[i].equals(ar[j])){
                    count++;
                }
            }

            mp.put(ar[i], count);
        }

        System.out.println(mp);

    }
}
