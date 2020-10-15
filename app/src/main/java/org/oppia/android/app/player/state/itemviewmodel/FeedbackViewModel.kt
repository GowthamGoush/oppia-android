package org.oppia.android.app.player.state.itemviewmodel

import org.oppia.android.util.parser.HtmlParser

/** [StateItemViewModel] for feedback blurbs. */
class FeedbackViewModel(
  val htmlContent: CharSequence,
  val gcsResourceName: String,
  val gcsEntityType: String,
  val gcsEntityId: String,
  val hasConversationView: Boolean,
  val isSplitView: Boolean,
  val supportsConceptCards: Boolean,
  val customOppiaTagActionListener: HtmlParser.CustomOppiaTagActionListener
) : StateItemViewModel(ViewType.FEEDBACK)
