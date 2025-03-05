package com.task.password 

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View; 
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class Task extends AppCompatActivity { 
private EditText emailInput;
private Button resetButton;
private ProgressBar progressBar;
private FirebaseAuth mAuth;

@Override 
 protected void onCreate (Bundle savedInstanceState) {
   super.onCreate(savedInstanceState);
   setContentView (R.layout.AndroidFirst);

  emailInput = findViewById(R.id.email_input);
  resetButton = findViewById(R.id.reset_button);
  progressBar = findViewById(R.id.progress_bar);
  mAuth = FirebaseAuth.getInstance();

  resetButton.setOnClickListener(new View.OnClickListener() {
    @Override 
    public void onClick(View v) {
      resetPassword();
    );

    private void resetPassword() {
      String email = emailInput.getText().toString().trim();

      if(TextUtils.isEmpty(email)) {
        emailInput.setError("Enter email address:");
        return;
       { 

     progressBar.setVisibility(View.VISIBLE);
     mAuth.sendPasswordResetEmail(email)
       .addOnCompleteListener(task -> { 
         progressBar.setVisibility(View.GONE);
         if(task.isSuccessful()) {
           Toast.makeText(Taskk.this, "The recovery link has been sent!", Toast.LENGTH_SHORT).show();
           {else {
             Toast.makeText(Taskk.this, "Wrong" + task.getException().getMessage(), Toast.LENGTH_LONG).show();
             );
    
