package com.example.adaptivelayoutdemo

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Contact(
    val name: String,
    val phone: String,
    val email: String,
    val address: String,
    val website: String,
) : Parcelable

val dummyContacts = listOf(
    Contact(
        "John Doe",
        "555-123-4567",
        "john.doe@example.com",
        "123 Main St, Anytown, CA 12345",
        "www.johndoe.com"
    ),
    Contact(
        "Jane Smith",
        "555-234-5678",
        "jane.smith@example.com",
        "456 Elm St, Anytown, CA 12345",
        "www.janesmith.com"
    ),
    Contact(
        "Bob Jones",
        "555-345-6789",
        "bob.jones@example.com",
        "789 Oak St, Anytown, CA 12345",
        "www.bobjones.com"
    ),
    Contact(
        "Alice Brown",
        "555-456-7890",
        "alice.brown@example.com",
        "1011 Pine St, Anytown, CA 12345",
        "www.alicebrown.com"
    ),
    Contact(
        "Tom Green",
        "555-567-8901",
        "tom.green@example.com",
        "1213 Cedar St, Anytown, CA 12345",
        "www.tomgreen.com"
    ),
    Contact(
        "Mary Johnson",
        "555-678-9012",
        "mary.johnson@example.com",
        "1415 Birch St, Anytown, CA 12345",
        "www.maryjohnson.com"
    ),
    Contact(
        "David Wilson",
        "555-789-0123",
        "david.wilson@example.com",
        "1617 Maple St, Anytown, CA 12345",
        "www.davidwilson.com"
    ),
    Contact(
        "Sarah Thompson",
        "555-890-1234",
        "sarah.thompson@example.com",
        "1819 Oakwood Ln, Anytown, CA 12345",
        "www.sarahthompson.com"
    ),
    Contact(
        "Michael Brown",
        "555-901-2345",
        "michael.brown@example.com",
        "2021 Pinewood Dr, Anytown, CA 12345",
        "www.michaelbrown.com"
    ),
    Contact(
        "Jessica Garcia",
        "555-012-3456",
        "jessica.garcia@example.com",
        "2223 Cedarwood Ct, Anytown, CA 12345",
        "www.jessicagarcia.com"
    ),
    Contact(
        "Matthew Smith",
        "555-112-4567",
        "matthew.smith@example.com",
        "2425 Birchwood Ln, Anytown, CA 12345",
        "www.matthewsmith.com"
    ),
    Contact(
        "Ashley Rodriguez",
        "555-223-5678",
        "ashley.rodriguez@example.com",
        "2627 Maplewood Dr, Anytown, CA 12345",
        "www.ashleyrodriguez.com"
    ),
    Contact(
        "Christopher Johnson",
        "555-334-6789",
        "christopher.johnson@example.com",
        "2829 Oakwood Ln, Anytown, CA 12345",
        "www.christopherjohnson.com"
    ),
    Contact(
        "Amanda Brown",
        "555-445-7890",
        "amanda.brown@example.com",
        "3031 Pinewood Dr, Anytown, CA 12345",
        "www.amandabrown.com"
    ),
    Contact(
        "Daniel Garcia",
        "555-556-8901",
        "daniel.garcia@example.com",
        "3233 Cedarwood Ct, Anytown, CA 12345",
        "www.danielgarcia.com"
    ),
    Contact(
        "Lauren Smith",
        "555-667-9012",
        "lauren.smith@example.com",
        "3435 Birchwood Ln, Anytown, CA 12345",
        "www.laurensmith.com"
    ),
    Contact(
        "David Johnson",
        "555-778-0123",
        "david.johnson@example.com",
        "3637 Maplewood Dr, Anytown, CA 12345",
        "www.davidjohnson.com"
    ),
    Contact(
        "Sarah Thompson",
        "555-889-1234",
        "sarah.thompson@example.com",
        "3839 Oakwood Ln, Anytown, CA 12345",
        "www.sarahthompson.com"
    ),
    Contact(
        "Michael Brown",
        "555-990-2345",
        "michael.brown@example.com",
        "4041 Pinewood Dr, Anytown, CA 12345",
        "www.michaelbrown.com"
    ),
    Contact(
        "Jessica Garcia",
        "555-001-3456",
        "jessica.garcia@example.com",
        "4243 Cedarwood Ct, Anytown, CA 12345",
        "www.jessicagarcia.com"
    ),
    Contact(
        "Matthew Smith",
        "555-112-4567",
        "matthew.smith@example.com",
        "4445 Birchwood Ln, Anytown, CA 12345",
        "www.matthewsmith.com"
    ),
    Contact(
        "Ashley Rodriguez",
        "555-223-5678",
        "ashley.rodriguez@example.com",
        "4647 Maplewood Dr, Anytown, CA 12345",
        "www.ashleyrodriguez.com"
    ),
    Contact(
        "Christopher Johnson",
        "555-334-6789",
        "christopher.johnson@example.com",
        "4849 Oakwood Ln, Anytown, CA 12345",
        "www.christopherjohnson.com"
    ),
    Contact(
        "Amanda Brown",
        "555-445-7890",
        "amanda.brown@example.com",
        "5051 Pinewood Dr, Anytown, CA 12345",
        "www.amandabrown.com"
    ),
    Contact(
        "Daniel Garcia",
        "555-556-8901",
        "daniel.garcia@example.com",
        "5253 Cedarwood Ct, Anytown, CA 12345",
        "www.danielgarcia.com"
    ),
    Contact(
        "Lauren Smith",
        "555-667-9012",
        "lauren.smith@example.com",
        "5455 Birchwood Ln, Anytown, CA 12345",
        "www.laurensmith.com"
    ),
    Contact(
        "David Johnson",
        "555-778-0123",
        "david.johnson@example.com",
        "5657 Maplewood Dr, Anytown, CA 12345",
        "www.davidjohnson.com"
    ),
    Contact(
        "Sarah Thompson",
        "555-889-1234",
        "sarah.thompson@example.com",
        "5859 Oakwood Ln, Anytown, CA 12345",
        "www.sarahthompson.com"
    ),
    Contact(
        "Michael Brown",
        "555-990-2345",
        "michael.brown@example.com",
        "6061 Pinewood Dr, Anytown, CA 12345",
        "www.michaelbrown.com"
    ),
    Contact(
        "Jessica Garcia",
        "555-001-3456",
        "jessica.garcia@example.com",
        "6263 Cedarwood Ct, Anytown, CA 12345",
        "www.jessicagarcia.com"
    ),
    Contact(
        "Matthew Smith",
        "555-112-4567",
        "matthew.smith@example.com",
        "6465 Birchwood Ln, Anytown, CA 12345",
        "www.matthewsmith.com"
    ),
    Contact(
        "Ashley Rodriguez",
        "555-223-5678",
        "ashley.rodriguez@example.com",
        "6667 Maplewood Dr, Anytown, CA 12345",
        "www.ashleyrodriguez.com"
    ),
    Contact(
        "Christopher Johnson",
        "555-334-6789",
        "christopher.johnson@example.com",
        "6869 Oakwood Ln, Anytown, CA 12345",
        "www.christopherjohnson.com"
    ),
    Contact(
        "Amanda Brown",
        "555-445-7890",
        "amanda.brown@example.com",
        "7071 Pinewood Dr, Anytown, CA 12345",
        "www.amandabrown.com"
    ),
    Contact(
        "Daniel Garcia",
        "555-556-8901",
        "daniel.garcia@example.com",
        "7273 Cedarwood Ct, Anytown, CA 12345",
        "www.danielgarcia.com"
    ),
    Contact(
        "Lauren Smith",
        "555-667-9012",
        "lauren.smith@example.com",
        "7475 Birchwood Ln, Anytown, CA 12345",
        "www.laurensmith.com"
    ),
    Contact(
        "David Johnson",
        "555-778-0123",
        "david.johnson@example.com",
        "7677 Maplewood Dr, Anytown, CA 12345",
        "www.davidjohnson.com"
    ),
    Contact(
        "Sarah Thompson",
        "555-889-1234",
        "sarah.thompson@example.com",
        "7879 Oakwood Ln, Anytown, CA 12345",
        "www.sarahthompson.com"
    ),
)
