package app

abstract class PlatformApp {
    private var customApp: CustomApp = NoCustomApp()

    protected fun setCustomApp(app: CustomApp){
        customApp = app
    }

    fun runApp(){
        updateApp()
        getNotificationsForThisApp()
        customApp.run()
    }

    private fun updateApp(){
        println("App is updated")
    }

    private fun getNotificationsForThisApp(){
        println("App notifications received")
    }
}