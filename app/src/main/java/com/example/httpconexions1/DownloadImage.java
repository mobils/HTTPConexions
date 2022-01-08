package com.example.httpconexions1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

public class DownloadImage extends AsyncTask<ImageView, Void, Bitmap> {
    ImageView image;

    @Override
    protected Bitmap doInBackground(ImageView... views) {

        image=views[0];

        Bitmap bitmap = null;
        try {
            URL url[] = new URL[6];  //Tenemos unas cuantas URL y se mostrará una al azar.
            url[0]= new URL("http://25.media.tumblr.com/tumblr_m7j9qiQnJm1ra2xmeo1_500.png");
            url[1] = new URL("http://image.slidesharecdn.com/iproyectoevaluacindellenguaje-121006222912-phpapp01/95/i-proyecto-evaluacin-del-lenguaje-51-728.jpg");
            //Se descargará una de las imágenes del array, al azar.

            int num=new Random().nextInt(1);
            HttpURLConnection urlConnection =  (HttpURLConnection)url[num].openConnection();
            int status = urlConnection.getResponseCode();


            if(status==200){
                //Recuperem contingut de la URL
                InputStream in = new BufferedInputStream(urlConnection.getInputStream());
                //Convertim el inputStream en imatge bitmap
                bitmap = BitmapFactory.decodeStream(in);
                Log.d("Connexio", "Imatge descarregada num: " + num);

                //Hacemos que sea un poco más lento
                //Espera entre 0 y 5 segundos
                new Thread().sleep(1000*new Random().nextInt(5));
            }
            else {
                Log.d("Connexio", "Error de connexió. Estat que retorna la connexió: " + status );

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bitmap;
    }

    @Override
    protected void onPostExecute(Bitmap result) {
        //Mostra la imatge descarregada (es un Bitmap)
        image.setImageBitmap(result);
        Log.d("Connexio", "Imatge al lloc " + image.getId());
        image.setVisibility(View.VISIBLE);


    }
}
