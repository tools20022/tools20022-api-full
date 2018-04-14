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
import com.tools20022.repository.codeset.NetworkTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of communication network.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NetworkTypeCode#InternetProtocol
 * NetworkTypeCode.InternetProtocol}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NetworkTypeCode#PublicTelephone
 * NetworkTypeCode.PublicTelephone}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.NetworkTypeCode#HTTP
 * NetworkTypeCode.HTTP}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.NetworkTypeCode#Sock4
 * NetworkTypeCode.Sock4}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.NetworkTypeCode#Sock5
 * NetworkTypeCode.Sock5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.NetworkType1Code
 * NetworkType1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.NetworkType2Code
 * NetworkType2Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NetworkTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of communication network."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class NetworkTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Protocol of an IP network.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NetworkTypeCode
	 * NetworkTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IPNW"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InternetProtocol"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Protocol of an IP network."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NetworkTypeCode InternetProtocol = new NetworkTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InternetProtocol";
			definition = "Protocol of an IP network.";
			owner_lazy = () -> com.tools20022.repository.codeset.NetworkTypeCode.mmObject();
			codeName = "IPNW";
		}
	};
	/**
	 * Protocol of a Public Switched Telephone Network (PSTN).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NetworkTypeCode
	 * NetworkTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PSTN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PublicTelephone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Protocol of a Public Switched Telephone Network (PSTN)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NetworkTypeCode PublicTelephone = new NetworkTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PublicTelephone";
			definition = "Protocol of a Public Switched Telephone Network (PSTN).";
			owner_lazy = () -> com.tools20022.repository.codeset.NetworkTypeCode.mmObject();
			codeName = "PSTN";
		}
	};
	/**
	 * HTTP proxy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NetworkTypeCode
	 * NetworkTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HTTP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HTTP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "HTTP proxy."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NetworkTypeCode HTTP = new NetworkTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HTTP";
			definition = "HTTP proxy.";
			owner_lazy = () -> com.tools20022.repository.codeset.NetworkTypeCode.mmObject();
			codeName = "HTTP";
		}
	};
	/**
	 * Sock4 proxy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NetworkTypeCode
	 * NetworkTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCK4"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sock4"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sock4 proxy."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NetworkTypeCode Sock4 = new NetworkTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sock4";
			definition = "Sock4 proxy.";
			owner_lazy = () -> com.tools20022.repository.codeset.NetworkTypeCode.mmObject();
			codeName = "SCK4";
		}
	};
	/**
	 * Sock5 proxy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NetworkTypeCode
	 * NetworkTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCK5"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sock5"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sock5 proxy."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final NetworkTypeCode Sock5 = new NetworkTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sock5";
			definition = "Sock5 proxy.";
			owner_lazy = () -> com.tools20022.repository.codeset.NetworkTypeCode.mmObject();
			codeName = "SCK5";
		}
	};
	final static private LinkedHashMap<String, NetworkTypeCode> codesByName = new LinkedHashMap<>();

	protected NetworkTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NetworkTypeCode";
				definition = "Type of communication network.";
				derivation_lazy = () -> Arrays.asList(NetworkType1Code.mmObject(), NetworkType2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NetworkTypeCode.InternetProtocol, com.tools20022.repository.codeset.NetworkTypeCode.PublicTelephone, com.tools20022.repository.codeset.NetworkTypeCode.HTTP,
						com.tools20022.repository.codeset.NetworkTypeCode.Sock4, com.tools20022.repository.codeset.NetworkTypeCode.Sock5);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(InternetProtocol.getCodeName().get(), InternetProtocol);
		codesByName.put(PublicTelephone.getCodeName().get(), PublicTelephone);
		codesByName.put(HTTP.getCodeName().get(), HTTP);
		codesByName.put(Sock4.getCodeName().get(), Sock4);
		codesByName.put(Sock5.getCodeName().get(), Sock5);
	}

	public static NetworkTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static NetworkTypeCode[] values() {
		NetworkTypeCode[] values = new NetworkTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, NetworkTypeCode> {
		@Override
		public NetworkTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(NetworkTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}