public class HashMap {

    char[] hashedPassword;
    private int mod = 10;

    public HashMap() {
        this.hashedPassword = new char[mod];
    }

    public void put(char c) {
        int ascii = (int) c;
        int index = ascii % mod;
        while (hashedPassword[index] != '\u0000') {
            index = (index + 1) % mod;
        }
        hashedPassword[index] = c;
    }

    public String getPasswordHash() {
        return new String(hashedPassword);
    }
}
