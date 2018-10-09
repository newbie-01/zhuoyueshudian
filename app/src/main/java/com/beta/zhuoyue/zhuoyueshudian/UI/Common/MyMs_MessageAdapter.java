package com.beta.zhuoyue.zhuoyueshudian.UI.Common;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * @author Lyh
 */
public class MyMs_MessageAdapter extends FragmentPagerAdapter {
	private List<Fragment> fragments;
	private String[]       titles;

	public MyMs_MessageAdapter(FragmentManager fm, String[] titles, List<Fragment> fragments) {
		super(fm);
		this.titles = titles;
		this.fragments = fragments;
	}

	@Override
	public Fragment getItem(int arg0) {
		return fragments.get(arg0);
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return titles[position];
	}

	@Override
	public int getCount() {
		return fragments.size();
	}
}