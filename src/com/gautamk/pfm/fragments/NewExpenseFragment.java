package com.gautamk.pfm.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.actionbarsherlock.app.SherlockFragment;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import com.gautamk.pfm.R;


/**
 * User: gautam
 * Date: 11/8/13
 * Time: 11:53 AM
 */
public class NewExpenseFragment extends SherlockFragment {


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		final View root = inflater.inflate(R.layout.fragment_new_expense, container, false);
		setHasOptionsMenu(true);
		return root;
	}

	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		inflater.inflate(R.menu.menu_new_expense_fragment, menu);
	}


	private void save() {
		Toast.makeText(getActivity().getApplicationContext(),"Saved",Toast.LENGTH_SHORT).show();
		getActivity().finish();
	}

	private void cancel() {
		Toast.makeText(getActivity().getApplicationContext(),"Discarded",Toast.LENGTH_SHORT).show();
		getActivity().finish();
	}


	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case R.id.save:
				save();
				break;
			case R.id.cancel:
				cancel();
				break;
		}
		return true;
	}
}