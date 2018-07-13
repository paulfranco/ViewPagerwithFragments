package co.paulfran.paulfranco.viewpagerwithfragments.app;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import co.paulfran.paulfranco.viewpagerwithfragments.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize ViewPager
        ViewPager viewpager = (ViewPager) findViewById(R.id.viewPager);

        // Initialize the custom adapter instance
        CustomAdapter adapter = new CustomAdapter(getSupportFragmentManager());

        // Bind the adapter to the view pager
        viewpager.setAdapter(adapter);


    }
}
