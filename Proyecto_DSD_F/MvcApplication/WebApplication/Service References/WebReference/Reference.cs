﻿//------------------------------------------------------------------------------
// <auto-generated>
//     Este código fue generado por una herramienta.
//     Versión de runtime:4.0.30319.225
//
//     Los cambios en este archivo podrían causar un comportamiento incorrecto y se perderán si
//     se vuelve a generar el código.
// </auto-generated>
//------------------------------------------------------------------------------

namespace WebApplication.WebReference {
    using System.Runtime.Serialization;
    using System;
    
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Runtime.Serialization", "4.0.0.0")]
    [System.Runtime.Serialization.DataContractAttribute(Name="PersonaDTO", Namespace="http://tempuri.org/")]
    [System.SerializableAttribute()]
    public partial class PersonaDTO : object, System.Runtime.Serialization.IExtensibleDataObject, System.ComponentModel.INotifyPropertyChanged {
        
        [System.NonSerializedAttribute()]
        private System.Runtime.Serialization.ExtensionDataObject extensionDataField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string feNaciField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string feUsuaCreaField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string feUsuaModiField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string idUsuaCreaField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string idUsuaModiField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string inEstdField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string inSexoField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string txApeMtnoField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string txApePtnoField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string txDireField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string txMailField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string txNombField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string txNumDocuField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string txTermCreaField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string txTermModiField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string ubigeoCompletoField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string idDptoField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string noDptoField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string idProvField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string noProvField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string idDistField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string noDistField;
        
        private int idTipoPersonaField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string noTipoPersonaField;
        
        private int idTipoDocumentoField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string noTipoDocumentoField;
        
        private int idEstadoCivilField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string noEstadoCivilField;
        
