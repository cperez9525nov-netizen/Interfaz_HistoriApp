# PROYECTO DE DESARROLLO DE INTERFACES

# 🛡️ HistoriApp — Jakarta EE & PrimeFaces Web Application

HistoriApp es una plataforma web desarrollada en **Jakarta EE** y **PrimeFaces**, diseñada para ofrecer una experiencia interactiva orientada a la gestión geoespacial e histórica. El proyecto implementa un diseño profesional basado en un sistema de diseño unificado (*Design System*) con **Bootstrap 5** y modo oscuro forzado.

---

## 🚀 Características Principales y Módulos

* **UI/UX Moderno y Dark Mode Enforcado**: 
  * Interfaz completamente oscurecida y estandarizada mediante `style.css` y `style_login.css` con reglas `!important` para sobrescribir valores por defecto del navegador y autocompletados.
  * Iconografía unificada utilizando **Bootstrap Icons** (`bi-swords`, `bi-person-circle`, etc.) para garantizar la legibilidad y mantenibilidad del código.
* **Navegación Dinámica y Breadcrumbs**:
  * Menú de migas de pan inteligente adaptado según la vista actual del usuario.
* **Gestión de Sesión, Autenticación y Perfil (`LoginBean`, `RegistroBean`, `UsuarioBean`)**:
  * Control completo de acceso de usuarios, recuperación de contraseñas y retroalimentación instantánea mediante `p:growl` para notificaciones de actualización.
* **Módulos Interactivos en el Footer (`template.xhtml`)**:
  * **Suscripción y Enlaces**: Acceso rápido y correo de contacto.
  * **Módulo de Reporte de Errores Interactivo (`ReporteBean`)**: Permite al usuario alternar estados de manera fluida (vista normal $\rightarrow$ formulario de reporte con textarea $\rightarrow$ mensaje de agradecimiento temporal). Cuenta con un temporizador automático de 5 segundos mediante `<p:poll>` y un botón de cancelar estilizado con efecto *hover* adaptado al diseño global.

---

## 🛠️ Tecnologías y Stack Utilizado

* **Backend**: Jakarta EE (Java), Session/Enterprise Beans.
* **Frontend**: Jakarta Faces (JSF), PrimeFaces 15, Bootstrap 5.3, Bootstrap Icons.
* **Control de Contenedores y Servlets**: Weld Servlet.
* **Estilos**: CSS3 personalizado con modo oscuro forzado.

---

## 📁 Estructura del Proyecto

```text
HistoriApp/
├── Jakarta/
│   ├── META-INF/
│   └── src/main/
│       ├── java/es/fempa/historiapp/
│       │   ├── Batallas.java
│       │   ├── BatallasBean.java
│       │   ├── LoginBean.java
│       │   ├── NewsletterBean.java
│       │   ├── RecuperarPasswordBean.java
│       │   ├── RegistroBean.java
│       │   ├── ReporteBean.java
│       │   ├── UsuarioBean.java
│       │   └── Usuarios.java
│       └── webapp/
│           ├── css/
│           │   ├── style.css
│           │   └── style_login.css
│           ├── img/                    # Recursos gráficos (coliseo, mapas, espadas)
│           ├── resources/javascript/
│           ├── WEB-INF/
│           │   ├── classes/
│           │   ├── lib/                # Librerías (PrimeFaces, Jakarta Faces, Weld)
│           │   ├── templates/
│           │   │   └── template.xhtml  # Plantilla principal (Header, Contenido, Footer dinámico)
│           │   ├── beans.xml
│           │   └── web.xml
│           ├── configuracion.xhtml
│           ├── index.xhtml             # Dashboard principal con mapas
│           ├── login.xhtml
│           └── perfil.xhtml
└── pom.xml
└── README.md
