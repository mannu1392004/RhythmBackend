package com.example.rhythm.mail

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.stereotype.Service
import org.springframework.mail.SimpleMailMessage


@Service
class EmailService(@Autowired private val mailSender: JavaMailSender) {
    fun sendMail(
        to: String,
    ){
        println(to)
        val message = SimpleMailMessage()
        message.from = "rhythm@dcrustm.org"
        message.setTo(to)
        message.subject = "Invitation to Participate in Rhythm 2024 – Annual Youth Cultural Fest"
        message.text = "Dear Sir/Madam,\n" +
                "\n" +
                "It is with great pleasure that we invite your esteemed institution to participate in Rhythm 2024, the Annual Youth Cultural Fest organized by Deenbandhu Chhotu Ram University of Science and Technology (DCRUST), Murthal, Sonepat. This prestigious event will take place from 20th to 22nd November 2024.\n" +
                "\n" +
                "Rhythm 2024 aims to provide a dynamic platform for students to showcase their creativity, talent, and cultural expression. We are confident that the involvement of your institution will significantly enrich the fest’s diversity and spirit.\n" +
                "\n" +
                "Registration Details\n" +
                "\n" +
                "Registration Link: https://forms.gle/dHvmsMgHqfmh6SMz8\n" +
                "Registration Fee: ₹100 per team\n" +
                "Deadline: 19th November 2024\n" +
                "Submission: Participants are required to submit the original registration form along with two photocopies at the registration counter by 9:30 AM on 20th November 2024.\n" +
                "\nThe official invitation letter and rule book can be accessed at the following link:\n" +
                "https://drive.google.com/drive/folders/1r_dbiInnp_OJMSnKBVS6dhK3WTkwI0qt?usp=sharing\n" +
                "It contains details of the events and guidelines for participation.\n" +
                "\n" +
                "For further queries or assistance, please feel free to contact:\n" +
                "\n" +
                "Khushi Pandey: +91 74270 55539\n" +
                "Naman Rathee: +91 77981 27096\n" +
                "\nWe look forward to your institution’s enthusiastic participation in Rhythm 2024, contributing to the celebration of art and culture on this vibrant platform.\n" +
                "\n" +
                "Warm regards,\n" +
                "\n" +
                "Dr. Manisha Manchanda\n" +
                "Cultural Coordinator\n" +
                "Deenbandhu Chhotu Ram University of Science and Technology\n" +
                "Murthal, Sonepat\n" +
                "Contact: +91 92155 23146"
        mailSender.send(message)
        println("Send ")
    }
}