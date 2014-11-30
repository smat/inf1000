INF1000
-------

## Variabler

```java
int ettTall = 1;
String enTekst = "Dette er en test";
```


## Flytkontroll

# If else

```java
int tall = 1

if (tall == 0) {
  System.out.println("Tallet er null");
}
else if (tall == 1) {
  System.out.println("Tallet er en");
}
else {
  System.out.println("Tallet er ikke null eller en");
}
```

```java
String tekst = "Stian";

if (tekst.equals("Stian")) {
  System.out.println("Teksten er Stian");
}
```

# For-l�kke

Best � bruke n�r du vet hvor mange ganger du skal gjenta noe, eller hvis man skal g� igjennom en array.

```java
for (int i = 0; i < 5; i++) {
  System.out.println("Dette er gang nr " + i);
}
```

# While-l�kke

Best � bruke n�r du ikke vet hvor mange ganger noe skal gjentas

```java
Scanner s = new Scanner(System.in) // Husk "import java.io.Scanner"
boolean fortsett = true;

while (fortsett) {                 // Fortsetter til "fortsett-variablen blir endret
  String input = s.nextLine();
  if (input.equalsIgnoreCase("stop")) {  // Sjekker om input er lik stop, uten � sjekke for store eller sm� bokstaver
    fortsett = false;              // Avslutter l�kka n�r brukeren skriver "Stop"
  }
}
```


