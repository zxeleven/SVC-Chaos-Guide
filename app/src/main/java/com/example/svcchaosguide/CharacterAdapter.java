package com.example.svcchaosguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CharacterAdapter extends RecyclerView.Adapter<CharacterAdapter.CharViewHolder>{

    private Context mCtx;
    private OnCharListener mOnCharListener;
    private List<Character> charList;

    public CharacterAdapter(Context mCtx, List<Character> charList, OnCharListener onCharListener) {
        this.mCtx = mCtx;
        this.mOnCharListener = onCharListener;
        this.charList = charList;
    }

    @NonNull
    @Override
    public CharViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_layout, null);
        return new CharViewHolder(view, mOnCharListener);
    }

    @Override
    public void onBindViewHolder(@NonNull CharViewHolder charViewHolder, int i) {
        Character new_char = charList.get(i);
        charViewHolder.char_name.setImageDrawable(mCtx.getResources().getDrawable(new_char.getName()));
        charViewHolder.char_portrait.setImageDrawable(mCtx.getResources().getDrawable(new_char.getPortrait()));
        charViewHolder.card_background.setImageDrawable(mCtx.getResources().getDrawable(new_char.getCardBackground()));
    }

    @Override
    public int getItemCount() {
        return charList.size();
    }

    class CharViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView char_name;
        ImageView char_portrait;
        ImageView card_background;
        OnCharListener onCharListener;

        public CharViewHolder(@NonNull View itemView, OnCharListener onCharListener) {
            super(itemView);

            char_name = itemView.findViewById(R.id.charName);
            char_portrait = itemView.findViewById(R.id.smallPortrait);
            card_background = itemView.findViewById(R.id.charBackground);

            this.onCharListener = onCharListener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            onCharListener.onCharClick(getAdapterPosition());
        }
    }

    public interface OnCharListener{
        void onCharClick(int pos);
    }
}
