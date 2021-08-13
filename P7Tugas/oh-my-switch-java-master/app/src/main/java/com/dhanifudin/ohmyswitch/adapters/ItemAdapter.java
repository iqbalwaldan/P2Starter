package com.dhanifudin.ohmyswitch.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.dhanifudin.ohmyswitch.R;
import com.dhanifudin.ohmyswitch.models.Item;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

	private List<Item> items;
	private OnItemClickCallback listener;

	public ItemAdapter(List<Item> items, OnItemClickCallback listener) {
		this.items = items;
		this.listener = listener;
	}
	@NonNull
	@Override
	public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(parent.getContext())
			.inflate(R.layout.item_row, parent, false);
		return new ViewHolder(view);
	}

	@Override
	public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
		Item item = items.get(position);
		Glide.with(holder.itemView.getContext())
			.load(item.getThumbnailImage())
			.into(holder.photoImage);
		holder.titleText.setText(item.getTitle());
		holder.subtitleText.setText(item.getSubtitle());
		holder.characteristicText.setText(item.getCharacteristic());
		holder.actuationText.setText(String.valueOf(item.getActuationForce()));
		holder.switchingPointText.setText(String.valueOf(item.getSwitchingPoint()));
		holder.totalTravelText.setText(String.valueOf(item.getTotalTravel()));
		holder.itemView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				listener.onItemClicked(item);
			}
		});
	}

	@Override
	public int getItemCount() {
		return items.size();
	}

	public class ViewHolder extends RecyclerView.ViewHolder {
		ImageView photoImage;
		TextView titleText;
		TextView subtitleText;
		TextView characteristicText;
		TextView actuationText;
		TextView switchingPointText;
		TextView totalTravelText;

		public ViewHolder(@NonNull View itemView) {
			super(itemView);
			photoImage = itemView.findViewById(R.id.avatar_image);
			titleText = itemView.findViewById(R.id.title_text);
			subtitleText = itemView.findViewById(R.id.subtitle_text);
			characteristicText = itemView.findViewById(R.id.characteristic_text);
			actuationText = itemView.findViewById(R.id.actuation_text);
			switchingPointText = itemView.findViewById(R.id.switching_point_text);
			totalTravelText = itemView.findViewById(R.id.total_travel_text);
		}

	}

	public interface OnItemClickCallback {
		void onItemClicked(Item item);
	}
}
