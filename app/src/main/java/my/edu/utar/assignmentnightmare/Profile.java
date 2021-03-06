package my.edu.utar.assignmentnightmare;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_profile);

        BottomNavigationView bottomNavigationView = findViewById(R.id.botnav);
        //initialize check
        bottomNavigationView.setSelectedItemId(R.id.profile);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch(item.getItemId()){
                case R.id.home:
                    item.setChecked(true);
                    Intent intent = new Intent(Profile.this, Homepagee.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
                    finish();
                case R.id.category:
                    item.setChecked(true);
                    Intent intent1 = new Intent(Profile.this, Homepagee.class);
                    startActivity(intent1);
                    overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
                    finish();
                case R.id.message:
                    item.setChecked(true);
                    Intent intent2 = new Intent(Profile.this, Homepagee.class);
                    startActivity(intent2);
                    overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
                    finish();
                case R.id.cart:
                    item.setChecked(true);
                    Intent intent3 = new Intent(Profile.this, Homepagee.class);
                    startActivity(intent3);
                    overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
                    finish();
                case R.id.profile:
                    item.setChecked(true);
                   break;
            }
            return false;
        });



    }

}
