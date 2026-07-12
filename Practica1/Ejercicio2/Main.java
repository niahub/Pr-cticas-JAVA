//TIP Para <b>ejecutar</b> el código, presiona <shortcut actionId="Run"/> o
// haga clic en el icono <icon src="AllIcons.Actions.Execute"/> del margen.
void main() {
    char[][] matriz = {{'.', '.', '#', '#', '.', '.', '.', '.', '.', '.', '.'},
                        {'#', '.', '.', '.', '#', '.', '.', '.', '#', '.', '.'},
                        {'.', '#', '.', '.', '.', '.', '#', '.', '.', '#', '.'},
                        {'.', '.', '#', '.', '#', '.', '.', '.', '#', '.', '#'},
                        {'.', '#', '.', '.', '.', '#', '#', '.', '.', '#', '.'},
                        {'.', '.', '#', '.', '#', '#', '.', '.', '.', '.', '.'},
                        {'.', '#', '.', '#', '.', '#', '.', '.', '.', '.', '#'},
                        {'.', '#', '.', '.', '.', '.', '.', '.', '.', '.', '#'},
                        {'#', '.', '#', '#', '.', '.', '.', '#', '.', '.', '.'},
                        {'#', '.', '.', '.', '#', '#', '.', '.', '.', '.', '#'},
                        {'.', '#', '.', '.', '#', '.', '.', '.', '#', '.', '#'}};

    Esquiador esquiador = new Esquiador();

    int dts = esquiador.downTheSlope(matriz, 3, 1);
    int jts = esquiador.jumpTheSlope(matriz, 3, 1);
    System.out.println("Nos hemos chocado con " + dts + " árboles usando downTheSlope");
    System.out.println("Nos hemos chocado con " + jts + " árboles usando jumpTheSlope");


}

