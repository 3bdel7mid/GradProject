package com.example.gradproject.models

class SignInModel {

    var mobileNumber : Int
    lateinit var password : String

    constructor(mobileNumber: Int, password: String) {
        this.mobileNumber = mobileNumber
        this.password = password
    }
}