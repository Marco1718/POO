package edu.marco.garcia.actividades.proyecto.lang;

public class Esp extends Lang{

    public Esp(){

        menu_login="\n╔═══════════════════════════╗\n║      Iniciar sesión       ║\n╠═══════════════════════════╣\n║ No tengo una cuenta       ║\n║ 1. Registrarse            ║\n║                           ║\n║ Ya tengo una cuenta       ║\n║ 2. Iniciar sesión         ║\n║                           ║\n║ 3. Salir                  ║\n╚═══════════════════════════╝";
        menu_admin="\n╔═══════════════════════════════════════════════════════════╗\n║                 MENÚ DE ADMINISTRADOR                     ║\n╠═══════════════════════════════════════════════════════════╣\n║     1. Consultar personas registradas en la biblioteca    ║\n║     2. Agregar nuevos libros a la biblioteca              ║\n║     3. Mostrar libros en stock                            ║\n║     4. Ver préstamos activos                              ║\n║     5. Ver todos los prestamos  del mes                   ║\n║     6. Libros más populares                               ║\n║     7. Libros menos populares                             ║\n║     8. Forzar recuperación de libros                      ║\n║     9. Mostrar prestamos vencidos                         ║\n║     10. Mostrar usuarios vencidos                         ║\n║     11. Mostrar lista negra                               ║\n║     12. Mostrar lista de honor                            ║\n║     13. Salir                                             ║\n╚═══════════════════════════════════════════════════════════╝";
        menu_user="\n╔══════════════════════════════════════════════╗\n║                    MENÚ                      ║\n╠══════════════════════════════════════════════╣\n║     1. Ver libros disponibles                ║\n║     2. Solicitar préstamo de un libro        ║\n║     3. Préstamos activos                     ║\n║     4. Devolver un libro                     ║\n║     5. Salir                                 ║\n╚══════════════════════════════════════════════╝";
        invalid_option="\n╔════════════════════════════════════════════════════════════════════════════╗\n║  Opción no válida, no puedes ingresar números que no están en el menú      ║\n╚════════════════════════════════════════════════════════════════════════════╝";
        username_prompt="\n╔══════════════════════════════════════════╗\n║ Excelente, ingresa tu nombre de usuario  ║\n╚══════════════════════════════════════════╝\n";
        password_prompt="\n╔═══════════════════════════════╗\n║   Ahora ingresa tu contraseña ║\n╚═══════════════════════════════╝\n";
        welcome_admin="\n╔═══════════════════════════╗\n║  Bienvenido Administrador ║\n╚═══════════════════════════╝";
        welcome_user="\n╔═════════════════════════════╗\n║  Bienvenido de vuelta, ";
        welcome_user_format=" ║\n╚═════════════════════════════╝";
        goodbye="\n╔════════════╗\n║  ¡Adiós!   ║\n╚════════════╝";
        register_user="\n╔═══════════════════════════════════╗\n║   Ingresa un nombre de usuario para registrarte    ║\n╚═══════════════════════════════════╝";
        register_password="\n╔═══════════════════════════════════╗\n║     Ingresa una contraseña segura       ║\n╚═══════════════════════════════════╝";
        registration_success="\n╔═════════════════════════════════╗\n║  ¡Cuenta creada con éxito!  ║\n╚═════════════════════════════════╝";
        invalid_credentials="\n╔═══════════════════════════╗\n║    Credenciales inválidas    ║\n╚═══════════════════════════╝";
        book_added="\n╔══════════════════════════════════════════╗\n║  ¡Libro agregado exitosamente al catálogo! ║\n╚══════════════════════════════════════════╝";
        book_borrow_success="\nLibro prestado con éxito";
        book_not_available="\nEl libro no está disponible";
        invalid_input_empty = "\n╔═════════════════════════════════════════════════════╗\n║  Opción no válida, no puedes dejar el campo vacío   ║\n╚═════════════════════════════════════════════════════╝";
        invalid_input_not_number = "\n╔═══════════════════════════════════════════════════════════╗\n║       Opción no válida, por favor ingresa un número       ║\n╚═══════════════════════════════════════════════════════════╝";
        invalid_option_out_of_range = "\n╔════════════════════════════════════════════════════════════════════════════╗n║    Opción no válida, solo puedes ingresar carácteres numéricos       ║\n╚════════════════════════════════════════════════════════════════════════════╝";
        enter_book_title_prompt = "\n╔══════════════════════════════╗\n║ Ingresa el título del libro  ║\n╚══════════════════════════════╝\n";
        invalid_title="\n╔═════════════════════════════════════════════════════════╗\n║        El libro debe tener un nombre, inténtalo de nuevo           ║\n╚═════════════════════════════════════════════════════════╝";
        enter_book_author_prompt = "\n╔═══════════════════════════════╗\n║ Ingresa el autor del libro  ║\n╚═══════════════════════════════╝\n";
        invalid_author="\n╔════════════════════════════════════════════════════════╗\n║    El libro debe tener un autor, inténtalo de nuevo.          ║\n╚════════════════════════════════════════════════════════╝";
        enter_book_isbn_prompt = "\n╔═════════════════════════════╗\n║ Ingresa el ISBN del libro  ║\n╚═════════════════════════════╝\n";
        invalid_isbn="\n╔══════════════════════════════════════════════════════════════╗\n║        El libro debe tener un código ISBN, inténtalo de nuevo.           ║\n╚══════════════════════════════════════════════════════════════╝";
        enter_book_genre_prompt = "\n╔══════════════════════════════╗\n║ Ingresa el género del libro  ║\n╚══════════════════════════════╝\n";
        invalid_genre="\n╔══════════════════════════════════════════════════════════════════════════╗\n║        El libro debe pertenecer a un género literario, inténtalo de nuevo.            ║\n╚══════════════════════════════════════════════════════════════════════════╝";
        enter_book_year_prompt = "\n╔════════════════════════════════════╗\n║ Ingresa el año de publicación del libro  ║\n╚════════════════════════════════════╝\n";
        year_of_publication_negative_error = "\n╔══════════════════════════════════════════════════════════════╗\n║        El año de publicación no puede ser negativo.           ║\n╚══════════════════════════════════════════════════════════════╝";
        year_of_publication_future_error = "\n╔══════════════════════════════════════════════════════════════╗\n║        El año de publicación aún no ha llegado. Ingresa un año válido (hasta 2025).  ║\n╚══════════════════════════════════════════════════════════════╝";
        book_entry_success = "\n╔════════════════════════════════════════╗\n║ El libro se registrará como disponible  ║\n╚════════════════════════════════════════╝";
        book_borrow_name_prompt = "\n╔═════════════════════════════════════════════════════════╗\n║     Ingresa el ISBN del libro que deseas pedir prestado       ║\n╚═════════════════════════════════════════════════════════╝";
        no_active_loans_message = "\n╔════════════════════════════════════════════════╗\n║    Estos son los libros que has pedido prestados       ║\n╚════════════════════════════════════════════════╝";
        no_books_borrowed_message = "\nNo tienes préstamos activos";
        show_books_in_catalog_message = "\n╔════════════════════════════════════════════╗\n║  Este es nuestro catálogo actual de libros      ║\n╚════════════════════════════════════════════╝";               
        number_format_exception = "\n╔══════════════════════════════════════════════════════════════╗\n║        Solo puedes ingresar números, intenta de nuevo.         ║\n╚══════════════════════════════════════════════════════════════╝";
        exit_admin = "\n╔══════════════════════════════════════╗\n║  Saliendo del menú de administrador  ║\n╚══════════════════════════════════════╝";
        singning_out = "\n╔═══════════════════════════════╗\n║  Cerrando sesión de tu cuenta  ║\n╚═══════════════════════════════╝";
        return_to_menu = "\nPresiona ENTER para volver al menú...";
        invalid_new_username = "\n╔══════════════════════════════════════════════════════════════════════════════════╗\n║          Ingresa un nombre de usuario válido, no puede estar vacío, inténtalo de nuevo            ║\n╚══════════════════════════════════════════════════════════════════════════════════╝";
        invalid_new_password = "\n╔═══════════════════════════════════════════════════════════════╗\n║     La contraseña no puede dejarse en blanco, intenta de nuevo       ║\n╚═══════════════════════════════════════════════════════════════╝";
        registered_people ="\n╔══════════════════════════════════════════════╗\n║ Las personas registradas en el sistema son:     ║\n╚══════════════════════════════════════════════╝";
        show_active_loans ="\nMostrando préstamos activos...";
        select_an_option = "\nSelecciona una opción: ";
        author="Autor: ";
        title ="Título: ";
        isbn="ISBN: ";
        genre="Género: ";
        year_book="Año de publicación: ";
        username="Nombre de usuario: ";
        password="Contraseña: ";

        //CLI
        enter_age =
                "╔═══════════════════╗\n" +
                "║  Ingrese su edad  ║\n" +
                "╚═══════════════════╝\n";

        age =
                "╔════════════╗\n" +
                "║  Edad:     ║\n" +
                "╚════════════╝\n";

        age_negative =
                "╔════════════════════════════════╗\n" +
                "║  La edad no puede ser negativa ║\n" +
                "╚════════════════════════════════╝\n";

        error_valid_number =
                "╔════════════════════════════╗\n" +
                "║  Ingrese un número válido  ║\n" +
                "╚════════════════════════════╝\n";

        error_real_name =
                "╔═══════════════════════════╗\n" +
                "║  Ingrese un nombre real   ║\n" +
                "╚═══════════════════════════╝\n";

        name_with_colon =
                "╔════════════╗\n" +
                "║  Nombre:   ║\n" +
                "╚════════════╝\n";

        error_valid_name =
                "╔════════════════════════════╗\n" +
                "║  Ingrese un nombre válido  ║\n" +
                "╚════════════════════════════╝\n";

        vip_user =
                "╔══════════════╗\n" +
                "║  Usuario VIP ║\n" +
                "╚══════════════╝\n";

        jr_user =
                "╔══════════════╗\n" +
                "║  Usuario JR  ║\n" +
                "╚══════════════╝\n";

        teen_user =
                "╔═══════════════╗\n" +
                "║  Usuario Teen ║\n" +
                "╚═══════════════╝\n";

        admin =
                "╔════════════╗\n" +
                "║  Admin     ║\n" +
                "╚════════════╝\n";

        currently_available =
                "╔══════════════════════════════╗\n" +
                "║  Actualmente disponibles     ║\n" +
                "╚══════════════════════════════╝\n";

        currently_borrowed =
                "╔═══════════════════════════════╗\n" +
                "║  Actualmente prestados        ║\n" +
                "╚═══════════════════════════════╝\n";

        user =
                "╔════════════╗\n" +
                "║  Usuario:  ║\n" +
                "╚════════════╝\n";

        name =
                "╔════════════╗\n" +
                "║  Nombre:   ║\n" +
                "╚════════════╝\n";

        user_type =
                "╔════════════════════════╗\n" +
                "║  Tipo de usuario:      ║\n" +
                "╚════════════════════════╝\n";

        jr_menu =
                "╔════════════════════════╗\n" +
                "║  Menú de usuario JR    ║\n" +
                "╚════════════════════════╝\n";

        vip_menu =
                "╔════════════════════════╗\n" +
                "║  Menú de usuario VIP   ║\n" +
                "╚════════════════════════╝\n";

        teens_menu =
                "╔════════════════════════╗\n" +
                "║  Menú de usuario Teen  ║\n" +
                "╚════════════════════════╝\n";

        no_books_available =
                "╔══════════════════════════════╗\n" +
                "║  No hay libros disponibles   ║\n" +
                "╚══════════════════════════════╝\n";

        available_books =
                "╔════════════════════════╗\n" +
                "║  Libros disponibles    ║\n" +
                "╚════════════════════════╝\n";

        error_same_unique_code =
                "╔═════════════════════════════════════════════════════════════════════════════╗\n" +
                "║  El libro no se puede agregar, ya existe un libro con el mismo código único ║\n" +
                "╚═════════════════════════════════════════════════════════════════════════════╝\n";

        borrowed_success =
                "╔════════════════════════════════╗\n" +
                "║  Préstamo realizado con éxito  ║\n" +
                "╚════════════════════════════════╝\n";

        adult_borrowed =
                "╔═════════════════════════════════════════════════════════════════════════════════════════════╗\n" +
                "║  El libro se ha prestado por 7 días por ser un usuario adulto recuerda devolverlo a tiempo  ║\n" +
                "╚═════════════════════════════════════════════════════════════════════════════════════════════╝\n";

        return_book =
                "╔══════════════════╗\n" +
                "║  Devolver libro  ║\n" +
                "╚══════════════════╝\n";

        enter_isbn =
                "╔═══════════════════════════════════════════════╗\n" +
                "║  Ingrese el ISBN del libro que desea devolver ║\n" +
                "╚═══════════════════════════════════════════════╝\n";

        entered_invalid_isbn =
                "╔═══════════════════════════╗\n" +
                "║  Ingrese un ISBN válido   ║\n" +
                "╚═══════════════════════════╝\n";

        teen_borrowed =
                "╔══════════════════════════════════════════════════════════════════════════════════════════╗\n" +
                "║  El libro se ha prestado por 7 días por ser un usuario teen recuerda devolverlo a tiempo ║\n" +
                "╚══════════════════════════════════════════════════════════════════════════════════════════╝\n";

        vip_borrowed =
                "╔══════════════════════════════════════════════════════════════════════════════════════════╗\n" +
                "║  El libro se ha prestado por 14 días por ser un usuario VIP recuerda devolverlo a tiempo ║\n" +
                "╚══════════════════════════════════════════════════════════════════════════════════════════╝\n";

        //bibliotecario
        fantasy =
                "╔════════════╗\n" +
                "║  Fantasía  ║\n" +
                "╚════════════╝\n";

        god =
                "╔══════════════════╗\n" +
                "║  Juego de tronos ║\n" +
                "╚══════════════════╝\n";

        lotr =
                "╔═══════════════════════════╗\n" +
                "║  El señor de los anillos  ║\n" +
                "╚═══════════════════════════╝\n";

        hp =
                "╔════════════════╗\n" +
                "║  Harry Potter  ║\n" +
                "╚════════════════╝\n";

        tlp =
                "╔════════════════╗\n" +
                "║  El principito ║\n" +
                "╚════════════════╝\n";

        ohyos =
                "╔════════════════════════╗\n" +
                "║  Cien años de soledad  ║\n" +
                "╚════════════════════════╝\n";

        dqtlm =
                "╔═══════════════════════════╗\n" +
                "║  Don Quijote de la Mancha ║\n" +
                "╚═══════════════════════════╝\n";

        overdue_loans =
                "╔════════════════════════╗\n" +
                "║  Préstamos vencidos    ║\n" +
                "╚════════════════════════╝\n";

        date_pattern =
                "╔════════════════════╗\n" +
                "║  yyyy-MM-dd       ║\n" +
                "╚════════════════════╝\n";

        overdue =
                "╔════════════╗\n" +
                "║  Vencido   ║\n" +
                "╚════════════╝\n";

        book =
                "╔════════════╗\n" +
                "║  Libro:    ║\n" +
                "╚════════════╝\n";

        return_date =
                "╔═══════════════════════╗\n" +
                "║  Fecha de devolución: ║\n" +
                "╚═══════════════════════╝\n";

        error_comparing_dates =
                "╔═════════════════════════════╗\n" +
                "║  Error al comparar fechas:  ║\n" +
                "╚═════════════════════════════╝\n";

        no_overdue_loans =
                "╔═════════════════════════════════════════════╗\n" +
                "║  No hay préstamos vencidos en la biblioteca ║\n" +
                "╚═════════════════════════════════════════════╝\n";

        borrowed =
                "╔════════════╗\n" +
                "║  Prestado  ║\n" +
                "╚════════════╝\n";

        new_return_date =
                "╔═══════════════════════════════════╗\n" +
                "║  Nueva fecha de devolución para:  ║\n" +
                "╚═══════════════════════════════════╝\n";

        with_the_book =
                "╔══════════════════╗\n" +
                "║  con el libro    ║\n" +
                "╚══════════════════╝\n";

        colon = ":";

        error_modifing_date =
                "╔══════════════════════════════════════════════╗\n" +
                "║  Error al modificar la fecha del préstamo:   ║\n" +
                "╚══════════════════════════════════════════════╝\n";

        eror_already_exists =
                "╔════════════════════════════════╗\n" +
                "║  Error: El usuario ya existe.  ║\n" +
                "╚════════════════════════════════╝\n";

        adult_users =
                "╔══════════════════╗\n" +
                "║  Usuario adulto  ║\n" +
                "╚══════════════════╝\n";

        book_not_found =
                "╔════════════════════════════════╗\n" +
                "║  Error: Libro no encontrado    ║\n" +
                "╚════════════════════════════════╝\n";

        user_not_found =
                "╔════════════════════════════════╗\n" +
                "║  Error: Usuario no encontrado  ║\n" +
                "╚════════════════════════════════╝\n";

        overload_teens =
                "╔══════════════════════════════════════════════════════════════════════════════════════════╗\n" +
                "║  Solo puedes tener 1 libro prestado a la vez, por favor devuelvelo antes de pedir otro.  ║\n" +
                "╚══════════════════════════════════════════════════════════════════════════════════════════╝\n";

        overload_adult =
                "╔═════════════════════════════════════════════════════════════════════════════════════════════╗\n" +
                "║  Solo puedes tener 2 libros prestados a la vez, por favor devuelve uno antes de pedir otro. ║\n" +
                "╚═════════════════════════════════════════════════════════════════════════════════════════════╝\n";

        overload_vip =
                "╔═════════════════════════════════════════════════════════════════════════════════════════════╗\n" +
                "║  Solo puedes tener 5 libros prestados a la vez, por favor devuelve uno antes de pedir otro. ║\n" +
                "╚═════════════════════════════════════════════════════════════════════════════════════════════╝\n";

        error_saving_user =
                "╔═══════════════════════════════╗\n" +
                "║  Error al guardar usuarios:   ║\n" +
                "╚═══════════════════════════════╝\n";

        user_data_not_found =
                "╔══════════════════════════════════════════╗\n" +
                "║  No se encontraron datos de usuarios.    ║\n" +
                "╚══════════════════════════════════════════╝\n";

        error_saving_books =
                "╔═════════════════════════════╗\n" +
                "║  Error al guardar libros:   ║\n" +
                "╚═════════════════════════════╝\n";

        book_data_not_found =
                "╔══════════════════════════════════════╗\n" +
                "║  No se encontraron datos de libros.  ║\n" +
                "╚══════════════════════════════════════╝\n";

        stranger =
                "╔══════════════╗\n" +
                "║  Desconocido ║\n" +
                "╚══════════════╝\n";

        returned =
                "╔════════════╗\n" +
                "║  Devuelto  ║\n" +
                "╚════════════╝\n";

        succesfuly_returned =
                "╔═════════════════════════════╗\n" +
                "║  Libro devuelto con éxito   ║\n" +
                "╚═════════════════════════════╝\n";

        popular_books =
                "╔═══════════════════════╗\n" +
                "║  Libros más populares ║\n" +
                "╚═══════════════════════╝\n";

        no_popular_books =
                "╔═══════════════════════════════════════════╗\n" +
                "║  No hay libros populares en la biblioteca ║\n" +
                "╚═══════════════════════════════════════════╝\n";

        popularity =
                "╔══════════════╗\n" +
                "║  Popularidad ║\n" +
                "╚══════════════╝\n";

        users_with_overdue =
                "╔════════════════════════════════════╗\n" +
                "║  Usuarios con préstamos vencidos:  ║\n" +
                "╚════════════════════════════════════╝\n";

        no_users_with_overdue =
                "╔══════════════════════════════════════════╗\n" +
                "║  No hay usuarios con préstamos vencidos. ║\n" +
                "╚══════════════════════════════════════════╝\n";

        users_with_more_overdue =
                "╔════════════════════════════════════════╗\n" +
                "║  Usuarios con más préstamos vencidos:  ║\n" +
                "╚════════════════════════════════════════╝\n";

        overdue_loans_colon =
                "╔═══════════════════════╗\n" +
                "║  Préstamos vencidos:  ║\n" +
                "╚═══════════════════════╝\n";

        users_with_more_returns =
                "╔═════════════════════════════════════════╗\n" +
                "║  Usuarios con más préstamos entregados: ║\n" +
                "╚═════════════════════════════════════════╝\n";

        no_users_with_returns =
                "╔═════════════════════════════════════════════╗\n" +
                "║  No hay usuarios con préstamos entregados.  ║\n" +
                "╚═════════════════════════════════════════════╝\n";

        returned_loans =
                "╔══════════════════════════╗\n" +
                "║  Préstamos entregados:   ║\n" +
                "╚══════════════════════════╝\n";

        books_arranged_by_title =
                "╔════════════════════════════════╗\n" +
                "║  Libros ordenados por título:  ║\n" +
                "╚════════════════════════════════╝\n";

        no_books_on_library =
                "╔═══════════════════════════════════╗\n" +
                "║  No hay libros en la biblioteca.  ║\n" +
                "╚═══════════════════════════════════╝\n";

        unpopular_books =
                "╔═══════════════════════════╗\n" +
                "║  Libros menos populares   ║\n" +
                "╚═══════════════════════════╝\n";

        loans_of_month =
                "╔══════════════════════╗\n" +
                "║  Préstamos del mes:  ║\n" +
                "╚══════════════════════╝\n";

        no_loans_on_month =
                "╔════════════════════════════════════════════════════════════╗\n" +
                "║  No se han registrado prestamos en la biblioteca este mes. ║\n" +
                "╚════════════════════════════════════════════════════════════╝\n";

        active_loans =
                "╔═══════════════════════╗\n" +
                "║  Préstamos activos:   ║\n" +
                "╚═══════════════════════╝\n";

        no_active_loans =
                "╔═════════════════════════════════════════════╗\n" +
                "║  No hay préstamos activos en la biblioteca. ║\n" +
                "╚═════════════════════════════════════════════╝\n";

        active_loans_of =
                "╔════════════════════════════════╗\n" +
                "║  Préstamos activos de          ║\n" +
                "╚════════════════════════════════╝\n";

        asset_loans =
                "╔══════════════════════════════════╗\n" +
                "║  No tienes préstamos activos.    ║\n" +
                "╚══════════════════════════════════╝\n";

        error_book_already_registered =
                "╔═══════════════════════════════════════════╗\n" +
                "║  Error: El libro ya está registrado.      ║\n" +
                "╚═══════════════════════════════════════════╝\n";
    }
}
