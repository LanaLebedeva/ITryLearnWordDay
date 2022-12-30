package com.github.lanalebedeva.itrylearnwordday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.lanalebedeva.itrylearnwordday.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container_view_tag, StartFragment())
            .commit()
    }
//        supportFragmentManager
//            .beginTransaction()
//            .replace(R.id.fragment_container_view_tag, WordListFragment())
//            .commit()
//    }
}
