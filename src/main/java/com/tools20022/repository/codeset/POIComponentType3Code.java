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
import com.tools20022.repository.codeset.POIComponentTypeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Type of component belonging to a POI (Point of Interaction) Terminal.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
 * POIComponentTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType3Code#mmAcquirerProtocolParameters
 * POIComponentType3Code.mmAcquirerProtocolParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType3Code#mmApplicationParameters
 * POIComponentType3Code.mmApplicationParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType3Code#mmTerminalParameters
 * POIComponentType3Code.mmTerminalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType3Code#mmSecurityParameters
 * POIComponentType3Code.mmSecurityParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType3Code#mmServer
 * POIComponentType3Code.mmServer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType3Code#mmTerminal
 * POIComponentType3Code.mmTerminal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType3Code#mmDevice
 * POIComponentType3Code.mmDevice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType3Code#mmSecureModule
 * POIComponentType3Code.mmSecureModule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType3Code#mmPaymentApplication
 * POIComponentType3Code.mmPaymentApplication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType3Code#mmEMVKernel
 * POIComponentType3Code.mmEMVKernel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType3Code#mmEMVLevel1
 * POIComponentType3Code.mmEMVLevel1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType3Code#mmMiddleware
 * POIComponentType3Code.mmMiddleware}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType3Code#mmDriver
 * POIComponentType3Code.mmDriver}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType3Code#mmOperatingSystem
 * POIComponentType3Code.mmOperatingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentType3Code#mmMerchantParameters
 * POIComponentType3Code.mmMerchantParameters}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AQPP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "POIComponentType3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Type of component belonging to a POI (Point of Interaction) Terminal."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.POIComponentType4Code
 * POIComponentType4Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class POIComponentType3Code extends POIComponentTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType3Code
	 * POIComponentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerProtocolParameters"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType4Code#mmAcquirerProtocolParameters
	 * POIComponentType4Code.mmAcquirerProtocolParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAcquirerProtocolParameters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerProtocolParameters";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.POIComponentType4Code.mmAcquirerProtocolParameters);
			owner_lazy = () -> POIComponentType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType3Code
	 * POIComponentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationParameters"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType4Code#mmApplicationParameters
	 * POIComponentType4Code.mmApplicationParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmApplicationParameters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationParameters";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.POIComponentType4Code.mmApplicationParameters);
			owner_lazy = () -> POIComponentType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType3Code
	 * POIComponentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalParameters"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType4Code#mmTerminalParameters
	 * POIComponentType4Code.mmTerminalParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTerminalParameters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalParameters";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.POIComponentType4Code.mmTerminalParameters);
			owner_lazy = () -> POIComponentType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType3Code
	 * POIComponentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityParameters"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType4Code#mmSecurityParameters
	 * POIComponentType4Code.mmSecurityParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSecurityParameters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityParameters";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.POIComponentType4Code.mmSecurityParameters);
			owner_lazy = () -> POIComponentType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType3Code
	 * POIComponentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Server"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType4Code#mmServer
	 * POIComponentType4Code.mmServer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmServer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Server";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.POIComponentType4Code.mmServer);
			owner_lazy = () -> POIComponentType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType3Code
	 * POIComponentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Terminal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType4Code#mmTerminal
	 * POIComponentType4Code.mmTerminal}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTerminal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Terminal";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.POIComponentType4Code.mmTerminal);
			owner_lazy = () -> POIComponentType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType3Code
	 * POIComponentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Device"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType4Code#mmDevice
	 * POIComponentType4Code.mmDevice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDevice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Device";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.POIComponentType4Code.mmDevice);
			owner_lazy = () -> POIComponentType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType3Code
	 * POIComponentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureModule"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType4Code#mmSecureModule
	 * POIComponentType4Code.mmSecureModule}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSecureModule = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureModule";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.POIComponentType4Code.mmSecureModule);
			owner_lazy = () -> POIComponentType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType3Code
	 * POIComponentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentApplication"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType4Code#mmPaymentApplication
	 * POIComponentType4Code.mmPaymentApplication}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPaymentApplication = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentApplication";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.POIComponentType4Code.mmPaymentApplication);
			owner_lazy = () -> POIComponentType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType3Code
	 * POIComponentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EMVKernel"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType4Code#mmEMVKernel
	 * POIComponentType4Code.mmEMVKernel}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmEMVKernel = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EMVKernel";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.POIComponentType4Code.mmEMVKernel);
			owner_lazy = () -> POIComponentType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType3Code
	 * POIComponentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EMVLevel1"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType4Code#mmEMVLevel1
	 * POIComponentType4Code.mmEMVLevel1}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmEMVLevel1 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EMVLevel1";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.POIComponentType4Code.mmEMVLevel1);
			owner_lazy = () -> POIComponentType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType3Code
	 * POIComponentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Middleware"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType4Code#mmMiddleware
	 * POIComponentType4Code.mmMiddleware}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMiddleware = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Middleware";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.POIComponentType4Code.mmMiddleware);
			owner_lazy = () -> POIComponentType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType3Code
	 * POIComponentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Driver"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType4Code#mmDriver
	 * POIComponentType4Code.mmDriver}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDriver = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Driver";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.POIComponentType4Code.mmDriver);
			owner_lazy = () -> POIComponentType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType3Code
	 * POIComponentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OperatingSystem"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType4Code#mmOperatingSystem
	 * POIComponentType4Code.mmOperatingSystem}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOperatingSystem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OperatingSystem";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.POIComponentType4Code.mmOperatingSystem);
			owner_lazy = () -> POIComponentType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType3Code
	 * POIComponentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantParameters"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType4Code#mmMerchantParameters
	 * POIComponentType4Code.mmMerchantParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMerchantParameters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantParameters";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.POIComponentType4Code.mmMerchantParameters);
			owner_lazy = () -> POIComponentType3Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("AQPP");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "POIComponentType3Code";
				definition = "Type of component belonging to a POI (Point of Interaction) Terminal.";
				nextVersions_lazy = () -> Arrays.asList(POIComponentType4Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.POIComponentType3Code.mmAcquirerProtocolParameters, com.tools20022.repository.codeset.POIComponentType3Code.mmApplicationParameters,
						com.tools20022.repository.codeset.POIComponentType3Code.mmTerminalParameters, com.tools20022.repository.codeset.POIComponentType3Code.mmSecurityParameters,
						com.tools20022.repository.codeset.POIComponentType3Code.mmServer, com.tools20022.repository.codeset.POIComponentType3Code.mmTerminal, com.tools20022.repository.codeset.POIComponentType3Code.mmDevice,
						com.tools20022.repository.codeset.POIComponentType3Code.mmSecureModule, com.tools20022.repository.codeset.POIComponentType3Code.mmPaymentApplication,
						com.tools20022.repository.codeset.POIComponentType3Code.mmEMVKernel, com.tools20022.repository.codeset.POIComponentType3Code.mmEMVLevel1, com.tools20022.repository.codeset.POIComponentType3Code.mmMiddleware,
						com.tools20022.repository.codeset.POIComponentType3Code.mmDriver, com.tools20022.repository.codeset.POIComponentType3Code.mmOperatingSystem,
						com.tools20022.repository.codeset.POIComponentType3Code.mmMerchantParameters);
				trace_lazy = () -> POIComponentTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}