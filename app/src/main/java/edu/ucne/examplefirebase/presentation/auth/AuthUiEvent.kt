package edu.ucne.examplefirebase.presentation.auth

import android.content.Context

sealed class AuthUiEvent {
    data class SignInWithGoogle(val context: Context) : AuthUiEvent()
    object SignOut : AuthUiEvent()
}