# Métodos e atributos estáticos

- Estáticos = são gerais para a classe, e não específicos de uma instância/objeto.

- Evite usar variáveis estáticas como variáveis globais.

```java

public class Gato
{
    // atributo estático
    static int totalDeGatos = 0; 
    
    Gato()
    {
        // incrementando atributo estático
        totalDeGatos++;
    }
    
    // um método estático
    static void seila()
    {
        
    }
}

// acessando atributo, não precisa da instância
print(Gato.totalDeGatos);

```

Se você usar o "static import", você pode usar os métodos estáticos sem referenciar o nome da classe!
```java
import static java.lang.Math.*;

// antes: Math.max(a,b);
max(a, b);
```
