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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Low level communication of the hardware or software component toward another
 * component or an external entity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.POICommunicationType1Code
 * POICommunicationType1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.POICommunicationType2Code
 * POICommunicationType2Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode#mmUSBHost
 * POICommunicationTypeCode.mmUSBHost}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode#mmUSBDevice
 * POICommunicationTypeCode.mmUSBDevice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode#mmEthernet
 * POICommunicationTypeCode.mmEthernet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode#mmWifi
 * POICommunicationTypeCode.mmWifi}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode#mmPSTN
 * POICommunicationTypeCode.mmPSTN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode#mmBluetooth
 * POICommunicationTypeCode.mmBluetooth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode#mmGSM
 * POICommunicationTypeCode.mmGSM}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode#mmGPRS
 * POICommunicationTypeCode.mmGPRS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode#mmRS232
 * POICommunicationTypeCode.mmRS232}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode#mmWirelessTechnology2G
 * POICommunicationTypeCode.mmWirelessTechnology2G}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode#mmWirelessTechnology3G
 * POICommunicationTypeCode.mmWirelessTechnology3G}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode#mmWirelessTechnology4G
 * POICommunicationTypeCode.mmWirelessTechnology4G}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode#mmWirelessTechnology5G
 * POICommunicationTypeCode.mmWirelessTechnology5G}</li>
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
 * <li>"USBH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "POICommunicationTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Low level communication of the hardware or software component toward another component or an external entity."
 * </li>
 * </ul>
 */
