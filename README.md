# Meri

<?xml version = "1.0" encoding = "utf-8"?>
<resources>
<LinearLayout xmlns:android="https://schemas.android.com/apk/res/android"
xmlns:tools = "http://schemas.android.com/tools"
android:layout_width = "match_parent"
android:layout_height = "match_parent"
android:orientation = "vertical"
android:padding = "16dp"
tools:context = ".Start">

<EditText
android:id = "@+id/email_input"
android:layout_width = "match_parent"
android:layout_height = "wrap-content"
android:hint = "Enter your email address."
android:inputType = "textEmailAddress"
android:padding = "12dp"
/>

<Button 
android:id = "@+id/reset_button"
android:layout_width = "match-parent"
android:layout_height = "wrap_content"
android:text = "Reset password"
android:backgroundTint = "@color/teal_700"
android:textColor = "@android:color/white"
android:padding = "12dp"
android: layout_marginTop = "10dp"
/>

<ProgressBar
android:id = "@+id/progress_bar"
android:layout_width = "wrap_content"
android:layout_height = "wrap_content"
android:visibility = "gone"
android:layout_gravity = "center"
android:layout_marginTop = "10dp"
/>
</LinearLayout>
</resources>

