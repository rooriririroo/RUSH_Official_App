package com.example.soyeonlee.myapplication2;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;


public class MyListAdapter extends BaseAdapter {
    Context context;
    ArrayList<list_item> list_itemArrayList;

    ImageView profile_img;
    TextView user_name;
    TextView date;
    TextView content;
    TextView like_num;
    TextView comment_num;
    ToggleButton like_button;
    Button comment_button;

    public MyListAdapter(Context context, ArrayList<list_item>list_itemArrayList) {
        this.context = context;
        this.list_itemArrayList = list_itemArrayList;
    }

    @Override // 이 리스트뷰가 몇 개의 아이템을 가지고 있는지
    public int getCount() {
        return this.list_itemArrayList.size();
    }

    @Override // 배열에 있는 객체 중 position에 해당하는 객체 불러옴
    public Object getItem(int position) {
        return this.list_itemArrayList.get(position);
    }

    @Override // 현재 어떤 position인지
    public long getItemId(int position) {
        return position;
    }

    @Override // 리스트뷰에 표시되는 한 줄의 row 설정
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item,null);
            profile_img = (ImageView)convertView.findViewById(R.id.profile_img);
            user_name = (TextView)convertView.findViewById(R.id.user_name);
            date = (TextView)convertView.findViewById(R.id.date);
            content = (TextView)convertView.findViewById(R.id.content);
            like_num = (TextView)convertView.findViewById(R.id.like_num);
            comment_num = (TextView)convertView.findViewById(R.id.comment_num);
            like_button = (ToggleButton)convertView.findViewById(R.id.like_button);
            comment_button = (Button)convertView.findViewById(R.id.comment_button);
        }

        profile_img.setImageResource(list_itemArrayList.get(position).getProfile_img());
        user_name.setText(list_itemArrayList.get(position).getUser_name());
        date.setText(list_itemArrayList.get(position).getDate());
        content.setText(list_itemArrayList.get(position).getContent());
        like_num.setText(list_itemArrayList.get(position).getLike_num());
        comment_num.setText(list_itemArrayList.get(position).getComment_num());
        like_button.setOnClickListener(new ToggleButton.OnClickListener() {
            public void onClick(View v) {
                    //Toast.makeText(context,"좋아요",Toast.LENGTH_SHORT).show();
            }
        });
        comment_button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                    Toast.makeText(context,"댓글",Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;
    }
}
