 package com.example.lab1hellotoast;


 import android.os.Bundle;
 import android.widget.Button;
 import android.widget.TextView;
 import android.widget.Toast;

 import androidx.appcompat.app.AppCompatActivity;

 public class MainActivity extends AppCompatActivity {

     // compteur
     private int compteurValeur = 0;

     // TextView
     private TextView affichageCompteur;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

         // récupération des éléments
         affichageCompteur = findViewById(R.id.value_counter);
         Button boutonToast = findViewById(R.id.btn_show_message);
         Button boutonPlus = findViewById(R.id.btn_increment);

         // action bouton toast
         boutonToast.setOnClickListener(view -> {
             Toast.makeText(MainActivity.this,
                     "Bienvenue dans mon application 🚀",
                     Toast.LENGTH_SHORT).show();
         });

         // action bouton compteur
         boutonPlus.setOnClickListener(view -> {
             compteurValeur++;
             affichageCompteur.setText(String.valueOf(compteurValeur));
         });
     }
 }