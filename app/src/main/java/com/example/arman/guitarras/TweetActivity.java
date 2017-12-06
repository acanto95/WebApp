package com.example.arman.guitarras;

import android.content.Intent;
import android.media.session.MediaSession;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.arman.SyncTaskClass.loginSyncTask;
import com.example.arman.SyncTaskClass.tweetSyncTask;
import com.tweet_api.model.MessagesCodeMessage;
import com.tweet_api.model.MessagesTweetInput;

import java.util.concurrent.ExecutionException;

public class TweetActivity extends AppCompatActivity {

    Button btnTweet;
    EditText edtTitle;
    EditText edtDescription;
    EditText edtUrlImage;
    EditText edtCuerdas;
    EditText edtPrecio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tweet);

        btnTweet = (Button) findViewById(R.id.btnTweet);
        edtTitle = (EditText) findViewById(R.id.edtTitle);
        edtDescription = (EditText) findViewById(R.id.edtDescription);
        edtCuerdas = (EditText) findViewById(R.id.edtCuerdas);
        edtPrecio = (EditText) findViewById(R.id.edtPrecio);
        edtUrlImage = (EditText) findViewById(R.id.edtUrlImage);
        edtUrlImage.setText("https://adsoft-iosclient.appspot.com/images/team-img3.jpg");


        btnTweet.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String title =  edtTitle.getText().toString().trim();
                String description = edtDescription.getText().toString().trim();
                String urlImage = edtUrlImage.getText().toString().trim();


                if ((title.length() == 0) || (description.length() == 0))
                {
                    Toast.makeText(TweetActivity.this,
                            "Necesitas ingresar tu titulo y descripcion.",
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                Intent intent = getIntent();
                String token = intent.getStringExtra("Token");


                Toast.makeText(TweetActivity.this, title + " , " +  description + " " + token,
                        Toast.LENGTH_LONG).show();

                String[] params = {title, description, token, urlImage};
                Toast.makeText(TweetActivity.this, "title: " + title + " description: " + description, Toast.LENGTH_LONG).show();

                AsyncTask<String, Void, MessagesCodeMessage> execute =
                        new tweetSyncTask(TweetActivity.this).execute(params);
                String Message = new String();



                /*LoginTask(LoginActivity.this).execute(params);*/
                try {
                    Message = execute.get().getMessage();
                    //Toast.makeText(LoginActivity.this,"Token: "+execute.get().getToken(),Toast.LENGTH_SHORT).show();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e){
                    e.printStackTrace();
                }
                finally
                {

                    if(Message != null) {

                        Toast.makeText(TweetActivity.this," Message: "+ Message,Toast.LENGTH_SHORT).show();

                        //Intent myIntent = new Intent(TweetActivity.this, TweetActivity.class);

                        //myIntent.putExtra("Message: ", Message);
                        //startActivity(intent);
                    }

                }
            }
        });

    }
}



