package com.example.a30_days_app.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * Represents a single daily wellness tip item.
 *
 * @param dayNumber Day index (1 to 30)
 * @param dayRes String resource for the day label (e.g. "Day 1" / "Jour 1")
 * @param titleRes String resource for the tip title
 * @param imageRes Drawable resource for the tip vector graphic
 * @param descriptionRes String resource for the tip detailed description
 */
data class Tip(
    val dayNumber: Int,
    @StringRes val dayRes: Int,
    @StringRes val titleRes: Int,
    @DrawableRes val imageRes: Int,
    @StringRes val descriptionRes: Int
)
