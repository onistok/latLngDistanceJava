//Örnek: register sayfasındasınız ve kullanıcının konumunu aldınız
private String latu, longu;


// kullanıcının komunumu bu değişkenlere aktarın
latu = "";
longu = "";

private void parselle() {
        dunya_cevresi = 40000; // dünyann çevrsi 40009 km
        metre = 0.0999; // 100 metre 0.0009
        latudb = Double.valueOf(latu);longudb = Double.valueOf(longu);
        latubindb = latudb / metre; latuint = (int)latubindb;
        latubin = Math.round( (int)latubindb );
        lng_length = dunya_cevresi * Math.cos(Math.toRadians( latudb ));
        number_of_bins_on_lng = lng_length * 0.1;
        longuint = (int)Math.round(number_of_bins_on_lng * longudb / 360);
    }



//Örnek yuakrıdaki fonksşyın çalıştıktan sonra bu değerleri Firebase kayıt ediniz.
userInfo.put("user_latitude", latuint);
userInfo.put("user_longitude", longuint);

// bundan sonra bu integer kutu değerleri arasındaki ilişkileri görebilirsiniz. iki mesafe arasında kaç metre fark olduguna kadar bulabilirsiniz.
// Aynı zamanda yukarıdaki metre değişkeninde ve eş zamanlı aşağıdaki * 0.1 çarpanı ile ters oynama yaparak dünyayı bölünebilecek kutu sayısını değiştirebilirsiniz. ( örnek 1km, 10 km gibi )