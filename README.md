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