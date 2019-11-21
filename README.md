# react-native-picture-in-picture

//Under development, don't use it.

## Getting started

`$ npm install react-native-picture-in-picture --save`

## Android Setup
If you want support PIP in your app, register your video activity in your manifest by setting `android:supportsPictureInPicture` and `android:resizeableActivity` to `true`. Edit your `AndroidManifest.xml` :

```
<activity
    android:name=".MainActivity"
    android:label="@string/app_name"
    android:resizeableActivity="true"
    android:supportsPictureInPicture="true"
    android:configChanges=
    "screenSize|smallestScreenSize|screenLayout|orientation|keyboard|keyboardHidden"
    ...
```

## IOS Setup
// TODO

### Mostly automatic installation

`$ react-native link react-native-picture-in-picture`

## Usage
```javascript
import PictureInPicture from 'react-native-picture-in-picture';

function pipHandler(){
  PictureInPicture.start();
}
```
