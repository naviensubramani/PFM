package com.gautamk.pfm.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.actionbarsherlock.app.SherlockFragment;
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
		return root;
	}
}