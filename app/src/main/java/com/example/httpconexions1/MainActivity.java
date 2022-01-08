package com.example.httpconexions1;


import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button botoGlide = findViewById(R.id.botoGlide);
        /*

        TODO: EXERCICI1: Aquest tros de codi hauria d'anar dins del onclick del botó que es diu
         botoGlide. Canvia la url (prova amb https), utilitza un placeholder per a que es mostri mentre es descarrega
         i utilitza també una imatge en cas d'error.
        ImageView image0 = findViewById(R.id.image0);

        String url0 = "http://25.media.tumblr.com/tumblr_m7j9qiQnJm1ra2xmeo1_500.png";

        Glide.with(this)
                .load(url0)
                .fitCenter()
                .into(image0);


         */

        Button botoVolley = findViewById(R.id.botoVolley);
        /*TODO: EXERCICI2: Afegeix el onclick del botóVolley i afegeix el codi per a que descarregui
            un tros de text i el mostri al textView
            EXERCICI3: Afegeix un 3r botó que utilitzi Volley per descarregar un JSON i el mostri
            sencer per pantalla
         */


    }
}