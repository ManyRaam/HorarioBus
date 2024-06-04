package com.example.busschedule

import android.app.Application
import com.example.busschedule.data.BusDataBase

class BusScheduleApplication: Application() {
    val database: BusDataBase by lazy { BusDataBase.getDatabase(this) }
}