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
ColorToast.roundInfo(YourActivity.this, 
"Hello World, I'm Round Toast Info"), Toast.LENGTH_SHORT);  

ColorToast.roundInfo(YourActivity.this, 
"Toast Title", "Hello World, I'm Round Toast Info"), Toast.LENGTH_SHORT);  


ColorToast.roundColorInfo(YourActivity.this, 
"Hello World, I'm Round Color Toast Info"), Toast.LENGTH_SHORT);  

ColorToast.roundColorInfo(YourActivity.this, 
"Toast Title", "Hello World, I'm Round Color Toast Info"), Toast.LENGTH_SHORT);  


ColorToast.roundLineInfo(YourActivity.this, 
"Hello World, I'm Round Line Toast Info"), Toast.LENGTH_SHORT);  

ColorToast.roundLineInfo(YourActivity.this, 
"Toast Title", "Hello World, I'm Round Line Color Toast Info"), Toast.LENGTH_SHORT);   
```
```Java
ColorToast.squareInfo(YourActivity.this, 
"Hello World, I'm Square Toast Info"), Toast.LENGTH_SHORT);  

ColorToast.squareInfo(YourActivity.this, 
"Toast Title", "Hello World, I'm Square Toast Info"), Toast.LENGTH_SHORT);  


ColorToast.squareColorInfo(YourActivity.this, 
"Hello World, I'm Square Color Toast Info"), Toast.LENGTH_SHORT);  

ColorToast.squareColorInfo(YourActivity.this, 
"Toast Title", "Hello World, I'm Square Color Toast Info"), Toast.LENGTH_SHORT);  


ColorToast.squareLineInfo(YourActivity.this, 
"Hello World, I'm Square Line Toast Info"), Toast.LENGTH_SHORT);  

ColorToast.squareLineInfo(YourActivity.this, 
"Toast Title", "Hello World, I'm Square Line Color Toast Info"), Toast.LENGTH_SHORT);                              
```
```Java
ColorToast.blockInfo(YourActivity.this, 
"Hello World, I'm Block Toast Info"), Toast.LENGTH_SHORT);  

ColorToast.blockInfo(YourActivity.this, 
"Toast Title", "Hello World, I'm Block Toast Info"), Toast.LENGTH_SHORT);  


ColorToast.blockColorInfo(YourActivity.this, 
"Hello World, I'm Block Color Toast Info"), Toast.LENGTH_SHORT);  

ColorToast.blockColorInfo(YourActivity.this, 
"Toast Title", "Hello World, I'm Block Color Toast Info"), Toast.LENGTH_SHORT);  


ColorToast.blockLineInfo(YourActivity.this, 
"Hello World, I'm Block Line Toast Info"), Toast.LENGTH_SHORT);  

ColorToast.blockLineInfo(YourActivity.this, 
"Toast Title", "Hello World, I'm Block Line Color Toast Info"), Toast.LENGTH_SHORT);                              
```

### ![](https://img.shields.io/badge/Round_Toast-Warning-F7B71D) ![](https://img.shields.io/badge/Square_Toast-Warning-F7B71D) ![](https://img.shields.io/badge/Block_Toast-Warning-F7B71D)
```Java
ColorToast.roundWarning(YourActivity.this, 
"Hello World, I'm Round Toast Warning"), Toast.LENGTH_SHORT);  

ColorToast.roundWarning(YourActivity.this, 
"Toast Title", "Hello World, I'm Round Toast Warning"), Toast.LENGTH_SHORT);  


ColorToast.roundColorWarning(YourActivity.this, 
"Hello World, I'm Round Color Toast Warning"), Toast.LENGTH_SHORT);  

ColorToast.roundColorWarning(YourActivity.this, 
"Toast Title", "Hello World, I'm Round Color Toast Warning"), Toast.LENGTH_SHORT);  


ColorToast.roundLineWarning(YourActivity.this, 
"Hello World, I'm Round Line Toast Warning"), Toast.LENGTH_SHORT);  

ColorToast.roundLineWarning(YourActivity.this, 
"Toast Title", "Hello World, I'm Round Line Color Toast Warning"), Toast.LENGTH_SHORT);   
```
```Java
ColorToast.squareWarning(YourActivity.this, 
"Hello World, I'm Square Toast Warning"), Toast.LENGTH_SHORT);  

ColorToast.squareWarning(YourActivity.this, 
"Toast Title", "Hello World, I'm Square Toast Warning"), Toast.LENGTH_SHORT);  


ColorToast.squareColorWarning(YourActivity.this, 
"Hello World, I'm Square Color Toast Warning"), Toast.LENGTH_SHORT);  

ColorToast.squareColorWarning(YourActivity.this, 
"Toast Title", "Hello World, I'm Square Color Toast Warning"), Toast.LENGTH_SHORT);  


ColorToast.squareLineWarning(YourActivity.this, 
"Hello World, I'm Square Line Toast Warning"), Toast.LENGTH_SHORT);  

ColorToast.squareLineWarning(YourActivity.this, 
"Toast Title", "Hello World, I'm Square Line Color Toast Warning"), Toast.LENGTH_SHORT);  
```
```Java
ColorToast.blockWarning(YourActivity.this, 
"Hello World, I'm Block Toast Warning"), Toast.LENGTH_SHORT);  

ColorToast.blockWarning(YourActivity.this, 
"Toast Title", "Hello World, I'm Block Toast Warning"), Toast.LENGTH_SHORT);  


ColorToast.blockColorWarning(YourActivity.this, 
"Hello World, I'm Block Color Toast Warning"), Toast.LENGTH_SHORT);  

ColorToast.blockColorWarning(YourActivity.this, 
"Toast Title", "Hello World, I'm Block Color Toast Warning"), Toast.LENGTH_SHORT);  


ColorToast.blockLineWarning(YourActivity.this, 
"Hello World, I'm Block Line Toast Warning"), Toast.LENGTH_SHORT);  

ColorToast.blockLineWarning(YourActivity.this, 
"Toast Title", "Hello World, I'm Block Line Color Toast Warning"), Toast.LENGTH_SHORT);  
```

### ![](https://img.shields.io/badge/Round_Toast-Error-FA1E0E) ![](https://img.shields.io/badge/Square_Toast-Error-FA1E0E) ![](https://img.shields.io/badge/Block_Toast-Error-FA1E0E)
```Java
ColorToast.showRoundToastError(YourActivity.this, 
"Hello World, I'm Round Toast Error"), Toast.LENGTH_SHORT);                             
```
```Java
ColorToast.showSquareToastError(YourActivity.this, 
"Hello World, I'm Square Toast Error"), Toast.LENGTH_SHORT);                             
```
```Java
ColorToast.showBlockToastError(YourActivity.this, 
"Hello World, I'm Block Toast Error"), Toast.LENGTH_SHORT);                             
```

### ![](https://img.shields.io/badge/Round_Toast-Success-21BF73) ![](https://img.shields.io/badge/Square_Toast-Success-21BF73) ![](https://img.shields.io/badge/Block_Toast-Success-21BF73)
```Java
ColorToast.showRoundToastSuccess(YourActivity.this, 
"Hello World, I'm Round Toast Success"), Toast.LENGTH_SHORT);                             
```
```Java
ColorToast.showSquareToastSuccess(YourActivity.this, 
"Hello World, I'm Square Toast Success"), Toast.LENGTH_SHORT);                             
```
```Java
ColorToast.showBlockToastSuccess(YourActivity.this, 
"Hello World, I'm Block Toast Success"), Toast.LENGTH_SHORT);                             
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
