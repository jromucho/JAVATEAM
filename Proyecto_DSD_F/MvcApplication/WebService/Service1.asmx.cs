using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

namespace WebService
{
    /// <summary>
    /// Descripción breve de Service1
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // Para permitir que se llame a este servicio Web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
    // [System.Web.Script.Services.ScriptService]
    public class Service1 : System.Web.Services.WebService
    {

        [WebMethod]
        public PersonaDTO buscarpersonaPorDNI(string dni, int tipoDocumento)
        {
            PersonaDTO obj = new PersonaDTO();
            obj.txNomb = "Juan Palús";
            obj.txMail = "jpalus@gob.org.pe";
            obj.txNumDocu = dni;
            return obj;
        }

        //[WebMethod]
        //public buscarPersonaPorDNI( string pNumDocumento, string pTipoDocumento)
        //{
        //}

    }


    public class PersonaDTO
    {
        private int idPers { get; set; }
        public string feNaci { get; set; }
        public string feUsuaCrea { get; set; }
        public string feUsuaModi { get; set; }
        public String idUsuaCrea { get; set; }
        public String idUsuaModi { get; set; }
        public String inEstd { get; set; }
        public String inSexo { get; set; }
        public String txApeMtno { get; set; }
        public String txApePtno { get; set; }
        public String txDire { get; set; }
        public String txMail { get; set; }
        public String txNomb { get; set; }
        public String txNumDocu { get; set; }
        public String txTermCrea { get; set; }
        public String txTermModi { get; set; }
        public String ubigeoCompleto { get; set; }
        public String idDpto { get; set; }
        public String noDpto { get; set; }
        public String idProv { get; set; }
        public String noProv { get; set; }
        public String idDist { get; set; }
        public String noDist { get; set; }
        public int idTipoPersona { get; set; }
        public String noTipoPersona { get; set; }
        public int idTipoDocumento { get; set; }
        public String noTipoDocumento { get; set; }
        public int idEstadoCivil { get; set; }
        public String noEstadoCivil { get; set; }
    }
}