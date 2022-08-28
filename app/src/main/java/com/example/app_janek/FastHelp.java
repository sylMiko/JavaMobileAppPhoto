package com.example.app_janek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FastHelp extends AppCompatActivity {
    private FirebaseAuth mAuth;
//    private DatabaseReference ref;
    private EditText description;
//    @Override
//    public void onStart() {
//        super.onStart();
//        FirebaseUser currentUser = mAuth.getCurrentUser();
//        if (currentUser != null) {
//            currentUser.reload();
//        }
//    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fast_help);
        Button send = findViewById(R.id.btn_send);
        ImageView add_photo = findViewById(R.id.iv_addphoto);
        description = findViewById(R.id.et_description);
//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference myRef = database.getReference("message");
//        FirebaseDatabase base = FirebaseDatabase.getInstance();
//        mAuth = FirebaseAuth.getInstance();
//        ref = base.getReference();

//        send.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String sdescription = description.getText().toString();
//                System.out.println(sdescription);
//                myRef.setValue("Hello, World!");
//                FirebaseUser user = mAuth.getCurrentUser();
//                //assert user != null;
//                String userID = user.getUid();
////                ref.child("opisy").child(userID).child("opis").setValue(sdescription);
////                Toast.makeText(FastHelp.this, "Dodawanie wartosci", Toast.LENGTH_SHORT).show();
//                }
//        });
    }
    }
