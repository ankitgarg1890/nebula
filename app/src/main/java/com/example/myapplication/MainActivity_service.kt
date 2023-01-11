package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationManager
import android.media.audiofx.Equalizer
import android.media.audiofx.Virtualizer
import android.os.Bundle
import android.provider.Settings
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices

class MainActivity_service : AppCompatActivity() {
    lateinit var textView: TextView
    lateinit var button: Button
    private lateinit var fusedLocationProviderClient: FusedLocationProviderClient


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_service)

        textView = findViewById(R.id.txt_location)
        button = findViewById(R.id.bt_l_device)

         fusedLocationProviderClient =
            LocationServices.getFusedLocationProviderClient(this)


        button.setOnClickListener{


            getcurrentLocationUser()
        }

        getcurrentLocationUser()

    }

    @SuppressLint("SetTextI18n")
    private fun getcurrentLocationUser() {

        if (checkSelfPermission()) {
            if (isLocationEnable()) {

                // Final Lat and log

                fusedLocationProviderClient.lastLocation.addOnCompleteListener(this) { task ->

                    val location: Location? = task.result

                    if (location == null) {
                        Toast.makeText(applicationContext, "NOt get Location", Toast.LENGTH_SHORT)
                            .show()


                    } else {

                        Toast.makeText(applicationContext, "Success", Toast.LENGTH_SHORT).show()


                        textView.text = "Your Location: \nLatitude: ${location.latitude}\nLongitude: ${location.longitude}"

                    }

                }


            } else {

                //setting open her

                Toast.makeText(applicationContext, "Turn on Location", Toast.LENGTH_SHORT).show()

                val intent = Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS)
                startActivity(intent)

            }

        } else {

            //request permission

            requestPermissions()

        }


    }

    private fun isLocationEnable(): Boolean {

        val locationManager: LocationManager =
            getSystemService(Context.LOCATION_SERVICE) as LocationManager

        return locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER) || locationManager.isProviderEnabled(
            LocationManager.NETWORK_PROVIDER
        )


    }

    private fun requestPermissions() {

        ActivityCompat.requestPermissions(
            this,
            arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION),
            PERMISSION_REQUEST_ACCESS_LOCATION
        )

    }

    companion object {

        private const val PERMISSION_REQUEST_ACCESS_LOCATION = 100

    }

    private fun checkSelfPermission(): Boolean {
        if (ActivityCompat.checkSelfPermission(
                this, android.Manifest.permission.ACCESS_FINE_LOCATION
            ) ==

            PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                this, android.Manifest.permission.ACCESS_BACKGROUND_LOCATION
            ) == PackageManager.PERMISSION_GRANTED
        ) {

            return true

        }

        return false
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        if (requestCode == PERMISSION_REQUEST_ACCESS_LOCATION) {

            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                Toast.makeText(applicationContext, "Granted", Toast.LENGTH_SHORT).show()

                getcurrentLocationUser()

            } else {

                Toast.makeText(applicationContext, "NOT Granted", Toast.LENGTH_SHORT).show()

            }

        }
    }
}