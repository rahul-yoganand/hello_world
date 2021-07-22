package com.example.hello_world

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast

class UiElementsDemo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ui_elements_demo)
        val openPopupBtn :Button =findViewById(R.id.open_popup)
        val popupMenu = PopupMenu(this,openPopupBtn)
        popupMenu.menuInflater.inflate(R.menu.menu_main,popupMenu.menu)

        popupMenu.setOnMenuItemClickListener { menuItem ->
            val id=menuItem.itemId
            when(id) {
                R.id.first_item -> {
                    Toast.makeText(this, "popup_menu", Toast.LENGTH_SHORT).show()

                }
            }

            true
        }
    }

}