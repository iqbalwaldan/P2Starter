package polinema.ac.id.dtschapter03_starter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class IntroActivity extends AppCompatActivity {

    private ViewPager screenPager;
    IntroViewPagerAdapter introViewPagerAdapter ;
    TabLayout tabIndicator;
    Button btnNext, btnGetStarted;
    int position = 0 ;
    Animation btnAnim ;
    TextView tvSkip,login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // make the activity on full screen

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        // when this activity is about to be launch we need to check if its openened before or not

        if (restorePrefData()) {

            Intent mainActivity = new Intent(getApplicationContext(),MainActivity.class );
            startActivity(mainActivity);
            finish();

        }

        setContentView(R.layout.activity_intro);

        // hide the action bar

        getSupportActionBar().hide();

        // ini views
//        btnNext = findViewById(R.id.btn_next);
        btnGetStarted = findViewById(R.id.btn_get_started);
        tabIndicator = findViewById(R.id.tab_indicator);
        btnAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.button_animation);
        tvSkip = findViewById(R.id.tv_skip);
        login = findViewById(R.id.btn_login);

        // fill list screen

        final List<ScreenItem> mList = new ArrayList<>();
        mList.add(new ScreenItem("Welcome To DTS VSGA","What is going to happen tomorrow ?", R.drawable.ic_eventlist,R.drawable.bg_red));
        mList.add(new ScreenItem("Work Happen","Get Notified When Work Happens", R.drawable.ic_superhero,R.drawable.bg_blue));
        mList.add(new ScreenItem("Task and Assign","Task and Assign them to colleagues", R.drawable.ic_assign,R.drawable.bg_purple));

        // setup viewpager
        screenPager =findViewById(R.id.screen_viewpager);
        introViewPagerAdapter = new IntroViewPagerAdapter(this,mList);
        screenPager.setAdapter(introViewPagerAdapter);

        // setup tablayout with viewpager

        tabIndicator.setupWithViewPager(screenPager);

        // next button click Listner

        btnGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                position = screenPager.getCurrentItem();
                if (position < mList.size()) {

                    position++;
                    screenPager.setCurrentItem(position);

                }

                if (position == mList.size()) { // when we rech to the last screen

                    // TODO : show the GETSTARTED Button and hide the indicator and the next button

                    Intent welcomeBack = new Intent(getApplicationContext(),WelcomeBack.class);
                    startActivity(welcomeBack);
                    // also we need to save a boolean value to storage so next time when the user run the app
                    // we could know that he is already checked the intro screen activity
                    // i'm going to use shared preferences to that process
                    savePrefsData();
                    finish();
//                    loaddLastScreen();
                }
            }
        });

        // tablayout add change listener


        tabIndicator.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                if (tab.getPosition() == mList.size()-1) {

//                    loaddLastScreen();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
        // Get Started button click listener

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //open main activity

                Intent welcomeBack = new Intent(getApplicationContext(),WelcomeBack.class);
                startActivity(welcomeBack);
                // also we need to save a boolean value to storage so next time when the user run the app
                // we could know that he is already checked the intro screen activity
                // i'm going to use shared preferences to that process
                savePrefsData();
                finish();
            }
        });

        // skip button click listener

        tvSkip.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                screenPager.setCurrentItem(mList.size());
            }
        });
    }

    private boolean restorePrefData() {

        SharedPreferences pref = getApplicationContext().getSharedPreferences("myPrefs",MODE_PRIVATE);
        Boolean isIntroActivityOpnendBefore = pref.getBoolean("isIntroOpnend",false);
        return  isIntroActivityOpnendBefore;
    }

    private void savePrefsData() {

        SharedPreferences pref = getApplicationContext().getSharedPreferences("myPrefs",MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean("isIntroOpnend",true);
        editor.commit();
    }

    // show the GETSTARTED Button and hide the indicator and the next button
//    private void loaddLastScreen() {
//
//        btnNext.setVisibility(View.INVISIBLE);
//        btnGetStarted.setVisibility(View.VISIBLE);
//        tvSkip.setVisibility(View.INVISIBLE);
//        tabIndicator.setVisibility(View.INVISIBLE);
//        // TODO : ADD an animation the getstarted button
//        // setup animation
//        btnGetStarted.setAnimation(btnAnim);
//    }
}