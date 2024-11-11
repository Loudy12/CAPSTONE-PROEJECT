package com.example.seniorcapstoneappfe.pages


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.seniorcapstoneappfe.R

class ForYouActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_for_you)  // The XML layout for this screen

        // Initialize views
        val usernameInput = findViewById<EditText>(R.id.username_input)
        val passwordInput = findViewById<EditText>(R.id.password_input)
        val loginButton = findViewById<Button>(R.id.login_button)
        val futureStudentsButton = findViewById<Button>(R.id.future_students_button)
        val visitorsButton = findViewById<Button>(R.id.visitors_button)

        loginButton.setOnClickListener {
            // Handle login logic here
        }

        futureStudentsButton.setOnClickListener {
            // Navigate to the Future Students screen
        }

        visitorsButton.setOnClickListener {
            // Navigate to the Visitors screen
        }
    }
}
