package br.newm.inspector_test;

import br.newm.inspector.Inspector;

public class Application extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Inspector.initializeWith(this, 30000);
        Inspector.setCipherKey("database_cipher3.db", "123456", 3);
        Inspector.setCipherKey("database_cipher4.db", "1234567", 4);
    }

    @Override
    public String[] databaseList() {
        return new String[]{"database.db", "database_cipher3.db", "database_cipher4.db"};
    }
}
