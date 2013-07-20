package com.example.menu;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.SubMenu;

public class MainActivity extends SherlockActivity {

	private SubMenu mGoItem;

	private static final int GO_ITEM_ID = 1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ActionBar ab = getSupportActionBar();
		ab.setBackgroundDrawable(getApplicationContext().getResources()
				.getDrawable(R.drawable.background));
		ab.setLogo(getResources().getDrawable(R.drawable.phone));
		ab.setDisplayShowTitleEnabled(true);
	}

	@SuppressLint("InlinedApi")
	@Override
	public boolean onCreateOptionsMenu(com.actionbarsherlock.view.Menu menu) {

		mGoItem = menu.addSubMenu(0, GO_ITEM_ID, 0, null);
		mGoItem.setIcon(R.drawable.setting);
		mGoItem.add(0, R.style.Theme_Sherlock, 0, "View Profile");
		mGoItem.add(0, R.style.Theme_Sherlock_Light, 0, "Account Privacy");
		mGoItem.add(0, R.style.Theme_Sherlock_Light_DarkActionBar, 0, "Logout");

		mGoItem.getItem().setShowAsAction(
				MenuItem.SHOW_AS_ACTION_ALWAYS
						| MenuItem.SHOW_AS_ACTION_WITH_TEXT);

		return true;
	}

	@SuppressLint("InlinedApi")
	@Override
	public boolean onOptionsItemSelected(
			com.actionbarsherlock.view.MenuItem item) {

		switch (item.getItemId()) {
		case GO_ITEM_ID:
			Toast.makeText(MainActivity.this, "Please Select menu list ",
					Toast.LENGTH_LONG).show();
			break;
		case R.style.Theme_Sherlock:
			Toast.makeText(MainActivity.this, "View Your Profile",
					Toast.LENGTH_LONG).show();
			break;
		case R.style.Theme_Sherlock_Light:
			Toast.makeText(MainActivity.this, "Account Privacy",
					Toast.LENGTH_LONG).show();
			break;
		case R.style.Theme_Sherlock_Light_DarkActionBar:
			Toast.makeText(MainActivity.this, "Logout", Toast.LENGTH_LONG)
					.show();
			super.finish();
			break;

		}

		return true;
	}

}