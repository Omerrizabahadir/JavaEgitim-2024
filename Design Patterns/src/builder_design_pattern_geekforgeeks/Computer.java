package builder_design_pattern_geekforgeeks;

import builder_design_pattern.Employee;

//product
public class Computer {
    /*
    Özel bilgisayarlar oluşturmak için bir sistem uygulamakla görevlendiriliyorsunuz.
         Her bilgisayar, kullanıcı tercihlerine bağlı olarak farklı yapılandırmalara sahip olabilir.
         Amaç, farklı CPU, RAM ve depolama seçeneklerine sahip bilgisayarlar oluşturmada esneklik sağlamaktır.
 */

    @Override
    public String toString() {
        return "Computer{" +
                " cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                '}';
    }

    String cpu;
    String ram;
    String storage;

    public Computer(ComputerBuilder computerBuilder) {
        this.cpu = computerBuilder.cpu;
        this.ram = computerBuilder.ram;
        this.storage = computerBuilder.storage;
    }


    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public static class ComputerBuilder {
        String cpu;
        String ram;
        String storage;

        public ComputerBuilder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

