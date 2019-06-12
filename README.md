# AndroidFragment3
Send data between 2 fragments using shared ViewModel


We use ViewModel to update data to other fragments. 

If you display one fragment and switch between the 2, this would work too because the data is not stored in the fragments but in the ViewModel which has its lifecycle.

When the fragment comes to the screen it asdds observer to the live data and update with the newest data.

You can access this data in the MainActivity too because the ViewModel belongs to this Activity.
