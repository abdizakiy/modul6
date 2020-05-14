package com.example.modul6;
public class Konfigurasi {
    //PENTING! JANGAN LUPA GANTI IP SESUAI DENGAN IP KOMPUTER DIMANA DATA PHP BERADA
    public static final String URL_GET_ALL = "http://192.168.56.1/modul6/read.php";
    public static final String URL_GET_EMP  = "http://192.168.56.1/modul6/select.php";
    public static final String URL_UPDATE_EMP  = "http://192.168.56.1/modul6/update.php";
    public static final String URL_DELETE_EMP  = "http://192.168.56.1/modul6/delete.php";
    public static final String URL_ADD = "http://192.168.56.1/modul6/insert.php";
    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    public static final String KEY_MHS_ID = "id";
    public static final String KEY_MHS_NAMA = "nama";
    public static final String KEY_MHS_JURUSAN = "jurusan";
    public static final String KEY_MHS_EMAIL = "email";

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "nama";
    public static final String TAG_JURUSAN = "jurusan";
    public static final String TAG_EMAIL = "email";

    public static final String MHS_ID = "mhs_id";
}