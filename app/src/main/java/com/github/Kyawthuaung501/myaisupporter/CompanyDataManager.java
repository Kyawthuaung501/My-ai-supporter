package com.github.Kyawthuaung501.myaisupporter;

import android.content.Context;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CompanyDataManager {

    private final Context context;

    public CompanyDataManager(Context context) {
        this.context = context;
    }

    /**
     * Load company_data.json from assets folder
     */
    public String loadCompanyData() {
        StringBuilder builder = new StringBuilder();

        try {
            InputStream is = context.getAssets().open("company_data.json");
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));

            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line).append("\n");
            }

            reader.close();
            is.close();

        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }

        return builder.toString();
    }
}
