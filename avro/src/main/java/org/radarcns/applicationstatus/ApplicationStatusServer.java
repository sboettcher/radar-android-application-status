/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.radarcns.applicationstatus;  
@SuppressWarnings("all")
/** Server connection status with android client. */
@org.apache.avro.specific.AvroGenerated
public class ApplicationStatusServer extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ApplicationStatusServer\",\"namespace\":\"org.radarcns.applicationstatus\",\"doc\":\"Server connection status with android client.\",\"fields\":[{\"name\":\"time\",\"type\":\"double\",\"doc\":\"device timestamp in UTC (s)\"},{\"name\":\"timeReceived\",\"type\":\"double\",\"doc\":\"device receiver timestamp in UTC (s)\"},{\"name\":\"clientIP\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Hardware identifier of client application\"},{\"name\":\"serverStatus\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"server connection status.\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** device timestamp in UTC (s) */
  @Deprecated public double time;
  /** device receiver timestamp in UTC (s) */
  @Deprecated public double timeReceived;
  /** Hardware identifier of client application */
  @Deprecated public java.lang.String clientIP;
  /** server connection status. */
  @Deprecated public java.lang.String serverStatus;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public ApplicationStatusServer() {}

  /**
   * All-args constructor.
   */
  public ApplicationStatusServer(java.lang.Double time, java.lang.Double timeReceived, java.lang.String clientIP, java.lang.String serverStatus) {
    this.time = time;
    this.timeReceived = timeReceived;
    this.clientIP = clientIP;
    this.serverStatus = serverStatus;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return time;
    case 1: return timeReceived;
    case 2: return clientIP;
    case 3: return serverStatus;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: time = (java.lang.Double)value$; break;
    case 1: timeReceived = (java.lang.Double)value$; break;
    case 2: clientIP = (java.lang.String)value$; break;
    case 3: serverStatus = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'time' field.
   * device timestamp in UTC (s)   */
  public java.lang.Double getTime() {
    return time;
  }

  /**
   * Sets the value of the 'time' field.
   * device timestamp in UTC (s)   * @param value the value to set.
   */
  public void setTime(java.lang.Double value) {
    this.time = value;
  }

  /**
   * Gets the value of the 'timeReceived' field.
   * device receiver timestamp in UTC (s)   */
  public java.lang.Double getTimeReceived() {
    return timeReceived;
  }

  /**
   * Sets the value of the 'timeReceived' field.
   * device receiver timestamp in UTC (s)   * @param value the value to set.
   */
  public void setTimeReceived(java.lang.Double value) {
    this.timeReceived = value;
  }

  /**
   * Gets the value of the 'clientIP' field.
   * Hardware identifier of client application   */
  public java.lang.String getClientIP() {
    return clientIP;
  }

  /**
   * Sets the value of the 'clientIP' field.
   * Hardware identifier of client application   * @param value the value to set.
   */
  public void setClientIP(java.lang.String value) {
    this.clientIP = value;
  }

  /**
   * Gets the value of the 'serverStatus' field.
   * server connection status.   */
  public java.lang.String getServerStatus() {
    return serverStatus;
  }

  /**
   * Sets the value of the 'serverStatus' field.
   * server connection status.   * @param value the value to set.
   */
  public void setServerStatus(java.lang.String value) {
    this.serverStatus = value;
  }

  /** Creates a new ApplicationStatusServer RecordBuilder */
  public static org.radarcns.applicationstatus.ApplicationStatusServer.Builder newBuilder() {
    return new org.radarcns.applicationstatus.ApplicationStatusServer.Builder();
  }
  
  /** Creates a new ApplicationStatusServer RecordBuilder by copying an existing Builder */
  public static org.radarcns.applicationstatus.ApplicationStatusServer.Builder newBuilder(org.radarcns.applicationstatus.ApplicationStatusServer.Builder other) {
    return new org.radarcns.applicationstatus.ApplicationStatusServer.Builder(other);
  }
  
  /** Creates a new ApplicationStatusServer RecordBuilder by copying an existing ApplicationStatusServer instance */
  public static org.radarcns.applicationstatus.ApplicationStatusServer.Builder newBuilder(org.radarcns.applicationstatus.ApplicationStatusServer other) {
    return new org.radarcns.applicationstatus.ApplicationStatusServer.Builder(other);
  }
  
  /**
   * RecordBuilder for ApplicationStatusServer instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ApplicationStatusServer>
    implements org.apache.avro.data.RecordBuilder<ApplicationStatusServer> {

    private double time;
    private double timeReceived;
    private java.lang.String clientIP;
    private java.lang.String serverStatus;

    /** Creates a new Builder */
    private Builder() {
      super(org.radarcns.applicationstatus.ApplicationStatusServer.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.radarcns.applicationstatus.ApplicationStatusServer.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.time)) {
        this.time = data().deepCopy(fields()[0].schema(), other.time);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.timeReceived)) {
        this.timeReceived = data().deepCopy(fields()[1].schema(), other.timeReceived);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.clientIP)) {
        this.clientIP = data().deepCopy(fields()[2].schema(), other.clientIP);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.serverStatus)) {
        this.serverStatus = data().deepCopy(fields()[3].schema(), other.serverStatus);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing ApplicationStatusServer instance */
    private Builder(org.radarcns.applicationstatus.ApplicationStatusServer other) {
            super(org.radarcns.applicationstatus.ApplicationStatusServer.SCHEMA$);
      if (isValidValue(fields()[0], other.time)) {
        this.time = data().deepCopy(fields()[0].schema(), other.time);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.timeReceived)) {
        this.timeReceived = data().deepCopy(fields()[1].schema(), other.timeReceived);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.clientIP)) {
        this.clientIP = data().deepCopy(fields()[2].schema(), other.clientIP);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.serverStatus)) {
        this.serverStatus = data().deepCopy(fields()[3].schema(), other.serverStatus);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'time' field */
    public java.lang.Double getTime() {
      return time;
    }
    
    /** Sets the value of the 'time' field */
    public org.radarcns.applicationstatus.ApplicationStatusServer.Builder setTime(double value) {
      validate(fields()[0], value);
      this.time = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'time' field has been set */
    public boolean hasTime() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'time' field */
    public org.radarcns.applicationstatus.ApplicationStatusServer.Builder clearTime() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'timeReceived' field */
    public java.lang.Double getTimeReceived() {
      return timeReceived;
    }
    
    /** Sets the value of the 'timeReceived' field */
    public org.radarcns.applicationstatus.ApplicationStatusServer.Builder setTimeReceived(double value) {
      validate(fields()[1], value);
      this.timeReceived = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'timeReceived' field has been set */
    public boolean hasTimeReceived() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'timeReceived' field */
    public org.radarcns.applicationstatus.ApplicationStatusServer.Builder clearTimeReceived() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'clientIP' field */
    public java.lang.String getClientIP() {
      return clientIP;
    }
    
    /** Sets the value of the 'clientIP' field */
    public org.radarcns.applicationstatus.ApplicationStatusServer.Builder setClientIP(java.lang.String value) {
      validate(fields()[2], value);
      this.clientIP = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'clientIP' field has been set */
    public boolean hasClientIP() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'clientIP' field */
    public org.radarcns.applicationstatus.ApplicationStatusServer.Builder clearClientIP() {
      clientIP = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'serverStatus' field */
    public java.lang.String getServerStatus() {
      return serverStatus;
    }
    
    /** Sets the value of the 'serverStatus' field */
    public org.radarcns.applicationstatus.ApplicationStatusServer.Builder setServerStatus(java.lang.String value) {
      validate(fields()[3], value);
      this.serverStatus = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'serverStatus' field has been set */
    public boolean hasServerStatus() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'serverStatus' field */
    public org.radarcns.applicationstatus.ApplicationStatusServer.Builder clearServerStatus() {
      serverStatus = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public ApplicationStatusServer build() {
      try {
        ApplicationStatusServer record = new ApplicationStatusServer();
        record.time = fieldSetFlags()[0] ? this.time : (java.lang.Double) defaultValue(fields()[0]);
        record.timeReceived = fieldSetFlags()[1] ? this.timeReceived : (java.lang.Double) defaultValue(fields()[1]);
        record.clientIP = fieldSetFlags()[2] ? this.clientIP : (java.lang.String) defaultValue(fields()[2]);
        record.serverStatus = fieldSetFlags()[3] ? this.serverStatus : (java.lang.String) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
