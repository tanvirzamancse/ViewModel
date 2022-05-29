package com.viewmodel.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.os.Bundle;
import com.viewmodel.R;
import com.viewmodel.ViewModel.MainActivityViewModel;
import com.viewmodel.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mainBinding;
    private MainActivityViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);

        String Number=viewModel.getMyrandomNumber();
        mainBinding.rendomNumber.setText(Number);
    }
}