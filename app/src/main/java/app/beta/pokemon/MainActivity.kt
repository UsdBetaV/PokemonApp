package app.beta.pokemon

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.beta.pokemon.databinding.MainActivityBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    companion object {
        lateinit var instance: AppCompatActivity
            private set
    }

    lateinit var viewBinding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = MainActivityBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        instance = this
//        if (savedInstanceState == null) {
//            supportFragmentManager.beginTransaction()
//                .replace(R.id.container, PokemonListFragment.newInstance())
//                .commitNow()
//        }

    }
}