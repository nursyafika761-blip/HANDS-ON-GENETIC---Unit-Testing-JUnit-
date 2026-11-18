public class Produk<T, U> {

    private T nama;
    private U harga;
    private Integer stok;

    public Produk(T nama, U harga, Integer stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    @Override
    public String toString() {
        return nama + "," + harga + "," + stok;
    }
}