package com.greedygames.data.model


import com.google.gson.annotations.SerializedName

data class ApiImage(
    @SerializedName("kind")
    val kind: String,
    @SerializedName("data")
    val `data`: Data) {
    data class Data(
        @SerializedName("modhash")
        val modhash: String,
        @SerializedName("dist")
        val dist: Int,
        @SerializedName("children")
        val children: List<Children>,
        @SerializedName("after")
        val after: String,
        @SerializedName("before")
        val before: Any
    ) {
        data class Children(
            @SerializedName("kind")
            val kind: String,
            @SerializedName("data")
            val `data`: Data
        ) {
            data class Data(
                @SerializedName("approved_at_utc")
                val approvedAtUtc: Any,
                @SerializedName("subreddit")
                val subreddit: String,
                @SerializedName("selftext")
                val selftext: String,
                @SerializedName("author_fullname")
                val authorFullname: String,
                @SerializedName("saved")
                val saved: Boolean,
                @SerializedName("mod_reason_title")
                val modReasonTitle: Any,
                @SerializedName("gilded")
                val gilded: Int,
                @SerializedName("clicked")
                val clicked: Boolean,
                @SerializedName("title")
                val title: String,
                @SerializedName("link_flair_richtext")
                val linkFlairRichtext: List<LinkFlairRichtext>,
                @SerializedName("subreddit_name_prefixed")
                val subredditNamePrefixed: String,
                @SerializedName("hidden")
                val hidden: Boolean,
                @SerializedName("pwls")
                val pwls: Any,
                @SerializedName("link_flair_css_class")
                val linkFlairCssClass: String,
                @SerializedName("downs")
                val downs: Int,
                @SerializedName("thumbnail_height")
                val thumbnailHeight: Int,
                @SerializedName("hide_score")
                val hideScore: Boolean,
                @SerializedName("name")
                val name: String,
                @SerializedName("quarantine")
                val quarantine: Boolean,
                @SerializedName("link_flair_text_color")
                val linkFlairTextColor: String,
                @SerializedName("upvote_ratio")
                val upvoteRatio: Double,
                @SerializedName("author_flair_background_color")
                val authorFlairBackgroundColor: Any,
                @SerializedName("subreddit_type")
                val subredditType: String,
                @SerializedName("ups")
                val ups: Int,
                @SerializedName("total_awards_received")
                val totalAwardsReceived: Int,
                @SerializedName("media_embed")
                val mediaEmbed: MediaEmbed,
                @SerializedName("thumbnail_width")
                val thumbnailWidth: Int,
                @SerializedName("author_flair_template_id")
                val authorFlairTemplateId: Any,
                @SerializedName("is_original_content")
                val isOriginalContent: Boolean,
                @SerializedName("user_reports")
                val userReports: List<Any>,
                @SerializedName("secure_media")
                val secureMedia: Any,
                @SerializedName("is_reddit_media_domain")
                val isRedditMediaDomain: Boolean,
                @SerializedName("is_meta")
                val isMeta: Boolean,
                @SerializedName("category")
                val category: Any,
                @SerializedName("secure_media_embed")
                val secureMediaEmbed: SecureMediaEmbed,
                @SerializedName("link_flair_text")
                val linkFlairText: String,
                @SerializedName("can_mod_post")
                val canModPost: Boolean,
                @SerializedName("score")
                val score: Int,
                @SerializedName("approved_by")
                val approvedBy: Any,
                @SerializedName("author_premium")
                val authorPremium: Boolean,
                @SerializedName("thumbnail")
                val thumbnail: String,
                @SerializedName("edited")
                val edited: Boolean,
                @SerializedName("author_flair_css_class")
                val authorFlairCssClass: Any,
                @SerializedName("author_flair_richtext")
                val authorFlairRichtext: List<Any>,
                @SerializedName("gildings")
                val gildings: Gildings,
                @SerializedName("post_hint")
                val postHint: String,
                @SerializedName("content_categories")
                val contentCategories: Any,
                @SerializedName("is_self")
                val isSelf: Boolean,
                @SerializedName("mod_note")
                val modNote: Any,
                @SerializedName("created")
                val created: Double,
                @SerializedName("link_flair_type")
                val linkFlairType: String,
                @SerializedName("wls")
                val wls: Any,
                @SerializedName("removed_by_category")
                val removedByCategory: Any,
                @SerializedName("banned_by")
                val bannedBy: Any,
                @SerializedName("author_flair_type")
                val authorFlairType: String,
                @SerializedName("domain")
                val domain: String,
                @SerializedName("allow_live_comments")
                val allowLiveComments: Boolean,
                @SerializedName("selftext_html")
                val selftextHtml: Any,
                @SerializedName("likes")
                val likes: Any,
                @SerializedName("suggested_sort")
                val suggestedSort: Any,
                @SerializedName("banned_at_utc")
                val bannedAtUtc: Any,
                @SerializedName("view_count")
                val viewCount: Any,
                @SerializedName("archived")
                val archived: Boolean,
                @SerializedName("no_follow")
                val noFollow: Boolean,
                @SerializedName("is_crosspostable")
                val isCrosspostable: Boolean,
                @SerializedName("pinned")
                val pinned: Boolean,
                @SerializedName("over_18")
                val over18: Boolean,
                @SerializedName("preview")
                val preview: Preview,
                @SerializedName("all_awardings")
                val allAwardings: List<AllAwarding>,
                @SerializedName("awarders")
                val awarders: List<Any>,
                @SerializedName("media_only")
                val mediaOnly: Boolean,
                @SerializedName("link_flair_template_id")
                val linkFlairTemplateId: String,
                @SerializedName("can_gild")
                val canGild: Boolean,
                @SerializedName("spoiler")
                val spoiler: Boolean,
                @SerializedName("locked")
                val locked: Boolean,
                @SerializedName("author_flair_text")
                val authorFlairText: Any,
                @SerializedName("treatment_tags")
                val treatmentTags: List<Any>,
                @SerializedName("visited")
                val visited: Boolean,
                @SerializedName("removed_by")
                val removedBy: Any,
                @SerializedName("num_reports")
                val numReports: Any,
                @SerializedName("distinguished")
                val distinguished: Any,
                @SerializedName("subreddit_id")
                val subredditId: String,
                @SerializedName("mod_reason_by")
                val modReasonBy: Any,
                @SerializedName("removal_reason")
                val removalReason: Any,
                @SerializedName("link_flair_background_color")
                val linkFlairBackgroundColor: String,
                @SerializedName("id")
                val id: String,
                @SerializedName("is_robot_indexable")
                val isRobotIndexable: Boolean,
                @SerializedName("report_reasons")
                val reportReasons: Any,
                @SerializedName("author")
                val author: String,
                @SerializedName("discussion_type")
                val discussionType: Any,
                @SerializedName("num_comments")
                val numComments: Int,
                @SerializedName("send_replies")
                val sendReplies: Boolean,
                @SerializedName("whitelist_status")
                val whitelistStatus: Any,
                @SerializedName("contest_mode")
                val contestMode: Boolean,
                @SerializedName("mod_reports")
                val modReports: List<Any>,
                @SerializedName("author_patreon_flair")
                val authorPatreonFlair: Boolean,
                @SerializedName("author_flair_text_color")
                val authorFlairTextColor: Any,
                @SerializedName("permalink")
                val permalink: String,
                @SerializedName("parent_whitelist_status")
                val parentWhitelistStatus: Any,
                @SerializedName("stickied")
                val stickied: Boolean,
                @SerializedName("url")
                val url: String,
                @SerializedName("subreddit_subscribers")
                val subredditSubscribers: Int,
                @SerializedName("created_utc")
                val createdUtc: Double,
                @SerializedName("num_crossposts")
                val numCrossposts: Int,
                @SerializedName("media")
                val media: Any,
                @SerializedName("is_video")
                val isVideo: Boolean
            ) {
                data class LinkFlairRichtext(
                    @SerializedName("e")
                    val e: String,
                    @SerializedName("t")
                    val t: String
                )

                class MediaEmbed(
                )

                class SecureMediaEmbed(
                )

                class Gildings(
                )

                data class Preview(
                    @SerializedName("images")
                    val images: List<Image>,
                    @SerializedName("enabled")
                    val enabled: Boolean
                ) {
                    data class Image(
                        @SerializedName("source")
                        val source: Source,
                        @SerializedName("resolutions")
                        val resolutions: List<Resolution>,
                        @SerializedName("variants")
                        val variants: Variants,
                        @SerializedName("id")
                        val id: String
                    ) {
                        data class Source(
                            @SerializedName("url")
                            val url: String,
                            @SerializedName("width")
                            val width: Int,
                            @SerializedName("height")
                            val height: Int
                        )

                        data class Resolution(
                            @SerializedName("url")
                            val url: String,
                            @SerializedName("width")
                            val width: Int,
                            @SerializedName("height")
                            val height: Int
                        )

                        class Variants(
                        )
                    }
                }

                data class AllAwarding(
                    @SerializedName("giver_coin_reward")
                    val giverCoinReward: Any,
                    @SerializedName("subreddit_id")
                    val subredditId: Any,
                    @SerializedName("is_new")
                    val isNew: Boolean,
                    @SerializedName("days_of_drip_extension")
                    val daysOfDripExtension: Int,
                    @SerializedName("coin_price")
                    val coinPrice: Int,
                    @SerializedName("id")
                    val id: String,
                    @SerializedName("penny_donate")
                    val pennyDonate: Any,
                    @SerializedName("coin_reward")
                    val coinReward: Int,
                    @SerializedName("icon_url")
                    val iconUrl: String,
                    @SerializedName("days_of_premium")
                    val daysOfPremium: Int,
                    @SerializedName("icon_height")
                    val iconHeight: Int,
                    @SerializedName("resized_icons")
                    val resizedIcons: List<ResizedIcon>,
                    @SerializedName("icon_width")
                    val iconWidth: Int,
                    @SerializedName("start_date")
                    val startDate: Any,
                    @SerializedName("is_enabled")
                    val isEnabled: Boolean,
                    @SerializedName("description")
                    val description: String,
                    @SerializedName("end_date")
                    val endDate: Any,
                    @SerializedName("subreddit_coin_reward")
                    val subredditCoinReward: Int,
                    @SerializedName("count")
                    val count: Int,
                    @SerializedName("name")
                    val name: String,
                    @SerializedName("icon_format")
                    val iconFormat: Any,
                    @SerializedName("award_sub_type")
                    val awardSubType: String,
                    @SerializedName("penny_price")
                    val pennyPrice: Any,
                    @SerializedName("award_type")
                    val awardType: String
                ) {
                    data class ResizedIcon(
                        @SerializedName("url")
                        val url: String,
                        @SerializedName("width")
                        val width: Int,
                        @SerializedName("height")
                        val height: Int
                    )
                }
            }
        }
    }
}