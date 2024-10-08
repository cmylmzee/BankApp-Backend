
# BankApp

BankApp, Spring Boot ile geliştirilmiş basit bir banka uygulamasıdır. Bu uygulama, hesap oluşturma, para yatırma, çekme ve tüm hesapları listeleme gibi temel bankacılık işlevlerini REST API aracılığıyla sunar.

## Özellikler

- Hesap oluşturma
- Hesap bakiyesi görüntüleme
- Para yatırma
- Para çekme
- Tüm hesapları listeleme

## Kullanılan Teknolojiler

- Java 17
- Spring Boot 3
- Maven
- H2 Veritabanı
- Spring Data JPA

## API Dökümantasyonu

### Hesap Oluşturma
**POST /api/accounts**

Gönderilen `AccountDto` ile yeni bir hesap oluşturur.

```json
{
  "accountHolderName": "Cem Yılmaz",
  "balance": 1000.0
}
```

### Hesap Detayı Getirme
**GET /api/accounts/{id}**

Belirtilen id'ye sahip hesabın detaylarını getirir.

### Para Yatırma
**PUT /api/accounts/{id}/deposit**

Belirtilen hesaba para yatırır. `amount` miktarı JSON body içinde gönderilmelidir.

```json
{
  "amount": 500.0
}
```

### Para Çekme
**PUT /api/accounts/{id}/withdraw**

Belirtilen hesaptan para çeker. `amount` miktarı JSON body içinde gönderilmelidir.

```json
{
  "amount": 300.0
}
```

### Tüm Hesapları Listeleme
**GET /api/accounts**

Tüm hesapları listeleyip JSON formatında döner.

## Kurulum

Projeyi klonladıktan sonra:

```bash
git clone https://github.com/cmylmzee/BankApp-Backend
cd bankapp
mvn clean install
mvn spring-boot:run
```

Uygulama, `http://localhost:8080` adresinde çalışacaktır.

## İletişim

Herhangi bir soru veya geri bildiriminiz için iletişime geçmekten çekinmeyin:
- LinkedIn: https://www.linkedin.com/in/cem-yılmaz-a0707b205/
- E-posta: yilmazcem1122@gmail.com
