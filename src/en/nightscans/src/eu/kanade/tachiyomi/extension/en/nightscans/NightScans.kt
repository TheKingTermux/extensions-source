package eu.kanade.tachiyomi.extension.en.nightscans

import eu.kanade.tachiyomi.multisrc.mangathemesia.MangaThemesiaAlt
import eu.kanade.tachiyomi.network.interceptor.rateLimit
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

class NightScans : MangaThemesiaAlt("NIGHT SCANS", "https://night-scans.net", "en", "/series") {

    override val client: OkHttpClient = super.client.newBuilder()
        .rateLimit(20, 4, TimeUnit.SECONDS)
        .build()
}
