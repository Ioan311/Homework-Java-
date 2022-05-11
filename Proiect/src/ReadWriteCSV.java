import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadWriteCSV {
    // FOR USER
    public static void writeCSV(String filePath) {
        List<User> users = new ArrayList<User>();
        User user = new User();
        user.setNume("Angel");
        user.setPrenume("Simion");
        user.setVarsta(34);
        user.setNrTelefon("0721054623");
        user.setAdresa("Traian Vuia, 4, Ploiesti");
        users.add(user);

        user = new User();
        user.setNume("Dumitrache");
        user.setPrenume("Ana");
        user.setVarsta(24);
        user.setNrTelefon("0721094623");
        user.setAdresa("Pictor Iscovescu, 8, Ploiesti");
        users.add(user);

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filePath);

            fileWriter.append("Nume, Prenume, Varsta, NrTelefon, Adresa");
            for(User u : users) {
                fileWriter.append(u.getNume());
                fileWriter.append(",");
                fileWriter.append(u.getPrenume());
                fileWriter.append(",");
                fileWriter.append(String.valueOf(u.getVarsta()));
                fileWriter.append(",");
                fileWriter.append(u.getNrTelefon());
                fileWriter.append(",");
                fileWriter.append(u.getAdresa());
                fileWriter.append("\n");
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void readCSV(String filePath) {
        BufferedReader reader = null;
        try {
            List<User> users = new ArrayList<User>();
            String line = "";
            reader = new BufferedReader(new FileReader(filePath));
            reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                if (fields.length > 0) {
                    User user = new User();
                    user.setNume(fields[0]);
                    user.setPrenume(fields[1]);
                    user.setVarsta(Integer.parseInt(fields[2]));
                    user.setNrTelefon(fields[3]);
                    user.setAdresa(fields[4]);
                }
            }
            for (User u : users) {
                System.out.printf("[userNume=%s, userPrenume=%s, userVarsta=%d, userNrTelefon=%s, userAdresa=%s]\n", u.getNume(), u.getPrenume(), u.getVarsta(), u.getNrTelefon(), u.getAdresa());
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    // FOR PREPARATE
    public static void writeCSV2 (String filePath2) {
        List<Preparate> foods = new ArrayList<Preparate>();
        Preparate food = new Preparate();
        food.setPret(49);
        food.setNumePreparat("Cartofi gratinati");
        food.setCantitate(250);
        foods.add(food);

        food = new Preparate();
        food.setPret(95);
        food.setNumePreparat("Spaghete Carbonara");
        food.setCantitate(400);
        foods.add(food);

        FileWriter fileWriter2 = null;
        try {
            fileWriter2 = new FileWriter(filePath2);
            fileWriter2.append("Pret, NumePreparat, Cantitate");
            for (Preparate p : foods) {
                fileWriter2.append(String.valueOf(p.getPret()));
                fileWriter2.append(",");
                fileWriter2.append(p.getNumePreparat());
                fileWriter2.append(",");
                fileWriter2.append(String.valueOf(p.getCantitate()));
                fileWriter2.append("\n");
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            try {
                fileWriter2.flush();
                fileWriter2.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    public static void readCSV2 (String filePath2) {
        BufferedReader reader2 = null;
        try {
            List<Preparate> foods = new ArrayList<Preparate>();
            String line2 = "";
            reader2 = new BufferedReader(new FileReader(filePath2));
            reader2.readLine();

            while ((line2 = reader2.readLine()) != null) {
                String[] fields2 = line2.split(",");
                if(fields2.length > 0) {
                    Preparate food = new Preparate();
                    food.setPret(Integer.parseInt(fields2[0]));
                    food.setNumePreparat(fields2[1]);
                    food.setCantitate(Integer.parseInt(fields2[2]));
                }
            }
            for (Preparate p : foods) {
                System.out.printf("[foodPret=%d, foodNumePreparat=%s, foodCantitate=%d]\n", p.getPret(), p.getNumePreparat(), p.getCantitate());
            }

        } catch (Exception excep) {
            excep.printStackTrace();
        } finally {
            try {
                reader2.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // FOR RESTAURANT
    public static void writeCSV3 (String filePath3) {
        List<Restaurant> restaurants = new ArrayList<Restaurant>();
        Restaurant restaurant = new Restaurant();
        restaurant.setNume("Evelin");
        restaurant.setAdresa("Carpati 2");
        restaurant.setTelefon("0712343554");
        restaurant.setIdComanda(17);
        restaurants.add(restaurant);

        restaurant = new Restaurant();
        restaurant.setNume("Cucina");
        restaurant.setAdresa("Mihai Bravu 23");
        restaurant.setTelefon("0702323509");
        restaurant.setIdComanda(99);
        restaurants.add(restaurant);

        FileWriter fileWriter3 = null;
        try {
            fileWriter3 = new FileWriter(filePath3);

            fileWriter3.append("Nume, Adresa, Telefon, IdComanda, Mancaruri, Comenzi");
            for (Restaurant r : restaurants) {
                fileWriter3.append(r.getNume());
                fileWriter3.append(",");
                fileWriter3.append(r.getAdresa());
                fileWriter3.append(",");
                fileWriter3.append(r.getTelefon());
                fileWriter3.append(",");
                fileWriter3.append(String.valueOf(r.getIdComanda()));
                fileWriter3.append("\n");
            }
        } catch (Exception except) {
            except.printStackTrace();
        } finally {
            try {
                fileWriter3.flush();
                fileWriter3.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void readCSV3(String filePath3) {
        BufferedReader reader3 = null;
        try {
            List<Restaurant> restaurants = new ArrayList<Restaurant>();
            String line3 = "";
            reader3 = new BufferedReader(new FileReader(filePath3));
            reader3.readLine();

            while ((line3 = reader3.readLine()) != null) {
                String[] fields3 = line3.split(",");
                if (fields3.length > 0) {
                    Restaurant restaurant = new Restaurant();
                    restaurant.setNume(fields3[0]);
                    restaurant.setAdresa(fields3[1]);
                    restaurant.setTelefon(fields3[2]);
                    restaurant.setIdComanda(Integer.parseInt(fields3[3]));
                }
            }
            for (Restaurant r : restaurants) {
                System.out.printf("[restaurantNume=%s, restaurantAdresa=%s, restaurantTelefon=%s, restaurantIdComanda=%d]\n", r.getNume(), r.getAdresa(), r.getTelefon(), r.getIdComanda());
            }

        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            try {
                reader3.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // FOR BON FISCAL
    public static void writeCSV4 (String filePath4) {
        List<BonFiscal> bonFiscals = new ArrayList<BonFiscal>();
        BonFiscal bonFiscal = new BonFiscal();
        bonFiscal.setIdBon(29);
        bonFiscal.setPret(49);
        bonFiscal.setTva(15);
        bonFiscals.add(bonFiscal);

        bonFiscal = new BonFiscal();
        bonFiscal.setIdBon(80);
        bonFiscal.setPret(24);
        bonFiscal.setTva(15);
        bonFiscals.add(bonFiscal);

        FileWriter fileWriter4 = null;
        try {
            fileWriter4 = new FileWriter(filePath4);

            fileWriter4.append("IdBon, Pret, Tva");
            for (BonFiscal b : bonFiscals) {
                fileWriter4.append(String.valueOf(b.getIdBon()));
                fileWriter4.append(",");
                fileWriter4.append(String.valueOf(b.getPret()));
                fileWriter4.append(",");
                fileWriter4.append(String.valueOf(b.getTva()));
                fileWriter4.append("\n");
            }
        } catch (Exception except) {
            except.printStackTrace();
        } finally {
            try {
                fileWriter4.flush();
                fileWriter4.close();
            } catch (Exception excep) {
                excep.printStackTrace();
            }
        }
    }
    public static void readCSV4 (String filePath4) {
        BufferedReader reader4 = null;
        try {
            List<BonFiscal> bonFiscals = new ArrayList<BonFiscal>();
            String line4 = "";
            reader4 = new BufferedReader(new FileReader(filePath4));
            reader4.readLine();

            while ((line4 = reader4.readLine()) != null) {
                String[] fields4 = line4.split(",");
                if (fields4.length > 0) {
                    BonFiscal bonFiscal = new BonFiscal();
                    bonFiscal.setIdBon(Integer.parseInt(fields4[0]));
                    bonFiscal.setPret(Float.parseFloat(fields4[1]));
                    bonFiscal.setTva(Float.parseFloat(fields4[2]));
                }
            }
            for (BonFiscal b : bonFiscals) {
                System.out.printf("[bonFiscalIdBon=%d, bonFiscalPret=%f, bonFiscalTva=%f]\n", b.getIdBon(), b.getPret(), b.getTva());
            }

        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            try {
                reader4.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
