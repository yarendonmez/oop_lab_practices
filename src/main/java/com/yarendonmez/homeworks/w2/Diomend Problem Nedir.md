# KALITIMDA DIAMOND PROBLEM

## 1. Kalıtım Nedir

Kalıtım nesneye yönelik programlamada bir sınıf içerisinde tanımlanmış değişken ve metotların, bu sınıftan kalıtım alan diğer bir sınıf içerisinde yeniden yazılmaya gerek kalmaksızın kullanılabilmesidir. Türetilen alt sınıf (*subclass*), üst sınıfta (*superclass*) tanımlanmış özelliklere sahip olur.

## 2. Küçük Bir Kalıtım Örneği ve UML Diyagramı

```csharp
using System;
public class Program
{
    public static void Main()
    {
        Cat cat = new Cat();
        cat.name = "Tekir";
        cat.weight = (Decimal)4.9;
        cat.height = 50;
        cat.eat();
        cat.SayName();
    }
}

public class Animal
{
    public string name;
    public decimal height;
    public decimal weight;
    public void eat()
    {
        this.weight++;
    }
    public void SayName()
    {
        Console.WriteLine("My name is " + this.name);
    }
}

public class Felines : Animal
{
    public int tailLength;
    public int Jump() { return 0; }
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

Yukarıda kodları bulunan kalıtım örneğinin UML diyagramı bu şekildedir. `Animal` sınıfından türeyen `Felines` (*Kedigiller*) sınıfı, `Animal` sınıfında bulunan `name`, `height`, `weight` gibi değişkenleri de kullanabilmektedir.

## 3. Multiple Inheritance (Çoklu Kalıtım)

Peki, `Animal` sınıfından türeyen `WildAnimals` adlı bir sınıf daha olsa ve `Cheetah` adlı yeni oluşturacağımız sınıf, hem `Felines` (*Kedigiller*) hem de `WildAnimals` sınıfından kalıtım almak istese, nasıl olurdu?

Çoklu kalıtım, bir sınıfın bir veya birden fazla sınıftan kalıtım almasıdır. Buradaki sorunun sebebi, hem üst sınıflarda hem de alt sınıflarda aynı imzaya sahip yöntemlerin olması durumunda ortaya çıkar. Derleyici, metodu çağırırken hangi sınıftaki metodu çağıracağını bilemediğinden probleme yol açmaktadır. Bu yüzden **C#, Java gibi dillerde çoklu kalıtım desteklenmez.**

**UML Diyagramı:**

```
        Animal
       /      \
  Felines   WildAnimals
       \      /
       Cheetah
```

Cheetah sınıfı hem `Felines` hem de `WildAnimals` sınıfından kalıtım almak istediğinde **C# ve Java dilleri Compile Error verecektir.** Bunun sebebi, `Cheetah` sınıfının hangi `SayName` metodunu kullanacağını bilememesidir.

**Compile Error:**
```
Compilation error (line 38, col 27): Class ‘Program.Cheetah’ cannot have multiple base classes: ‘Program.Felines’ and ‘WildAnimals’
```

## 4. Neden Diamond?

Peki bu problemin adı neden **Diamond Problemi** olarak literatüre geçmiş? Bunun sebebi UML diyagramında çizim yapıldığında ortaya **elmasa benzer** bir şekil çıkmasıdır.

**Şekil:**
```
        Animal
       /      \
  Felines   WildAnimals
       \      /
       Cheetah
```

---

## 5. Peki Bir Çözüm Var Mı?

Peki ya alt sınıfın, üst iki sınıfa ait özellikleri metotlar konusunda karışıklık yaşamadan kullanmasını istersek ne yapmalıyız? Bu durumda **Java ve C# gibi diller çoklu kalıtıma izin vermediğinden çözüm, interface (arayüz) kullanımıdır.**

### 5.1 Araç Modeli Örneği

```java
class A {
    public String genelOzellikler;
    public void genelFonksiyonlar() {
        // Aracın genel fonksiyonları
    }
}

class B extends A {
    public void otomatikPark() {
        // Otomatik park sistemi
    }
}

class C extends A {
    public void otomatikSilecek() {
        // Otomatik silecek sistemi
    }
}
```

Firma, `D` model bir araç geliştirdiğinde hem `B` hem de `C` özelliklerini almak istiyor. Ancak **Java ve C# gibi dillerde çoklu kalıtıma izin verilmediği için interface (arayüz) kullanılır.**

**Arayüz Kullanımı ile Diamond Problemi Çözümü:**

```java
interface IA {
    public String genelOzellikler;
    public void genelFonksiyonlar();
}

interface IB extends IA {
    public void otomatikPark();
}

interface IC extends IA {
    public void otomatikSilecek();
}

interface ID extends IB, IC {}

class A implements IA {
    public String genelOzellikler;
    public void genelFonksiyonlar() {
        // Aracın genel fonksiyonları
    }
}

class B implements IB {
    public String genelOzellikler;
    public void genelFonksiyonlar() {}
    public void otomatikPark() {}
}

class C implements IC {
    public String genelOzellikler;
    public void genelFonksiyonlar() {}
    public void otomatikSilecek() {}
}

class D implements ID {
    public String genelOzellikler;
    public void genelFonksiyonlar() {}
    public void otomatikPark() {}
    public void otomatikSilecek() {}
}
```

Bu yöntem sayesinde **Diamond Problemi önlenmiş olur.** Interface kullanarak, sınıfların birbirinden bağımsız ancak belirlenen kurallara göre genişletilebilir olmasını sağlarız.

Arayüzleri kullanmadan doğrudan kalıtım ile sorunu çözmek istediğimizde metodların karışması diyebileceğimiz diamond problemi ile karşılaşırız. Örneğin A sınıfındaki `genelFonksiyonlar` metodunun B ve C sınıfında farklı override edildiğini düşünelim. Bu durumda C++ gibi dillerde çoklu kalıtım desteklendiğinden B ve C sınıfından aynı anda miras alan D sınıfında `genelFonksiyonlar` metodunun hangi versiyonunun çağırılacağı belirsiz bir hale gelir. B’nin override ettiği metodu mu, yoksa C’nin mi? Ancak interface kullandığımızda, her sınıfın bu metodu nasıl uygulayacağını açıkça belirtmesi gerektiğinden, bu tür bir problemle karşılaşmayız.
