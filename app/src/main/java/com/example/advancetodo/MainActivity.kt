package com.example.advancetodo

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.advancetodo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addNotes.setOnClickListener {
            isOpen()
        }
    }

    private fun isOpen() {
        if (binding.addNotesEt.visibility == View.GONE) {
            binding.addNotesEt.visibility = View.VISIBLE
        } else {
            binding.addNotesEt.visibility = View.GONE
        }
    }


//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        // Handle item selection.
//        return when (item.itemId) {
//            R.id.new_game -> {
//                newGame()
//                true
//            }
//            R.id.help -> {
//                showHelp()
//                true
//            }
//            else -> super.onOptionsItemSelected(item)
//        }
//    }
}