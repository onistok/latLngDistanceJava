private void parselle(latu,longu) {
        dunya_cevresi = 40000; // dünyann çevrsi 40009 km
        metre = 0.0999; // 100 metre 0.0009
        latudb = Double.valueOf(latu);longudb = Double.valueOf(longu);
        latubindb = latudb / metre; latuint = (int)latubindb;
        latubin = Math.round( (int)latubindb );
        lng_length = dunya_cevresi * Math.cos(Math.toRadians( latudb ));
        number_of_bins_on_lng = lng_length * 0.1;
        longuint = (int)Math.round(number_of_bins_on_lng * longudb / 360);
    }
