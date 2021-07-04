package com.github.welblade.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_linear)
        Log.w("LifeCycle", "CREATE  - Estou criando a tela.")
    }

    override fun onStart() {
        super.onStart()
        Log.w("LifeCycle", "START   - Deixei a tela visível para você.")
    }

    override fun onResume(){
        super.onResume()
        Log.w("LifeCycle", "RESUME  - Agora você pode interagir com a tela.")
    }

    override fun onPause() {
        super.onPause()
        Log.w("LifeCycle", "PAUSE   - A tela perdeu o foco, você não pode mais interagir.")
    }

    override fun onStop(){
        super.onStop()
        Log.w("LifeCycle", "STOP    - A tela não está mais visível, mas ainda existe.")
    }

    override fun onRestart(){
        super.onRestart()
        Log.w("LifeCycle", "RESTART - Não a banda, é a tela que está retomando o foco.")
    }

    override fun onDestroy(){
        super.onDestroy()
        Log.e("LifeCycle", "DESTROY - Oh não! A tela foi destruída.")
    }
}