public class POICommunicationTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Communication with a host from an USB port.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode
	 * POICommunicationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USBH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USBHost"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Communication with a host from an USB port."</li>
	 * </ul>
	 */
	public static final MMCode mmUSBHost = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "USBHost";
			definition = "Communication with a host from an USB port.";
			owner_lazy = () -> POICommunicationTypeCode.mmObject();
			codeName = "USBH";
		}
	};
	/**
	 * Communication with a USB stick or any USB device.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode
	 * POICommunicationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USBD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USBDevice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Communication with a USB stick or any USB device."</li>
	 * </ul>
	 */
	public static final MMCode mmUSBDevice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "USBDevice";
			definition = "Communication with a USB stick or any USB device.";
			owner_lazy = () -> POICommunicationTypeCode.mmObject();
			codeName = "USBD";
		}
	};
	/**
	 * Ethernet port to communicate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode
	 * POICommunicationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ETHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ethernet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ethernet port to communicate."</li>
	 * </ul>
	 */
	public static final MMCode mmEthernet = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Ethernet";
			definition = "Ethernet port to communicate.";
			owner_lazy = () -> POICommunicationTypeCode.mmObject();
			codeName = "ETHR";
		}
	};
	/**
	 * Wifi communication with another component.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode
	 * POICommunicationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WIFI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Wifi"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Wifi communication with another component."</li>
	 * </ul>
	 */
	public static final MMCode mmWifi = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Wifi";
			definition = "Wifi communication with another component.";
			owner_lazy = () -> POICommunicationTypeCode.mmObject();
			codeName = "WIFI";
		}
	};
	/**
	 * Communication with a host using Public Switching Telephone Network.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode
	 * POICommunicationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PSTN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PSTN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Communication with a host using Public Switching Telephone Network."</li>
	 * </ul>
	 */
	public static final MMCode mmPSTN = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PSTN";
			definition = "Communication with a host using Public Switching Telephone Network.";
			owner_lazy = () -> POICommunicationTypeCode.mmObject();
			codeName = "PSTN";
		}
	};
	/**
	 * Communication with a host using Bluetooth.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode
	 * POICommunicationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BLTH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bluetooth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Communication with a host using Bluetooth."</li>
	 * </ul>
	 */
	public static final MMCode mmBluetooth = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Bluetooth";
			definition = "Communication with a host using Bluetooth.";
			owner_lazy = () -> POICommunicationTypeCode.mmObject();
			codeName = "BLTH";
		}
	};
	/**
	 * Communication with a host using GSM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode
	 * POICommunicationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GSMF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GSM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Communication with a host using GSM."</li>
	 * </ul>
	 */
	public static final MMCode mmGSM = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GSM";
			definition = "Communication with a host using GSM.";
			owner_lazy = () -> POICommunicationTypeCode.mmObject();
			codeName = "GSMF";
		}
	};
	/**
	 * Communication with a host using GPRS.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode
	 * POICommunicationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GPRS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GPRS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Communication with a host using GPRS."</li>
	 * </ul>
	 */
	public static final MMCode mmGPRS = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GPRS";
			definition = "Communication with a host using GPRS.";
			owner_lazy = () -> POICommunicationTypeCode.mmObject();
			codeName = "GPRS";
		}
	};
	/**
	 * Serial port to communicate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode
	 * POICommunicationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RS23"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RS232"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Serial port to communicate."</li>
	 * </ul>
	 */
	public static final MMCode mmRS232 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RS232";
			definition = "Serial port to communicate.";
			owner_lazy = () -> POICommunicationTypeCode.mmObject();
			codeName = "RS23";
		}
	};
	/**
	 * Includes all communication technologies which can be qualified as being
	 * part of the 2G technology (e.g EDGE or PDC).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode
	 * POICommunicationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WT2G"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WirelessTechnology2G"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Includes all communication technologies which can be qualified as being part of the 2G technology (e.g EDGE or PDC)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmWirelessTechnology2G = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WirelessTechnology2G";
			definition = "Includes all communication technologies which can be qualified as being part of the 2G technology (e.g EDGE or PDC).";
			owner_lazy = () -> POICommunicationTypeCode.mmObject();
			codeName = "WT2G";
		}
	};
	/**
	 * Includes all communication technologies which can be qualified as being
	 * part of the 3G technology.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode
	 * POICommunicationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WT3G"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WirelessTechnology3G"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Includes all communication technologies which can be qualified as being part of the 3G technology."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmWirelessTechnology3G = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WirelessTechnology3G";
			definition = "Includes all communication technologies which can be qualified as being part of the 3G technology.";
			owner_lazy = () -> POICommunicationTypeCode.mmObject();
			codeName = "WT3G";
		}
	};
	/**
	 * Includes all communication technologies which can be qualified as being
	 * part of the 4G technology.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode
	 * POICommunicationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WT4G"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WirelessTechnology4G"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Includes all communication technologies which can be qualified as being part of the 4G technology."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmWirelessTechnology4G = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WirelessTechnology4G";
			definition = "Includes all communication technologies which can be qualified as being part of the 4G technology.";
			owner_lazy = () -> POICommunicationTypeCode.mmObject();
			codeName = "WT4G";
		}
	};
	/**
	 * Includes all communication technologies which can be qualified as being
	 * part of the 5G technology.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode
	 * POICommunicationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WT5G"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WirelessTechnology5G"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Includes all communication technologies which can be qualified as being part of the 5G technology."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmWirelessTechnology5G = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WirelessTechnology5G";
			definition = "Includes all communication technologies which can be qualified as being part of the 5G technology.";
			owner_lazy = () -> POICommunicationTypeCode.mmObject();
			codeName = "WT5G";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("USBH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "POICommunicationTypeCode";
				definition = "Low level communication of the hardware or software component toward another component or an external entity.";
				code_lazy = () -> Arrays.asList(POICommunicationTypeCode.mmUSBHost, POICommunicationTypeCode.mmUSBDevice, POICommunicationTypeCode.mmEthernet, POICommunicationTypeCode.mmWifi, POICommunicationTypeCode.mmPSTN,
						POICommunicationTypeCode.mmBluetooth, POICommunicationTypeCode.mmGSM, POICommunicationTypeCode.mmGPRS, POICommunicationTypeCode.mmRS232, POICommunicationTypeCode.mmWirelessTechnology2G,
						POICommunicationTypeCode.mmWirelessTechnology3G, POICommunicationTypeCode.mmWirelessTechnology4G, POICommunicationTypeCode.mmWirelessTechnology5G);
				derivation_lazy = () -> Arrays.asList(POICommunicationType1Code.mmObject(), POICommunicationType2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}