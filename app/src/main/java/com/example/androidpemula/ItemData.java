package com.example.androidpemula;

import java.util.ArrayList;

public class ItemData {
    public static String[][] data = new String[][]{
            {"Fakultas Ilmu Alam", "Natural sciences are the basis for applied sciences, while Mathematics is the language with we which formulate theories and natural laws. Faculty of Mathematics and Natural Science of ITS provides several branches of study programs of Mathematics and Natural Science. The faculty is expected to produce human resources who are able to develop mathematical and analytical logical-thinking and to make scientific research as well as to produce various scientific ideas and finding.\n" +
                    "\n.", "https://www.its.ac.id/old2//files/images/001_FIA.png"},
            {"Fakultas Teknologi Industri", "Faculty of Industrial Technology (FTI) was founded as the realization of government regulation No. 5/1980 and government regulation No. 27/1981 officiated under the Decree of the Minister of Education and Culture No. 0144/0/1983 regarding organization in ITS. Education in FTI is specially designed to yield graduates who are able to keep abreast with the development of science and technology, and who are sensitive to the community demands in the areas of industry and technology.", "https://www.its.ac.id/old2//files/images/002_FTI.png"},
            {"Fakultas Teknologi Elektro", "Fakultas Teknologi Elektro (FTE) ditetapkan dalam Peraturan Rektor ITS Nomor 10 Tahun 2016 tentang Organisasi dan Tata Kerja (OTK) Institut Teknologi Sepuluh Nopember (ITS) di Surabaya, 03 Oktober 2016. Pada saat FTE ditetapkan, ITS sudah menjadi PTNBH (Perguruan Tinggi Negeri Badan Hukum).", "https://www.its.ac.id/old2//files/images/003_FTE.png"},
            {"Fakultas Teknik Sipil", "Fakultas Teknik Sipil, Lingkungan dan Kebumian yang sebelumnya merupakan bagian dari Fakultas Teknik Sipil dan Perencanaan mempuyai kepakaran dalam berbagai bidang yang menunjang pembangunan strategis nasional berkelanjutan dan berwawasan lingkungan. Sesuai dengan target ITS maka FTSLK dan seluruh departemen yang ada dibawahnya mempunyai target untuk mempunyai reputasi internasional dalam bidang akademik, penelitian dan karya unggul untuk mewujudkan world class university dan mempunyai kontribusi bagi pembangunan nasional.", "https://www.its.ac.id/old2//files/images/004_FTSLK.png"},
            {"Fakultas Arsitektur", "Tentang FADP. Berdasarkan SOTK ITS No. 10 tahun 2016, Fakultas Teknik Sipil dan Perencanaan (FTSP) adalah salah satu fakultas yang dibagi menjadi dua Fakultas baru, yaitu: Fakultas Ilmu Sipil, Lingkungan dan Ilmu Bumi (FTSLK) dan Fakultas Arsitektur, Desain dan Perencanaan (FADP).", "https://www.its.ac.id/old2//files/images/005_FADP.png"},
            {"Fakultas Teknologi Kelautan", "Fakultas Teknologi Kelautan (FTK) ITS didirikan sesuai Keputusan Presiden No. 58 tahun 1982 dan merupakan pengembangan dari Fakultas Teknik Perkapalan  yang bersamaan dengan berdirinya Institut Teknologi Sepuluh Nopember pada tahun 1960. Pada saat ini, Fakultas Teknologi Kelautan memiliki departemen program sarjana dan pascasarjana.", "https://www.its.ac.id/old2//files/images/006_FTK.png"},
            {"FAKULTAS MATEMATIKA, KOMPUTASI, DAN SAINS DATA", "\n" +
                    "Fakultas matematika, komputasi dan ilmu data mengembangkan siswa yang dapat memahami dan menerapkan ilmu hitung dan data untuk menyelesaikan berbagai masalah. Karena, sejak dulu kemampuan memproses data dan angka sangat penting dan dibutuhkan di tempat kerja. Fakultas ini mencakup Matematika, Statistik, dan Ilmu Aktuaria.", "https://www.its.ac.id/old2//files/images/007_FMKS.jpg"},
            {"Fakultas Teknologi Informasi", "Faculty of Informaton Technology (FTIf) is the newest faculty, established under the Rector’s Decree dated on 14th June 2001. The establishment of the Faculty was made as a response to the demands of increasing quality and distributon of informaton technology. Educaton of FTIf ITS aims at producing experts having in-depth knowledge of computer technology and mastering of trouble-shootng techniques. The curriculum was compiled on the basis of equal balance of hardware and sofware aspects.", "https://www.its.ac.id/old2//files/images/008_FTIK.png"},
            {"FAKULTAS BISNIS DAN MANAJEMEN TEKNOLOGI", "Currently, the business world both for services and products in Indonesia is growing. In its development process will be followed by the community or human resources that properly understand business and project management. ITS also give a contribution to developing students who able to support business and management in Indonesia by build Faculty of Business and Technology Management. This faculty provides Business Management Department, Technology Management Department, and Development Studies Department.", "https://www.its.ac.id/old2//files/images/009_FBMT.png"},
            {"Fakultas Vokasi", "Fakultas Vokasi (FV) adalah adalah salah satu fakultas yang baru dibentuk oleh ITS berdasarkan Peraturan Rektor Nomor 10 tahun 2016 dan mulai beroperasi pada tanggal 26 Januari 2017. Fakultas Vokasi diberi tugas untuk mengelola dan mengkoordinasikan semua Program Studi yang bersifat vokasi di lingkungan ITS. ", "https://www.its.ac.id/old2//files/images/0010_FV.png"},
    };

    public static ArrayList<Item> getListData() {
        ArrayList<Item> list = new ArrayList<>();
        for (String[] aData : data) {
            Item item = new Item();
            item.setName(aData[0]);
            item.setDesc(aData[1]);
            item.setPhoto(aData[2]);
            item.setDefine(aData[1]);
            list.add(item);
        }
        return list;
    }
}
