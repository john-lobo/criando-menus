package com.johnlennonlobo.criandomenus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //este metodo cria o menu na activity
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu_principal,menu)

        return super.onCreateOptionsMenu(menu)
    }

    //este metodo trata o evento de click
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.salvar -> Toast.makeText(this, "Salvar", Toast.LENGTH_SHORT).show()
            R.id.editar -> Toast.makeText(this, "Editar", Toast.LENGTH_SHORT).show()
            R.id.config -> Toast.makeText(this, "Configurar", Toast.LENGTH_SHORT).show()
        }

        return super.onOptionsItemSelected(item)
    }
}