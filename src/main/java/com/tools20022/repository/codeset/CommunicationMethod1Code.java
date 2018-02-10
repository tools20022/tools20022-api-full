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
import com.tools20022.repository.codeset.CommunicationMethod1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Communication method used for the transmission of documents.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod1Code#SWIFTMT
 * CommunicationMethod1Code.SWIFTMT}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod1Code#SWIFTMX
 * CommunicationMethod1Code.SWIFTMX}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod1Code#Fax
 * CommunicationMethod1Code.Fax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod1Code#Email
 * CommunicationMethod1Code.Email}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod1Code#Proprietary
 * CommunicationMethod1Code.Proprietary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CommunicationMethodCode
 * CommunicationMethodCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"SWMT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CommunicationMethod1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Communication method used for the transmission of documents."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CommunicationMethod1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod1Code
	 * CommunicationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SWIFTMT"</li>
	 * </ul>
	 */
	public static final CommunicationMethod1Code SWIFTMT = new CommunicationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SWIFTMT";
			owner_lazy = () -> com.tools20022.repository.codeset.CommunicationMethod1Code.mmObject();
			codeName = CommunicationMethodCode.SWIFTMT.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod1Code
	 * CommunicationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SWIFTMX"</li>
	 * </ul>
	 */
	public static final CommunicationMethod1Code SWIFTMX = new CommunicationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SWIFTMX";
			owner_lazy = () -> com.tools20022.repository.codeset.CommunicationMethod1Code.mmObject();
			codeName = CommunicationMethodCode.SWIFTMX.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod1Code
	 * CommunicationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fax"</li>
	 * </ul>
	 */
	public static final CommunicationMethod1Code Fax = new CommunicationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fax";
			owner_lazy = () -> com.tools20022.repository.codeset.CommunicationMethod1Code.mmObject();
			codeName = CommunicationMethodCode.Fax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod1Code
	 * CommunicationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Email"</li>
	 * </ul>
	 */
	public static final CommunicationMethod1Code Email = new CommunicationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Email";
			owner_lazy = () -> com.tools20022.repository.codeset.CommunicationMethod1Code.mmObject();
			codeName = CommunicationMethodCode.Email.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethod1Code
	 * CommunicationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * </ul>
	 */
	public static final CommunicationMethod1Code Proprietary = new CommunicationMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			owner_lazy = () -> com.tools20022.repository.codeset.CommunicationMethod1Code.mmObject();
			codeName = CommunicationMethodCode.Proprietary.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CommunicationMethod1Code> codesByName = new LinkedHashMap<>();

	protected CommunicationMethod1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SWMT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CommunicationMethod1Code";
				definition = "Communication method used for the transmission of documents.";
				trace_lazy = () -> CommunicationMethodCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CommunicationMethod1Code.SWIFTMT, com.tools20022.repository.codeset.CommunicationMethod1Code.SWIFTMX,
						com.tools20022.repository.codeset.CommunicationMethod1Code.Fax, com.tools20022.repository.codeset.CommunicationMethod1Code.Email, com.tools20022.repository.codeset.CommunicationMethod1Code.Proprietary);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SWIFTMT.getCodeName().get(), SWIFTMT);
		codesByName.put(SWIFTMX.getCodeName().get(), SWIFTMX);
		codesByName.put(Fax.getCodeName().get(), Fax);
		codesByName.put(Email.getCodeName().get(), Email);
		codesByName.put(Proprietary.getCodeName().get(), Proprietary);
	}

	public static CommunicationMethod1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CommunicationMethod1Code[] values() {
		CommunicationMethod1Code[] values = new CommunicationMethod1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CommunicationMethod1Code> {
		@Override
		public CommunicationMethod1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CommunicationMethod1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}