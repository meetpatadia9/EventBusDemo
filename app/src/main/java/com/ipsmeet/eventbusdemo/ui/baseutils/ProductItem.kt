package com.ipsmeet.eventbusdemo.ui.baseutils

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ipsmeet.eventbusdemo.ui.theme.EventBusDemoTheme

@Composable
fun ProductItem(productName: String) {
    val context = LocalContext.current

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = productName,
            fontSize = 21.sp
        )

        Button(onClick = {
            Toast.makeText(context, "$productName is added to cart!", Toast.LENGTH_SHORT).show()
        }) {
            Text(text = "Add to cart")
        }
    }   // Row
}

@Preview(showBackground = true)
@Composable
private fun PreviewProductItem() {
    EventBusDemoTheme {
        ProductItem("Product name")
    }
}