package store.pargalapp.alfamindku;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        setupToolbar();

        init();
    }

    protected void setupToolbar() {
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }
    private void init(){
        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
    }
    private void setupViewPager(final ViewPager viewPager) {
        ViewPagerAdapter viewPagerAdapter = new
                ViewPagerAdapter(getSupportFragmentManager(), this);
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.setOffscreenPageLimit(4);
        viewPager.addOnPageChangeListener(new
                TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setTabsFromPagerAdapter(viewPagerAdapter);
    }


    public void home(MenuItem item) {
        Intent i = new Intent(MainActivity.this, MainActivity.class);
        startActivity(i);
    }

    public void profile(MenuItem item) {
        Intent i = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(i);
    }
}




