package com.psiarb.go.j_tanu;

import android.graphics.Typeface;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;
import java.util.Random;

public class Main2Activity extends AppCompatActivity {

    Typeface font1;
    TextToSpeech TTS;
    int result;
    Random rand = new Random();
    TextView farsi;
    TextView english;
    Button btn;
    int prev =0;

    String V1[] = new String[10];
    String A1[] = new String[10];
    String V2[] = new String[10];
    String A2[] = new String[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main2);
        font1 =  Typeface.createFromAsset(getAssets(), "Far_Danesh.ttf");

        V1[0] = "بگو ";
        V1[1] = "بااینکه";
        V1[2] = "بازگشت";
        V1[3] = "از طریق";
        V1[4] = "بواسطه";
        V1[5] = "بعد از";
        V1[6] = "جهان";
        V1[7] = "هنوز ";
        V1[8] = "آخر";
        V1[9] = "پرسیدن";

        A1[0] = "begu \n Tell it! / Say it!";
        A1[1] = "baalinke\n Although / Even though";
        A1[2] = "baazgashte\n Recovery / Recuperation ";
        A1[3] = "az tariq\n Through";
        A1[4] = "bevaasete\n Because of";
        A1[5] = "ba'd az\n after";
        A1[6] = "jahaan \n world";
        A1[7] = "hanuz\n still / already";
        A1[8] = "aakhar \nlast";
        A1[9] = "porsidan\n ask";

        V2[0] = "زنگ زدن";
        V2[1] = "تلاش كردن";
        V2[2] = "نیاز";
        V2[3] = "من هم همینطور";
        V2[4] = "احساس کن";
        V2[5] = "حالت";
        V2[6] = "هرگز";
        V2[7] = "شدن";
        V2[8] = "بین";
        V2[9] = "میان";

        A2[0] = "zang zadan\n call";
        A2[1] = "talaash kardan\n try";
        A2[2] = "niaaz \n need";
        A2[3] = "man hamintour\n me too";
        A2[4] = "ehsaasekan\n feel";
        A2[5] = "haalate\n state";
        A2[6] = "hargez\n never";
        A2[7] = "shodan\n become";
        A2[8] = "bin\n between";
        A2[9] = "miaan\n between";

        farsi = (TextView) findViewById(R.id.farsi);
        english = (TextView) findViewById((R.id.english));
        btn = (Button) findViewById(R.id.a);
        farsi.setTypeface(font1);
        english.setTypeface(font1);

        TTS = new TextToSpeech(Main2Activity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {

            if(i == TextToSpeech.SUCCESS){

            result= TTS.setLanguage(Locale.ENGLISH);

            }

            }
        });

    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            int i = rand.nextInt(9);

            if(i != prev){

                prev = i;
                farsi.setText(V2[i]);
                english.setText(A2[i]);
                //   TTS.speak(A1[i],TextToSpeech.QUEUE_FLUSH,null);}

            }

        }

    });

    }
}