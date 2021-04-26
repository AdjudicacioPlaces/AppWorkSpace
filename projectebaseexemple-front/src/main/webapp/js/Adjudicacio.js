$(document).ready(function() {
	//Relacio d'adjudicacions
    $('#places_adjudicades').DataTable( {
    	"ajax": "files/arrays.txt",
    	"columns": [
            { "data": "data_adjudicacio" },
            { "data": "llocs_treball" },
            { "data": "convocatoria" },
            { "data": "funcions" },
            { "data": "tipus" },
            { "data": "mitja_jornada" },
            { "data": "itinerant" },
            { "data": "data_inici" },
            { "data": "data_finalitzacio_prevista" },
            { "data": "data_peticio_director" },
            { "data": "motiu" }   
        ],
        "language": {
            "processing": "Processant...",
            "lengthMenu": "Mostra _MENU_ registres",
            "zeroRecords": "No s'han trobat registres",
            "emptyTable": "No hi ha registres disponible en aquesta taula",
            "info": "Mostrant del _START_ al _END_ d'un total de _TOTAL_ registres",
            "infoEmpty": "No hi ha registres disponibles",
            "infoFiltered": "(filtrat de _MAX_ registres)",
            "search": "Cerca:",
            "infoThousands": ".",
            "decimal": ",",
            "loadingRecords": "Carregant...",
            "paginate": {
                "first": "Primer",
                "previous": "Anterior",
                "next": "Següent",
                "last": "Últim"
            },
            "aria": {
                "sortAscending": ": Activa per ordenar la columna de manera ascendent",
                "sortDescending": ": Activa per ordenar la columna de manera descendent"
            },
            "buttons": {
                "print": "Imprimeix",
                "copy": "Copia",
                "colvis": "Columnes",
                "copyTitle": "Copia al portapapers",
                "copySuccess": {
                    "_": "%d files copiades",
                    "1": "1 fila copiada"
                },
                "pageLength": {
                    "-1": "Mostra totes les files",
                    "_": "Mostra %d files"
                },
                "pdf": "PDF"
            },
            "select": {
                "rows": {
                    "_": "%d files seleccionades",
                    "0": "Cap fila seleccionada",
                    "1": "1 fila seleccionada"
                }
            },
            "autoFill": {
                "cancel": "Cancel·lar"
            },
            "thousands": ".",
            "datetime": {
                "hours": "Hora",
                "minutes": "Minut",
                "seconds": "Segons",
                "unknown": "Desconegut",
                "amPm": [
                    "am",
                    "pm"
                ]
            },
            "editor": {
                "close": "Tancar"
            }
        },
    } );
//Places no adjudicades
    $('#places_no_adjudicades').DataTable( {
    	"ajax": "files/arrays.txt",
    	"columns": [
            { "data": "data_adjudicacio" },
            { "data": "llocs_treball" },
            { "data": "convocatoria" },
            { "data": "funcions" },
            { "data": "tipus" },
            { "data": "mitja_jornada" },
            { "data": "itinerant" },
            { "data": "data_inici" },
            { "data": "data_finalitzacio_prevista" },
            { "data": "data_peticio_director" },
            { "data": "motiu" }   
        ],
        "language": {
            "processing": "Processant...",
            "lengthMenu": "Mostra _MENU_ registres",
            "zeroRecords": "No s'han trobat registres",
            "emptyTable": "No hi ha registres disponible en aquesta taula",
            "info": "Mostrant del _START_ al _END_ d'un total de _TOTAL_ registres",
            "infoEmpty": "No hi ha registres disponibles",
            "infoFiltered": "(filtrat de _MAX_ registres)",
            "search": "Cerca:",
            "infoThousands": ".",
            "decimal": ",",
            "loadingRecords": "Carregant...",
            "paginate": {
                "first": "Primer",
                "previous": "Anterior",
                "next": "Següent",
                "last": "Últim"
            },
            "aria": {
                "sortAscending": ": Activa per ordenar la columna de manera ascendent",
                "sortDescending": ": Activa per ordenar la columna de manera descendent"
            },
            "buttons": {
                "print": "Imprimeix",
                "copy": "Copia",
                "colvis": "Columnes",
                "copyTitle": "Copia al portapapers",
                "copySuccess": {
                    "_": "%d files copiades",
                    "1": "1 fila copiada"
                },
                "pageLength": {
                    "-1": "Mostra totes les files",
                    "_": "Mostra %d files"
                },
                "pdf": "PDF"
            },
            "select": {
                "rows": {
                    "_": "%d files seleccionades",
                    "0": "Cap fila seleccionada",
                    "1": "1 fila seleccionada"
                }
            },
            "autoFill": {
                "cancel": "Cancel·lar"
            },
            "thousands": ".",
            "datetime": {
                "hours": "Hora",
                "minutes": "Minut",
                "seconds": "Segons",
                "unknown": "Desconegut",
                "amPm": [
                    "am",
                    "pm"
                ]
            },
            "editor": {
                "close": "Tancar"
            }
        }  
    } );
//Places eliminades
    $('#places_eliminades').DataTable( {
    	"ajax": "files/places_eliminades.txt",
    	"columns": [
            { "data": "llocs_treball" },
            { "data": "funcions" },
            { "data": "perfils" },
            { "data": "tipus" },
            { "data": "mitja_jornada" },
            { "data": "itinerant" },
            { "data": "data_inici" },
            { "data": "data_finalitzacio_prevista" },
            { "data": "data_peticio_director" },
            { "data": "motiu" },
            { "data": "data_anulacio" },
            { "data": "motiu_anulacio" }
            
        ],
        "language": {
            "processing": "Processant...",
            "lengthMenu": "Mostra _MENU_ registres",
            "zeroRecords": "No s'han trobat registres",
            "emptyTable": "No hi ha registres disponible en aquesta taula",
            "info": "Mostrant del _START_ al _END_ d'un total de _TOTAL_ registres",
            "infoEmpty": "No hi ha registres disponibles",
            "infoFiltered": "(filtrat de _MAX_ registres)",
            "search": "Cerca:",
            "infoThousands": ".",
            "decimal": ",",
            "loadingRecords": "Carregant...",
            "paginate": {
                "first": "Primer",
                "previous": "Anterior",
                "next": "Següent",
                "last": "Últim"
            },
            "aria": {
                "sortAscending": ": Activa per ordenar la columna de manera ascendent",
                "sortDescending": ": Activa per ordenar la columna de manera descendent"
            },
            "buttons": {
                "print": "Imprimeix",
                "copy": "Copia",
                "colvis": "Columnes",
                "copyTitle": "Copia al portapapers",
                "copySuccess": {
                    "_": "%d files copiades",
                    "1": "1 fila copiada"
                },
                "pageLength": {
                    "-1": "Mostra totes les files",
                    "_": "Mostra %d files"
                },
                "pdf": "PDF"
            },
            "select": {
                "rows": {
                    "_": "%d files seleccionades",
                    "0": "Cap fila seleccionada",
                    "1": "1 fila seleccionada"
                }
            },
            "autoFill": {
                "cancel": "Cancel·lar"
            },
            "thousands": ".",
            "datetime": {
                "hours": "Hora",
                "minutes": "Minut",
                "seconds": "Segons",
                "unknown": "Desconegut",
                "amPm": [
                    "am",
                    "pm"
                ]
            },
            "editor": {
                "close": "Tancar"
            }
        }  
    } );
} );