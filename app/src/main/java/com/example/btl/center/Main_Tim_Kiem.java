package com.example.btl.center;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

import com.example.btl.R;

import java.util.ArrayList;
import java.util.List;

public class Main_Tim_Kiem extends AppCompatActivity  {
    RecyclerView rcvfood;
    private FoodAdapter foodAdapter;
    private SearchView searchView;

    private List<foodatv> foodatvList = new ArrayList<>();

    private List<foodatv> deletedFood = new ArrayList<>();
    private List<foodatv> archivedFood = new ArrayList<>();

    private int archivedCounter = 0;
    private int deletedCounter = 0;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tim_kiem);
        rcvfood= findViewById(R.id.rcv_food);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rcvfood.setLayoutManager(linearLayoutManager);

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        rcvfood.addItemDecoration(itemDecoration);


        foodAdapter = new FoodAdapter( this,getListFood());
        rcvfood.setAdapter(foodAdapter);
    }

    public List<foodatv> getListFood() {
        List<foodatv> list = new ArrayList<>();
        //1
        list.add(new foodatv(R.drawable.rangcom, "Cơm Rang Thập Cẩm",
                "Nguyên liệu",
                "\u2022  2 quả trứng\n\u2022  150g dưa chua, thái khúc \n\u2022  2 chén cơm nguội\n\u2022  200g đậu que\n\u2022  200g lạp xưởng\n\u2022  Gia vị nêm nếm: đường, hạt nêm, muối, xì dầu, dầu hào",
                "Cách làm",
                "\u2022 Đun nóng dầu trong chảo, cho hành tây băm nhỏ vào phi thơm. Cho hỗn hợp rau đã nguội vào xào. Nêm gia vị vừa ăn. Thêm giò, đảo đều đến khi chín vừa. \n\n\u2022 Vẫn chiếc chảo đó, thêm một ít dầu ăn vào. Khi dầu sôi cho hành tây thái hạt lựu và đảo đều. Để lửa lớn, cho cơm vào rang. Thêm 1 chút dầu hào, xì dầu, tương ớt, gia vị vừa ăn. \n\n\u2022 Cho hỗn hợp rau đã xào lúc trước vào chảo, đảo đều tay. Sau đó thấy cơm được thì tắt bếp. Cơm rang ngon hơn nên dùng cơm khi còn nóng.",
                "ngon vô cùng luôn"));
        //2
        list.add(new foodatv(R.drawable.canhkimchi1, "Canh kim chi",
                "Nguyên liệu",
                "\u2022  Thịt ba chỉ 200 gr\n\u2022 Kim chi 200 gr  \n\u2022  Gia vị thông dụng \n\u2022  1 ít(đường/ muối/ tiêu xay)",
                "Cách làm",
                "\u2022 200gr đem cắt thành từng miếng nhỏ vừa miệng." +
                        "\n\n\u2022 200gr kim chi cắt thành từng khúc nhỏ dài khoảng ngón tay cái, phần nước kim chi bạn giữ lại cho vào bát riêng nhé!" +
                        "\n\n\u2022 Bật bếp với lửa lớn, bạn cho thịt vào cùng 1/2 muỗng cà phê muối, 1/2 muỗng cà phê tiêu, sau đó xào sơ qua khoảng 2 - 3 phút cho thịt săn lại. Tiếp theo, bạn cho phần kim chi vào, đảo đều cho thịt và kim chi thấm đều vào nhau khoảng 2 phút." +
                        "\n\n\u2022 Bạn cho 80ml nước kim chi vào cùng 250ml nước ấm. Sau khoảng 7 - 10 phút, nước canh bắt đầu sôi, bạn hạ lửa nhỏ và đậy nắp lại nấu thêm 15 phút." +
                        "\n\n\u2022 Sau đó mở nắp, nêm thêm 1 muỗng cà phê đường cho vừa ăn là có thể tắt bếp.",
                "ngon vô cùng luôn"));
        //3
        list.add(new foodatv(R.drawable.banhxeo1, "Bánh xèo",
                "Nguyên liệu","\u2022  200gr bột gạo khô\n" +
                "\n\u2022 10gr bột nghệ\n" +
                "\n\u2022  200gr thịt lợn\n" +
                "\n\u2022  200gr tôm\n" +
                "\n\u2022  100gr giá đỗ\n" +
                "\n\u2022  Rau sống ăn bánh xèo các loại\n" +
                "\n\u2022  Gia vị: muối, đường, tiêu, hành tím, gừng, hành lá",
                "Cách làm",
                "\u2022 Để pha bột làm bánh xèo, bạn trộn 200gr bột gạo, 10gr bột nghệ, 250ml nước lọc, 100ml bia, 1 muỗng cà phê muối với hành lá băm lại, khuấy bột cho thật đều tay để bột tan hết.200gr kim chi cắt thành từng khúc nhỏ dài khoảng ngón tay cái, phần nước kim chi bạn giữ lại cho vào bát riêng nhé!" +
                        "\n\n\u2022 Bắc chảo lên bếp và cho vào một lớp dầu mỏng. Sau khi dầu nóng, bạn múc muỗng canh bột vừa và tráng đều chảo." +
                        "\n\n\u2022 Sau đó, cho thêm một ít nhân và giá vào. Để lửa nhỏ, đợi khoảng 2 phút cho vỏ bánh khô giòn rồi bạn gấp đôi bánh lại hong thêm một chút và để bánh ra dĩa.",
                "ngon vô cùng luôn"));


        //4
        list.add(new foodatv(R.drawable.suon1, "Sườn nướng tảng",
                "Nguyên liệu",
                "\u2022  800g sườn non nguyên tảng" +
                        "\n\u2022 Gia vị: Đường cát vàng, muối, bột ngọt, bột tỏi, bột nghệ, bột ớt, tiêu xay, ngũ vị hương, dầu hào, tương ớt xí muội, xốt ướp thịt nướng.",
                "Cách làm",
                "\u2022 Sườn sau khi mua về bạn rửa sạch với nước muối loãng, sau đó rửa lại với nước sạch rồi để ráo." +
                        "\n\u2022 Đầu tiên, bạn cho 2 muỗng canh đường cát vàng, 1 muỗng canh muối, 1 muỗng canh bột ngọt, ½ muỗng canh bột tỏi, ½ muỗng canh bột nghệ, ½ muỗng canh bột ớt, 1 muỗng cà phê tiêu xay và 1 muỗng cà phê ngũ vị hương vào chén riêng. Sau đó bạn trộn đều hỗn hợp." +
                        "\n\\u2022 Đầu tiên, bạn cần làm nóng lò nướng ở 180 độ C trong khoảng 10 phút. Sau đó, bạn dùng giấy bạc bọc kín sườn rồi cho vào lò nướng tầm 50 phút." +
                        "\n\u2022 Tiếp đến bạn cho sườn vào lại lò nướng và nướng trong 15 phút ở 250 độ C." +
                        "\n\u2022 Sau khi nướng lần 2, bạn lấy sườn ra khỏi lò, gỡ giấy bạc ra và phết gia vị lên mặt còn lại của sườn rồi bọc giấy bạc lại sau đó cho vào lò nướng ở nhiệt độ 250 độ C trong khoảng 15 phút.",
                "ngon vô cùng luôn"));

        list.add(new foodatv(R.drawable.mi1, "Mì trứng",
                "Nguyên liệu",
                "\u2022  Mì tôm 1 gói" +
                        "\n\u2022 Tôm 3 con" +
                        "\n\u2022  Trứng gà 1 quả" +
                        "\n\u2022  Dầu ớt 1 muỗng cà phê" +
                        "\n\u2022  Hành lá 1 í" +
                        "\n\u2022  Ớt bột 1 ít",
                "Cách làm",
                "\u2022 Tôm bạn rửa thật sạch với nước rồi cẩn thận lột bỏ phần vỏ tôm.200gr kim chi cắt thành từng khúc nhỏ dài khoảng ngón tay cái, phần nước kim chi bạn giữ lại cho vào bát riêng nhé!" +
                        "\n\u2022 Bắc nồi lên bếp, cho vào khoảng 200ml nước, đổ gói rau củ khô nằm trong gói mì vào. Thả mì vào luộc trong khoảng 3 phút rồi cho cho gói gia vị vào." +
                        "\n\u2022 Dùng nĩa từ từ làm tơi phần mì này ra, cho 3 con tôm, cẩn thận đập 1 quả trứng gà và thêm 1 muỗng cà phê dầu ớt. Đậy nắp lai và nấu thêm 2 phút nữa thì tắt bếp." +
                        "\n\u2022 Gắp mì tôm và topping cho vào chén rồi rưới nước mì vào. Cẩn thận cho đặt trứng lên trên cùng, trộn đều và thưởng thức nhé!",
                "ngon vô cùng luôn"));

        list.add(new foodatv(R.drawable.dau1, "Nước dâu",
                "Nguyên liệu",
                "\u2022  Dâu tây tươi: 200gr" +
                        "\n\u2022 Đường cát: 20gr" +
                        "\n\u2022  Nước đường cát: 30 ml" +
                        "\n\u2022  Nước cốt chanh: 5 ml" +
                        "\n\u2022  Vài giọt syrup hoa bụp giấm (nếu có)" +
                        "\n\u2022  Đá viên",
                "Cách làm",
                "\u2022 Dâu tây chọn những quả tươi ngon, bỏ cuống, ngâm với chút muối, rửa lại với nước sạch rồi để ráo. Bạn cắt dâu tây thành những miếng nhỏ mang đi ướp với 2 muỗng đường cát trước khi làm nước ép." +
                        "\n\u2022 Cho dâu tây đã ướp đường vào máy ép, ép lấy nước. Nếu không có máy ép bạn có thể xay nhuyễn dâu rồi lọc lấy nước cốt, bỏ phần bã đi." +
                        "\n\u2022 Cho nước ép dâu tây, 30 ml nước đường cát, 5 ml nước cốt chanh, vài giọt syrup hoa bụp giấm và đá viên vào bình lắc. Có thể cho phần nước ngâm dâu vào lắc chung. Lắc đều bằng lực cổ tay đến khi thấy bình lạnh thì cho nước ép dâu tây ra ly rồi trang trí với một quả dâu tây tươi hay một cọng húng lủi để thức uống thêm hấp dẫn.",
                "ngon vô cùng luôn"));

        list.add(new foodatv(R.drawable.khoai1, "Khoai tây chiên",
                "Nguyên liệu",
                "\u2022  Khoai tây 4 củ" +
                        "\n\u2022 Bột phô mai 2 muỗng canh" +
                        "\n\u2022  Bột nghệ 1 muỗng cà phê" +
                        "\n\u2022  Muối 1 muỗng cà phê" +
                        "\n\u2022  Dầu ăn 1 ít",
                "Cách làm",
                "\u2022 Khoai tây rửa sạch bụi bẩn, sau đó gọt bỏ vỏ và ngâm vào nước muối trong 10 phút. Tiếp theo, dùng dao hoặc dao bào cắt khoai tây thành những lát mỏng (cắt theo chiều ngang củ khoai tây)." +
                        "\n\u2022 Chuẩn bị 1 tô nước muối mới có pha thêm 1 muỗng cà phê bột nghệ. Sau đó, bạn cho phần khoai tây vừa gọt vào ngâm khoảng 30 phút để khoai ra hết tinh bột. Kế đến, tiếp tục ngâm khoai vào tô nước đá lạnh thêm 10 phút nữa." +
                        "\n\u2022 Bắc chảo lên bếp, cho vào 1 ít dầu ăn vừa đủ ngập mặt khoai và đun nóng. Khi dầu đã nóng, bạn cho khoai vào chiên trên lửa vừa đến khi khoai vàng giòn. Tiếp đến, vớt khoai ra rổ để ráo dầu. Bạn có thể lắc khoai với bột phô mai để tăng thêm hương vị cho món ăn nhé!",
                "ngon vô cùng luôn"));

        list.add(new foodatv(R.drawable.salad1, "Salad rau",
                "Nguyên liệu",
                "\u2022  3 cây xà lách" +
                        "\n\u2022 2 quả cà chua" +
                        "\n\u2022  1 củ hành tây" +
                        "\n\u2022  1 trái dưa leo" +
                        "\n\u2022  2 trái ớt" +
                        "\n\u2022  2 củ tỏi" +
                        "\n\u2022  5 cây ngò rí" +
                        "\n\u2022  Gia vị: Muối, đường, hạt nêm, bột ngọt, giấm gạo, tương ớt, dầu ăn",
                "Cách làm",
                "\u2022 Bạn cho tỏi và ớt vào cối rồi giã nhuyễn, sau đó bạn cho vào cối 3 muỗng canh đường, 2 muỗng canh bột ngọt, 1 muỗng canh hạt nêm, 1 muỗng canh tương ớt, 3 muỗng canh giấm gạo." +
                        "\n\u2022 Bạn dùng muỗng khuấy đều để gia vị được hòa tan, rồi cho 100ml dầu ăn vào cối rồi khuấy đều một lần nữa." +
                        "\n\u2022 Bạn cho xà lách, dưa leo, cà chua, hành tây đã cắt lát vào một cái tô rồi trộn đều sau đó bạn cho nước sốt đã làm ở bước 2 vào, bạn đảo đều nhẹ tay một lần nữa cho đến khi nước sốt thấm vào rau củ quả." +
                        "\n\u2022 Cuối cùng, bạn cho vào ngò rí đã cắt khúc vào rồi trộn đều là hoàn thành.",
                "ngon vô cùng luôn"));

        list.add(new foodatv(R.drawable.bongngo1, "Bắp rang bơ",
                "Nguyên liệu","\u2022  Hạt bắp khô 200 gr" +
                "\n\u2022 Đường cát trắng 200 gr" +
                "\n\u2022  Bơ nhạt 100 gr" +
                "\n\u2022  Dầu ăn 2 muỗng canh" +
                "\n\u2022  Nước lọc 100 ml",
                "Cách làm",
                "\u2022 Cho 3 muỗng canh dầu thực vật vào nồi." +
                        "\n\u2022 Vặn lửa vừa và thả hai hạt bắp vào nồi để thử độ nóng. Khi những hạt bắp bắt đầu bung lên, dầu đủ nóng thì thêm phần bắp còn lại." +
                        "\n\u2022 Thêm số lượng hạt gợi ý trên túi vào chảo và đậy nắp lại. Nếu nắp nồi không có lỗ, hãy giữ cho nó hơi hé ra." +
                        "\n\u2022 Nhẹ nhàng lắc chảo để giữ cho hạt bắp không bị cháy." +
                        "\n\u2022 Khi bắp ngừng bung hạt, tắt bếp. Đợi một vài giây cho những hạt bắp cuối cùng bung ra, và sau đó tháo nắp ra để tránh hơi nước làm mềm hạt bắp." +
                        "\n\u2022 Bắc nồi lên bếp, để lửa nhỏ rồi cho đường và khoảng 5ml nước vào khuấy đều. Đun cho đến khi đường tan chảy và chuyển dần sang màu nâu cánh gián." +
                        "\n\u2022 Trút hết bỏng ngô vào nồi, đảo đều từ 3 - 4 phút để hạt bắp thấm hỗn hợp bơ – đường.",
                "ngon vô cùng luôn"));


        list.add(new foodatv(R.drawable.rangcom, "Cơm Rang Thập Cẩm",
                "Nguyên liệu",
                "\u2022  2 quả trứng\n\u2022  150g dưa chua, thái khúc \n\u2022  2 chén cơm nguội\n\u2022  200g đậu que\n\u2022  200g lạp xưởng\n\u2022  Gia vị nêm nếm: đường, hạt nêm, muối, xì dầu, dầu hào",
                "Cách làm",
                "\u2022 Đun nóng dầu trong chảo, cho hành tây băm nhỏ vào phi thơm. Cho hỗn hợp rau đã nguội vào xào. Nêm gia vị vừa ăn. Thêm giò, đảo đều đến khi chín vừa. \n\n\u2022 Vẫn chiếc chảo đó, thêm một ít dầu ăn vào. Khi dầu sôi cho hành tây thái hạt lựu và đảo đều. Để lửa lớn, cho cơm vào rang. Thêm 1 chút dầu hào, xì dầu, tương ớt, gia vị vừa ăn. \n\n\u2022 Cho hỗn hợp rau đã xào lúc trước vào chảo, đảo đều tay. Sau đó thấy cơm được thì tắt bếp. Cơm rang ngon hơn nên dùng cơm khi còn nóng.",
                "ngon vô cùng luôn"));
        //2
        list.add(new foodatv(R.drawable.canhkimchi1, "Canh kim chi",
                "Nguyên liệu",
                "\u2022  Thịt ba chỉ 200 gr\n\u2022 Kim chi 200 gr  \n\u2022  Gia vị thông dụng \n\u2022  1 ít(đường/ muối/ tiêu xay)",
                "Cách làm",
                "\u2022 200gr đem cắt thành từng miếng nhỏ vừa miệng." +
                        "\n\n\u2022 200gr kim chi cắt thành từng khúc nhỏ dài khoảng ngón tay cái, phần nước kim chi bạn giữ lại cho vào bát riêng nhé!" +
                        "\n\n\u2022 Bật bếp với lửa lớn, bạn cho thịt vào cùng 1/2 muỗng cà phê muối, 1/2 muỗng cà phê tiêu, sau đó xào sơ qua khoảng 2 - 3 phút cho thịt săn lại. Tiếp theo, bạn cho phần kim chi vào, đảo đều cho thịt và kim chi thấm đều vào nhau khoảng 2 phút." +
                        "\n\n\u2022 Bạn cho 80ml nước kim chi vào cùng 250ml nước ấm. Sau khoảng 7 - 10 phút, nước canh bắt đầu sôi, bạn hạ lửa nhỏ và đậy nắp lại nấu thêm 15 phút." +
                        "\n\n\u2022 Sau đó mở nắp, nêm thêm 1 muỗng cà phê đường cho vừa ăn là có thể tắt bếp.",
                "ngon vô cùng luôn"));
        //3
        list.add(new foodatv(R.drawable.banhxeo1, "Bánh xèo",
                "Nguyên liệu","\u2022  200gr bột gạo khô\n" +
                "\n\u2022 10gr bột nghệ\n" +
                "\n\u2022  200gr thịt lợn\n" +
                "\n\u2022  200gr tôm\n" +
                "\n\u2022  100gr giá đỗ\n" +
                "\n\u2022  Rau sống ăn bánh xèo các loại\n" +
                "\n\u2022  Gia vị: muối, đường, tiêu, hành tím, gừng, hành lá",
                "Cách làm",
                "\u2022 Để pha bột làm bánh xèo, bạn trộn 200gr bột gạo, 10gr bột nghệ, 250ml nước lọc, 100ml bia, 1 muỗng cà phê muối với hành lá băm lại, khuấy bột cho thật đều tay để bột tan hết.200gr kim chi cắt thành từng khúc nhỏ dài khoảng ngón tay cái, phần nước kim chi bạn giữ lại cho vào bát riêng nhé!" +
                        "\n\n\u2022 Bắc chảo lên bếp và cho vào một lớp dầu mỏng. Sau khi dầu nóng, bạn múc muỗng canh bột vừa và tráng đều chảo." +
                        "\n\n\u2022 Sau đó, cho thêm một ít nhân và giá vào. Để lửa nhỏ, đợi khoảng 2 phút cho vỏ bánh khô giòn rồi bạn gấp đôi bánh lại hong thêm một chút và để bánh ra dĩa.",
                "ngon vô cùng luôn"));


        //4
        list.add(new foodatv(R.drawable.suon1, "Sườn nướng tảng",
                "Nguyên liệu",
                "\u2022  800g sườn non nguyên tảng" +
                        "\n\u2022 Gia vị: Đường cát vàng, muối, bột ngọt, bột tỏi, bột nghệ, bột ớt, tiêu xay, ngũ vị hương, dầu hào, tương ớt xí muội, xốt ướp thịt nướng.",
                "Cách làm",
                "\u2022 Sườn sau khi mua về bạn rửa sạch với nước muối loãng, sau đó rửa lại với nước sạch rồi để ráo." +
                        "\n\u2022 Đầu tiên, bạn cho 2 muỗng canh đường cát vàng, 1 muỗng canh muối, 1 muỗng canh bột ngọt, ½ muỗng canh bột tỏi, ½ muỗng canh bột nghệ, ½ muỗng canh bột ớt, 1 muỗng cà phê tiêu xay và 1 muỗng cà phê ngũ vị hương vào chén riêng. Sau đó bạn trộn đều hỗn hợp." +
                        "\n\\u2022 Đầu tiên, bạn cần làm nóng lò nướng ở 180 độ C trong khoảng 10 phút. Sau đó, bạn dùng giấy bạc bọc kín sườn rồi cho vào lò nướng tầm 50 phút." +
                        "\n\u2022 Tiếp đến bạn cho sườn vào lại lò nướng và nướng trong 15 phút ở 250 độ C." +
                        "\n\u2022 Sau khi nướng lần 2, bạn lấy sườn ra khỏi lò, gỡ giấy bạc ra và phết gia vị lên mặt còn lại của sườn rồi bọc giấy bạc lại sau đó cho vào lò nướng ở nhiệt độ 250 độ C trong khoảng 15 phút.",
                "ngon vô cùng luôn"));

        list.add(new foodatv(R.drawable.mi1, "Mì trứng",
                "Nguyên liệu",
                "\u2022  Mì tôm 1 gói" +
                        "\n\u2022 Tôm 3 con" +
                        "\n\u2022  Trứng gà 1 quả" +
                        "\n\u2022  Dầu ớt 1 muỗng cà phê" +
                        "\n\u2022  Hành lá 1 í" +
                        "\n\u2022  Ớt bột 1 ít",
                "Cách làm",
                "\u2022 Tôm bạn rửa thật sạch với nước rồi cẩn thận lột bỏ phần vỏ tôm.200gr kim chi cắt thành từng khúc nhỏ dài khoảng ngón tay cái, phần nước kim chi bạn giữ lại cho vào bát riêng nhé!" +
                        "\n\u2022 Bắc nồi lên bếp, cho vào khoảng 200ml nước, đổ gói rau củ khô nằm trong gói mì vào. Thả mì vào luộc trong khoảng 3 phút rồi cho cho gói gia vị vào." +
                        "\n\u2022 Dùng nĩa từ từ làm tơi phần mì này ra, cho 3 con tôm, cẩn thận đập 1 quả trứng gà và thêm 1 muỗng cà phê dầu ớt. Đậy nắp lai và nấu thêm 2 phút nữa thì tắt bếp." +
                        "\n\u2022 Gắp mì tôm và topping cho vào chén rồi rưới nước mì vào. Cẩn thận cho đặt trứng lên trên cùng, trộn đều và thưởng thức nhé!",
                "ngon vô cùng luôn"));

        list.add(new foodatv(R.drawable.dau1, "Nước dâu",
                "Nguyên liệu",
                "\u2022  Dâu tây tươi: 200gr" +
                        "\n\u2022 Đường cát: 20gr" +
                        "\n\u2022  Nước đường cát: 30 ml" +
                        "\n\u2022  Nước cốt chanh: 5 ml" +
                        "\n\u2022  Vài giọt syrup hoa bụp giấm (nếu có)" +
                        "\n\u2022  Đá viên",
                "Cách làm",
                "\u2022 Dâu tây chọn những quả tươi ngon, bỏ cuống, ngâm với chút muối, rửa lại với nước sạch rồi để ráo. Bạn cắt dâu tây thành những miếng nhỏ mang đi ướp với 2 muỗng đường cát trước khi làm nước ép." +
                        "\n\u2022 Cho dâu tây đã ướp đường vào máy ép, ép lấy nước. Nếu không có máy ép bạn có thể xay nhuyễn dâu rồi lọc lấy nước cốt, bỏ phần bã đi." +
                        "\n\u2022 Cho nước ép dâu tây, 30 ml nước đường cát, 5 ml nước cốt chanh, vài giọt syrup hoa bụp giấm và đá viên vào bình lắc. Có thể cho phần nước ngâm dâu vào lắc chung. Lắc đều bằng lực cổ tay đến khi thấy bình lạnh thì cho nước ép dâu tây ra ly rồi trang trí với một quả dâu tây tươi hay một cọng húng lủi để thức uống thêm hấp dẫn.",
                "ngon vô cùng luôn"));

        list.add(new foodatv(R.drawable.khoai1, "Khoai tây chiên",
                "Nguyên liệu",
                "\u2022  Khoai tây 4 củ" +
                        "\n\u2022 Bột phô mai 2 muỗng canh" +
                        "\n\u2022  Bột nghệ 1 muỗng cà phê" +
                        "\n\u2022  Muối 1 muỗng cà phê" +
                        "\n\u2022  Dầu ăn 1 ít",
                "Cách làm",
                "\u2022 Khoai tây rửa sạch bụi bẩn, sau đó gọt bỏ vỏ và ngâm vào nước muối trong 10 phút. Tiếp theo, dùng dao hoặc dao bào cắt khoai tây thành những lát mỏng (cắt theo chiều ngang củ khoai tây)." +
                        "\n\u2022 Chuẩn bị 1 tô nước muối mới có pha thêm 1 muỗng cà phê bột nghệ. Sau đó, bạn cho phần khoai tây vừa gọt vào ngâm khoảng 30 phút để khoai ra hết tinh bột. Kế đến, tiếp tục ngâm khoai vào tô nước đá lạnh thêm 10 phút nữa." +
                        "\n\u2022 Bắc chảo lên bếp, cho vào 1 ít dầu ăn vừa đủ ngập mặt khoai và đun nóng. Khi dầu đã nóng, bạn cho khoai vào chiên trên lửa vừa đến khi khoai vàng giòn. Tiếp đến, vớt khoai ra rổ để ráo dầu. Bạn có thể lắc khoai với bột phô mai để tăng thêm hương vị cho món ăn nhé!",
                "ngon vô cùng luôn"));

        list.add(new foodatv(R.drawable.salad1, "Salad rau",
                "Nguyên liệu",
                "\u2022  3 cây xà lách" +
                        "\n\u2022 2 quả cà chua" +
                        "\n\u2022  1 củ hành tây" +
                        "\n\u2022  1 trái dưa leo" +
                        "\n\u2022  2 trái ớt" +
                        "\n\u2022  2 củ tỏi" +
                        "\n\u2022  5 cây ngò rí" +
                        "\n\u2022  Gia vị: Muối, đường, hạt nêm, bột ngọt, giấm gạo, tương ớt, dầu ăn",
                "Cách làm",
                "\u2022 Bạn cho tỏi và ớt vào cối rồi giã nhuyễn, sau đó bạn cho vào cối 3 muỗng canh đường, 2 muỗng canh bột ngọt, 1 muỗng canh hạt nêm, 1 muỗng canh tương ớt, 3 muỗng canh giấm gạo." +
                        "\n\u2022 Bạn dùng muỗng khuấy đều để gia vị được hòa tan, rồi cho 100ml dầu ăn vào cối rồi khuấy đều một lần nữa." +
                        "\n\u2022 Bạn cho xà lách, dưa leo, cà chua, hành tây đã cắt lát vào một cái tô rồi trộn đều sau đó bạn cho nước sốt đã làm ở bước 2 vào, bạn đảo đều nhẹ tay một lần nữa cho đến khi nước sốt thấm vào rau củ quả." +
                        "\n\u2022 Cuối cùng, bạn cho vào ngò rí đã cắt khúc vào rồi trộn đều là hoàn thành.",
                "ngon vô cùng luôn"));

        list.add(new foodatv(R.drawable.bongngo1, "Bắp rang bơ",
                "Nguyên liệu","\u2022  Hạt bắp khô 200 gr" +
                "\n\u2022 Đường cát trắng 200 gr" +
                "\n\u2022  Bơ nhạt 100 gr" +
                "\n\u2022  Dầu ăn 2 muỗng canh" +
                "\n\u2022  Nước lọc 100 ml",
                "Cách làm",
                "\u2022 Cho 3 muỗng canh dầu thực vật vào nồi." +
                        "\n\u2022 Vặn lửa vừa và thả hai hạt bắp vào nồi để thử độ nóng. Khi những hạt bắp bắt đầu bung lên, dầu đủ nóng thì thêm phần bắp còn lại." +
                        "\n\u2022 Thêm số lượng hạt gợi ý trên túi vào chảo và đậy nắp lại. Nếu nắp nồi không có lỗ, hãy giữ cho nó hơi hé ra." +
                        "\n\u2022 Nhẹ nhàng lắc chảo để giữ cho hạt bắp không bị cháy." +
                        "\n\u2022 Khi bắp ngừng bung hạt, tắt bếp. Đợi một vài giây cho những hạt bắp cuối cùng bung ra, và sau đó tháo nắp ra để tránh hơi nước làm mềm hạt bắp." +
                        "\n\u2022 Bắc nồi lên bếp, để lửa nhỏ rồi cho đường và khoảng 5ml nước vào khuấy đều. Đun cho đến khi đường tan chảy và chuyển dần sang màu nâu cánh gián." +
                        "\n\u2022 Trút hết bỏng ngô vào nồi, đảo đều từ 3 - 4 phút để hạt bắp thấm hỗn hợp bơ – đường.",
                "ngon vô cùng luôn"));

        return list;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.timkiem, menu);
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);

        searchView = (SearchView) menu.findItem(R.id.action_seach).getActionView();
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchView.setMaxWidth(Integer.MAX_VALUE);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                foodAdapter.getFilter().filter(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                foodAdapter.getFilter().filter(newText);
                return false;
            }
        });
        return true;
    }
    @Override
    protected void onDestroy() {

        super.onDestroy();
        if (foodAdapter != null)
        {
            foodAdapter.release();
        }
    }

}