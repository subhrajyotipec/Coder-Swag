package com.subhra.coderswag.Services

import com.subhra.coderswag.Model.Category
import com.subhra.coderswag.Model.Product

/**
 * Created by subhra on 12/15/2017.
 */
object DataService{
    val categories= listOf(
            Category("HATS","shirtimage"),
            Category("SHIRT","haimage"),
            Category("HOODIE","hoodieimage")
    )
    val hats= listOf(
            Product("RED HAT","100 INR","hat01"),
            Product("SWAG HAT","200 INR","hat02"),
            Product("MAD HAT","150 INR","hat03"),
            Product("DON HAT","400 INR","hat04")
    )
    val shirt= listOf(
            Product("RED SHIRT","100 INR","shirt01"),
            Product("SWAG SHIRT","200 INR","shirt02"),
            Product("MAD SHIRT","150 INR","shirt03"),
            Product("DON SHIRT","400 INR","shirt04")
    )
    val hoodie= listOf(
            Product("RED HOODIE","100 INR","hoodie01"),
            Product("SWAG HOODIE","200 INR","hoodie02"),
            Product("MAD HOODIE","150 INR","hoodie03"),
            Product("DON HOODIE","400 INR","hoodie04")

    )

}