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
import com.tools20022.repository.codeset.ExtendedEventType4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies DTCC (The Depository Trust and Clearing Corporation) defined
 * corporate action event type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventType4Code#Termination
 * ExtendedEventType4Code.Termination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventType4Code#FinalPaydown
 * ExtendedEventType4Code.FinalPaydown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventType4Code#CertificateOfDepositEarlyRedemption
 * ExtendedEventType4Code.CertificateOfDepositEarlyRedemption}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeV2Code
 * ExtendedEventTypeV2Code}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ExtendedEventType4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies DTCC (The Depository Trust and Clearing Corporation) defined corporate action event type."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventType3Code
 * ExtendedEventType3Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ExtendedEventType4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedEventType4Code
	 * ExtendedEventType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Termination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedEventType3Code#Termination
	 * ExtendedEventType3Code.Termination}</li>
	 * </ul>
	 */
	public static final ExtendedEventType4Code Termination = new ExtendedEventType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Termination";
			previousVersion_lazy = () -> ExtendedEventType3Code.Termination;
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedEventType4Code.mmObject();
			codeName = ExtendedEventTypeV2Code.Termination.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedEventType4Code
	 * ExtendedEventType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalPaydown"</li>
	 * </ul>
	 */
	public static final ExtendedEventType4Code FinalPaydown = new ExtendedEventType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalPaydown";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedEventType4Code.mmObject();
			codeName = ExtendedEventTypeV2Code.FinalPaydown.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedEventType4Code
	 * ExtendedEventType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateOfDepositEarlyRedemption"</li>
	 * </ul>
	 */
	public static final ExtendedEventType4Code CertificateOfDepositEarlyRedemption = new ExtendedEventType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateOfDepositEarlyRedemption";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedEventType4Code.mmObject();
			codeName = ExtendedEventTypeV2Code.CertificateOfDepositEarlyRedemption.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ExtendedEventType4Code> codesByName = new LinkedHashMap<>();

	protected ExtendedEventType4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ExtendedEventType4Code";
				definition = "Specifies DTCC (The Depository Trust and Clearing Corporation) defined corporate action event type.";
				previousVersion_lazy = () -> ExtendedEventType3Code.mmObject();
				trace_lazy = () -> ExtendedEventTypeV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ExtendedEventType4Code.Termination, com.tools20022.repository.codeset.ExtendedEventType4Code.FinalPaydown,
						com.tools20022.repository.codeset.ExtendedEventType4Code.CertificateOfDepositEarlyRedemption);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Termination.getCodeName().get(), Termination);
		codesByName.put(FinalPaydown.getCodeName().get(), FinalPaydown);
		codesByName.put(CertificateOfDepositEarlyRedemption.getCodeName().get(), CertificateOfDepositEarlyRedemption);
	}

	public static ExtendedEventType4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ExtendedEventType4Code[] values() {
		ExtendedEventType4Code[] values = new ExtendedEventType4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ExtendedEventType4Code> {
		@Override
		public ExtendedEventType4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ExtendedEventType4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}