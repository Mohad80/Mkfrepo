from kivy.app import App
from kivy.uix.gridlayout import GridLayout
from kivy.config import Config
Config.set("graphics", "resizable", 1)
# noinspection PyBroadException
class MGL(GridLayout):
    def calc(self, event):
        if event:
            try:
                self.display.text = str(eval(event))
            except:
                self.display.text = "error"
class TestApp(App):
    def build(self):
        return MGL()
TestApp().run()