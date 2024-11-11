package com.example.seniorcapstoneappfe

import android.app.Application
import com.amazonaws.mobile.client.AWSMobileClient
import com.amazonaws.regions.Regions
import com.amazonaws.services.cognitoidentityprovider.CognitoUserPool

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        // Initialize AWS Cognito
        val awsMobileClient = AWSMobileClient.getInstance()
        awsMobileClient.initialize(this) {
            val userPoolConfig = CognitoUserPool.Builder()
                .clientId("287a4e53vrj0anmdl03bupqa5n")
                .poolId("us-east-2_WDDhh4cw6")
                .region(Regions.US_EAST_2)
                .build()
            awsMobileClient.userPool = userPoolConfig
        }.execute()
    }
}
