package com.dhanifudin.ohmyswitch;

import android.content.Intent;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dhanifudin.ohmyswitch.adapters.ItemAdapter;
import com.dhanifudin.ohmyswitch.models.Item;

import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemAdapter.OnItemClickCallback {

	public static final String KEY_ITEM = "item";
	private RecyclerView itemsView;
	private List<Item> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		itemsView = findViewById(R.id.rv_items);
		items = MyApplication.getItems();
		RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
		ItemAdapter adapter = new ItemAdapter(items, this);

		itemsView.setLayoutManager(layoutManager);
		itemsView.setAdapter(adapter);
    }

	@Override
	public void onItemClicked(Item item) {
		Toast.makeText(this, "Click", Toast.LENGTH_SHORT).show();
		Intent intent = new Intent(this, DetailActivity.class);
		intent.putExtra(KEY_ITEM, item);
		startActivity(intent);
	}
}