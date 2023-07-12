package com.example.pruebaiipuebliando409;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Locale;

public class Home extends AppCompatActivity {

    //Attributes zone
    Button botonHotel;
    Button botonRestaurant;
    Button botonTourism;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        /*a un botón aquí le lancé uno que cree en lo gráfico o simple, vinculación del botón con java*/
        botonHotel =findViewById(R.id.botonhoteles);
        botonRestaurant =findViewById(R.id.botonrestaurantes);
        botonTourism =findViewById(R.id.botonsitios);
        //Tiene que exister para poder dar clic
        //Sobre quién voy a escuchar? Sobre la vista

        botonHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Qué se quiere que pase al detectar un clic
                Intent intenthotel = new Intent(Home.this,HotelesHome.class);
                startActivity(intenthotel);
            }
        });

        botonRestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentrest = new Intent(Home.this,RestaurantesHome.class);
                startActivity(intentrest);
            }
        });

        botonTourism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenturismo = new Intent(Home.this,SitiosHome.class);
                startActivity(intenturismo);
            }
        });



    }

    //Para inflar o hacer aparecer menú

    public boolean onCreateOptionsMenu(Menu menujava){
        getMenuInflater().inflate(R.menu.menuidiomas,menujava);
        return true;
    }


     //Si el id es el id del item de idioma X entonces traducir a ese idioma:
    public boolean onOptionsItemSelected(MenuItem itemsjava){
        int itemSeleccionado = itemsjava.getItemId();
        switch (itemSeleccionado) {
            case(R.id.Op1Esp):
                Toast.makeText(this, "Quiero que esté en español", Toast.LENGTH_SHORT).show();
                break;
            case(R.id.Op2Eng):
                Toast.makeText(this, "Quiero que esté en inglés", Toast.LENGTH_SHORT).show();
                break;
            case(R.id.Op3Por):
                Toast.makeText(this, "Quiero que esté en portugués", Toast.LENGTH_SHORT).show();
                break;
            case(R.id.About):
                Toast.makeText(this, "Quiero ir a About Us", Toast.LENGTH_SHORT).show();
                break;
        }
        //CAda que detecta que se le da clic devuelve un verdadero
        return super.onOptionsItemSelected(itemsjava);
    }
    //public void cambiarIdioma(String idioma)


}