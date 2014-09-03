package com.example.paraloxscrollanna1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.nirhart.parallaxscroll.views.ParallaxExpandableListView;

public class MultipleParallaxExpandableListView extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.expand_list_multiple_parallax);
		ParallaxExpandableListView listView = (ParallaxExpandableListView) findViewById(R.id.list_view);
		CustomExpandableListAdapter adapter = new CustomExpandableListAdapter(LayoutInflater.from(this));
		listView.setAdapter(adapter);
	}
	
}
