package com.nasahacker.nasaeditorlibrary

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.nasahacker.editorlibrary.widget.NasaEditorView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        /*val editorView = findViewById<NasaEditorView>(R.id.editor_view)
        editorView.setHtmlCode(editorView.getDefaultHtml())
        editorView.setCssCode(editorView.getDefaultCss())
        editorView.setJsCode(editorView.getDefaultJs())
        editorView.runCode()*/


    }
}