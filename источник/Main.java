        // Задача 1
int clientOs = 1;
int iOS = 0;
int android = 1;
if (clientOs == iOS){
System.out.println("Установите версию приложения iOS");
}else {
System.out.println("Установите версию приложения Android");
    
}

// Задача 2

int clientDeviceYear = 2015;
int iOs = 0;
if (clientOs<clientDeviceYear && clientOs == android){
System.out.println("Установите облегченную версию приложения Android");
} else{
System.out.println("Установите  версию приложения Android");
}  if (clientOs<clientDeviceYear && clientOs == iOs){
System.out.println("Установите облегченную версию приложения iOs");
} else {
System.out.println("Установите версию приложения iOs");
}
//Задача3
int year = 2021;
if (year % 4 == 0 && year % 100 != 0 ||year % 400 == 0){
			System.out.println(year + "Год высокосный!");
		}else{
			System.out.println(year + "Год не высокосный!");
		}

// Задача4
int deliveryDistance = 95;
int deliveryDay = 1;
if (deliveryDistance<=20) {
System.out.println("Потребуется дней: " + deliveryDay);
}else if (deliveryDistance>20 && deliveryDistance <=60 ){
System.out.println("Потребуется дней: " + deliveryDay*2);
}else if (deliveryDistance>60 && deliveryDistance <=100){
System.out.println("Потребуется дней: " + deliveryDay*3);
}else{
System.out.println("Потребуется дней больше 3 " );
}

// Задача5
int monthNumber = 10;
switch (monthNumber){
case 12:
case 1:
case 2:
System.out.println("Зима");
case 3:
case 4:
case 5:
System.out.println("Весна");
case 6:
case 7:
case 8:
System.out.println("Лето");
case 9:
case 10:
case 11:
System.out.println("Осень");
}
