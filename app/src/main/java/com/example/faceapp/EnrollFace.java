package com.example.faceapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.otaliastudios.cameraview.CameraListener;
import com.otaliastudios.cameraview.CameraView;
import com.otaliastudios.cameraview.PictureResult;
import com.otaliastudios.cameraview.controls.Facing;

public class EnrollFace extends AppCompatActivity {

    private boolean isFront = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enroll_face);

        final CameraView camera = findViewById(R.id.camera);
        camera.setLifecycleOwner(this);

        camera.addCameraListener(new CameraListener() {
            @Override
            public void onPictureTaken(PictureResult result) {
                // A Picture was taken!
            }
        });


        ImageView switchCamera = (ImageView) findViewById(R.id.camera_switch_cam);
        ImageView captureImage = (ImageView) findViewById(R.id.camera_take_pic);


        captureImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(v.getContext(), EnrolmentForm.class));
            }
        });

        switchCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isFront = !isFront;
                camera.setFacing(isFront ? Facing.FRONT : Facing.BACK);
            }
        });
    }
}
