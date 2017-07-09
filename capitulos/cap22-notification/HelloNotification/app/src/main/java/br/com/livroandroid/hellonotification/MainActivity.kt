package br.com.livroandroid.hellonotification
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btNotificacao).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            NotificationUtil.create(this, 1, intent, "Livro Android", "Hello Notification")
        }
    }
}
