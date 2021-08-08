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
        openPopupBtn.setOnClickListener {
            val popupMenu = PopupMenu(this,openPopupBtn)
            popupMenu.menuInflater.inflate(R.menu.menu_main,popupMenu.menu)
            popupMenu.show()
            popupMenu.setOnMenuItemClickListener { menuItem ->
                when(menuItem.itemId) {
                    R.id.first_item -> {
                        Toast.makeText(this, "popup_menu_first", Toast.LENGTH_SHORT).show()

                    }
                    R.id.second_item -> {
                        Toast.makeText(this, "popup_menu_second", Toast.LENGTH_SHORT).show()

                    }
                }

                true
            }
        }


    }

}