package com.example.soyeonlee.myapplication2;

import android.content.ClipData;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.VideoView;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class SubActivity1 extends AppCompatActivity {

    private EditText input_message;
    private ImageView imageView;
    private VideoView videoView;
    private Button picture_button;
    private Button video_button;
    private Button file_button;
    private Button cancel_button;
    private Button finish_button;

    String imageEncoded;
    List<String> imagesEncidedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1);

        input_message = (EditText) findViewById(R.id.input_message);
        String input = input_message.getText().toString();
        input = input.replace("'","''");

        imageView = (ImageView)findViewById(R.id.imageView);
        videoView = (VideoView)findViewById(R.id.videoView);
        picture_button = (Button)findViewById(R.id.picture_button);
        video_button = (Button)findViewById(R.id.video_button);
        file_button = (Button)findViewById(R.id.file_button);

        picture_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE,true);
                intent.setAction(Intent.ACTION_GET_CONTENT);
                //startActivityForResult(Intent.createChooser(intent,"select picture"),1);
                startActivityForResult(intent,1);
            }
        });

        video_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setType("video/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                intent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE,true);
                startActivityForResult(intent,2);
            }
        });

        file_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setType("file/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                intent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE,true);
                startActivityForResult(intent,3);
            }
        });

    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
       // super.onActivityResult(requestCode,resultCode,data);

        if(requestCode == 1) {

            if(resultCode == RESULT_OK) {

                try {
                   // if(data.getClipData() != null) {
                      //  int count = data.getClipData().getItemCount();
                       // for(int i=0; i<count; i++) {
                         //   Uri imageUri = data.getClipData().getItemAt(i).getUri();
                           // imageView.setImageURI(imageUri);
                       // }

                   // }
                   // else if(data.getData() != null) {
                   //     String imagePath = data.getData().getPath();
                   // }

                    Uri uri = data.getData();
                    imageView.setImageURI(uri);


                    //InputStream in = getContentResolver().openInputStream(data.getData());
                    //Bitmap img = BitmapFactory.decodeStream(in);
                    //in.close();
                    //imageView.setImageBitmap(img);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        if(requestCode == 2) {

            if(resultCode == RESULT_OK) {

                try {

                    Uri uri = data.getData();
                    videoView.setVideoURI(uri);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        if(requestCode == 3) {

            if(resultCode == RESULT_OK) {

                try {

                    Uri uri = data.getData();



                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
