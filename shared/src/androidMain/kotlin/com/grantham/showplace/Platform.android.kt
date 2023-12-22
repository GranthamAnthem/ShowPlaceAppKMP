package com.grantham.showplace

import com.grantham.showplace.data.models.Band
import com.grantham.showplace.data.models.Show
import com.grantham.showplace.data.models.Venue
import kotlinx.datetime.Clock
import kotlinx.datetime.TimeZone
import kotlinx.datetime.todayIn

actual val BASE_URL = "http://10.0.2.2:8080"

actual val showPreview = Show(
    id = "5",
    lineup = "Metal, Fun Name, Great Band",
    venue = Venue(
        name = "Fun Venue",
        ageLimit = "none",
        accessibility = "blah",
        url = "",
        capacity = ""
    ),
    time = "9pm",
    date = Clock.System.todayIn(TimeZone.currentSystemDefault()).toString(),
    price = "Free"
)
