package kg.geektech.kotlin4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import kg.geektech.kotlin4.databinding.ActivityMainBinding
import kg.geektech.kotlin4.ui.adapters.PageAdapter
import kg.geektech.kotlin4.ui.fragments.FirstFragment
import kg.geektech.kotlin4.ui.fragments.SecondFragment
import kg.geektech.kotlin4.ui.fragments.ThirdFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragments: ArrayList<Fragment> = arrayListOf(
            FirstFragment(),
            SecondFragment(),
            ThirdFragment(),
        )
        val adapter = PageAdapter(fragments, this)
        binding.viewpager.adapter = adapter
    }
}