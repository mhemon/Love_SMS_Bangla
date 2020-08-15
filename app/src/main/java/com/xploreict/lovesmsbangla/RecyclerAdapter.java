package com.xploreict.lovesmsbangla;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

import static android.content.Context.CLIPBOARD_SERVICE;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerviewHolder>{
    private String[] data;
    int lastPosition = 0;

    public RecyclerAdapter (String[] data){
        this.data = data;
    }

    @NonNull
    @Override
    public RecyclerviewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.message, viewGroup, false);
        return new RecyclerviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerviewHolder recyclerviewHolder, int i) {
        final String title = data[i];
        recyclerviewHolder.txtmessage.setText(title);
        recyclerviewHolder.share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, title);
                v.getContext().startActivity(Intent.createChooser(sharingIntent, "Share using"));
            }
        });

        recyclerviewHolder.copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboard = (ClipboardManager) v.getContext().getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("label", title);
                clipboard.setPrimaryClip(clip);
                //Toast.makeText(v.getContext(),"Copied to clipboard",Toast.LENGTH_SHORT).show();
                Toasty.success(v.getContext(), "Copied Successful!", Toast.LENGTH_SHORT, true).show();
            }
        });

        recyclerviewHolder.send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("smsto:");
                Intent intent = new Intent(Intent.ACTION_SEND,uri);
                intent.putExtra("sms_body",title);
                v.getContext().startActivity(Intent.createChooser(intent,"Send ur Message"));
            }
        });

        if (i > lastPosition) {
            AnimationUtil.animate(recyclerviewHolder, true);
        }else {
            AnimationUtil.animate(recyclerviewHolder, false);
        }
        lastPosition = i;
    }


    @Override
    public int getItemCount() {
        return data.length;
    }

    public class RecyclerviewHolder extends RecyclerView.ViewHolder{
        TextView txtmessage;
        ImageView share;
        ImageView copy;
        ImageView send;

        public RecyclerviewHolder(@NonNull View itemView) {
            super(itemView);
            txtmessage = (TextView) itemView.findViewById(R.id.statusTextView);
            share = (ImageView) itemView.findViewById(R.id.shareImageView);
            copy = (ImageView) itemView.findViewById(R.id.copyImageView);
            send = (ImageView) itemView.findViewById(R.id.sendImageView);
        }
    }
}
