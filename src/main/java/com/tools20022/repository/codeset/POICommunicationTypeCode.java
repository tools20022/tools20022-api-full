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
import com.tools20022.repository.codeset.POICommunicationTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Low level communication of the hardware or software component toward another
 * component or an external entity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode#USBHost
 * POICommunicationTypeCode.USBHost}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode#USBDevice
 * POICommunicationTypeCode.USBDevice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode#Ethernet
 * POICommunicationTypeCode.Ethernet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode#Wifi
 * POICommunicationTypeCode.Wifi}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode#PSTN
 * POICommunicationTypeCode.PSTN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode#Bluetooth
 * POICommunicationTypeCode.Bluetooth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode#GSM
 * POICommunicationTypeCode.GSM}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode#GPRS
 * POICommunicationTypeCode.GPRS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode#RS232
 * POICommunicationTypeCode.RS232}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode#WirelessTechnology2G
 * POICommunicationTypeCode.WirelessTechnology2G}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode#WirelessTechnology3G
 * POICommunicationTypeCode.WirelessTechnology3G}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode#WirelessTechnology4G
 * POICommunicationTypeCode.WirelessTechnology4G}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode#WirelessTechnology5G
 * POICommunicationTypeCode.WirelessTechnology5G}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.POICommunicationType1Code
 * POICommunicationType1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.POICommunicationType2Code
 * POICommunicationType2Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class POICommunicationTypeCode extends MMCode {

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
	public static final POICommunicationTypeCode USBHost = new POICommunicationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "USBHost";
			definition = "Communication with a host from an USB port.";
			owner_lazy = () -> com.tools20022.repository.codeset.POICommunicationTypeCode.mmObject();
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
	public static final POICommunicationTypeCode USBDevice = new POICommunicationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "USBDevice";
			definition = "Communication with a USB stick or any USB device.";
			owner_lazy = () -> com.tools20022.repository.codeset.POICommunicationTypeCode.mmObject();
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
	public static final POICommunicationTypeCode Ethernet = new POICommunicationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Ethernet";
			definition = "Ethernet port to communicate.";
			owner_lazy = () -> com.tools20022.repository.codeset.POICommunicationTypeCode.mmObject();
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
	public static final POICommunicationTypeCode Wifi = new POICommunicationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Wifi";
			definition = "Wifi communication with another component.";
			owner_lazy = () -> com.tools20022.repository.codeset.POICommunicationTypeCode.mmObject();
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
	public static final POICommunicationTypeCode PSTN = new POICommunicationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PSTN";
			definition = "Communication with a host using Public Switching Telephone Network.";
			owner_lazy = () -> com.tools20022.repository.codeset.POICommunicationTypeCode.mmObject();
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
	public static final POICommunicationTypeCode Bluetooth = new POICommunicationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Bluetooth";
			definition = "Communication with a host using Bluetooth.";
			owner_lazy = () -> com.tools20022.repository.codeset.POICommunicationTypeCode.mmObject();
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
	public static final POICommunicationTypeCode GSM = new POICommunicationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GSM";
			definition = "Communication with a host using GSM.";
			owner_lazy = () -> com.tools20022.repository.codeset.POICommunicationTypeCode.mmObject();
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
	public static final POICommunicationTypeCode GPRS = new POICommunicationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GPRS";
			definition = "Communication with a host using GPRS.";
			owner_lazy = () -> com.tools20022.repository.codeset.POICommunicationTypeCode.mmObject();
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
	public static final POICommunicationTypeCode RS232 = new POICommunicationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RS232";
			definition = "Serial port to communicate.";
			owner_lazy = () -> com.tools20022.repository.codeset.POICommunicationTypeCode.mmObject();
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
	public static final POICommunicationTypeCode WirelessTechnology2G = new POICommunicationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WirelessTechnology2G";
			definition = "Includes all communication technologies which can be qualified as being part of the 2G technology (e.g EDGE or PDC).";
			owner_lazy = () -> com.tools20022.repository.codeset.POICommunicationTypeCode.mmObject();
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
	public static final POICommunicationTypeCode WirelessTechnology3G = new POICommunicationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WirelessTechnology3G";
			definition = "Includes all communication technologies which can be qualified as being part of the 3G technology.";
			owner_lazy = () -> com.tools20022.repository.codeset.POICommunicationTypeCode.mmObject();
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
	public static final POICommunicationTypeCode WirelessTechnology4G = new POICommunicationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WirelessTechnology4G";
			definition = "Includes all communication technologies which can be qualified as being part of the 4G technology.";
			owner_lazy = () -> com.tools20022.repository.codeset.POICommunicationTypeCode.mmObject();
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
	public static final POICommunicationTypeCode WirelessTechnology5G = new POICommunicationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WirelessTechnology5G";
			definition = "Includes all communication technologies which can be qualified as being part of the 5G technology.";
			owner_lazy = () -> com.tools20022.repository.codeset.POICommunicationTypeCode.mmObject();
			codeName = "WT5G";
		}
	};
	final static private LinkedHashMap<String, POICommunicationTypeCode> codesByName = new LinkedHashMap<>();

	protected POICommunicationTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("USBH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "POICommunicationTypeCode";
				definition = "Low level communication of the hardware or software component toward another component or an external entity.";
				derivation_lazy = () -> Arrays.asList(POICommunicationType1Code.mmObject(), POICommunicationType2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.POICommunicationTypeCode.USBHost, com.tools20022.repository.codeset.POICommunicationTypeCode.USBDevice,
						com.tools20022.repository.codeset.POICommunicationTypeCode.Ethernet, com.tools20022.repository.codeset.POICommunicationTypeCode.Wifi, com.tools20022.repository.codeset.POICommunicationTypeCode.PSTN,
						com.tools20022.repository.codeset.POICommunicationTypeCode.Bluetooth, com.tools20022.repository.codeset.POICommunicationTypeCode.GSM, com.tools20022.repository.codeset.POICommunicationTypeCode.GPRS,
						com.tools20022.repository.codeset.POICommunicationTypeCode.RS232, com.tools20022.repository.codeset.POICommunicationTypeCode.WirelessTechnology2G,
						com.tools20022.repository.codeset.POICommunicationTypeCode.WirelessTechnology3G, com.tools20022.repository.codeset.POICommunicationTypeCode.WirelessTechnology4G,
						com.tools20022.repository.codeset.POICommunicationTypeCode.WirelessTechnology5G);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(USBHost.getCodeName().get(), USBHost);
		codesByName.put(USBDevice.getCodeName().get(), USBDevice);
		codesByName.put(Ethernet.getCodeName().get(), Ethernet);
		codesByName.put(Wifi.getCodeName().get(), Wifi);
		codesByName.put(PSTN.getCodeName().get(), PSTN);
		codesByName.put(Bluetooth.getCodeName().get(), Bluetooth);
		codesByName.put(GSM.getCodeName().get(), GSM);
		codesByName.put(GPRS.getCodeName().get(), GPRS);
		codesByName.put(RS232.getCodeName().get(), RS232);
		codesByName.put(WirelessTechnology2G.getCodeName().get(), WirelessTechnology2G);
		codesByName.put(WirelessTechnology3G.getCodeName().get(), WirelessTechnology3G);
		codesByName.put(WirelessTechnology4G.getCodeName().get(), WirelessTechnology4G);
		codesByName.put(WirelessTechnology5G.getCodeName().get(), WirelessTechnology5G);
	}

	public static POICommunicationTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static POICommunicationTypeCode[] values() {
		POICommunicationTypeCode[] values = new POICommunicationTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, POICommunicationTypeCode> {
		@Override
		public POICommunicationTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(POICommunicationTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}