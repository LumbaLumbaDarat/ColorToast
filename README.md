# ColorToast
Simple Toast with Custom Color

[![platform](https://img.shields.io/badge/platform-Android-yellow.svg)](https://www.android.com)
[![](https://jitpack.io/v/LumbaLumbaDarat/ColorToast.svg)](https://jitpack.io/#LumbaLumbaDarat/ColorToast)

# About
Simple Toast with 4 Colors Indicator.
Info, Warning, Error, and Success.
Each Toast have different style background.
Round Background, Square Background, and Block (this will pop up in top your Apps.)

# Depencies
- Add JitPack to build.gradle
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

- Add implementation to build.gradle app
```
	dependencies {
	        implementation 'com.github.LumbaLumbaDarat:ColorToast:1.0.0' 
	}
```
# Uses
### -Round Toast
```
ColorToast.showRoundToastInfo(YourActivity.this, 
"Hello World, I'm Round Toast Info"), Toast.LENGTH_SHORT);                             
```
```
ColorToast.showRoundToastWarning(YourActivity.this, 
"Hello World, I'm Round Toast Warning"), Toast.LENGTH_SHORT);                             
```
```
ColorToast.showRoundToastError(YourActivity.this, 
"Hello World, I'm Round Toast Error"), Toast.LENGTH_SHORT);                             
```
```
ColorToast.showRoundToastSuccess(YourActivity.this, 
"Hello World, I'm Round Toast Success"), Toast.LENGTH_SHORT);                             
```

### -Square Toast
```
ColorToast.showSquareToastInfo(YourActivity.this, 
"Hello World, I'm Square Toast Success"), Toast.LENGTH_SHORT);                             
```
```
ColorToast.showSquareToastWarning(YourActivity.this, 
"Hello World, I'm Square Toast Warning"), Toast.LENGTH_SHORT);                             
```
```
ColorToast.showSquareToastError(YourActivity.this, 
"Hello World, I'm Square Toast Error"), Toast.LENGTH_SHORT);                             
```
```
ColorToast.showSquareToastSuccess(YourActivity.this, 
"Hello World, I'm Square Toast Success"), Toast.LENGTH_SHORT);                             
```

### -Block Toast
```
ColorToast.showBlockToastInfo(YourActivity.this, 
"Hello World, I'm Block Toast Info"), Toast.LENGTH_SHORT);                             
```
```
ColorToast.showBlockToastWarning(YourActivity.this, 
"Hello World, I'm Block Toast Warning"), Toast.LENGTH_SHORT);                             
```
```
ColorToast.showBlockToastError(YourActivity.this, 
"Hello World, I'm Block Toast Error"), Toast.LENGTH_SHORT);                             
```
```
ColorToast.showBlockToastSuccess(YourActivity.this, 
"Hello World, I'm Block Toast Success"), Toast.LENGTH_SHORT);                             
```
