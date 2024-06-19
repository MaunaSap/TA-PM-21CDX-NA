import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class activity_transaction : AppCompatActivity() {

    private lateinit var editTextQuantity: EditText
    private lateinit var buttonBook: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transaction)

        editTextQuantity = findViewById(R.id.editTextQuantity)
        buttonBook = findViewById(R.id.buttonBook)

        buttonBook.setOnClickListener {
            val quantity = editTextQuantity.text.toString().toIntOrNull()

            if (quantity != null && quantity > 0) {
                // Example: Perform booking or transaction logic here
                // You can add your own implementation
                // For simplicity, we just show a toast message
                Toast.makeText(this, "Booking for $quantity people confirmed!", Toast.LENGTH_SHORT).show()
            } else {
                // Handle invalid input (e.g., quantity not entered)
                Toast.makeText(this, "Please enter a valid quantity", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
