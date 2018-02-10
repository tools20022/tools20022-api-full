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
import com.tools20022.repository.codeset.POICommunicationType2Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code#Bluetooth
 * POICommunicationType2Code.Bluetooth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code#Ethernet
 * POICommunicationType2Code.Ethernet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code#GPRS
 * POICommunicationType2Code.GPRS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code#GSM
 * POICommunicationType2Code.GSM}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code#PSTN
 * POICommunicationType2Code.PSTN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code#RS232
 * POICommunicationType2Code.RS232}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code#USBDevice
 * POICommunicationType2Code.USBDevice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code#USBHost
 * POICommunicationType2Code.USBHost}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code#Wifi
 * POICommunicationType2Code.Wifi}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code#WirelessTechnology2G
 * POICommunicationType2Code.WirelessTechnology2G}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code#WirelessTechnology3G
 * POICommunicationType2Code.WirelessTechnology3G}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code#WirelessTechnology4G
 * POICommunicationType2Code.WirelessTechnology4G}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code#WirelessTechnology5G
 * POICommunicationType2Code.WirelessTechnology5G}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.POICommunicationTypeCode
 * POICommunicationTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class POICommunicationType2Code extends MMCode {

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
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType1Code#Bluetooth
	 * POICommunicationType1Code.Bluetooth}</li>
	 * </ul>
	 */
	public static final POICommunicationType2Code Bluetooth = new POICommunicationType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bluetooth";
			previousVersion_lazy = () -> POICommunicationType1Code.Bluetooth;
			owner_lazy = () -> com.tools20022.repository.codeset.POICommunicationType2Code.mmObject();
			codeName = POICommunicationTypeCode.Bluetooth.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType1Code#Ethernet
	 * POICommunicationType1Code.Ethernet}</li>
	 * </ul>
	 */
	public static final POICommunicationType2Code Ethernet = new POICommunicationType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Ethernet";
			previousVersion_lazy = () -> POICommunicationType1Code.Ethernet;
			owner_lazy = () -> com.tools20022.repository.codeset.POICommunicationType2Code.mmObject();
			codeName = POICommunicationTypeCode.Ethernet.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType1Code#GPRS
	 * POICommunicationType1Code.GPRS}</li>
	 * </ul>
	 */
	public static final POICommunicationType2Code GPRS = new POICommunicationType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GPRS";
			previousVersion_lazy = () -> POICommunicationType1Code.GPRS;
			owner_lazy = () -> com.tools20022.repository.codeset.POICommunicationType2Code.mmObject();
			codeName = POICommunicationTypeCode.GPRS.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType1Code#GSM
	 * POICommunicationType1Code.GSM}</li>
	 * </ul>
	 */
	public static final POICommunicationType2Code GSM = new POICommunicationType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GSM";
			previousVersion_lazy = () -> POICommunicationType1Code.GSM;
			owner_lazy = () -> com.tools20022.repository.codeset.POICommunicationType2Code.mmObject();
			codeName = POICommunicationTypeCode.GSM.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType1Code#PSTN
	 * POICommunicationType1Code.PSTN}</li>
	 * </ul>
	 */
	public static final POICommunicationType2Code PSTN = new POICommunicationType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PSTN";
			previousVersion_lazy = () -> POICommunicationType1Code.PSTN;
			owner_lazy = () -> com.tools20022.repository.codeset.POICommunicationType2Code.mmObject();
			codeName = POICommunicationTypeCode.PSTN.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType1Code#RS232
	 * POICommunicationType1Code.RS232}</li>
	 * </ul>
	 */
	public static final POICommunicationType2Code RS232 = new POICommunicationType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RS232";
			previousVersion_lazy = () -> POICommunicationType1Code.RS232;
			owner_lazy = () -> com.tools20022.repository.codeset.POICommunicationType2Code.mmObject();
			codeName = POICommunicationTypeCode.RS232.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType1Code#USBDevice
	 * POICommunicationType1Code.USBDevice}</li>
	 * </ul>
	 */
	public static final POICommunicationType2Code USBDevice = new POICommunicationType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USBDevice";
			previousVersion_lazy = () -> POICommunicationType1Code.USBDevice;
			owner_lazy = () -> com.tools20022.repository.codeset.POICommunicationType2Code.mmObject();
			codeName = POICommunicationTypeCode.USBDevice.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType1Code#USBHost
	 * POICommunicationType1Code.USBHost}</li>
	 * </ul>
	 */
	public static final POICommunicationType2Code USBHost = new POICommunicationType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USBHost";
			previousVersion_lazy = () -> POICommunicationType1Code.USBHost;
			owner_lazy = () -> com.tools20022.repository.codeset.POICommunicationType2Code.mmObject();
			codeName = POICommunicationTypeCode.USBHost.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType1Code#Wifi
	 * POICommunicationType1Code.Wifi}</li>
	 * </ul>
	 */
	public static final POICommunicationType2Code Wifi = new POICommunicationType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Wifi";
			previousVersion_lazy = () -> POICommunicationType1Code.Wifi;
			owner_lazy = () -> com.tools20022.repository.codeset.POICommunicationType2Code.mmObject();
			codeName = POICommunicationTypeCode.Wifi.getCodeName().orElse(name);
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
	public static final POICommunicationType2Code WirelessTechnology2G = new POICommunicationType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WirelessTechnology2G";
			owner_lazy = () -> com.tools20022.repository.codeset.POICommunicationType2Code.mmObject();
			codeName = POICommunicationTypeCode.WirelessTechnology2G.getCodeName().orElse(name);
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
	public static final POICommunicationType2Code WirelessTechnology3G = new POICommunicationType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WirelessTechnology3G";
			owner_lazy = () -> com.tools20022.repository.codeset.POICommunicationType2Code.mmObject();
			codeName = POICommunicationTypeCode.WirelessTechnology3G.getCodeName().orElse(name);
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
	public static final POICommunicationType2Code WirelessTechnology4G = new POICommunicationType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WirelessTechnology4G";
			owner_lazy = () -> com.tools20022.repository.codeset.POICommunicationType2Code.mmObject();
			codeName = POICommunicationTypeCode.WirelessTechnology4G.getCodeName().orElse(name);
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
	public static final POICommunicationType2Code WirelessTechnology5G = new POICommunicationType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WirelessTechnology5G";
			owner_lazy = () -> com.tools20022.repository.codeset.POICommunicationType2Code.mmObject();
			codeName = POICommunicationTypeCode.WirelessTechnology5G.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, POICommunicationType2Code> codesByName = new LinkedHashMap<>();

	protected POICommunicationType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BLTH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "POICommunicationType2Code";
				definition = "Low level communication of the hardware or software component toward another component or an external entity.";
				previousVersion_lazy = () -> POICommunicationType1Code.mmObject();
				trace_lazy = () -> POICommunicationTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.POICommunicationType2Code.Bluetooth, com.tools20022.repository.codeset.POICommunicationType2Code.Ethernet,
						com.tools20022.repository.codeset.POICommunicationType2Code.GPRS, com.tools20022.repository.codeset.POICommunicationType2Code.GSM, com.tools20022.repository.codeset.POICommunicationType2Code.PSTN,
						com.tools20022.repository.codeset.POICommunicationType2Code.RS232, com.tools20022.repository.codeset.POICommunicationType2Code.USBDevice, com.tools20022.repository.codeset.POICommunicationType2Code.USBHost,
						com.tools20022.repository.codeset.POICommunicationType2Code.Wifi, com.tools20022.repository.codeset.POICommunicationType2Code.WirelessTechnology2G,
						com.tools20022.repository.codeset.POICommunicationType2Code.WirelessTechnology3G, com.tools20022.repository.codeset.POICommunicationType2Code.WirelessTechnology4G,
						com.tools20022.repository.codeset.POICommunicationType2Code.WirelessTechnology5G);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Bluetooth.getCodeName().get(), Bluetooth);
		codesByName.put(Ethernet.getCodeName().get(), Ethernet);
		codesByName.put(GPRS.getCodeName().get(), GPRS);
		codesByName.put(GSM.getCodeName().get(), GSM);
		codesByName.put(PSTN.getCodeName().get(), PSTN);
		codesByName.put(RS232.getCodeName().get(), RS232);
		codesByName.put(USBDevice.getCodeName().get(), USBDevice);
		codesByName.put(USBHost.getCodeName().get(), USBHost);
		codesByName.put(Wifi.getCodeName().get(), Wifi);
		codesByName.put(WirelessTechnology2G.getCodeName().get(), WirelessTechnology2G);
		codesByName.put(WirelessTechnology3G.getCodeName().get(), WirelessTechnology3G);
		codesByName.put(WirelessTechnology4G.getCodeName().get(), WirelessTechnology4G);
		codesByName.put(WirelessTechnology5G.getCodeName().get(), WirelessTechnology5G);
	}

	public static POICommunicationType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static POICommunicationType2Code[] values() {
		POICommunicationType2Code[] values = new POICommunicationType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, POICommunicationType2Code> {
		@Override
		public POICommunicationType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(POICommunicationType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}