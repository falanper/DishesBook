package com.falanper.dishesbook.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.falanper.dishesbook.R
import com.falanper.dishesbook.databinding.ActivityAddUpdateDishBinding

class AddUpdateDishActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var mBinding: ActivityAddUpdateDishBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityAddUpdateDishBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        setUpActionBar()
        mBinding.ivAddDishImage.setOnClickListener(this)
    }

    private fun setUpActionBar() {
        mBinding.toolbarAddDishesActivity.apply {
            setSupportActionBar(this)
            setNavigationOnClickListener {
                onBackPressedDispatcher.onBackPressed()
            }
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.ivAddDishImage -> {
                Toast.makeText(this, "Photo image clicked!", Toast.LENGTH_SHORT).show()
                return
            }
        }
    }
}