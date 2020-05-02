public class AnimalFavorit {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.nama = "Kucing";
        animal1.jenis = "Mamalia";
        animal1.warna = "Putih";
        animal1.jumlahkaki = 4;
        animal1.harga = 500000;
        animal1.cetakInfo();

        Animal animal2 = new Animal();
        animal2.nama = "Kura-kura";
        animal2.jenis = "Reptil";
        animal2.warna = "Hitam";
        animal2.jumlahkaki = 4;
        animal2.harga = 300000;
        animal2.cetakInfo();

        Animal animal3 = new Animal();
        animal3.nama = "Ayam";
        animal3.jenis = "Unggas";
        animal3.warna = "Coklat";
        animal3.jumlahkaki = 2;
        animal3.harga = 200000;
        animal3.cetakInfo();
    }
}
