package com.Notes_2.controllers.Notes;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.Notes_2.R;
import com.Notes_2.data.Note;
import com.Notes_2.data.Singleton;

/**
 * Created by student on 6/23/14.
 */
public class MyListAdapter extends BaseAdapter {
    @Override
    public int getCount() {
        return Singleton.getInstance().getNotes().size();
    }

    @Override
    public Note getItem(int i) {
        return Singleton.getInstance().getNotes().get(i);
    }

    @Override
    public long getItemId(int i) {
        return Singleton.getInstance().getNotes().get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Holder holder;
        if(view == null)
        {
            view = View.inflate(viewGroup.getContext(), R.layout.fragment_note_item, null);
            holder = new Holder();
            holder.header = (TextView)view.findViewById(R.id.note_header);
            holder.text = (TextView)view.findViewById(R.id.note_text);
            view.setTag(holder);
        }
        else
        {
            holder = (Holder)view.getTag();

        }
        Note note = getItem(i);
        holder.header.setText(note.getTitle());
        holder.text.setText(note.getContent());
        return view;
    }

    public static class Holder{
        public TextView header;
        public TextView text;


    }
}