        [global::System.ComponentModel.BrowsableAttribute(false)]
        public System.Runtime.Serialization.ExtensionDataObject ExtensionData {
            get {
                return this.extensionDataField;
            }
            set {
                this.extensionDataField = value;
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false)]
        public string feNaci {
            get {
                return this.feNaciField;
            }
            set {
                if ((object.ReferenceEquals(this.feNaciField, value) != true)) {
                    this.feNaciField = value;
                    this.RaisePropertyChanged("feNaci");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false)]
        public string feUsuaCrea {
            get {
                return this.feUsuaCreaField;
            }
            set {
                if ((object.ReferenceEquals(this.feUsuaCreaField, value) != true)) {
                    this.feUsuaCreaField = value;
                    this.RaisePropertyChanged("feUsuaCrea");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false)]
        public string feUsuaModi {
            get {
                return this.feUsuaModiField;
            }
            set {
                if ((object.ReferenceEquals(this.feUsuaModiField, value) != true)) {
                    this.feUsuaModiField = value;
                    this.RaisePropertyChanged("feUsuaModi");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false)]
        public string idUsuaCrea {
            get {
                return this.idUsuaCreaField;
            }
            set {
                if ((object.ReferenceEquals(this.idUsuaCreaField, value) != true)) {
                    this.idUsuaCreaField = value;
                    this.RaisePropertyChanged("idUsuaCrea");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false)]
        public string idUsuaModi {
            get {
                return this.idUsuaModiField;
            }
            set {
                if ((object.ReferenceEquals(this.idUsuaModiField, value) != true)) {
                    this.idUsuaModiField = value;
                    this.RaisePropertyChanged("idUsuaModi");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false)]
        public string inEstd {
            get {
                return this.inEstdField;
            }
            set {
                if ((object.ReferenceEquals(this.inEstdField, value) != true)) {
                    this.inEstdField = value;
                    this.RaisePropertyChanged("inEstd");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false)]
        public string inSexo {
            get {
                return this.inSexoField;
            }
            set {
                if ((object.ReferenceEquals(this.inSexoField, value) != true)) {
                    this.inSexoField = value;
                    this.RaisePropertyChanged("inSexo");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false)]
        public string txApeMtno {
            get {
                return this.txApeMtnoField;
            }
            set {
                if ((object.ReferenceEquals(this.txApeMtnoField, value) != true)) {
                    this.txApeMtnoField = value;
                    this.RaisePropertyChanged("txApeMtno");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false)]
        public string txApePtno {
            get {
                return this.txApePtnoField;
            }
            set {
                if ((object.ReferenceEquals(this.txApePtnoField, value) != true)) {
                    this.txApePtnoField = value;
                    this.RaisePropertyChanged("txApePtno");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false)]
        public string txDire {
            get {
                return this.txDireField;
            }
            set {
                if ((object.ReferenceEquals(this.txDireField, value) != true)) {
                    this.txDireField = value;
                    this.RaisePropertyChanged("txDire");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false)]
        public string txMail {
            get {
                return this.txMailField;
            }
            set {
                if ((object.ReferenceEquals(this.txMailField, value) != true)) {
                    this.txMailField = value;
                    this.RaisePropertyChanged("txMail");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false)]
        public string txNomb {
            get {
                return this.txNombField;
            }
            set {
                if ((object.ReferenceEquals(this.txNombField, value) != true)) {
                    this.txNombField = value;
                    this.RaisePropertyChanged("txNomb");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false)]
        public string txNumDocu {
            get {
                return this.txNumDocuField;
            }
            set {
                if ((object.ReferenceEquals(this.txNumDocuField, value) != true)) {
                    this.txNumDocuField = value;
                    this.RaisePropertyChanged("txNumDocu");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false)]
        public string txTermCrea {
            get {
                return this.txTermCreaField;
            }
            set {
                if ((object.ReferenceEquals(this.txTermCreaField, value) != true)) {
                    this.txTermCreaField = value;
                    this.RaisePropertyChanged("txTermCrea");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false)]
        public string txTermModi {
            get {
                return this.txTermModiField;
            }
            set {
                if ((object.ReferenceEquals(this.txTermModiField, value) != true)) {
                    this.txTermModiField = value;
                    this.RaisePropertyChanged("txTermModi");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false)]
        public string ubigeoCompleto {
            get {
                return this.ubigeoCompletoField;
            }
            set {
                if ((object.ReferenceEquals(this.ubigeoCompletoField, value) != true)) {
                    this.ubigeoCompletoField = value;
                    this.RaisePropertyChanged("ubigeoCompleto");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=16)]
        public string idDpto {
            get {
                return this.idDptoField;
            }
            set {
                if ((object.ReferenceEquals(this.idDptoField, value) != true)) {
                    this.idDptoField = value;
                    this.RaisePropertyChanged("idDpto");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=17)]
        public string noDpto {
            get {
                return this.noDptoField;
            }
            set {
                if ((object.ReferenceEquals(this.noDptoField, value) != true)) {
                    this.noDptoField = value;
                    this.RaisePropertyChanged("noDpto");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=18)]
        public string idProv {
            get {
                return this.idProvField;
            }
            set {
                if ((object.ReferenceEquals(this.idProvField, value) != true)) {
                    this.idProvField = value;
                    this.RaisePropertyChanged("idProv");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=19)]
        public string noProv {
            get {
                return this.noProvField;
            }
            set {
                if ((object.ReferenceEquals(this.noProvField, value) != true)) {
                    this.noProvField = value;
                    this.RaisePropertyChanged("noProv");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=20)]
        public string idDist {
            get {
                return this.idDistField;
            }
            set {
                if ((object.ReferenceEquals(this.idDistField, value) != true)) {
                    this.idDistField = value;
                    this.RaisePropertyChanged("idDist");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=21)]
        public string noDist {
            get {
                return this.noDistField;
            }
            set {
                if ((object.ReferenceEquals(this.noDistField, value) != true)) {
                    this.noDistField = value;
                    this.RaisePropertyChanged("noDist");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute(IsRequired=true, Order=22)]
        public int idTipoPersona {
            get {
                return this.idTipoPersonaField;
            }
            set {
                if ((this.idTipoPersonaField.Equals(value) != true)) {
                    this.idTipoPersonaField = value;
                    this.RaisePropertyChanged("idTipoPersona");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=23)]
        public string noTipoPersona {
            get {
                return this.noTipoPersonaField;
            }
            set {
                if ((object.ReferenceEquals(this.noTipoPersonaField, value) != true)) {
                    this.noTipoPersonaField = value;
                    this.RaisePropertyChanged("noTipoPersona");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute(IsRequired=true, Order=24)]
        public int idTipoDocumento {
            get {
                return this.idTipoDocumentoField;
            }
            set {
                if ((this.idTipoDocumentoField.Equals(value) != true)) {
                    this.idTipoDocumentoField = value;
                    this.RaisePropertyChanged("idTipoDocumento");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=25)]
        public string noTipoDocumento {
            get {
                return this.noTipoDocumentoField;
            }
            set {
                if ((object.ReferenceEquals(this.noTipoDocumentoField, value) != true)) {
                    this.noTipoDocumentoField = value;
                    this.RaisePropertyChanged("noTipoDocumento");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute(IsRequired=true, Order=26)]
        public int idEstadoCivil {
            get {
                return this.idEstadoCivilField;
            }
            set {
                if ((this.idEstadoCivilField.Equals(value) != true)) {
                    this.idEstadoCivilField = value;
                    this.RaisePropertyChanged("idEstadoCivil");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=27)]
        public string noEstadoCivil {
            get {
                return this.noEstadoCivilField;
            }
            set {
                if ((object.ReferenceEquals(this.noEstadoCivilField, value) != true)) {
                    this.noEstadoCivilField = value;
                    this.RaisePropertyChanged("noEstadoCivil");
                }
            }
        }
        
        public event System.ComponentModel.PropertyChangedEventHandler PropertyChanged;
        
        protected void RaisePropertyChanged(string propertyName) {
            System.ComponentModel.PropertyChangedEventHandler propertyChanged = this.PropertyChanged;
            if ((propertyChanged != null)) {
                propertyChanged(this, new System.ComponentModel.PropertyChangedEventArgs(propertyName));
            }
        }
    }
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ServiceModel.ServiceContractAttribute(ConfigurationName="WebReference.Service1Soap")]
    public interface Service1Soap {
        
        // CODEGEN: Se está generando un contrato de mensaje, ya que el nombre de elemento dni del espacio de nombres http://tempuri.org/ no está marcado para aceptar valores nil.
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/buscarpersonaPorDNI", ReplyAction="*")]
        WebApplication.WebReference.buscarpersonaPorDNIResponse buscarpersonaPorDNI(WebApplication.WebReference.buscarpersonaPorDNIRequest request);
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class buscarpersonaPorDNIRequest {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Name="buscarpersonaPorDNI", Namespace="http://tempuri.org/", Order=0)]
        public WebApplication.WebReference.buscarpersonaPorDNIRequestBody Body;
        
        public buscarpersonaPorDNIRequest() {
        }
        
        public buscarpersonaPorDNIRequest(WebApplication.WebReference.buscarpersonaPorDNIRequestBody Body) {
            this.Body = Body;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.Runtime.Serialization.DataContractAttribute(Namespace="http://tempuri.org/")]
    public partial class buscarpersonaPorDNIRequestBody {
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=0)]
        public string dni;
        
        [System.Runtime.Serialization.DataMemberAttribute(Order=1)]
        public int tipoDocumento;
        
        public buscarpersonaPorDNIRequestBody() {
        }
        
        public buscarpersonaPorDNIRequestBody(string dni, int tipoDocumento) {
            this.dni = dni;
            this.tipoDocumento = tipoDocumento;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class buscarpersonaPorDNIResponse {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Name="buscarpersonaPorDNIResponse", Namespace="http://tempuri.org/", Order=0)]
        public WebApplication.WebReference.buscarpersonaPorDNIResponseBody Body;
        
        public buscarpersonaPorDNIResponse() {
        }
        
        public buscarpersonaPorDNIResponse(WebApplication.WebReference.buscarpersonaPorDNIResponseBody Body) {
            this.Body = Body;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.Runtime.Serialization.DataContractAttribute(Namespace="http://tempuri.org/")]
    public partial class buscarpersonaPorDNIResponseBody {
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=0)]
        public WebApplication.WebReference.PersonaDTO buscarpersonaPorDNIResult;
        
        public buscarpersonaPorDNIResponseBody() {
        }
        
        public buscarpersonaPorDNIResponseBody(WebApplication.WebReference.PersonaDTO buscarpersonaPorDNIResult) {
            this.buscarpersonaPorDNIResult = buscarpersonaPorDNIResult;
        }
    }
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public interface Service1SoapChannel : WebApplication.WebReference.Service1Soap, System.ServiceModel.IClientChannel {
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public partial class Service1SoapClient : System.ServiceModel.ClientBase<WebApplication.WebReference.Service1Soap>, WebApplication.WebReference.Service1Soap {
        
        public Service1SoapClient() {
        }
        
        public Service1SoapClient(string endpointConfigurationName) : 
                base(endpointConfigurationName) {
        }
        
        public Service1SoapClient(string endpointConfigurationName, string remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public Service1SoapClient(string endpointConfigurationName, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public Service1SoapClient(System.ServiceModel.Channels.Binding binding, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(binding, remoteAddress) {
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        WebApplication.WebReference.buscarpersonaPorDNIResponse WebApplication.WebReference.Service1Soap.buscarpersonaPorDNI(WebApplication.WebReference.buscarpersonaPorDNIRequest request) {
            return base.Channel.buscarpersonaPorDNI(request);
        }
        
        public WebApplication.WebReference.PersonaDTO buscarpersonaPorDNI(string dni, int tipoDocumento) {
            WebApplication.WebReference.buscarpersonaPorDNIRequest inValue = new WebApplication.WebReference.buscarpersonaPorDNIRequest();
            inValue.Body = new WebApplication.WebReference.buscarpersonaPorDNIRequestBody();
            inValue.Body.dni = dni;
            inValue.Body.tipoDocumento = tipoDocumento;
            WebApplication.WebReference.buscarpersonaPorDNIResponse retVal = ((WebApplication.WebReference.Service1Soap)(this)).buscarpersonaPorDNI(inValue);
            return retVal.Body.buscarpersonaPorDNIResult;
        }
    }
}
