package com.lombok_tourism.www.voyagetolombok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListSummaryWisataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_summary_wisata);

        RecyclerView listWisataView = (RecyclerView) findViewById(R.id.RecyclerWisataView);

        List<DataListWisata> list = new ArrayList<>();

        list.add(new DataListWisata(R.drawable.rinjani, "Gunung Rinjani", "Wisata pegunungan, pemandangan danau, Hot Spring"
                , "Gunung Rinjani adalah gunung yang berlokasi di Pulau Lombok, Nusa Tenggara Barat. " +
                "Gunung yang merupakan gunung berapi kedua tertinggi di Indonesia dengan ketinggian 3726 m dpl ini" +
                " merupakan gunung favorit bagi pendaki Indonesia karena keindahan pemandangannya. Gunung ini merupakan" +
                " bagian dari Taman Nasional Gunung Rinjani yang memiliki luas sekitar 41.330 ha dan ini akan diusulkan" +
                " penambahannya sehingga menjadi 76000 ha ke arah barat dan timur.", "255 km",
                "4 Jam","Tidak Punya Telpon Resmi","Tidak Punya Web Resmi"));


        list.add(new DataListWisata(R.drawable.kuta_lombok, "Pantai Kuta", "Wisata Pantai Virgin, Surfing, Spa, etc"
                , "Pantai Kuta, Lombok adalah tempat wisata di Pulau Lombok, Nusa Tenggara Barat, Indonesia." +
                " Pantai dengan pasir berwarna putih ini terletak sebuah desa bernama Desa Kuta. Desa Kuta mulai menjadi" +
                " tempat tujuan wisata yang menarik di Indonesia sejak didirikannya banyak hotel-hotel baru. banyak sekali " +
                "aktivitas yang bisa Anda lakukan di pantai nan menakjubkan ini. Seperti snorkling, berselancar, atau hanya " +
                "sekedar bermain air sembari menanti sunset yang indah. Sekitar 2 km sebelah timur Pantai Kuta, Anda bisa " +
                "mengunjungi juga Pantai Seger. Pantai ini masih berada pada garis pantai yang sama dengan Pantai Kuta. " +
                "Pemandangannya juga menakjubkan. Namun untuk pecinta snorkling dan selancar","130 km",
                "2 Jam","Tidak Punya Telpon Resmi","Tidak Punya Web Resmi"));


        list.add(new DataListWisata(R.drawable.sengigi, "Pantai Senggigi", "Wisata Pantai, Bar, Handicraft, Banana Boat"
                , "Gunung Rinjani adalah gunung yang berlokasi di Pulau Lombok, Nusa Tenggara Barat. " +
                "Pantai Senggigi adalah tempat pariwisata yang terkenal di Lombok. Letaknya di sebelah barat pesisir Pulau Lombok." +
                " Pantai Senggigi memang tidak sebesar Pantai Kuta di Bali, tetapi seketika kita berada di sini akan merasa seperti " +
                "berada di Pantai Kuta, Bali. Memasuki area pantai Senggigi, wisatawan seta merta disapa oleh lembutnya angin semilir " +
                "yang menenangkan. Pesisir pantainya masih asri, Pemandangan bawah lautnya sangat indah, dan wisatawan bisa melakukan " +
                "selam permukaan (snorkeling) sepuasnya karena ombaknya tidak terlalu besar. Dengan garis pantai yang panjang tersebut, " +
                "Pantai Senggigi Lombok menyuguhkan gradasi warna pasir pantai dari hitam ke putih. Air lautnya memiliki ombak yang tidak " +
                "besar, jernih, dan bersih. Ada banyak alasan yang membuat Pantai Senggigi di Lombok menjadi salah satu tempat wisata " +
                "favorit di kalangan penikmat perjalanan mancanegara. Turis-turis yang datang ke pantai ini lebih senang menghabiskan " +
                "waktunya dengan berjemur, berenang, snorkeling, atau sekedar bermain-main di tepian pantai.\n","50 km",
                "1 Jam","Tidak Punya Telpon Resmi","Tidak Punya Web Resmi"));


        list.add(new DataListWisata(R.drawable.sekotong, "Pantai Sekotong", "Wisata Pantai Virgin, Diving, Spa, etc"
                , "Sekotong merupakan sebuah kecamatan di Lombok Barat, NTB yang memiliki banyak " +
                "sekali pantai cantik. Istimewanya pantai-pantai di Sekotong adalah suasana yang masih sangat " +
                "natural karna tidak terlalu ramai pengunjung. Pantai ini dikelilingi oleh kawasan perbukitan" +
                " yang melingkar tak jauh dari pinggir pantai. Lautnya berair biru dan pantainya berpasir putih." +
                " Pantai Sekotong ini masih asli, bebas polusi dan belum banyak dijamah manusia. Namun demikian " +
                "kini mulai dibangun sarana akomodasi seperti hotel dan penginapan.","100 km",
                "2 Jam","Tidak Punya Telpon Resmi","Tidak Punya Web Resmi"));


        list.add(new DataListWisata(R.drawable.gili_trawangan, "Gili Trawangan", "Wisata Pulau Pribadi, Diving, Banana Boat, Etc"
                ,"Gili Trawangan adalah yang terbesar dari ketiga pulau kecil atau gili yang terdapat " +
                "di sebelah barat laut Lombok. Trawangan juga satu-satunya gili yang ketinggiannya di atas permukaan " +
                "laut cukup signifikan. Dengan panjang 3 km dan lebar 2 km, Trawangan berpopulasi sekitar 800 jiwa. " +
                "Di antara ketiga gili tersebut, Trawangan memiliki fasilitas untuk wisatawan yang paling beragam, " +
                "kedai Tîr na Nôg mengklaim bahwa Trawangan adalah pulau terkecil di dunia yang ada bar Irlandia-nya." +
                " Bagian paling padat penduduk adalah sebelah timur pulau ini. Trawangan punya nuansa pesta lebih " +
                "daripada Gili Meno dan Gili Air, karena banyaknya pesta sepanjang malam yang setiap malamnya dirotasi " +
                "acaranya oleh beberapa tempat keramaian. Aktivitas yang populer dilakukan para wisatawan di Trawangan " +
                "adalah scuba diving (dengan sertifikasi PADI), snorkeling (di pantai sebelah timur laut), bermain kayak, " +
                "dan berselancar. Ada juga beberapa tempat bagi para wisatawan belajar berkuda mengelilingi pulau","150 km",
                "3 Jam","Tidak Punya Telpon Resmi","Tidak Punya Web Resmi"));


        list.add(new DataListWisata(R.drawable.narmada, "Narmada & Suranadi", "Wisata Alam, Rafting, Air Terjun"
                , "Taman Narmada merupakan salah satu  tempat wisata di lombok barat yang juga menarik " +
                "untuk dikunjungi hal ini dikarenakan lokasi wisatanya yang unik dan antik. Letak lokasi tempat wisata " +
                "ini sekitar 10 km dari arah timur ibukota Nusa Tenggara Barat Mataram.  Tempat wisata ini meniru dari " +
                "gunung Rinjani.  Pada wal abad ke 19 raja yang bernama Raja Anak Agung  membuat persembahyangan bernama " +
                "Pura Suci Narmada. Setiap melakukan persembahyangan di Pura Suci Narmada dipimpin oleh seorang pendeta " +
                "sehingga ketika melakukan sembahyang tidak perlu langsung ke Gunung Rinjani melainkan hanya di pura " +
                "tersebut saja. Pada saat ini taman tersbut terbuka untuk umum, sehingga banyak wisatawan yang memanfaatkannya " +
                "untuk rekerasi bersama teman, sahabat maupun keluarga. Taman Narmada selalu ramai dikunjungi oleh wisatawan " +
                "pada saat weekend dan musim liburan tiba.  Di dalam taman tersebut terdapat mata air, menurut sejarahnya " +
                "mata air tersebut dipercaya berguna untuk membuat seseorang yang membasuh muka di mata air tersebut awet muda " +
                "dan panjang umur, bahkan mata air tersebut disebut dengan mata air awet muda.","50 km",
                "1 Jam","Tidak Punya Telpon Resmi","Tidak Punya Web Resmi"));

        ListSummaryAdapter adapterWisata = new ListSummaryAdapter(list);

        listWisataView.setLayoutManager(new LinearLayoutManager(this));

        listWisataView.setAdapter(adapterWisata);
    }
}
