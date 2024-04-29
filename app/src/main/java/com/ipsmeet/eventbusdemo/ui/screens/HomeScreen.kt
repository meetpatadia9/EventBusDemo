package com.ipsmeet.eventbusdemo.ui.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ipsmeet.eventbusdemo.model.Product
import com.ipsmeet.eventbusdemo.ui.baseutils.ProductItem
import com.ipsmeet.eventbusdemo.ui.theme.EventBusDemoTheme

@Composable
fun HomeScreen() {
    val productList = arrayListOf<Product>().apply {
        add(Product(0, "Apple"))
        add(Product(1, "Banana"))
        add(Product(4, "Grapes"))
        add(Product(5, "Kiwi"))
        add(Product(3, "Mango"))
        add(Product(6, "Papaya"))
        add(Product(2, "Watermelon"))
    }

    LazyColumn {
        items(items = productList) {
            ProductItem(it.productName)
        }   // items
    }   // LazyRow
}

@Preview
@Composable
private fun PreviewHomeScreen() {
    EventBusDemoTheme {
        HomeScreen()
    }
}