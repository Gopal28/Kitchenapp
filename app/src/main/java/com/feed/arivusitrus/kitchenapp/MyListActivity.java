/*
 * Copyright 2013 Niek Haarman
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.feed.arivusitrus.kitchendelete;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Iterator;

public class MyListActivity extends ListActivity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getListView().setDivider(null);

     // name= getIntent().getExtras().getString("Name");

	}

	protected ArrayAdapter<String> createListAdapter() {
		return new MyListAdapter(this, getItems());
	}

	public ArrayList<String> getItems() {
		ArrayList<String> items = new ArrayList<String>();
      //  ArrayList<String> myList = items.get(0);
        //String s = myList.get(0);
      //name=Additem.str;
      /* String[] str1 = new String[5];
        str1[0]=Additem.str;
        str1[1]=Additem.lv.getItemAtPosition( Additem.global_position).toString();
        str1[2]="Lesson3";
        str1[3]="Lesson4";
        str1[4]="Lesson5";
        for(int i=0;i<5;i++)
        {
            items.add(str1[i]);
        }*/
        int k=Additem.i;

       // for(k=Additem.i;k<Additem.j;) items.add(String.valueOf(k));
        items.add("Apple");
        Iterator<String> iterator;
        iterator =  Additem.strArr.iterator();
        while(iterator.hasNext()){
            String version = iterator.next();
            System.out.println(version);
            items.add(Additem.str);
            /* android.remove(version); */ //removing object from List - ConcurrentModificationException

            //iterator.remove();  // you should be using Iterator's remove method
        }

       /* name=Additem.str;
        //   name= getIntent().getExtras().getString("Name");
		items.add("Apple");
        items.add("Orange");
        items.add("Mango");
      items.add(name);*/
		return items;
	}

	private static class MyListAdapter extends ArrayAdapter<String> {

		private Context mContext;

		public MyListAdapter(Context context, ArrayList<String> items) {
			super(items);
			mContext = context;
		}

		@Override
		public long getItemId(int position) {
			return getItem(position).hashCode();
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			TextView tv = (TextView) convertView;
			if (tv == null) {
				tv = (TextView) LayoutInflater.from(mContext).inflate(R.layout.list_row, parent, false);
			}
			tv.setText( getItem(position));
			return tv;
		}
	}

}
