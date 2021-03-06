package com.feed.arivusitrus.kitchendelete;

import android.os.Bundle;


public class ContextualUndoActivity extends MyListActivity {

	private final ArrayAdapter<String> mAdapter = createListAdapter();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		ContextualUndoAdapter contextualUndoAdapter = new ContextualUndoAdapter(mAdapter, R.layout.undo_row, R.id.undo_row_undobutton);
		contextualUndoAdapter.setAbsListView(getListView());
		getListView().setAdapter(contextualUndoAdapter);
		contextualUndoAdapter.setDeleteItemCallback(new MyDeleteItemCallback());
	}

	private class MyDeleteItemCallback implements com.feed.arivusitrus.kitchendelete.ContextualUndoAdapter.DeleteItemCallback {


		public void deleteItem(int position) {
			mAdapter.remove(position);
			mAdapter.notifyDataSetChanged();
		}
	}
}