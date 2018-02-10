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
import com.tools20022.repository.codeset.CorporateActionCancellationReason1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies reasons for cancellation of a corporate action event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionCancellationReason1Code#Withrawal
 * CorporateActionCancellationReason1Code.Withrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionCancellationReason1Code#Processing
 * CorporateActionCancellationReason1Code.Processing}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CorporateActionCancellationReasonCode
 * CorporateActionCancellationReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"WITH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionCancellationReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies reasons for cancellation of a corporate action event."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionCancellationReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionCancellationReason1Code
	 * CorporateActionCancellationReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withrawal"</li>
	 * </ul>
	 */
	public static final CorporateActionCancellationReason1Code Withrawal = new CorporateActionCancellationReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Withrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionCancellationReason1Code.mmObject();
			codeName = CorporateActionCancellationReasonCode.Withrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionCancellationReason1Code
	 * CorporateActionCancellationReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Processing"</li>
	 * </ul>
	 */
	public static final CorporateActionCancellationReason1Code Processing = new CorporateActionCancellationReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Processing";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionCancellationReason1Code.mmObject();
			codeName = CorporateActionCancellationReasonCode.Processing.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CorporateActionCancellationReason1Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionCancellationReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("WITH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionCancellationReason1Code";
				definition = "Specifies reasons for cancellation of a corporate action event.";
				trace_lazy = () -> CorporateActionCancellationReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionCancellationReason1Code.Withrawal, com.tools20022.repository.codeset.CorporateActionCancellationReason1Code.Processing);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Withrawal.getCodeName().get(), Withrawal);
		codesByName.put(Processing.getCodeName().get(), Processing);
	}

	public static CorporateActionCancellationReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionCancellationReason1Code[] values() {
		CorporateActionCancellationReason1Code[] values = new CorporateActionCancellationReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionCancellationReason1Code> {
		@Override
		public CorporateActionCancellationReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionCancellationReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}