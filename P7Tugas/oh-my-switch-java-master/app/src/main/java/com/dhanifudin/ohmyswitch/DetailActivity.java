package com.dhanifudin.ohmyswitch;

import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.dhanifudin.ohmyswitch.models.Item;

public class DetailActivity extends AppCompatActivity {

	private Item item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        item = getIntent().getParcelableExtra(MainActivity.KEY_ITEM);
        if (item != null) {
			Log.i("DETAIL", item.toString());
		}
    }
}