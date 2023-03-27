package com.example.rv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rv2.databinding.ActivityDetailBinding;
import com.example.rv2.recycler.Car;

public class DetailActivity extends AppCompatActivity {

	ActivityDetailBinding binding;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		binding = ActivityDetailBinding.inflate(getLayoutInflater());
		setContentView(binding.getRoot());
		getInformation();
	}

	private void getInformation() {
		String carName = getIntent().getStringExtra("text");
		binding.tvName.setText(carName);
		binding.imageViewNew.setImageResource(getIntent().getIntExtra("image",0));
	}
}
