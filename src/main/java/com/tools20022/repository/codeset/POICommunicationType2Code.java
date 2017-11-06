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
import com.tools20022.repository.codeset.POICommunicationTypeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Low level communication of the hardware or software component toward another
 * component or an external entity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode
 * POICommunicationTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code#mmBluetooth
 * POICommunicationType2Code.mmBluetooth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code#mmEthernet
 * POICommunicationType2Code.mmEthernet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code#mmGPRS
 * POICommunicationType2Code.mmGPRS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code#mmGSM
 * POICommunicationType2Code.mmGSM}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code#mmPSTN
 * POICommunicationType2Code.mmPSTN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code#mmRS232
 * POICommunicationType2Code.mmRS232}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code#mmUSBDevice
 * POICommunicationType2Code.mmUSBDevice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code#mmUSBHost
 * POICommunicationType2Code.mmUSBHost}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code#mmWifi
 * POICommunicationType2Code.mmWifi}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code#mmWirelessTechnology2G
 * POICommunicationType2Code.mmWirelessTechnology2G}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code#mmWirelessTechnology3G
 * POICommunicationType2Code.mmWirelessTechnology3G}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code#mmWirelessTechnology4G
 * POICommunicationType2Code.mmWirelessTechnology4G}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code#mmWirelessTechnology5G
 * POICommunicationType2Code.mmWirelessTechnology5G}</li>
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
 * <li>"BLTH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "POICommunicationType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Low level communication of the hardware or software component toward another component or an external entity."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.POICommunicationType1Code
 * POICommunicationType1Code}</li>
 * </ul>
 */
public class POICommunicationType2Code extends POICommunicationTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code
	 * POICommunicationType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bluetooth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType1Code#mmBluetooth
	 * POICommunicationType1Code.mmBluetooth}</li>
	 * </ul>
	 */
	public static final MMCode mmBluetooth = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bluetooth";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.POICommunicationType1Code.mmBluetooth;
			owner_lazy = () -> POICommunicationType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code
	 * POICommunicationType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ethernet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType1Code#mmEthernet
	 * POICommunicationType1Code.mmEthernet}</li>
	 * </ul>
	 */
	public static final MMCode mmEthernet = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Ethernet";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.POICommunicationType1Code.mmEthernet;
			owner_lazy = () -> POICommunicationType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code
	 * POICommunicationType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GPRS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType1Code#mmGPRS
	 * POICommunicationType1Code.mmGPRS}</li>
	 * </ul>
	 */
	public static final MMCode mmGPRS = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GPRS";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.POICommunicationType1Code.mmGPRS;
			owner_lazy = () -> POICommunicationType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code
	 * POICommunicationType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GSM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType1Code#mmGSM
	 * POICommunicationType1Code.mmGSM}</li>
	 * </ul>
	 */
	public static final MMCode mmGSM = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GSM";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.POICommunicationType1Code.mmGSM;
			owner_lazy = () -> POICommunicationType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code
	 * POICommunicationType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PSTN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType1Code#mmPSTN
	 * POICommunicationType1Code.mmPSTN}</li>
	 * </ul>
	 */
	public static final MMCode mmPSTN = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PSTN";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.POICommunicationType1Code.mmPSTN;
			owner_lazy = () -> POICommunicationType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code
	 * POICommunicationType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RS232"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType1Code#mmRS232
	 * POICommunicationType1Code.mmRS232}</li>
	 * </ul>
	 */
	public static final MMCode mmRS232 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RS232";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.POICommunicationType1Code.mmRS232;
			owner_lazy = () -> POICommunicationType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code
	 * POICommunicationType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USBDevice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType1Code#mmUSBDevice
	 * POICommunicationType1Code.mmUSBDevice}</li>
	 * </ul>
	 */
	public static final MMCode mmUSBDevice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USBDevice";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.POICommunicationType1Code.mmUSBDevice;
			owner_lazy = () -> POICommunicationType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code
	 * POICommunicationType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USBHost"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType1Code#mmUSBHost
	 * POICommunicationType1Code.mmUSBHost}</li>
	 * </ul>
	 */
	public static final MMCode mmUSBHost = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USBHost";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.POICommunicationType1Code.mmUSBHost;
			owner_lazy = () -> POICommunicationType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code
	 * POICommunicationType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Wifi"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType1Code#mmWifi
	 * POICommunicationType1Code.mmWifi}</li>
	 * </ul>
	 */
	public static final MMCode mmWifi = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Wifi";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.POICommunicationType1Code.mmWifi;
			owner_lazy = () -> POICommunicationType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code
	 * POICommunicationType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WirelessTechnology2G"</li>
	 * </ul>
	 */
	public static final MMCode mmWirelessTechnology2G = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WirelessTechnology2G";
			owner_lazy = () -> POICommunicationType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code
	 * POICommunicationType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WirelessTechnology3G"</li>
	 * </ul>
	 */
	public static final MMCode mmWirelessTechnology3G = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WirelessTechnology3G";
			owner_lazy = () -> POICommunicationType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code
	 * POICommunicationType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WirelessTechnology4G"</li>
	 * </ul>
	 */
	public static final MMCode mmWirelessTechnology4G = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WirelessTechnology4G";
			owner_lazy = () -> POICommunicationType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code
	 * POICommunicationType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WirelessTechnology5G"</li>
	 * </ul>
	 */
	public static final MMCode mmWirelessTechnology5G = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WirelessTechnology5G";
			owner_lazy = () -> POICommunicationType2Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("BLTH");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "POICommunicationType2Code";
				definition = "Low level communication of the hardware or software component toward another component or an external entity.";
				previousVersion_lazy = () -> POICommunicationType1Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.POICommunicationType2Code.mmBluetooth, com.tools20022.repository.codeset.POICommunicationType2Code.mmEthernet,
						com.tools20022.repository.codeset.POICommunicationType2Code.mmGPRS, com.tools20022.repository.codeset.POICommunicationType2Code.mmGSM, com.tools20022.repository.codeset.POICommunicationType2Code.mmPSTN,
						com.tools20022.repository.codeset.POICommunicationType2Code.mmRS232, com.tools20022.repository.codeset.POICommunicationType2Code.mmUSBDevice, com.tools20022.repository.codeset.POICommunicationType2Code.mmUSBHost,
						com.tools20022.repository.codeset.POICommunicationType2Code.mmWifi, com.tools20022.repository.codeset.POICommunicationType2Code.mmWirelessTechnology2G,
						com.tools20022.repository.codeset.POICommunicationType2Code.mmWirelessTechnology3G, com.tools20022.repository.codeset.POICommunicationType2Code.mmWirelessTechnology4G,
						com.tools20022.repository.codeset.POICommunicationType2Code.mmWirelessTechnology5G);
				trace_lazy = () -> POICommunicationTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}