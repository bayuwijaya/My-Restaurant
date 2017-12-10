package com.lombok_tourism.www.voyagetolombok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v4.view.ViewPager;


import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;


import java.util.HashMap;

public class DashboardActivity extends AppCompatActivity {
    private SliderLayout sliderLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        sliderLayout = (SliderLayout) findViewById(R.id.slider);

        // Load image dari URL
        HashMap<String, String> url_maps = new HashMap<String, String>();
        url_maps.put("Wisata Gunung Rinjani", "http://www.lomboktourplus.com/wp-content/uploads/2017/01/Pesona-Gunung-Rinjani-Bak-Surga-Yang-Terlihat-wisata-lombok-lomboktourplus.jpg");
        url_maps.put("Pantai Kuta Lombok", "http://www.ninabarbosa.com/wp-content/uploads/2017/05/pantai-kuta-lombok.png");
        url_maps.put("Pantai Sekotong", "http://www.jacktarsuperyachtcharter.com/wp-content/uploads/2013/10/Lombok-Island.jpg");
        url_maps.put("Bukit Sembalun", "http://www.lombokwandertour.com/images/Artikel - Bukit Selong/Sembalun.jpg");

        // Load Image Dari res/drawable
        HashMap<String, Integer> file_maps = new HashMap<String, Integer>();
        file_maps.put("Wisata Gunung Rinjani", R.drawable.rinjani);
        file_maps.put("Pantai Kuta Lombok", R.drawable.kuta_lombok);
        file_maps.put("Pantai Sekotong", R.drawable.gili_trawangan);
        file_maps.put("Bukit Sembalun", R.drawable.narmada);

        for (String name : file_maps.keySet()) {
            TextSliderView textSliderView = new TextSliderView(this);

            // initialize a SliderLayout
            textSliderView
                    .description(name)
                    .image(file_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit);

            //add your extra information
            textSliderView.bundle(new Bundle());
            textSliderView.getBundle()
                    .putString("extra", name);
            sliderLayout.addSlider(textSliderView);
        }

        sliderLayout.setPresetTransformer(SliderLayout.Transformer.Accordion);
        sliderLayout.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        sliderLayout.setCustomAnimation(new DescriptionAnimation());
        sliderLayout.setDuration(4000);
    }

    public void hotel_event(View view)
    {
        Intent intent = new Intent(DashboardActivity.this, ListSummaryWisataActivity.class);
        startActivity(intent);
    }

}
