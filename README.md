# MVP
<img src="https://www.journaldev.com/wp-content/uploads/2017/08/android-mvp-flow.png">


if you looking for easy MVP architecture in android , this is can be helpfull

go to you empty progect and copy this library in your project !

## Clone
```
git clone https://github.com/MahdiRahmani80/MVP.git
```
## App Tree
```

├── AndroidManifest.xml 
├── java
│   └── com
│       └── mahdirahmani8
│           └── mvp
│               ├── MainContract.java
│               ├── Model
│               │   ├── CreateUsers.java
│               │   └──  User.java
│               ├── Presenter
│               │   └── Presenter.java
│               └── View
│                   └── Main
│                       └── MainActivity.java
└── res
 ```

# Persian :

معماری MVP همون طور که از اسمش معلومه دارای ۳ قسمت هست
### مدل 'Model'
توی قسمت مدل ما هر چیزی که رد دیتا توش باشه رو باید بذاریم اون جا 
مثلا فایل های مربوط به دیتابیس یا API هایی که از سرور میان

### ویو 'View' 
هر چیزی که بشه اون رو دید رو بهش میگیم ویو 
و نکته خیلی مهم این هست که ویو هیچ مغزی نداره 
و نباید هیچ کاری انجام بده جز نمایش یک سری دیتا

### پرزنتر 'Presenter'
خوب وظیفه این که کی و کجا و به چه ویویی باید چه چیزی رو نشون بدیم هم میوفته گردن پرزنتر 


توی این مثال ساده نحوه پیاده سازی یک معماری MVP رو میبینیم </br>
امیدوارم لذت ببرید 

