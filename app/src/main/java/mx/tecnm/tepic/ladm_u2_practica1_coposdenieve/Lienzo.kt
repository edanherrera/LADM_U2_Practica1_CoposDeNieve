package mx.tecnm.tepic.ladm_u2_practica1_coposdenieve

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.view.View


class Lienzo(este:MainActivity): View(este) {
    var este = este
    //var circulos = Array<Circulos>(10,{Circulos(this@Lienzo)})
    override fun onDraw(c: Canvas) {

        super.onDraw(c)
        var p = Paint()

        //Creamos el fondo
        val fondo= Color.rgb(20,131,151)
        c.drawColor(fondo)

        p.color = Color.YELLOW
        //Creación de paredes
        c.drawRect(300f,600f,600f,900f,p)

        //Dibujo de techo
        var col =  arrayOf<Int>(Color.LTGRAY, Color.LTGRAY, Color.LTGRAY, Color.LTGRAY, Color.LTGRAY, Color.LTGRAY)
        val co = IntArray(6)
        co[0] =Color.LTGRAY
        co[1] = Color.LTGRAY
        co[2] = Color.LTGRAY
        co[3] = Color.LTGRAY
        co[4] = Color.LTGRAY
        co[5] = Color.LTGRAY
        var verti= FloatArray(6)
        verti[0] = 450f
        verti[1] = 400f
        verti[2] = 600f
        verti[3] = 600f
        verti[4] = 300f
        verti[5] = 600f
        c.drawVertices(Canvas.VertexMode.TRIANGLES,verti.size,verti,0,
            null,0,co, 0, null, 0, 0,p)


        //Dibujo arbol
        //tronco

    }
}