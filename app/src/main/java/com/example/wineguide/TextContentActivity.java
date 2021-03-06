package com.example.wineguide;


import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TextContentActivity extends AppCompatActivity {
    private TextView text_content;
    private ImageView image_content;
    private Typeface face1;
    private Typeface face2;
    private int category = 0;
    private int position = 0;
    private int[] array_specification = {R.string.nutritional_value, R.string.calorie_content,R.string.shelf_life};
    private int[] array_classification = {R.string.color_quality, R.string.alcohol_sugar,R.string.grape_sort};
    private int[] array_winemaking = {R.string.technology, R.string.geography,R.string.demand};
    private int[] array_culture = {R.string.etiquette, R.string.selection,R.string.open};
    private int[] array_tasting = {R.string.terms, R.string.stages,R.string.places};
    private int[] array_image_specification = {R.drawable.image_nutritional_value,R.drawable.image_calorie_content,R.drawable.image_shelf_life};
    private int[] array_image_classification = {R.drawable.image_color,R.drawable.image_alcohol,R.drawable.image_grape_sort};
    private int[] array_image_winemaking = {R.drawable.image_technology,R.drawable.image_geography,R.drawable.image_demand};
    private int[] array_image_culture = {R.drawable.image_etiquette,R.drawable.image_selection,R.drawable.image_open};
    private int[] array_image_tasting = {R.drawable.image_terms,R.drawable.image_stages,R.drawable.image_places};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_content);
        init();
        reciveIntent();
    }

    private void init(){
        text_content = findViewById(R.id.text_main_content);
        image_content = findViewById(R.id.imageContent);
        face2 = Typeface.createFromAsset(this.getAssets(),"fonts/Jura-VariableFont_wght.ttf");
        text_content.setTypeface(face2);
    }

    private void reciveIntent(){
        Intent i = getIntent();
        if (i != null) {
            category = i.getIntExtra("category",0);
            position = i.getIntExtra("position",0);
        }
        switch (category){
            case 0:
                image_content.setImageResource(array_image_specification[position]);
                text_content.setText(array_specification[position]);
                break;
            case 1:
                image_content.setImageResource(array_image_classification[position]);
                text_content.setText(array_classification[position]);
                break;
            case 2:
                image_content.setImageResource(array_image_winemaking[position]);
                text_content.setText(array_winemaking[position]);
                break;
            case 3:
                image_content.setImageResource(array_image_culture[position]);
                text_content.setText(array_culture[position]);
                break;
            case 4:
                image_content.setImageResource(array_image_tasting[position]);
                text_content.setText(array_tasting[position]);
                break;
            case 5:
                image_content.setImageResource(array_image_specification[position]);

                break;
        }
    }
}
