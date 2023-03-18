package edu.hanu.a1_2001040222.hellojapan;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;



public class MainActivity extends AppCompatActivity {
    GridView currentView;

    MediaPlayer mediaPlayer;
    List<Characters> buttonList = new ArrayList<>();
    CharacterBaseAdapter characterBaseAdapter;
    private Button btn;
    private Button btnHiragana;
    private Button btnKatakana;

    private ArrayList<Characters> setHiraganaTable() {
        ArrayList<Characters> buttonList = new ArrayList<>();
        buttonList.add(new Characters("a", R.drawable.a, R.raw.h_a));
        buttonList.add(new Characters("i", R.drawable.i, R.raw.h_i));
        buttonList.add(new Characters("u", R.drawable.u, R.raw.h_u));
        buttonList.add(new Characters("e", R.drawable.e, R.raw.h_e));
        buttonList.add(new Characters("o", R.drawable.o, R.raw.h_o));
        buttonList.add(new Characters("ka", R.drawable.ka, R.raw.h_ka));
        buttonList.add(new Characters("ki", R.drawable.ki, R.raw.h_ki));
        buttonList.add(new Characters("ku", R.drawable.ku, R.raw.h_ku));
        buttonList.add(new Characters("ke", R.drawable.ke, R.raw.h_ke));
        buttonList.add(new Characters("ko", R.drawable.ko, R.raw.h_ko));
        buttonList.add(new Characters("sa", R.drawable.sa, R.raw.h_sa));
        buttonList.add(new Characters("shi", R.drawable.shi, R.raw.h_shi));
        buttonList.add(new Characters("su", R.drawable.su, R.raw.h_su));
        buttonList.add(new Characters("se", R.drawable.se, R.raw.h_se));
        buttonList.add(new Characters("so", R.drawable.so, R.raw.h_so));
        buttonList.add(new Characters("ta", R.drawable.ta, R.raw.h_ta));
        buttonList.add(new Characters("chi", R.drawable.chi, R.raw.h_chi));
        buttonList.add(new Characters("tsu", R.drawable.tsu, R.raw.h_tsu));
        buttonList.add(new Characters("te", R.drawable.te, R.raw.h_te));
        buttonList.add(new Characters("to", R.drawable.to, R.raw.h_to));
        buttonList.add(new Characters("na", R.drawable.na, R.raw.h_na));
        buttonList.add(new Characters("ni", R.drawable.ni, R.raw.h_ni));
        buttonList.add(new Characters("nu", R.drawable.nu, R.raw.h_nu));
        buttonList.add(new Characters("ne", R.drawable.ne, R.raw.h_ne));
        buttonList.add(new Characters("no", R.drawable.no, R.raw.h_no));
        buttonList.add(new Characters("ha", R.drawable.ha, R.raw.h_ha));
        buttonList.add(new Characters("hi", R.drawable.hi, R.raw.h_hi));
        buttonList.add(new Characters("fu", R.drawable.fu, R.raw.h_fu));
        buttonList.add(new Characters("he", R.drawable.he, R.raw.h_he));
        buttonList.add(new Characters("ho", R.drawable.ho, R.raw.h_ho));
        buttonList.add(new Characters("ma", R.drawable.ma, R.raw.h_ma));
        buttonList.add(new Characters("mi", R.drawable.mi, R.raw.h_mi));
        buttonList.add(new Characters("mu", R.drawable.mu, R.raw.h_mu));
        buttonList.add(new Characters("me", R.drawable.me, R.raw.h_me));
        buttonList.add(new Characters("mo", R.drawable.mo, R.raw.h_mo));
        buttonList.add(new Characters("ya", R.drawable.ya, R.raw.h_ya));
        buttonList.add(new Characters("", 0, 0));
        buttonList.add(new Characters("yu", R.drawable.yu, R.raw.h_yu));
        buttonList.add(new Characters("empty", 0, 0));
        buttonList.add(new Characters("yo", R.drawable.yo, R.raw.h_yo));
        buttonList.add(new Characters("ra", R.drawable.ra, R.raw.h_ra));
        buttonList.add(new Characters("ri", R.drawable.ri, R.raw.h_ri));
        buttonList.add(new Characters("ru", R.drawable.ru, R.raw.h_ru));
        buttonList.add(new Characters("re", R.drawable.re, R.raw.h_re));
        buttonList.add(new Characters("ro", R.drawable.ro, R.raw.h_ro));
        buttonList.add(new Characters("wa", R.drawable.wa, R.raw.h_wa));
        buttonList.add(new Characters("empty", 0, 0));
        buttonList.add(new Characters("empty", 0, 0));
        buttonList.add(new Characters("empty", 0, 0));
        buttonList.add(new Characters("wo", R.drawable.wo, R.raw.h_o));
        buttonList.add(new Characters("n", R.drawable.n, R.raw.h_n));
        buttonList.add(new Characters("empty", 0, 0));
        buttonList.add(new Characters("empty", 0, 0));
        buttonList.add(new Characters("empty", 0, 0));
        buttonList.add(new Characters("empty", 0, 0));
        return buttonList;
    }

