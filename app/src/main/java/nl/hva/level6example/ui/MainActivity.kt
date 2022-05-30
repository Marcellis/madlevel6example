package nl.hva.level6example.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import androidx.activity.viewModels
import nl.hva.level6example.R
import nl.hva.level6example.databinding.ActivityMainBinding
import nl.hva.level6example.vm.TriviaViewModel

class MainActivity : AppCompatActivity() {
    private val viewModel: TriviaViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setSupportActionBar(binding.toolbar)

        binding.fab.setOnClickListener {
            viewModel.getTriviaNumber()
        }
    }
}
