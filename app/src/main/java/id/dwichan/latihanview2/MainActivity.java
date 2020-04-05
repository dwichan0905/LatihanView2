package id.dwichan.latihanview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RatingBar rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /**
         * Tema Gelapnya dimana? Cek AndroidManifest.xml!
         */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btnGambar = (ImageButton) findViewById(R.id.btnGambar);
        btnGambar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Ini tombol pake icon Google Assistant!", Toast.LENGTH_SHORT).show();
            }
        });
        Button btnMsg2 = (Button) findViewById(R.id.btnMsg2);
        btnMsg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Ini tombol pake icon Google Assistant dan ada text nya!", Toast.LENGTH_SHORT).show();
            }
        });

        rb = (RatingBar) findViewById(R.id.rb);
        Button btPenilaian = (Button) findViewById(R.id.btnPenilaian);
        btPenilaian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rat = String.valueOf(rb.getRating());
                Toast.makeText(MainActivity.this, "Penilaian Anda: " + rat, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void Greeting(View view) {
        Toast.makeText(this, "Halo, Chan :*", Toast.LENGTH_SHORT).show();
    }

    public void RadioJKClick(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.jkPria:
                if (checked) Toast.makeText(this, "Anda adalah seorang pria.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.jkWanita:
                if (checked) Toast.makeText(this, "Anda adalah seorang wanita.", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void light(View view) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        Toast.makeText(this, "Tema kini berubah menjadi mode terang!", Toast.LENGTH_SHORT).show();
    }

    public void dark(View view) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        Toast.makeText(this, "Tema kini berubah menjadi mode gelap!", Toast.LENGTH_SHORT).show();
    }

    public void sysdef(View view) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);
        Toast.makeText(this, "Tema kini berubah mengikuti pengaturan Android!", Toast.LENGTH_SHORT).show();
    }
}
