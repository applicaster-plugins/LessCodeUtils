# Less Code Utils
Library to make your life easier as an Android Developer.

## Date Utils
Methods regarding the work with dates.

##### `getCurrentDate(dateFormat: String): String`
It returns the current date with the desired format.
`dateFormat` can be `yyyy-MM-dd'T'HH:mm:ss` for example.

## Alert Utils
Methods related to get/show alert dialogs.

##### `showAlertDialog(context, title, message, positiveBtnText, listener)`
It shows an alert dialog.

##### `getAlertDialog(context, title, message, positiveBtnText): AlertDialog`
It returns an `AlertDialog` with a default listener (that dismisses the dialog).

##### `getAlertDialog(context, title, message, positiveBtnText, listener) : AlertDialog`
It returns an `AlertDialog` with a custom listener (defined by `listener`).

## Adding module dependency to the project
Add the dependency in the `build.gradle` file of your module:
```
implementation "com.applicaster:LessCodeUtils-Android:x.x.x"
```

If you start contributing and want to make tests locally in your app you will need to add the following snippet instead:
```
def lessCodeLib = findProject(':LessCodeUtils')
if (lessCodeLib != null) {
    implementation(project(":LessCodeUtils"))
} else {
    implementation "com.applicaster:LessCodeUtils-Android:x.x.x"
}
```