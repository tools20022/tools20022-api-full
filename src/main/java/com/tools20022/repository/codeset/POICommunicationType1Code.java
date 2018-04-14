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
import com.tools20022.repository.codeset.POICommunicationType1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.POICommunicationType1Code#Bluetooth
 * POICommunicationType1Code.Bluetooth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationType1Code#Ethernet
 * POICommunicationType1Code.Ethernet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationType1Code#GPRS
 * POICommunicationType1Code.GPRS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationType1Code#GSM
 * POICommunicationType1Code.GSM}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationType1Code#PSTN
 * POICommunicationType1Code.PSTN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationType1Code#RS232
 * POICommunicationType1Code.RS232}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationType1Code#USBDevice
 * POICommunicationType1Code.USBDevice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationType1Code#USBHost
 * POICommunicationType1Code.USBHost}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POICommunicationType1Code#Wifi
 * POICommunicationType1Code.Wifi}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "POICommunicationType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Low level communication of the hardware or software component toward another component or an external entity."
 * </li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.POICommunicationType2Code
 * POICommunicationType2Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class POICommunicationType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType1Code
	 * POICommunicationType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bluetooth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code#Bluetooth
	 * POICommunicationType2Code.Bluetooth}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final POICommunicationType1Code Bluetooth = new POICommunicationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bluetooth";
			nextVersions_lazy = () -> Arrays.asList(POICommunicationType2Code.Bluetooth);
			owner_lazy = () -> com.tools20022.repository.codeset.POICommunicationType1Code.mmObject();
			codeName = POICommunicationTypeCode.Bluetooth.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType1Code
	 * POICommunicationType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ethernet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code#Ethernet
	 * POICommunicationType2Code.Ethernet}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final POICommunicationType1Code Ethernet = new POICommunicationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Ethernet";
			nextVersions_lazy = () -> Arrays.asList(POICommunicationType2Code.Ethernet);
			owner_lazy = () -> com.tools20022.repository.codeset.POICommunicationType1Code.mmObject();
			codeName = POICommunicationTypeCode.Ethernet.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType1Code
	 * POICommunicationType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GPRS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code#GPRS
	 * POICommunicationType2Code.GPRS}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final POICommunicationType1Code GPRS = new POICommunicationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GPRS";
			nextVersions_lazy = () -> Arrays.asList(POICommunicationType2Code.GPRS);
			owner_lazy = () -> com.tools20022.repository.codeset.POICommunicationType1Code.mmObject();
			codeName = POICommunicationTypeCode.GPRS.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType1Code
	 * POICommunicationType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GSM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code#GSM
	 * POICommunicationType2Code.GSM}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final POICommunicationType1Code GSM = new POICommunicationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GSM";
			nextVersions_lazy = () -> Arrays.asList(POICommunicationType2Code.GSM);
			owner_lazy = () -> com.tools20022.repository.codeset.POICommunicationType1Code.mmObject();
			codeName = POICommunicationTypeCode.GSM.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType1Code
	 * POICommunicationType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PSTN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code#PSTN
	 * POICommunicationType2Code.PSTN}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final POICommunicationType1Code PSTN = new POICommunicationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PSTN";
			nextVersions_lazy = () -> Arrays.asList(POICommunicationType2Code.PSTN);
			owner_lazy = () -> com.tools20022.repository.codeset.POICommunicationType1Code.mmObject();
			codeName = POICommunicationTypeCode.PSTN.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType1Code
	 * POICommunicationType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RS232"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code#RS232
	 * POICommunicationType2Code.RS232}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final POICommunicationType1Code RS232 = new POICommunicationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RS232";
			nextVersions_lazy = () -> Arrays.asList(POICommunicationType2Code.RS232);
			owner_lazy = () -> com.tools20022.repository.codeset.POICommunicationType1Code.mmObject();
			codeName = POICommunicationTypeCode.RS232.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType1Code
	 * POICommunicationType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USBDevice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code#USBDevice
	 * POICommunicationType2Code.USBDevice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final POICommunicationType1Code USBDevice = new POICommunicationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USBDevice";
			nextVersions_lazy = () -> Arrays.asList(POICommunicationType2Code.USBDevice);
			owner_lazy = () -> com.tools20022.repository.codeset.POICommunicationType1Code.mmObject();
			codeName = POICommunicationTypeCode.USBDevice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType1Code
	 * POICommunicationType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USBHost"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code#USBHost
	 * POICommunicationType2Code.USBHost}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final POICommunicationType1Code USBHost = new POICommunicationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USBHost";
			nextVersions_lazy = () -> Arrays.asList(POICommunicationType2Code.USBHost);
			owner_lazy = () -> com.tools20022.repository.codeset.POICommunicationType1Code.mmObject();
			codeName = POICommunicationTypeCode.USBHost.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType1Code
	 * POICommunicationType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Wifi"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.POICommunicationType2Code#Wifi
	 * POICommunicationType2Code.Wifi}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final POICommunicationType1Code Wifi = new POICommunicationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Wifi";
			nextVersions_lazy = () -> Arrays.asList(POICommunicationType2Code.Wifi);
			owner_lazy = () -> com.tools20022.repository.codeset.POICommunicationType1Code.mmObject();
			codeName = POICommunicationTypeCode.Wifi.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, POICommunicationType1Code> codesByName = new LinkedHashMap<>();

	protected POICommunicationType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BLTH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "POICommunicationType1Code";
				definition = "Low level communication of the hardware or software component toward another component or an external entity.";
				nextVersions_lazy = () -> Arrays.asList(POICommunicationType2Code.mmObject());
				trace_lazy = () -> POICommunicationTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.POICommunicationType1Code.Bluetooth, com.tools20022.repository.codeset.POICommunicationType1Code.Ethernet,
						com.tools20022.repository.codeset.POICommunicationType1Code.GPRS, com.tools20022.repository.codeset.POICommunicationType1Code.GSM, com.tools20022.repository.codeset.POICommunicationType1Code.PSTN,
						com.tools20022.repository.codeset.POICommunicationType1Code.RS232, com.tools20022.repository.codeset.POICommunicationType1Code.USBDevice, com.tools20022.repository.codeset.POICommunicationType1Code.USBHost,
						com.tools20022.repository.codeset.POICommunicationType1Code.Wifi);
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
	}

	public static POICommunicationType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static POICommunicationType1Code[] values() {
		POICommunicationType1Code[] values = new POICommunicationType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, POICommunicationType1Code> {
		@Override
		public POICommunicationType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(POICommunicationType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}