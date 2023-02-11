package resa.mario.models

import java.time.LocalDateTime

data class Usuario(
    val id: Long,
    val username: String,
    val password: String,
    var role: Role = Role.USER,
    val createdAt: LocalDateTime = LocalDateTime.now(),
) {
    enum class Role {
        USER, ADMIN
    }
}