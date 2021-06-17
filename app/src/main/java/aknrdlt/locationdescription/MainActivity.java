package aknrdlt.locationdescription;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static ArrayList<String> list = new ArrayList<>();
    private static ArrayList<ImageView> iv_list = new ArrayList<>();
    private static ArrayList<String> descriptionList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list.add("Land of Earth");
        list.add("Land of Fire");
        list.add("Land of Iron");
        list.add("Land of Lightning");
        list.add("Land of Snow");
        list.add("Land of Sound");
        list.add("Land of Water");
        list.add("Land of Wind");
        list.add("Land of the Sky");

        ArrayList<TextView> tv_list = new ArrayList<>();
        int j = 1;
        for(int i = 0;i < list.size();i++){
            String id = "tv_country_" + j;
            int resID = getResources().getIdentifier(id, "id", getPackageName());
            tv_list.add(findViewById(resID));
            j++;
        }
        for(int i = 0;i < list.size();i++){
            tv_list.get(i).setText(list.get(i));
        }

        ArrayList<Button> bt_list = new ArrayList<>();
        for(int i = 1;i <= 9;i++){
            String id = "bt_" + i;
            int resID = getResources().getIdentifier(id, "id", getPackageName());
            bt_list.add(findViewById(resID));
            bt_list.get(i - 1).setOnClickListener(this);
        }
        for(int i = 1;i <= 9;i++){
            String id = "land_view_" + i;
            int resID = getResources().getIdentifier(id, "id", getPackageName());
            iv_list.add(findViewById(resID));
        }

        descriptionList.add("   The Land of Earth (土の国, Tsuchi no Kuni) has seen little attention in the series thus far. It is located north-west of the Land of Fire. Its government leader is the Earth Daimyō. The country is mostly comprised of desolate, rocky areas. The border of the Land of Earth runs along a rocky mountain range, blocking communication with other countries. The wind blowing from the north passes over these mountains, carrying small rocks from the Land of Earth to the surrounding countries. This famous natural phenomenon is called \"Rock Rain\" (岩雨, Gan'u).");
        descriptionList.add("   The Land of Fire (火の国, Hi no Kuni) is one of the largest and most powerful countries seen, and is the home of the main characters of the series. Its government leader is the Fire Daimyō. The Land of Fire was the first country to adopt a ninja village, Konohagakure, a custom other countries would soon adopt. The Land of Fire is appropriately oriented towards the element of fire, typically having very bright and warm weather. While not the physically largest country, it has the largest hidden village.");
        descriptionList.add("   The Land of Iron (鉄の国, Tetsu no Kuni) is an icy, snow-covered country located among three mountains called the Three Wolves (三狼, Sanrō). Unlike other countries of the world whose militaries use shinobi, the Land of Iron's military is made up of samurai. Due to the differing ideologies between shinobi and samurai – as well as the fact that the Land of Iron's samurai are quite formidable – there is an agreement among shinobi not to interfere with the Land of Iron.");
        descriptionList.add("   The Land of Lightning (雷の国, Kaminari no Kuni) is located on a peninsula north-east of the Land of Fire and is one of the Five Great Shinobi Countries. Its government leader is the Lightning Daimyō. In the centre of the country are vast mountain ranges, whose many thunderstorms are said to give the country its name. From these mountain ranges, many rivers flow to the sea, creating a very crooked coastline that displays an impressive oceanic beauty. There are many hot springs located within the country. The country's western border with the Land of Frost has a large desert.");
        descriptionList.add("   The Land of Snow (雪の国, Yuki no Kuni) is a nation introduced in Naruto the Movie: Ninja Clash in the Land of Snow, that is also briefly mentioned in the anime and in the Hiden novels.Originally, the country was a small, but peaceful place. However, it was taken over by a tyrant, Dotō Kazahana, after he and his mercenaries killed his older brother and predecessor, Sōsetsu Kazahana.");
        descriptionList.add("   The Land of Sound (音の国, Oto no Kuni) is a neighbouring country of the Land of Fire. It is a relatively new country in the political scene, though it has existed for some time under the name of the Land of Rice Fields (田の国, Ta no Kuni, English TV: Land of Rice Paddies). According to the anime, Orochimaru conquered the country and convinced its daimyō to let him establish his own ninja village.");
        descriptionList.add("   The Land of Water (水の国, Mizu no Kuni) also known as the \"Land of Mist\" (霧の国, Kiri no Kuni).[9][10] It is composed of many islands, with each having its own unique traditions. The country's weather is typically cool and the islands are usually covered by mist. The islands themselves also feature many lakes. In some places, like the area where Haku grew up, it is very cold and snows quite a bit. The nation is oriented towards the element of water. Its government leader is the Water Daimyō.");
        descriptionList.add("   The Land of Wind (風の国, Kaze no Kuni) is one of the more prominent countries in the series. It is located to the south-west of the Land of Fire and borders the Land of Rivers and Amegakure. Its government leader is the Wind Daimyō. The country covers a vast realm, but is significantly composed of deserts and thus has little productivity.[11] Because there is very little rainfall throughout the year, the people of the country live in villages built on one of the desert's many oases. Despite the country's extremely harsh environment, it has a large population. Although they have warred with each other in the past, the Land of Wind is now on good terms with the Land of Fire, with a great deal of trade going on between the two countries.");
        descriptionList.add("   The Land of the Sky (空の国, Sora no Kuni) is a country featured in Naruto Shippūden the Movie: Bonds. It was formed by ninja from several countries that could mould their chakra into mist in order to fly. It is said that they fought in the Second Shinobi World War, and their hidden village was destroyed in the war by Konohagakure for challenging the Five Great Shinobi Countries, but the country itself survived. They apparently have quite the reputation as Tsunade was terrified that the descendants of the survivors were attacking Konohagakure, which was devastated due to a powerful and unexpected air raid. Shinnō is a prominent member of this country.");

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, LandActivity.class);
        switch (v.getId()) {
            case R.id.bt_1:
                intent.putExtra(Intent.EXTRA_TEXT, list.get(0));
                intent.putExtra("1", R.drawable.land_view_1);
                intent.putExtra("11", descriptionList.get(0));
                break;
            case R.id.bt_2:
                intent.putExtra(Intent.EXTRA_TEXT, list.get(1));
                intent.putExtra("2", R.drawable.land_view_2);
                intent.putExtra("12", descriptionList.get(1));
                break;
            case R.id.bt_3:
                intent.putExtra(Intent.EXTRA_TEXT, list.get(2));
                intent.putExtra("3", R.drawable.land_view_3);
                intent.putExtra("13", descriptionList.get(2));
                break;
            case R.id.bt_4:
                intent.putExtra(Intent.EXTRA_TEXT, list.get(3));
                intent.putExtra("4", R.drawable.land_view_4);
                intent.putExtra("14", descriptionList.get(3));
                break;
            case R.id.bt_5:
                intent.putExtra(Intent.EXTRA_TEXT, list.get(4));
                intent.putExtra("5", R.drawable.land_view_5);
                intent.putExtra("15", descriptionList.get(4));
                break;
            case R.id.bt_6:
                intent.putExtra(Intent.EXTRA_TEXT, list.get(5));
                intent.putExtra("6", R.drawable.land_view_6);
                intent.putExtra("16", descriptionList.get(5));
                break;
            case R.id.bt_7:
                intent.putExtra(Intent.EXTRA_TEXT, list.get(6));
                intent.putExtra("7", R.drawable.land_view_7);
                intent.putExtra("17", descriptionList.get(6));
                break;
            case R.id.bt_8:
                intent.putExtra(Intent.EXTRA_TEXT, list.get(7));
                intent.putExtra("8", R.drawable.land_view_8);
                intent.putExtra("18", descriptionList.get(7));
                break;
            case R.id.bt_9:
                intent.putExtra(Intent.EXTRA_TEXT, list.get(8));
                intent.putExtra("9", R.drawable.land_view_9);
                intent.putExtra("19", descriptionList.get(8));
                break;
            default:
                break;
        }
        startActivity(intent);
    }
}