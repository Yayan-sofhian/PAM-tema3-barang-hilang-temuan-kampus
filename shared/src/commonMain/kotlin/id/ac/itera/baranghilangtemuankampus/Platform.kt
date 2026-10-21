package id.ac.itera.baranghilangtemuankampus

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform