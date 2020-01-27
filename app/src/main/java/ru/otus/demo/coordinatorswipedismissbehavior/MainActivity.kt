package ru.otus.demo.coordinatorswipedismissbehavior

import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // get the bottom sheet view
        val bottomSheet = findViewById<LinearLayout>(R.id.design_bottom_sheet)
        // init the bottom sheet behavior
        val bShBehavior = BottomSheetBehavior.from(bottomSheet)
        if (false) { //temporary disabled
            // change the state of the bottom sheet
            bShBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
            bShBehavior.state = BottomSheetBehavior.STATE_EXPANDED
            bShBehavior.state = BottomSheetBehavior.STATE_HIDDEN
            // set the peek height(16:9 - PEEK_HEIGHT_AUTO)
            bShBehavior.peekHeight = BottomSheetBehavior.PEEK_HEIGHT_AUTO
            // set hideable or not
            bShBehavior.isHideable = true
        }
    }
}