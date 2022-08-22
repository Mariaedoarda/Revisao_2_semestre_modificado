package com.example.revisao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val edtNome: EditText = findViewById(R.id.edtNome)
        val edtEndereco: EditText = findViewById(R.id.edtEnderecos)
        val edtBairro: EditText = findViewById(R.id.edtBairros)
        val edtCep: EditText = findViewById(R.id.edtCeps)
        val edtCidade: EditText = findViewById(R.id.edtCidades)

        val intent = intent

        val inputNome = intent.getStringExtra("nome")
        val inputEndereco = intent.getStringExtra("endereco")
        val inputCidade = intent.getStringExtra("cidade")
        val inputCep = intent.getStringExtra("cep")
        val inputBairro = intent.getStringExtra("bairro")

        edtNome.setText("Nome: " + inputNome.toString())
        edtEndereco.setText("Endereço: " + inputEndereco.toString())
        edtBairro.setText("Cidade: " + inputCidade.toString())
        edtCep.setText("Cep: " + inputCep.toString())
        edtCidade.setText("Bairro: " + inputBairro.toString())

        val btnVoltar: Button = findViewById(R.id.btnVoltar)


        btnVoltar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }
}