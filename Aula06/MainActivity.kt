class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton = findViewById<Button>(R.id.login_button)
        val closePopup = findViewById<Button>(R.id.close_popup)
        val errorOverlay = findViewById<View>(R.id.error_overlay)
        val errorPopup = findViewById<View>(R.id.error_popup)

        loginButton.setOnClickListener {
            val username = findViewById<EditText>(R.id.username).text.toString()
            val password = findViewById<EditText>(R.id.password).text.toString()

            if (username != "admin" || password != "1234") {
                //MOSTRAR POPUP    
            }
        }

        closePopup.setOnClickListener {
            //ESCONDER POPUP
        }
    }
}
