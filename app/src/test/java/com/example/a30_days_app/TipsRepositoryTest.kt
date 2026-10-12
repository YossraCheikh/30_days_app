package com.example.a30_days_app

import com.example.a30_days_app.data.TipsRepository
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class TipsRepositoryTest {

    @Test
    fun repository_containsThirtyTips() {
        val tips = TipsRepository.tips
        assertEquals(30, tips.size)
    }

    @Test
    fun repository_tipsHaveSequentialDayNumbers() {
        val tips = TipsRepository.tips
        for (i in tips.indices) {
            assertEquals(i + 1, tips[i].dayNumber)
        }
    }

    @Test
    fun repository_allTipsHaveValidResourceIds() {
        val tips = TipsRepository.tips
        for (tip in tips) {
            assertTrue("dayRes should not be 0", tip.dayRes != 0)
            assertTrue("titleRes should not be 0", tip.titleRes != 0)
            assertTrue("imageRes should not be 0", tip.imageRes != 0)
            assertTrue("descriptionRes should not be 0", tip.descriptionRes != 0)
        }
    }
}
