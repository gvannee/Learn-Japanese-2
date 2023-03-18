package edu.hanu.a1_2001040222.hellojapan;

import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;

import java.util.concurrent.atomic.AtomicInteger;

public class Characters {
    private int sound;
    private String name;
    private int image;


    public Characters(String name, int image, int sound) {

        this.sound = sound;
        this.name = name;
        this.image = image;
    }

    public int getSound() {
        return sound;
    }

    public void setSound(int sound) {
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }


}
