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
import com.tools20022.repository.codeset.RejectedStatusReason8Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for a rejected status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason8Code#CutOffTime
 * RejectedStatusReason8Code.CutOffTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason8Code#NotAllowedToCancel
 * RejectedStatusReason8Code.NotAllowedToCancel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason8Code#NotCompliantWithSLA
 * RejectedStatusReason8Code.NotCompliantWithSLA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason8Code#LegallyImpossible
 * RejectedStatusReason8Code.LegallyImpossible}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
 * RejectedStatusReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CUTO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RejectedStatusReason8Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for a rejected status."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RejectedStatusReason8Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason8Code
	 * RejectedStatusReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CutOffTime"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason8Code CutOffTime = new RejectedStatusReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CutOffTime";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason8Code.mmObject();
			codeName = RejectedStatusReasonCode.CutOffTime.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason8Code
	 * RejectedStatusReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAllowedToCancel"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason8Code NotAllowedToCancel = new RejectedStatusReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAllowedToCancel";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason8Code.mmObject();
			codeName = RejectedStatusReasonCode.NotAllowedToCancel.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason8Code
	 * RejectedStatusReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotCompliantWithSLA"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason8Code NotCompliantWithSLA = new RejectedStatusReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotCompliantWithSLA";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason8Code.mmObject();
			codeName = RejectedStatusReasonCode.NotCompliantWithSLA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason8Code
	 * RejectedStatusReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegallyImpossible"</li>
	 * </ul>
	 */
	public static final RejectedStatusReason8Code LegallyImpossible = new RejectedStatusReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegallyImpossible";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectedStatusReason8Code.mmObject();
			codeName = RejectedStatusReasonCode.LegallyImpossible.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RejectedStatusReason8Code> codesByName = new LinkedHashMap<>();

	protected RejectedStatusReason8Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CUTO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectedStatusReason8Code";
				definition = "Specifies the reason for a rejected status.";
				trace_lazy = () -> RejectedStatusReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectedStatusReason8Code.CutOffTime, com.tools20022.repository.codeset.RejectedStatusReason8Code.NotAllowedToCancel,
						com.tools20022.repository.codeset.RejectedStatusReason8Code.NotCompliantWithSLA, com.tools20022.repository.codeset.RejectedStatusReason8Code.LegallyImpossible);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CutOffTime.getCodeName().get(), CutOffTime);
		codesByName.put(NotAllowedToCancel.getCodeName().get(), NotAllowedToCancel);
		codesByName.put(NotCompliantWithSLA.getCodeName().get(), NotCompliantWithSLA);
		codesByName.put(LegallyImpossible.getCodeName().get(), LegallyImpossible);
	}

	public static RejectedStatusReason8Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RejectedStatusReason8Code[] values() {
		RejectedStatusReason8Code[] values = new RejectedStatusReason8Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RejectedStatusReason8Code> {
		@Override
		public RejectedStatusReason8Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RejectedStatusReason8Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}