package Question2;

public class Main {
    public static void main(String[] args) {
        //Instancia e configuração do IntegerList
        Arranjo<Integer> arranjo = new IntegerList();
        arranjo.classificar();
        arranjo.add(7);
        arranjo.add(4);
        arranjo.add(5);
        arranjo.add(6);
        arranjo.add(7);
        arranjo.add(8);

        arranjo.sort();
        arranjo.list();
        arranjo.remove(5);
        arranjo.list();

        //Instancia e configuração do FloatList
        Arranjo<Float> arranjo2 = new FloatList();
        arranjo2.classificar();
        arranjo2.add(5.6F);
        arranjo2.add(4.6F);
        arranjo2.add(7.9F);
        arranjo2.add(0.9F);
        arranjo2.add(9.6F);
        arranjo2.add(4.3F);

        arranjo2.sort();
        arranjo2.list();
        arranjo2.remove(7.9F);
        arranjo2.list();


        //Instancia e configuração do DoubleList
        Arranjo<Double> arranjo3 = new DoubleList();
        arranjo3.classificar();
        arranjo3.add(4.5);
        arranjo3.add( 79.8);
        arranjo3.add(6.5);
        arranjo3.add( 7.6);
        arranjo3.add( 1.0);

        arranjo3.sort();
        arranjo3.list();
        arranjo3.remove(7.6);
        arranjo3.list();


        //Instancia e configuração do ByteList
        Arranjo<Byte> arranjo4 = new ByteList();
        arranjo4.classificar();
        arranjo4.add((byte) 7);
        arranjo4.add((byte) 4);
        arranjo4.add((byte) 9);
        arranjo4.add((byte) 5);
        arranjo4.add((byte) 6);
        arranjo4.add((byte) 7);

        arranjo4.sort();
        arranjo4.list();
        arranjo4.remove((byte) 5);
        arranjo4.list();


        //Instancia e configuração do ShortList
        Arranjo<Short> arranjo5 = new ShortList();
        arranjo5.classificar();
        arranjo5.add((short) 100);
        arranjo5.add((short)50);
        arranjo5.add((short)57);
        arranjo5.add((short)80);
        arranjo5.add((short)98);

        arranjo5.sort();
        arranjo5.list();
        arranjo5.remove((short)80);
        arranjo5.list();

        //Instancia e configuração do LongList
        Arranjo<Long> arranjo6 = new LongList();
        arranjo6.classificar();
        arranjo6.add(10000L);
        arranjo6.add(800800L);
        arranjo6.add(966488L);
        arranjo6.add(884185L);
        arranjo6.add(8844L);
        arranjo6.add(8448848L);
        arranjo6.add(444884L);

        arranjo6.sort();
        arranjo6.list();
        arranjo6.remove(800800L);
        arranjo6.list();

        //Instancia e configuração do CharList
        Arranjo<Character> arranjo7 = new CharList();
        arranjo7.classificar();
        arranjo7.add( 'n');
        arranjo7.add( 'v');
        arranjo7.add( 'e');
        arranjo7.add('r');
        arranjo7.add('u');

        arranjo7.sort();
        arranjo7.list();
        arranjo7.remove( 'u');
        arranjo7.list();

    }
}