    private ArrayList<Characters> setKatakanaTable() {
        ArrayList<Characters> buttonList = new ArrayList<>();
        buttonList.add(new Characters("a", R.drawable.katakana_a, R.raw.h_a));
        buttonList.add(new Characters("i", R.drawable.katakana_i, R.raw.h_i));
        buttonList.add(new Characters("u", R.drawable.katakana_u, R.raw.h_u));
        buttonList.add(new Characters("e", R.drawable.katakana_e, R.raw.h_e));
        buttonList.add(new Characters("o", R.drawable.katakana_o, R.raw.h_o));
        buttonList.add(new Characters("ka", R.drawable.katakana_ka, R.raw.h_ka));
        buttonList.add(new Characters("ki", R.drawable.katakana_ki, R.raw.h_ki));
        buttonList.add(new Characters("ku", R.drawable.katakana_ku, R.raw.h_ku));
        buttonList.add(new Characters("ke", R.drawable.katakana_ke, R.raw.h_ke));
        buttonList.add(new Characters("ko", R.drawable.katakana_ko, R.raw.h_ko));
        buttonList.add(new Characters("sa", R.drawable.katakana_sa, R.raw.h_sa));
        buttonList.add(new Characters("shi", R.drawable.katakana_shi, R.raw.h_shi));
        buttonList.add(new Characters("su", R.drawable.katakana_su, R.raw.h_su));
        buttonList.add(new Characters("se", R.drawable.katakana_se, R.raw.h_se));
        buttonList.add(new Characters("so", R.drawable.katakana_so, R.raw.h_so));
        buttonList.add(new Characters("ta", R.drawable.katakana_ta, R.raw.h_ta));
        buttonList.add(new Characters("chi", R.drawable.katakana_chi, R.raw.h_chi));
        buttonList.add(new Characters("tsu", R.drawable.katakana_tsu, R.raw.h_tsu));
        buttonList.add(new Characters("te", R.drawable.katakana_te, R.raw.h_te));
        buttonList.add(new Characters("to", R.drawable.katakana_to, R.raw.h_to));
        buttonList.add(new Characters("na", R.drawable.katakana_na, R.raw.h_na));
        buttonList.add(new Characters("ni", R.drawable.katakana_ni, R.raw.h_ni));
        buttonList.add(new Characters("nu", R.drawable.katakana_nu, R.raw.h_nu));
        buttonList.add(new Characters("ne", R.drawable.katakana_ne, R.raw.h_ne));
        buttonList.add(new Characters("no", R.drawable.katakana_no, R.raw.h_no));
        buttonList.add(new Characters("ha", R.drawable.katakana_ha, R.raw.h_ha));
        buttonList.add(new Characters("hi", R.drawable.katakana_hi, R.raw.h_hi));
        buttonList.add(new Characters("fu", R.drawable.katakana_fu, R.raw.h_fu));
        buttonList.add(new Characters("he", R.drawable.katakana_he, R.raw.h_he));
        buttonList.add(new Characters("ho", R.drawable.katakana_ho, R.raw.h_ho));
        buttonList.add(new Characters("ma", R.drawable.katakana_ma, R.raw.h_ma));
        buttonList.add(new Characters("mi", R.drawable.katakana_mi, R.raw.h_mi));
        buttonList.add(new Characters("mu", R.drawable.katakana_mu, R.raw.h_mu));
        buttonList.add(new Characters("me", R.drawable.katakana_me, R.raw.h_me));
        buttonList.add(new Characters("mo", R.drawable.katakana_mo, R.raw.h_mo));
        buttonList.add(new Characters("ya", R.drawable.katakana_ya, R.raw.h_ya));
        buttonList.add(new Characters("", 0, 0));
        buttonList.add(new Characters("yu", R.drawable.katakana_yu, R.raw.h_yu));
        buttonList.add(new Characters("", 0, 0));
        buttonList.add(new Characters("yo", R.drawable.katakana_yo, R.raw.h_yo));
        buttonList.add(new Characters("ra", R.drawable.katakana_ra, R.raw.h_ra));
        buttonList.add(new Characters("ri", R.drawable.katakana_ri, R.raw.h_ri));
        buttonList.add(new Characters("ru", R.drawable.katakana_ru, R.raw.h_ru));
        buttonList.add(new Characters("re", R.drawable.katakana_re, R.raw.h_re));
        buttonList.add(new Characters("ro", R.drawable.katakana_ro, R.raw.h_ro));
        buttonList.add(new Characters("wa", R.drawable.katakana_wa, R.raw.h_wa));
        buttonList.add(new Characters("", 0, 0));
        buttonList.add(new Characters("", 0, 0));
        buttonList.add(new Characters("", 0, 0));
        buttonList.add(new Characters("wo", R.drawable.katakana_wo, R.raw.h_o));
        buttonList.add(new Characters("n", R.drawable.katakana_n, R.raw.h_n));
        buttonList.add(new Characters("", 0, 0));
        buttonList.add(new Characters("", 0, 0));
        buttonList.add(new Characters("", 0, 0));
        buttonList.add(new Characters("", 0, 0));
        return buttonList;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get refs
        GridView hiraganaTable = findViewById(R.id.hiraganaTable);
        TextView titleHiragana = findViewById(R.id.titleHiragana);

        GridView katakanaTable = findViewById(R.id.katakanaTable);
        TextView titleKatakana = findViewById(R.id.titleKatakana);

        btnHiragana = findViewById(R.id.btnHiragana);
        btnKatakana = findViewById(R.id.btnKatakana);


        //set hiragana table
        buttonList = setHiraganaTable();
        characterBaseAdapter = new CharacterBaseAdapter(MainActivity.this, buttonList);

        //set default layout
        hiraganaTable.setAdapter(characterBaseAdapter);



        //click btn hiragana -> change to hiragana button
        btnHiragana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnHiragana.setBackgroundColor(getResources().getColor(R.color.lighterPink));
                btnKatakana.setBackgroundColor(getResources().getColor(R.color.gray));

                //TODO: change to table Hiragana
                buttonList = setHiraganaTable();
                currentView = hiraganaTable;

                //set base adapter
                characterBaseAdapter = new CharacterBaseAdapter(MainActivity.this, buttonList);
                hiraganaTable.setAdapter(characterBaseAdapter);

                //show Hiragana table and its title
                hiraganaTable.setVisibility(View.VISIBLE);
                titleHiragana.animate().alpha(1);

                //hide Katakana table and its title
                katakanaTable.setVisibility(View.GONE);
                titleKatakana.animate().alpha(0);
            }
        });

        //click btn Katakana -> show katakana table
        btnKatakana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnHiragana.setBackgroundColor(getResources().getColor(R.color.gray));
                btnKatakana.setBackgroundColor(getResources().getColor(R.color.lighterPink));

                //TODO: change to katakana table
                buttonList = setKatakanaTable();
                currentView = katakanaTable;

                //set base adapter
                characterBaseAdapter = new CharacterBaseAdapter(MainActivity.this, buttonList);
                katakanaTable.setAdapter(characterBaseAdapter);

                //show katakana table and its title
                katakanaTable.setVisibility(View.VISIBLE);
                titleKatakana.animate().alpha(1);

                //hide hiragana table and its title
                hiraganaTable.setVisibility(View.GONE);
                titleHiragana.animate().alpha(0);
            }
        });

        //click to play sound for hiragana table
        hiraganaTable.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (mediaPlayer != null) {
                    mediaPlayer.reset();
                }
                if (buttonList.get(i).getSound() != 0) {
                    mediaPlayer = MediaPlayer.create(MainActivity.this, buttonList.get(i).getSound());
                    mediaPlayer.start();
                }


            }
        });

        //click to play sound for katakana table
        katakanaTable.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (mediaPlayer != null) {
                    mediaPlayer.reset();
                }

                if (buttonList.get(i).getSound() != 0) {
                    mediaPlayer = MediaPlayer.create(MainActivity.this, buttonList.get(i).getSound());
                    mediaPlayer.start();
                }
            }
        });


    }


}