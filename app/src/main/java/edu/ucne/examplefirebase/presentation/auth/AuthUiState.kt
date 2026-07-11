package edu.ucne.examplefirebase.presentation.auth

import com.google.firebase.auth.FirebaseUser

data class AuthUiState(
    val isLoading: Boolean = false,
    val user: FirebaseUser? = null,
    val errorMessage: String? = null
)