
/**
 * LectureModeParticipant_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.vidyo.portal.user.v1_1;
            

            /**
            *  LectureModeParticipant_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class LectureModeParticipant_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = LectureModeParticipant_type0
                Namespace URI = http://portal.vidyo.com/user/v1_1
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for EntityID
                        */

                        
                                    protected com.vidyo.portal.user.v1_1.EntityID localEntityID ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.vidyo.portal.user.v1_1.EntityID
                           */
                           public  com.vidyo.portal.user.v1_1.EntityID getEntityID(){
                               return localEntityID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EntityID
                               */
                               public void setEntityID(com.vidyo.portal.user.v1_1.EntityID param){
                            
                                            this.localEntityID=param;
                                    

                               }
                            

                        /**
                        * field for ParticipantID
                        */

                        
                                    protected com.vidyo.portal.user.v1_1.EntityID localParticipantID ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.vidyo.portal.user.v1_1.EntityID
                           */
                           public  com.vidyo.portal.user.v1_1.EntityID getParticipantID(){
                               return localParticipantID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ParticipantID
                               */
                               public void setParticipantID(com.vidyo.portal.user.v1_1.EntityID param){
                            
                                            this.localParticipantID=param;
                                    

                               }
                            

                        /**
                        * field for EntityType
                        */

                        
                                    protected com.vidyo.portal.user.v1_1.EntityType_type0 localEntityType ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.vidyo.portal.user.v1_1.EntityType_type0
                           */
                           public  com.vidyo.portal.user.v1_1.EntityType_type0 getEntityType(){
                               return localEntityType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EntityType
                               */
                               public void setEntityType(com.vidyo.portal.user.v1_1.EntityType_type0 param){
                            
                                            this.localEntityType=param;
                                    

                               }
                            

                        /**
                        * field for DisplayName
                        */

                        
                                    protected java.lang.String localDisplayName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDisplayName(){
                               return localDisplayName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DisplayName
                               */
                               public void setDisplayName(java.lang.String param){
                            
                                            this.localDisplayName=param;
                                    

                               }
                            

                        /**
                        * field for Extension
                        */

                        
                                    protected java.lang.String localExtension ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getExtension(){
                               return localExtension;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Extension
                               */
                               public void setExtension(java.lang.String param){
                            
                                            this.localExtension=param;
                                    

                               }
                            

                        /**
                        * field for Audio
                        */

                        
                                    protected boolean localAudio ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAudioTracker = false ;

                           public boolean isAudioSpecified(){
                               return localAudioTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAudio(){
                               return localAudio;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Audio
                               */
                               public void setAudio(boolean param){
                            localAudioTracker = true;
                                   
                                            this.localAudio=param;
                                    

                               }
                            

                        /**
                        * field for Video
                        */

                        
                                    protected boolean localVideo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localVideoTracker = false ;

                           public boolean isVideoSpecified(){
                               return localVideoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getVideo(){
                               return localVideo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Video
                               */
                               public void setVideo(boolean param){
                            localVideoTracker = true;
                                   
                                            this.localVideo=param;
                                    

                               }
                            

                        /**
                        * field for Appshare
                        */

                        
                                    protected boolean localAppshare ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAppshareTracker = false ;

                           public boolean isAppshareSpecified(){
                               return localAppshareTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAppshare(){
                               return localAppshare;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Appshare
                               */
                               public void setAppshare(boolean param){
                            localAppshareTracker = true;
                                   
                                            this.localAppshare=param;
                                    

                               }
                            

                        /**
                        * field for HandRaised
                        */

                        
                                    protected boolean localHandRaised ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHandRaisedTracker = false ;

                           public boolean isHandRaisedSpecified(){
                               return localHandRaisedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getHandRaised(){
                               return localHandRaised;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HandRaised
                               */
                               public void setHandRaised(boolean param){
                            localHandRaisedTracker = true;
                                   
                                            this.localHandRaised=param;
                                    

                               }
                            

                        /**
                        * field for Presenter
                        */

                        
                                    protected boolean localPresenter ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPresenterTracker = false ;

                           public boolean isPresenterSpecified(){
                               return localPresenterTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getPresenter(){
                               return localPresenter;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Presenter
                               */
                               public void setPresenter(boolean param){
                            localPresenterTracker = true;
                                   
                                            this.localPresenter=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://portal.vidyo.com/user/v1_1");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":LectureModeParticipant_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "LectureModeParticipant_type0",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localEntityID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("entityID cannot be null!!");
                                            }
                                           localEntityID.serialize(new javax.xml.namespace.QName("http://portal.vidyo.com/user/v1_1","entityID"),
                                               xmlWriter);
                                        
                                            if (localParticipantID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("participantID cannot be null!!");
                                            }
                                           localParticipantID.serialize(new javax.xml.namespace.QName("http://portal.vidyo.com/user/v1_1","participantID"),
                                               xmlWriter);
                                        
                                            if (localEntityType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("EntityType cannot be null!!");
                                            }
                                           localEntityType.serialize(new javax.xml.namespace.QName("http://portal.vidyo.com/user/v1_1","EntityType"),
                                               xmlWriter);
                                        
                                    namespace = "http://portal.vidyo.com/user/v1_1";
                                    writeStartElement(null, namespace, "displayName", xmlWriter);
                             

                                          if (localDisplayName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("displayName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDisplayName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://portal.vidyo.com/user/v1_1";
                                    writeStartElement(null, namespace, "extension", xmlWriter);
                             

                                          if (localExtension==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("extension cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localExtension);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localAudioTracker){
                                    namespace = "http://portal.vidyo.com/user/v1_1";
                                    writeStartElement(null, namespace, "audio", xmlWriter);
                             
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAudio));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localVideoTracker){
                                    namespace = "http://portal.vidyo.com/user/v1_1";
                                    writeStartElement(null, namespace, "video", xmlWriter);
                             
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVideo));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAppshareTracker){
                                    namespace = "http://portal.vidyo.com/user/v1_1";
                                    writeStartElement(null, namespace, "appshare", xmlWriter);
                             
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAppshare));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localHandRaisedTracker){
                                    namespace = "http://portal.vidyo.com/user/v1_1";
                                    writeStartElement(null, namespace, "handRaised", xmlWriter);
                             
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHandRaised));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPresenterTracker){
                                    namespace = "http://portal.vidyo.com/user/v1_1";
                                    writeStartElement(null, namespace, "presenter", xmlWriter);
                             
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPresenter));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://portal.vidyo.com/user/v1_1")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                
                            elementList.add(new javax.xml.namespace.QName("http://portal.vidyo.com/user/v1_1",
                                                                      "entityID"));
                            
                            
                                    if (localEntityID==null){
                                         throw new org.apache.axis2.databinding.ADBException("entityID cannot be null!!");
                                    }
                                    elementList.add(localEntityID);
                                
                            elementList.add(new javax.xml.namespace.QName("http://portal.vidyo.com/user/v1_1",
                                                                      "participantID"));
                            
                            
                                    if (localParticipantID==null){
                                         throw new org.apache.axis2.databinding.ADBException("participantID cannot be null!!");
                                    }
                                    elementList.add(localParticipantID);
                                
                            elementList.add(new javax.xml.namespace.QName("http://portal.vidyo.com/user/v1_1",
                                                                      "EntityType"));
                            
                            
                                    if (localEntityType==null){
                                         throw new org.apache.axis2.databinding.ADBException("EntityType cannot be null!!");
                                    }
                                    elementList.add(localEntityType);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://portal.vidyo.com/user/v1_1",
                                                                      "displayName"));
                                 
                                        if (localDisplayName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDisplayName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("displayName cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://portal.vidyo.com/user/v1_1",
                                                                      "extension"));
                                 
                                        if (localExtension != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExtension));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("extension cannot be null!!");
                                        }
                                     if (localAudioTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://portal.vidyo.com/user/v1_1",
                                                                      "audio"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAudio));
                            } if (localVideoTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://portal.vidyo.com/user/v1_1",
                                                                      "video"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVideo));
                            } if (localAppshareTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://portal.vidyo.com/user/v1_1",
                                                                      "appshare"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAppshare));
                            } if (localHandRaisedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://portal.vidyo.com/user/v1_1",
                                                                      "handRaised"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHandRaised));
                            } if (localPresenterTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://portal.vidyo.com/user/v1_1",
                                                                      "presenter"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPresenter));
                            }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static LectureModeParticipant_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            LectureModeParticipant_type0 object =
                new LectureModeParticipant_type0();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"LectureModeParticipant_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (LectureModeParticipant_type0)com.vidyo.portal.user.v1_1.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://portal.vidyo.com/user/v1_1","entityID").equals(reader.getName())){
                                
                                                object.setEntityID(com.vidyo.portal.user.v1_1.EntityID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://portal.vidyo.com/user/v1_1","participantID").equals(reader.getName())){
                                
                                                object.setParticipantID(com.vidyo.portal.user.v1_1.EntityID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://portal.vidyo.com/user/v1_1","EntityType").equals(reader.getName())){
                                
                                                object.setEntityType(com.vidyo.portal.user.v1_1.EntityType_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://portal.vidyo.com/user/v1_1","displayName").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"displayName" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDisplayName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://portal.vidyo.com/user/v1_1","extension").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"extension" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setExtension(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://portal.vidyo.com/user/v1_1","audio").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAudio(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://portal.vidyo.com/user/v1_1","video").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setVideo(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://portal.vidyo.com/user/v1_1","appshare").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAppshare(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://portal.vidyo.com/user/v1_1","handRaised").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setHandRaised(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://portal.vidyo.com/user/v1_1","presenter").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPresenter(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    