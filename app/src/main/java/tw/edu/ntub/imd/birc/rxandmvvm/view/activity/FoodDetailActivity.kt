package tw.edu.ntub.imd.birc.rxandmvvm.view.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import tw.edu.ntub.imd.birc.rxandmvvm.R

class FoodDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_detail)
    }

    fun btn_back(view: View) {
       finish()
    }
}