# ColorToast
Simple Toast with Custom Color

[![platform](https://img.shields.io/badge/platform-Android-yellow.svg)](https://www.android.com)
[![](https://jitpack.io/v/LumbaLumbaDarat/ColorToast.svg)](https://jitpack.io/#LumbaLumbaDarat/ColorToast)

# About
Simple Toast with 4 Colors Indicator.
Info, Warning, Error, and Success.
Each Toast have different style background.
Round Background, Square Background, and Block (this will pop up in top your Apps.)
<br/>
[![](https://img.shields.io/badge/Minimum_Android_SDK-Android_6.0_(API_level_23)-FFFFFF)](https://developer.android.com/about/versions/marshmallow)
<br/>
[![](https://img.shields.io/badge/Demo_Apps-Download_in_Google_Drive-056AF3)](https://drive.google.com/file/d/1mcyjS8AHKoRt3z29B063zZ1gLu93VI6q/view?usp=sharing)

# Depencies
- Add JitPack to build.gradle
```Gradle
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

- Add implementation to build.gradle app
```Gradle
dependencies {
	implementation 'com.github.LumbaLumbaDarat:ColorToast:1.1.1'
}
```
# Uses
### ![](https://img.shields.io/badge/Round_Toast-Info-0E49B5) ![](https://img.shields.io/badge/Square_Toast-Info-0E49B5) ![](https://img.shields.io/badge/Block_Toast-Info-0E49B5)
```Java
//Toast with default Title
ColorToast.roundInfo(YourActivity.this, 
"Hello World, I'm Toast Info"), Toast.LENGTH_SHORT);

//Toast with Your Title
ColorToast.roundInfo(YourActivity.this, 
"Put Your Title in here", "Hello World, I'm Toast Info"), Toast.LENGTH_SHORT);

//Other method, with same parameter, and have different Model Toast
ColorToast.roundColorInfo
ColorToast.roundLineInfo
ColorToast.squareInfo
ColorToast.squareColorInfo
ColorToast.squareLineInfo
ColorToast.blockInfo
ColorToast.blockColorInfo
ColorToast.blockLineInfo 
```

### ![](https://img.shields.io/badge/Round_Toast-Warning-F7B71D) ![](https://img.shields.io/badge/Square_Toast-Warning-F7B71D) ![](https://img.shields.io/badge/Block_Toast-Warning-F7B71D)
```Java
//Toast with default Title
ColorToast.roundWarning(YourActivity.this, 
"Hello World, I'm Toast Warning"), Toast.LENGTH_SHORT);  

//Toast with Your Title
ColorToast.roundWarning(YourActivity.this, 
"Put Your Title in here", "Hello World, I'm Toast Warning"), Toast.LENGTH_SHORT);

//Other method, with same parameter, and have different Model Toast
ColorToast.roundColorWarning
ColorToast.roundLineWarning
ColorToast.squareWarning
ColorToast.squareColorWarning
ColorToast.squareLineWarning
ColorToast.blockWarning
ColorToast.blockColorWarning
ColorToast.blockLineWarning 
```
### ![](https://img.shields.io/badge/Round_Toast-Error-FA1E0E) ![](https://img.shields.io/badge/Square_Toast-Error-FA1E0E) ![](https://img.shields.io/badge/Block_Toast-Error-FA1E0E)
```Java
//Toast with default Title
ColorToast.roundError(YourActivity.this, 
"Hello World, I'm Toast Error"), Toast.LENGTH_SHORT);  

//Toast with Your Title
ColorToast.roundError(YourActivity.this, 
"Put Your Title in here", "Hello World, I'm Toast Error"), Toast.LENGTH_SHORT);

//Other method, with same parameter, and have different Model Toast
ColorToast.roundColorError
ColorToast.roundLineError
ColorToast.squareError
ColorToast.squareColorError
ColorToast.squareLineError
ColorToast.blockError
ColorToast.blockColorError
ColorToast.blockLineError 
```
### ![](https://img.shields.io/badge/Round_Toast-Success-21BF73) ![](https://img.shields.io/badge/Square_Toast-Success-21BF73) ![](https://img.shields.io/badge/Block_Toast-Success-21BF73)
```Java
//Toast with default Title
ColorToast.roundSuccess(YourActivity.this, 
"Hello World, I'm Toast Success"), Toast.LENGTH_SHORT);  

//Toast with Your Title
ColorToast.roundSuccess(YourActivity.this, 
"Put Your Title in here", "Hello World, I'm Toast Success"), Toast.LENGTH_SHORT);

//Other method, with same parameter, and have different Model Toast
ColorToast.roundColorSuccess
ColorToast.roundLineSuccess
ColorToast.squareSuccess
ColorToast.squareColorSuccess
ColorToast.squareLineSuccess
ColorToast.blockSuccess
ColorToast.blockColorSuccess
ColorToast.blockLineSuccess 
```

## Licence
```
	Copyright [2021] [Lumba Lumba Darat]

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```
