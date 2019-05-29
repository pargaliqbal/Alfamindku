package store.pargalapp.alfamindku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class  FlashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash);
        Thread thread = new Thread() {
            public  void run() {
                try {
                    sleep(4000);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    startActivity(new Intent(FlashActivity.this, WelcomeActivity.class));
                    finish();
                }
            }

        };
        thread.start();
    }
}
