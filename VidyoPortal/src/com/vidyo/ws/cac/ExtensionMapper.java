
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package com.vidyo.ws.cac;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://ws.vidyo.com/cac".equals(namespaceURI) &&
                  "EntityID".equals(typeName)){
                   
                            return  com.vidyo.ws.cac.EntityID.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.vidyo.com/cac".equals(namespaceURI) &&
                  "RoomMode_type0".equals(typeName)){
                   
                            return  com.vidyo.ws.cac.RoomMode_type0.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.vidyo.com/cac".equals(namespaceURI) &&
                  "validityTime_type1".equals(typeName)){
                   
                            return  com.vidyo.ws.cac.ValidityTime_type1.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.vidyo.com/cac".equals(namespaceURI) &&
                  "Entity_type0".equals(typeName)){
                   
                            return  com.vidyo.ws.cac.Entity_type0.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    