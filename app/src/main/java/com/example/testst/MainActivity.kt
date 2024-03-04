import android.os.Bundle
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val mainLayout = RelativeLayout(this)
        mainLayout.layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        )
        mainLayout.id = R.id.home
        mainLayout.clipToOutline = true
        mainLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.white))

        // Status bar
        val statusBar = RelativeLayout(this)
        val statusBarParams = RelativeLayout.LayoutParams(
            dpToPx(390),
            dpToPx(44)
        )
        statusBarParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE)
        statusBarParams.leftMargin = dpToPx(13)
        statusBarParams.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE)
        statusBarParams.topMargin = dpToPx(2)
        statusBar.layoutParams = statusBarParams
        statusBar.clipToOutline = true

        val bellaOlonj = ImageView(this)
        bellaOlonj.id = R.id.bella_olonj
        val bellaOlonjParams = RelativeLayout.LayoutParams(
            dpToPx(170),
            dpToPx(147)
        )
        bellaOlonjParams.addRule(RelativeLayout.CENTER_HORIZONTAL, RelativeLayout.TRUE)
        bellaOlonjParams.addRule(RelativeLayout.CENTER_VERTICAL, RelativeLayout.TRUE)
        bellaOlonj.layoutParams = bellaOlonjParams
        bellaOlonj.setBackgroundResource(R.drawable.bella_olonj)

        // Author
        val authorProf = RelativeLayout(this)
        val authorProfParams = RelativeLayout.LayoutParams(
            dpToPx(401),
            dpToPx(56)
        )
        authorProfParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE)
        authorProfParams.leftMargin = dpToPx(13)
        authorProfParams.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE)
        authorProfParams.topMargin = dpToPx(192)
        authorProf.layoutParams = authorProfParams

        mainLayout.addView(statusBar)
        mainLayout.addView(bellaOlonj)
        mainLayout.addView(authorProf)
        setContentView(mainLayout)


        val keyFeatureLayout: RelativeLayout = findViewById(R.id.key_feature)
        keyFeatureLayout.layoutParams = RelativeLayout.LayoutParams(1301, 180)
        keyFeatureLayout.elevation = 4f

        val filmOnlineLayout: RelativeLayout = findViewById(R.id.film_online)
        filmOnlineLayout.layoutParams = RelativeLayout.LayoutParams(185, 25)

        val filmOnlineCustomLayout: RelativeLayout = findViewById(R.id.film_online_custom)
        filmOnlineCustomLayout.layoutParams = RelativeLayout.LayoutParams(462, 231)
        filmOnlineCustomLayout.setPadding(20, 0, 0, 677)
    }

    private fun dpToPx(dp: Int): Int {
        val density: Float = resources.displayMetrics.density
        return Math.round(dp * density)
    }
}

const communityText = document.createElement('TextView');
communityText.setAttribute('android:id', '@+id/community_w');
communityText.setAttribute('android:layout_width', '208dp');
communityText.setAttribute('android:layout_height', '24dp');
communityText.setAttribute('android:text', '@string/community_w');
communityText.setAttribute('android:textAppearance', '@style/community_w');
communityText.setAttribute('android:lineSpacingExtra', '5sp');
communityText.setAttribute('android:gravity', 'center_vertical');


const communityStyle = document.createElement('style');
communityStyle.innerHTML = `
#community_w {
    android:textSize: 16sp;
    android:textColor: #000000;
}
`;


const communityString = document.createElement('string');
communityString.setAttribute('name', 'community_w');
communityString.textContent = 'Scientific/Periodic Catalog';


const scientificLayout = document.createElement('RelativeLayout');
scientificLayout.setAttribute('xmlns:android', 'http://schemas.android.com/apk/res/android');
scientificLayout.setAttribute('android:id', '@+id/scientific_');
scientificLayout.setAttribute('android:layout_width', '462.87dp');
scientificLayout.setAttribute('android:layout_height', '231dp');
scientificLayout.setAttribute('android:layout_alignParentLeft', 'true');
scientificLayout.setAttribute('android:layout_marginLeft', '20dp');
scientificLayout.setAttribute('android:layout_alignParentTop', 'true');
scientificLayout.setAttribute('android:layout_marginTop', '1265dp');


const bookListinLayout = document.createElement('RelativeLayout');
bookListinLayout.setAttribute('xmlns:android', 'http://schemas.android.com/apk/res/android');
bookListinLayout.setAttribute('android:id', '@+id/book_listin');
bookListinLayout.setAttribute('android:layout_width', '193dp');
bookListinLayout.setAttribute('android:layout_height', '25dp');
bookListinLayout.setAttribute('android:layout_centerHorizontal', 'true');
bookListinLayout.setAttribute('android:layout_centerVertical', 'true');
bookListinLayout.setAttribute('android:background', '@drawable/book_listin');


const vectorDrawable = document.createElement('vector');
vectorDrawable.setAttribute('xmlns:android', 'http://schemas.android.com/apk/res/android');
vectorDrawable.setAttribute('xmlns:aapt', 'http://schemas.android.com/aapt');
vectorDrawable.setAttribute('android:width', '194.83dp');
vectorDrawable.setAttribute('android:height', '26.83dp');
vectorDrawable.setAttribute('android:viewportWidth', '194.83');
vectorDrawable.setAttribute('android:viewportHeight', '26.83');

const clipPathGroup = document.createElement('group');
const clipPath = document.createElement('clip-path');
clipPath.setAttribute('android:pathData', 'M8.22857 0.914286H186.6C190.64 0.914286 193.914 4.189 193.914 8.22857V18.6C193.914 22.6396 190.64 25.9143 186.6 25.9143H8.22857C4.189 25.9143 0.914286 22.6396 0.914286 18.6V8.22857C0.914286 4.189 4.189 0.914286 8.22857 0.914286Z');
clipPathGroup.appendChild(clipPath);


const path = document.createElement('path');
path.setAttribute('android:pathData', 'M8.22857 0.914286H186.6C190.64 0.914286 193.914 4.189 193.914 8.22857V18.6C193.914 22.6396 190.64 25.9143 186.6 25.9143H8.22857C4.189 25.9143 0.914286 22.6396 0.914286 18.6V8.22857C0.914286 4.189 4.189 0.914286 8.22857 0.914286Z');
path.setAttribute('android:strokeWidth', '1.83');
path.setAttribute('android:strokeColor', '#000000');
clipPathGroup.appendChild(path);

vectorDrawable.appendChild(clipPathGroup);


const bottomBarLayout = document.createElement('RelativeLayout');
bottomBarLayout.setAttribute('xmlns:android', 'http://schemas.android.com/apk/res/android');
bottomBarLayout.setAttribute('android:id', '@+id/bottom_bar');
bottomBarLayout.setAttribute('android:layout_width', '427dp');
bottomBarLayout.setAttribute('android:layout_height', '84dp');
bottomBarLayout.setAttribute('android:layout_alignParentLeft', 'true');
bottomBarLayout.setAttribute('android:layout_marginLeft', '-7dp');
bottomBarLayout.setAttribute('android:layout_alignParentTop', 'true');
bottomBarLayout.setAttribute('android:layout_marginTop', '1798dp');


document.body.appendChild(communityText);
document.body.appendChild(communityStyle);
document.body.appendChild(communityString);
document.body.appendChild(scientificLayout);
document.body.appendChild(bookListinLayout);
document.body.appendChild(vectorDrawable);
document.body.appendChild(bottomBarLayout);
