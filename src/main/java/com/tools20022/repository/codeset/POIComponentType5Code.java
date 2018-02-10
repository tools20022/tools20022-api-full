/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.POIComponentType5Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of component belonging to a POI (Point of Interaction) Terminal.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType5Code#AcquirerProtocolParameters
 * POIComponentType5Code.AcquirerProtocolParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType5Code#ApplicationParameters
 * POIComponentType5Code.ApplicationParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType5Code#TerminalParameters
 * POIComponentType5Code.TerminalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType5Code#SecurityParameters
 * POIComponentType5Code.SecurityParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType5Code#Server
 * POIComponentType5Code.Server}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType5Code#Terminal
 * POIComponentType5Code.Terminal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType5Code#Device
 * POIComponentType5Code.Device}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType5Code#SecureModule
 * POIComponentType5Code.SecureModule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType5Code#PaymentApplication
 * POIComponentType5Code.PaymentApplication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType5Code#EMVKernel
 * POIComponentType5Code.EMVKernel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType5Code#EMVLevel1
 * POIComponentType5Code.EMVLevel1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType5Code#Middleware
 * POIComponentType5Code.Middleware}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType5Code#Driver
 * POIComponentType5Code.Driver}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType5Code#OperatingSystem
 * POIComponentType5Code.OperatingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType5Code#MerchantParameters
 * POIComponentType5Code.MerchantParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType5Code#CertificateParameters
 * POIComponentType5Code.CertificateParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType5Code#TMSProtocolParameters
 * POIComponentType5Code.TMSProtocolParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType5Code#SaleComponent
 * POIComponentType5Code.SaleComponent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType5Code#SaleToPOIProtocolParameters
 * POIComponentType5Code.SaleToPOIProtocolParameters}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
 * POIComponentTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AQPP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "POIComponentType5Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Type of component belonging to a POI (Point of Interaction) Terminal."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.POIComponentType4Code
 * POIComponentType4Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class POIComponentType5Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType5Code
	 * POIComponentType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerProtocolParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType4Code#AcquirerProtocolParameters
	 * POIComponentType4Code.AcquirerProtocolParameters}</li>
	 * </ul>
	 */
	public static final POIComponentType5Code AcquirerProtocolParameters = new POIComponentType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerProtocolParameters";
			previousVersion_lazy = () -> POIComponentType4Code.AcquirerProtocolParameters;
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentType5Code.mmObject();
			codeName = POIComponentTypeCode.AcquirerProtocolParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType5Code
	 * POIComponentType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType4Code#ApplicationParameters
	 * POIComponentType4Code.ApplicationParameters}</li>
	 * </ul>
	 */
	public static final POIComponentType5Code ApplicationParameters = new POIComponentType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationParameters";
			previousVersion_lazy = () -> POIComponentType4Code.ApplicationParameters;
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentType5Code.mmObject();
			codeName = POIComponentTypeCode.ApplicationParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType5Code
	 * POIComponentType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType4Code#TerminalParameters
	 * POIComponentType4Code.TerminalParameters}</li>
	 * </ul>
	 */
	public static final POIComponentType5Code TerminalParameters = new POIComponentType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalParameters";
			previousVersion_lazy = () -> POIComponentType4Code.TerminalParameters;
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentType5Code.mmObject();
			codeName = POIComponentTypeCode.TerminalParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType5Code
	 * POIComponentType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType4Code#SecurityParameters
	 * POIComponentType4Code.SecurityParameters}</li>
	 * </ul>
	 */
	public static final POIComponentType5Code SecurityParameters = new POIComponentType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityParameters";
			previousVersion_lazy = () -> POIComponentType4Code.SecurityParameters;
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentType5Code.mmObject();
			codeName = POIComponentTypeCode.SecurityParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType5Code
	 * POIComponentType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Server"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType4Code#Server
	 * POIComponentType4Code.Server}</li>
	 * </ul>
	 */
	public static final POIComponentType5Code Server = new POIComponentType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Server";
			previousVersion_lazy = () -> POIComponentType4Code.Server;
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentType5Code.mmObject();
			codeName = POIComponentTypeCode.Server.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType5Code
	 * POIComponentType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Terminal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType4Code#Terminal
	 * POIComponentType4Code.Terminal}</li>
	 * </ul>
	 */
	public static final POIComponentType5Code Terminal = new POIComponentType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Terminal";
			previousVersion_lazy = () -> POIComponentType4Code.Terminal;
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentType5Code.mmObject();
			codeName = POIComponentTypeCode.Terminal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType5Code
	 * POIComponentType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Device"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType4Code#Device
	 * POIComponentType4Code.Device}</li>
	 * </ul>
	 */
	public static final POIComponentType5Code Device = new POIComponentType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Device";
			previousVersion_lazy = () -> POIComponentType4Code.Device;
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentType5Code.mmObject();
			codeName = POIComponentTypeCode.Device.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType5Code
	 * POIComponentType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureModule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType4Code#SecureModule
	 * POIComponentType4Code.SecureModule}</li>
	 * </ul>
	 */
	public static final POIComponentType5Code SecureModule = new POIComponentType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureModule";
			previousVersion_lazy = () -> POIComponentType4Code.SecureModule;
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentType5Code.mmObject();
			codeName = POIComponentTypeCode.SecureModule.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType5Code
	 * POIComponentType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentApplication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType4Code#PaymentApplication
	 * POIComponentType4Code.PaymentApplication}</li>
	 * </ul>
	 */
	public static final POIComponentType5Code PaymentApplication = new POIComponentType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentApplication";
			previousVersion_lazy = () -> POIComponentType4Code.PaymentApplication;
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentType5Code.mmObject();
			codeName = POIComponentTypeCode.PaymentApplication.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType5Code
	 * POIComponentType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EMVKernel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType4Code#EMVKernel
	 * POIComponentType4Code.EMVKernel}</li>
	 * </ul>
	 */
	public static final POIComponentType5Code EMVKernel = new POIComponentType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EMVKernel";
			previousVersion_lazy = () -> POIComponentType4Code.EMVKernel;
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentType5Code.mmObject();
			codeName = POIComponentTypeCode.EMVKernel.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType5Code
	 * POIComponentType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EMVLevel1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType4Code#EMVLevel1
	 * POIComponentType4Code.EMVLevel1}</li>
	 * </ul>
	 */
	public static final POIComponentType5Code EMVLevel1 = new POIComponentType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EMVLevel1";
			previousVersion_lazy = () -> POIComponentType4Code.EMVLevel1;
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentType5Code.mmObject();
			codeName = POIComponentTypeCode.EMVLevel1.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType5Code
	 * POIComponentType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Middleware"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType4Code#Middleware
	 * POIComponentType4Code.Middleware}</li>
	 * </ul>
	 */
	public static final POIComponentType5Code Middleware = new POIComponentType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Middleware";
			previousVersion_lazy = () -> POIComponentType4Code.Middleware;
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentType5Code.mmObject();
			codeName = POIComponentTypeCode.Middleware.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType5Code
	 * POIComponentType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Driver"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType4Code#Driver
	 * POIComponentType4Code.Driver}</li>
	 * </ul>
	 */
	public static final POIComponentType5Code Driver = new POIComponentType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Driver";
			previousVersion_lazy = () -> POIComponentType4Code.Driver;
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentType5Code.mmObject();
			codeName = POIComponentTypeCode.Driver.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType5Code
	 * POIComponentType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OperatingSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType4Code#OperatingSystem
	 * POIComponentType4Code.OperatingSystem}</li>
	 * </ul>
	 */
	public static final POIComponentType5Code OperatingSystem = new POIComponentType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OperatingSystem";
			previousVersion_lazy = () -> POIComponentType4Code.OperatingSystem;
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentType5Code.mmObject();
			codeName = POIComponentTypeCode.OperatingSystem.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType5Code
	 * POIComponentType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType4Code#MerchantParameters
	 * POIComponentType4Code.MerchantParameters}</li>
	 * </ul>
	 */
	public static final POIComponentType5Code MerchantParameters = new POIComponentType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantParameters";
			previousVersion_lazy = () -> POIComponentType4Code.MerchantParameters;
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentType5Code.mmObject();
			codeName = POIComponentTypeCode.MerchantParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType5Code
	 * POIComponentType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType4Code#CertificateParameters
	 * POIComponentType4Code.CertificateParameters}</li>
	 * </ul>
	 */
	public static final POIComponentType5Code CertificateParameters = new POIComponentType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateParameters";
			previousVersion_lazy = () -> POIComponentType4Code.CertificateParameters;
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentType5Code.mmObject();
			codeName = POIComponentTypeCode.CertificateParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType5Code
	 * POIComponentType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TMSProtocolParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType4Code#TMSProtocolParameters
	 * POIComponentType4Code.TMSProtocolParameters}</li>
	 * </ul>
	 */
	public static final POIComponentType5Code TMSProtocolParameters = new POIComponentType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMSProtocolParameters";
			previousVersion_lazy = () -> POIComponentType4Code.TMSProtocolParameters;
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentType5Code.mmObject();
			codeName = POIComponentTypeCode.TMSProtocolParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType5Code
	 * POIComponentType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleComponent"</li>
	 * </ul>
	 */
	public static final POIComponentType5Code SaleComponent = new POIComponentType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleComponent";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentType5Code.mmObject();
			codeName = POIComponentTypeCode.SaleComponent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType5Code
	 * POIComponentType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleToPOIProtocolParameters"</li>
	 * </ul>
	 */
	public static final POIComponentType5Code SaleToPOIProtocolParameters = new POIComponentType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleToPOIProtocolParameters";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentType5Code.mmObject();
			codeName = POIComponentTypeCode.SaleToPOIProtocolParameters.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, POIComponentType5Code> codesByName = new LinkedHashMap<>();

	protected POIComponentType5Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AQPP");
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "POIComponentType5Code";
				definition = "Type of component belonging to a POI (Point of Interaction) Terminal.";
				previousVersion_lazy = () -> POIComponentType4Code.mmObject();
				trace_lazy = () -> POIComponentTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.POIComponentType5Code.AcquirerProtocolParameters, com.tools20022.repository.codeset.POIComponentType5Code.ApplicationParameters,
						com.tools20022.repository.codeset.POIComponentType5Code.TerminalParameters, com.tools20022.repository.codeset.POIComponentType5Code.SecurityParameters, com.tools20022.repository.codeset.POIComponentType5Code.Server,
						com.tools20022.repository.codeset.POIComponentType5Code.Terminal, com.tools20022.repository.codeset.POIComponentType5Code.Device, com.tools20022.repository.codeset.POIComponentType5Code.SecureModule,
						com.tools20022.repository.codeset.POIComponentType5Code.PaymentApplication, com.tools20022.repository.codeset.POIComponentType5Code.EMVKernel, com.tools20022.repository.codeset.POIComponentType5Code.EMVLevel1,
						com.tools20022.repository.codeset.POIComponentType5Code.Middleware, com.tools20022.repository.codeset.POIComponentType5Code.Driver, com.tools20022.repository.codeset.POIComponentType5Code.OperatingSystem,
						com.tools20022.repository.codeset.POIComponentType5Code.MerchantParameters, com.tools20022.repository.codeset.POIComponentType5Code.CertificateParameters,
						com.tools20022.repository.codeset.POIComponentType5Code.TMSProtocolParameters, com.tools20022.repository.codeset.POIComponentType5Code.SaleComponent,
						com.tools20022.repository.codeset.POIComponentType5Code.SaleToPOIProtocolParameters);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AcquirerProtocolParameters.getCodeName().get(), AcquirerProtocolParameters);
		codesByName.put(ApplicationParameters.getCodeName().get(), ApplicationParameters);
		codesByName.put(TerminalParameters.getCodeName().get(), TerminalParameters);
		codesByName.put(SecurityParameters.getCodeName().get(), SecurityParameters);
		codesByName.put(Server.getCodeName().get(), Server);
		codesByName.put(Terminal.getCodeName().get(), Terminal);
		codesByName.put(Device.getCodeName().get(), Device);
		codesByName.put(SecureModule.getCodeName().get(), SecureModule);
		codesByName.put(PaymentApplication.getCodeName().get(), PaymentApplication);
		codesByName.put(EMVKernel.getCodeName().get(), EMVKernel);
		codesByName.put(EMVLevel1.getCodeName().get(), EMVLevel1);
		codesByName.put(Middleware.getCodeName().get(), Middleware);
		codesByName.put(Driver.getCodeName().get(), Driver);
		codesByName.put(OperatingSystem.getCodeName().get(), OperatingSystem);
		codesByName.put(MerchantParameters.getCodeName().get(), MerchantParameters);
		codesByName.put(CertificateParameters.getCodeName().get(), CertificateParameters);
		codesByName.put(TMSProtocolParameters.getCodeName().get(), TMSProtocolParameters);
		codesByName.put(SaleComponent.getCodeName().get(), SaleComponent);
		codesByName.put(SaleToPOIProtocolParameters.getCodeName().get(), SaleToPOIProtocolParameters);
	}

	public static POIComponentType5Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static POIComponentType5Code[] values() {
		POIComponentType5Code[] values = new POIComponentType5Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, POIComponentType5Code> {
		@Override
		public POIComponentType5Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(POIComponentType5Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}