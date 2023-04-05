package Nedelja4.Nedelja4_ZadaciNedelja;//Напомена: Свака од следећих класа мора имати бар:
//        2 атрибута различитих типова
//        1 Конструктор
//        1 Методу***
//        Пошто нисмо стигли да урадимо ово, све што има везе са методама НИЈЕ за домаћи
//        Ко има времена, може да проба самостално
//        За домаћи су задаци 1 и 2 (тј прављење 2 класе и једног main метода у Test-класи)
//        1. Написати неке од следећих класа (најмање две)
//        Изаберите нешто занимљиво сами
//        Класа Аутомобил
//        Класа Животиња
//        Класа Профил (Нпр на некој друштвеној мрежи)
//        Класа Књига
//        Класа Торта
//        *Класа Библиотека
//        Нпр може да садржи низ објеката типа Књига
//        2. Написати main методу (ван ваше класе) која:
//        *Прави 3 Објекта ваше класе (једне)
//        *Користи (позива) макар једном неку методу над конкретним објектом

public class Biblioteka {
    int redniBrojKnjige;
    String nazivKnjige;
    String nazivPisca;

    public Biblioteka(int redniBrojKnjige, String nazivPisca, String nazivKnjige){
        this.redniBrojKnjige = redniBrojKnjige;
        this.nazivPisca = nazivPisca;
        this.nazivKnjige = nazivKnjige;
    }
    public void ispisiPodatke() {
        System.out.println(redniBrojKnjige + ". " + nazivPisca + " - " + nazivKnjige);
    }
}
