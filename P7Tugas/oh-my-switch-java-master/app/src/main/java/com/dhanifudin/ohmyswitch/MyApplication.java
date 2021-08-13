package com.dhanifudin.ohmyswitch;

import android.app.Application;
import com.dhanifudin.ohmyswitch.models.Item;

import java.util.ArrayList;
import java.util.List;

public class MyApplication extends Application {

	private static List<Item> items;

	@Override
	public void onCreate() {
		super.onCreate();
		items = new ArrayList<>();
		items.add(new Item(
			"MX Red",
			"Smooth and Direct",
			"https://www.cherrymx.de/_Resources/Persistent/af1adbb0d619d1a9728352b11786a369b76034b5/img-thumb-mxRed%402x_100-80x80.png",
			"https://www.cherrymx.de/_Resources/Persistent/d4e5d661da4d28eb2c5d6321289c29ac2d6cbd56/img-productstage-mxRed%402x_100-368x368.png",
			"Linear",
			45,
			2.0f,
			4.0f,
			"The linear switching characteristic combined with the low spring resistance triggers directly. The CHERRY MX Red is the first choice for beginners in the world of mechanical keyboards. The smooth-running CHERRY MX technology enables balanced writing and gaming sessions.",
			"https://www.cherrymx.de/_Resources/Persistent/fdcfc281f40105a8b46c3e03b72e34e7692ab1c6/GIF_MXRGB_Std-Red.gif"
		));
		items.add(new Item(
			"MX Speed Silver",
			"Fast and Direct",
			"https://www.cherrymx.de/_Resources/Persistent/798962ca891cee81e01a6ff82cf4a50b4c01b17f/img-thumb-mxSpeedsilver%402x_100-79x80.png",
			"https://www.cherrymx.de/_Resources/Persistent/39e2416ee3a4110c462ec4cdc58cf340c340cd05/img-productstage-mxSpeedSilver%402x_100-368x368.png",
			"Linear",
			45,
			1.2f,
			3.4f,
			"The CHERRY MX Speed Silver is the fastest model of the CHERRY MX switch family in full height. Due to the linear switching characteristics combined with the low spring resistance, the silver switch triggers directly. When milliseconds decide whether you win or lose, the CHERRY MX Speed Silver is your guarantee for a successful gaming session.",
			"https://www.cherrymx.de/_Resources/Persistent/5d5d3d27a7049ae2d13150229240122630dd374d/GIF_MXRGB_Speed.gif"
		));
		items.add(new Item(
			"MX Black",
			"Powerful and Direct",
			"https://www.cherrymx.de/_Resources/Persistent/6d8e18bba508bd939bba389ba7ca4d2da9fb3329/img-thumb-mxBlack%402x_100-79x80.png",
			"https://www.cherrymx.de/_Resources/Persistent/9adfae3ad1b291618e8c739694e2c8aa313d0b01/img-productstage-mxBlack%402x_100-368x368.png",
			"Linear",
			60,
			2.0f,
			4.0f,
			"The linear switching characteristic combined with an increased spring force triggers directly. Thanks to a stronger spiral spring, the tried and true CHERRY MX Black smoothly moves the keys back to the starting position and grants the necessary staying power for long writing and gaming sessions.",
			"https://www.cherrymx.de/_Resources/Persistent/baba6c3fa6e129976b40b6b3534449f7db49230b/GIF_MXRGB_Std-Black.gif"
		));
		items.add(new Item(
			"MX Black",
			"Powerful and Direct",
			"https://www.cherrymx.de/_Resources/Persistent/6d8e18bba508bd939bba389ba7ca4d2da9fb3329/img-thumb-mxBlack%402x_100-79x80.png",
			"https://www.cherrymx.de/_Resources/Persistent/9adfae3ad1b291618e8c739694e2c8aa313d0b01/img-productstage-mxBlack%402x_100-368x368.png",
			"Linear",
			60,
			2.0f,
			4.0f,
			"The linear switching characteristic combined with an increased spring force triggers directly. Thanks to a stronger spiral spring, the tried and true CHERRY MX Black smoothly moves the keys back to the starting position and grants the necessary staying power for long writing and gaming sessions.",
			"https://www.cherrymx.de/_Resources/Persistent/baba6c3fa6e129976b40b6b3534449f7db49230b/GIF_MXRGB_Std-Black.gif"
		));
		items.add(new Item(
			"MX Black",
			"Powerful and Direct",
			"https://www.cherrymx.de/_Resources/Persistent/6d8e18bba508bd939bba389ba7ca4d2da9fb3329/img-thumb-mxBlack%402x_100-79x80.png",
			"https://www.cherrymx.de/_Resources/Persistent/9adfae3ad1b291618e8c739694e2c8aa313d0b01/img-productstage-mxBlack%402x_100-368x368.png",
			"Linear",
			60,
			2.0f,
			4.0f,
			"The linear switching characteristic combined with an increased spring force triggers directly. Thanks to a stronger spiral spring, the tried and true CHERRY MX Black smoothly moves the keys back to the starting position and grants the necessary staying power for long writing and gaming sessions.",
			"https://www.cherrymx.de/_Resources/Persistent/baba6c3fa6e129976b40b6b3534449f7db49230b/GIF_MXRGB_Std-Black.gif"
		));
		items.add(new Item(
			"MX Black",
			"Powerful and Direct",
			"https://www.cherrymx.de/_Resources/Persistent/6d8e18bba508bd939bba389ba7ca4d2da9fb3329/img-thumb-mxBlack%402x_100-79x80.png",
			"https://www.cherrymx.de/_Resources/Persistent/9adfae3ad1b291618e8c739694e2c8aa313d0b01/img-productstage-mxBlack%402x_100-368x368.png",
			"Linear",
			60,
			2.0f,
			4.0f,
			"The linear switching characteristic combined with an increased spring force triggers directly. Thanks to a stronger spiral spring, the tried and true CHERRY MX Black smoothly moves the keys back to the starting position and grants the necessary staying power for long writing and gaming sessions.",
			"https://www.cherrymx.de/_Resources/Persistent/baba6c3fa6e129976b40b6b3534449f7db49230b/GIF_MXRGB_Std-Black.gif"
		));
	}

	public static List<Item> getItems() {
		return items;
	}
}