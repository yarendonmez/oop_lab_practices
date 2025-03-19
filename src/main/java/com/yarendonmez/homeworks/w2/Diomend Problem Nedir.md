# CENG-106 - OBJECT ORIENTED PROGRAMMING

## DIAMOND PROBLEM RAPORU

**YAREN DÖNMEZ - 21118080035**

---

## 1. Kalıtım Nedir?

Kalıtım, nesneye yönelik programlamada bir sınıf içerisinde tanımlanmış değişken ve metotların, bu sınıftan kalıtım alan diğer bir sınıf içerisinde yeniden yazılmaya gerek kalmaksızın kullanılabilmesini sağlar. Türetilen alt sınıf (*subclass*), üst sınıfta (*superclass*) tanımlanmış özelliklere sahip olur.

## 2. Küçük Bir Kalıtım Örneği ve UML Diyagramı

```java
class Animal {
    String name;
    int height;
    int weight;
}

class Felines extends Animal {
    // Kedigiller sınıfı
}
```

**UML Diyagramı:**

```
        Animal
          |
    -------------
    |           |
 Felines    WildAnimals
          |       |
        Cheetah
```

## 3. Multiple Inheritance (Çoklu Kalıtım)

Peki, `Animal` sınıfından türeyen `WildAnimals` adlı bir sınıf daha olsa ve `Cheetah` sınıfı hem `Felines` hem de `WildAnimals` sınıfından kalıtım almak istese, nasıl olurdu?

Çoklu kalıtım, bir sınıfın birden fazla sınıftan türemesi anlamına gelir. Ancak, üst ve alt sınıflarda aynı imzaya sahip yöntemler olduğunda derleyici, hangi sınıftaki metodu çağıracağını bilemez. Bu yüzden **C# ve Java gibi dillerde çoklu kalıtım desteklenmez.**

```java
class Felines extends Animal {
    void sayName() {
        System.out.println("Felines");
    }
}

class WildAnimals extends Animal {
    void sayName() {
        System.out.println("WildAnimals");
    }
}

class Cheetah extends Felines, WildAnimals { // Compile Error!
}
```

**Compile Error:**
```
Compilation error: Class ‘Cheetah’ cannot have multiple base classes: ‘Felines’ and ‘WildAnimals’
```

## 4. Diamond Problemi Neden "Diamond" Adını Almıştır?

Çoklu kalıtımın UML diyagramı çizildiğinde, ortaya **elmasa (diamond) benzer bir yapı** çıkmaktadır. Bu yüzden "Diamond Problemi" olarak adlandırılmıştır.

```
        Animal
       /      \
  Felines   WildAnimals
       \      /
       Cheetah
```

## 5. Peki Bir Çözüm Var Mı?

C# ve Java gibi dillerde çoklu kalıtım desteklenmediğinden, **çözüm interface (arayüz) kullanımıdır.**

### **Örnek: Araç Modeli Üzerinden Interface Kullanımı**

```java
interface IA {
    void genelFonksiyonlar();
}

interface IB extends IA {
    void otomatikPark();
}

interface IC extends IA {
    void otomatikSilecek();
}

interface ID extends IB, IC {}

class A implements IA {
    public void genelFonksiyonlar() {
        // Araç genel fonksiyonları
    }
}

class B implements IB {
    public void genelFonksiyonlar() {}
    public void otomatikPark() {}
}

class C implements IC {
    public void genelFonksiyonlar() {}
    public void otomatikSilecek() {}
}

class D implements ID {
    public void genelFonksiyonlar() {}
    public void otomatikPark() {}
    public void otomatikSilecek() {}
}
```

**Interface Kullanımı ile Diamond Problemi Çözümü:**
- `D` sınıfı hem `B` hem de `C` sınıfının özelliklerine sahiptir.
- Hangi metodun çağrılacağı belirsiz olmaz çünkü her sınıf, arayüzü (*interface*) implement ederek metodları açıkça tanımlar.

## **Kaynakça**
1. [Multiple Inheritance ve Diamond Problemi](https://medium.com/@celikalper/multiple-inheritance-ve-diamond-problemi-34698bc957d)
2. [Kalıtımda Diamond Problemi](https://yusufbilgen.wordpress.com/2022/11/30/kalitimda-diamond-problemi/)
