package com.dhanifudin.ohmyswitch.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Item implements Parcelable {

	private String title;
	private String subtitle;
	private String thumbnailImage;
	private String detailImage;
	private String characteristic;
	private int actuationForce;
	private float switchingPoint;
	private float totalTravel;
	private String description;
	private String animationImage;

	public Item(String title, String subtitle, String thumbnailImage, String detailImage, String characteristic, int actuationForce, float switchingPoint, float totalTravel, String description, String animationImage) {
		this.title = title;
		this.subtitle = subtitle;
		this.thumbnailImage = thumbnailImage;
		this.detailImage = detailImage;
		this.characteristic = characteristic;
		this.actuationForce = actuationForce;
		this.switchingPoint = switchingPoint;
		this.totalTravel = totalTravel;
		this.description = description;
		this.animationImage = animationImage;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getThumbnailImage() {
		return thumbnailImage;
	}

	public void setThumbnailImage(String thumbnailImage) {
		this.thumbnailImage = thumbnailImage;
	}

	public String getDetailImage() {
		return detailImage;
	}

	public void setDetailImage(String detailImage) {
		this.detailImage = detailImage;
	}

	public String getCharacteristic() {
		return characteristic;
	}

	public void setCharacteristic(String characteristic) {
		this.characteristic = characteristic;
	}

	public int getActuationForce() {
		return actuationForce;
	}

	public void setActuationForce(int actuationForce) {
		this.actuationForce = actuationForce;
	}

	public float getSwitchingPoint() {
		return switchingPoint;
	}

	public void setSwitchingPoint(float switchingPoint) {
		this.switchingPoint = switchingPoint;
	}

	public float getTotalTravel() {
		return totalTravel;
	}

	public void setTotalTravel(float totalTravel) {
		this.totalTravel = totalTravel;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAnimationImage() {
		return animationImage;
	}

	public void setAnimationImage(String animationImage) {
		this.animationImage = animationImage;
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(this.title);
		dest.writeString(this.subtitle);
		dest.writeString(this.thumbnailImage);
		dest.writeString(this.detailImage);
		dest.writeString(this.characteristic);
		dest.writeInt(this.actuationForce);
		dest.writeFloat(this.switchingPoint);
		dest.writeFloat(this.totalTravel);
		dest.writeString(this.description);
		dest.writeString(this.animationImage);
	}

	public void readFromParcel(Parcel source) {
		this.title = source.readString();
		this.subtitle = source.readString();
		this.thumbnailImage = source.readString();
		this.detailImage = source.readString();
		this.characteristic = source.readString();
		this.actuationForce = source.readInt();
		this.switchingPoint = source.readFloat();
		this.totalTravel = source.readFloat();
		this.description = source.readString();
		this.animationImage = source.readString();
	}

	protected Item(Parcel in) {
		this.title = in.readString();
		this.subtitle = in.readString();
		this.thumbnailImage = in.readString();
		this.detailImage = in.readString();
		this.characteristic = in.readString();
		this.actuationForce = in.readInt();
		this.switchingPoint = in.readFloat();
		this.totalTravel = in.readFloat();
		this.description = in.readString();
		this.animationImage = in.readString();
	}

	public static final Creator<Item> CREATOR = new Creator<Item>() {
		@Override
		public Item createFromParcel(Parcel source) {
			return new Item(source);
		}

		@Override
		public Item[] newArray(int size) {
			return new Item[size];
		}
	};

	@Override
	public String toString() {
		return "Item{" +
			"title='" + title + '\'' +
			", subtitle='" + subtitle + '\'' +
			", thumbnailImage='" + thumbnailImage + '\'' +
			", detailImage='" + detailImage + '\'' +
			", characteristic='" + characteristic + '\'' +
			", actuationForce=" + actuationForce +
			", switchingPoint=" + switchingPoint +
			", totalTravel=" + totalTravel +
			", description='" + description + '\'' +
			", animationImage='" + animationImage + '\'' +
			'}';
	}
}
