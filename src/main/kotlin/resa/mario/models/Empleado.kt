package resa.mario.models

import kotlinx.serialization.Serializable

@Serializable
data class Empleado(
    val id: Long,
    val name: String,
    val email: String,
    val avatar: String,
    val departamento: Departamento? = null
) {
    override fun toString(): String {
        return "Empleado(id=$id, name='$name', departamento=$departamento)"
    }
}
