package cz.slevomat.dominika.htmldisplayer.ProductDisplayer.RecyclerViewItems

import android.text.SpannableString
import android.text.method.LinkMovementMethod
import com.xwray.groupie.kotlinandroidextensions.Item
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import cz.slevomat.dominika.htmldisplayer.R
import kotlinx.android.synthetic.main.list_item.*

/**
 * Groupie item for a list item
 * @param liLevel defines level (padding) of the list item
 */
class ListItem (private val text: SpannableString?, private val liLevel: Int) : Item() {

    override fun getLayout() = R.layout.list_item

    override fun bind(viewHolder: ViewHolder, position: Int) {
        val view = viewHolder.text_view_list
        view.setPadding(liLevel * 50, 0,0,0)
        viewHolder.text_view_list.movementMethod = LinkMovementMethod.getInstance()
        viewHolder.text_view_list.text = text
    }
}