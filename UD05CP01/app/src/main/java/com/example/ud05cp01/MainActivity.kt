package com.example.ud05cp01

import android.app.DatePickerDialog
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    private var DiaNa: Int=0
    private var MesNac: Int=0
    private var AnhoNac: Int=0

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val fechaHoy= LocalDate.now()
        val formato= DateTimeFormatter.ofPattern("dd/MM/yyyy")
        val fechaHoyFormateada=fechaHoy.format(formato)
        //FECHA PARA LA PARTE ARRIBA HOY ES DIA...
        findViewById<TextView>(R.id.TextParteArriba).text=getString(R.string.TextParteArriba,fechaHoyFormateada)
        //CONFIGURAQCION DE LA FECHA DE NACIMIENTO CON CALENDARIO
        findViewById<Button>(R.id.button).setOnClickListener {
            val calendario= Calendar.getInstance()
            val anho=calendario.get(Calendar.YEAR)
            val mes=calendario.get(Calendar.MONTH)
            val dia=calendario.get(Calendar.DAY_OF_MONTH)
            val datePickerDialog=DatePickerDialog(this, { _, anho, mes, dia ->
                val fechaSeleccionada = LocalDate.of( anho, mes + 1, dia)
                val fechaSeleccionadaFormateada = fechaSeleccionada.format(formato)
                AnhoNac=anho
                MesNac=mes
                DiaNa=dia
                calculoEdad()

            }, anho, mes, dia)
            datePickerDialog.setOnShowListener {
                datePickerDialog.getButton(DatePickerDialog.BUTTON_POSITIVE).text = getString(R.string.BotonPositivoCalendario)
                datePickerDialog.getButton(DatePickerDialog.BUTTON_NEGATIVE).text = getString(R.string.BotonNegativoCalendario)
            }
                datePickerDialog.show()

        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun calculoEdad(){
        val fechaHoy= LocalDate.now()
        val formato= DateTimeFormatter.ofPattern("dd/MM/yyyy")
        val fechaHoyFormateada=fechaHoy.format(formato)
        val fechaNac=LocalDate.of(AnhoNac,MesNac+1,DiaNa)
        val fechaNaciFormateada=fechaNac.format(formato)
        var anhos=fechaHoy.year-fechaNac.year
        var meses=fechaHoy.monthValue-fechaNac.monthValue
        var dias=fechaHoy.dayOfMonth-fechaNac.dayOfMonth

        if(meses<0 || (meses==0 && dias<0)){
            anhos--
            meses+=12
        }

        if (dias<0){
            meses--
            dias+=30
        }
        var diasSinmeses= +(meses*30)+dias
        findViewById<TextView>(R.id.TextoNaciste).text=getString(R.string.TextoNacisteCambio,fechaNaciFormateada)
        findViewById<TextView>(R.id.TextoAbajo).text=getString(R.string.AccionBoton,anhos,diasSinmeses)
    }


}