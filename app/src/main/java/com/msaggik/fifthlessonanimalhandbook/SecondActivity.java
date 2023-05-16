package com.msaggik.fifthlessonanimalhandbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    // создание коллекции контейнера для данных класса
    List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // инициализируем контейнер
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.list_animal);

        // создадим адаптер и загрузим в него контейнер с данными
        AnimalAdapter adapter = new AnimalAdapter(this, animals);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(adapter);
    }

    // метод setInitialData() устанавливает начальный набор данных (а именно изображения из папки res/drawables)
    private void setInitialData() {
        // добавление в контейнер animals объектов сущности
        animals.add( new Animal("Ромашка", "Род однолетних цветковых растений семейства астровые, или сложноцветные (Asteraceae)",
                R.drawable._637849417_2_pro_dachnikov_com_p_romashka_foto_2, "Численность средняя"));
        animals.add( new Animal("Тюльпан", "Род многолетних травянистых луковичных растений семейства Лилейные (Liliaceae)",
                R.drawable._656324558_30_mykaleidoscope_ru_p_malenkie_tyulpani_krasivo_foto_37, "Численность большая"));
        animals.add( new Animal("Роза", "Собирательное название видов и сортов представителей рода Шипо́вник (лат. Rósa), выращиваемых человеком и растущих в дикой природе.",
                R.drawable._656117181_28_mykaleidoscope_ru_p_roza_khaim_satin_krasivo_foto_28, "Численность большая"));
        animals.add( new Animal("Лилия", "Род растений семейства Лилейные (Liliaceae). Многолетние травы, снабжённые луковицами, состоящими из мясистых низовых листьев",
                R.drawable._637803229_7_pro_dachnikov_com_p_liliya_belosnezhnaya_foto_7, "Численность большая"));
        animals.add( new Animal("Сирень", "Род кустарников, принадлежащий семейству Маслиновые (лат. Oleaceae)",
                R.drawable._650637186_61_vsegda_pomnim_com_p_tsvetenie_sireni_foto_68, "Численность большая"));
    }
}