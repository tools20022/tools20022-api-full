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
import com.tools20022.repository.codeset.RejectionReason8Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason of a rejection of an election amendment request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason8Code#AmendmentNotAllowed
 * RejectionReason8Code.AmendmentNotAllowed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RejectionReason8Code#Late
 * RejectionReason8Code.Late}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason8Code#ElectionAlreadyCancelled
 * RejectionReason8Code.ElectionAlreadyCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason8Code#FailedValidation
 * RejectionReason8Code.FailedValidation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
 * RejectionReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"NAMD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RejectionReason8Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason of a rejection of an election amendment request."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RejectionReason8Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason8Code
	 * RejectionReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendmentNotAllowed"</li>
	 * </ul>
	 */
	public static final RejectionReason8Code AmendmentNotAllowed = new RejectionReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendmentNotAllowed";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason8Code.mmObject();
			codeName = RejectionReasonCode.AmendmentNotAllowed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason8Code
	 * RejectionReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Late"</li>
	 * </ul>
	 */
	public static final RejectionReason8Code Late = new RejectionReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Late";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason8Code.mmObject();
			codeName = RejectionReasonCode.Late.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason8Code
	 * RejectionReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectionAlreadyCancelled"</li>
	 * </ul>
	 */
	public static final RejectionReason8Code ElectionAlreadyCancelled = new RejectionReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionAlreadyCancelled";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason8Code.mmObject();
			codeName = RejectionReasonCode.ElectionAlreadyCancelled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason8Code
	 * RejectionReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailedValidation"</li>
	 * </ul>
	 */
	public static final RejectionReason8Code FailedValidation = new RejectionReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailedValidation";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason8Code.mmObject();
			codeName = RejectionReasonCode.FailedValidation.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RejectionReason8Code> codesByName = new LinkedHashMap<>();

	protected RejectionReason8Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NAMD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectionReason8Code";
				definition = "Specifies the reason of a rejection of an election amendment request.";
				trace_lazy = () -> RejectionReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectionReason8Code.AmendmentNotAllowed, com.tools20022.repository.codeset.RejectionReason8Code.Late,
						com.tools20022.repository.codeset.RejectionReason8Code.ElectionAlreadyCancelled, com.tools20022.repository.codeset.RejectionReason8Code.FailedValidation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AmendmentNotAllowed.getCodeName().get(), AmendmentNotAllowed);
		codesByName.put(Late.getCodeName().get(), Late);
		codesByName.put(ElectionAlreadyCancelled.getCodeName().get(), ElectionAlreadyCancelled);
		codesByName.put(FailedValidation.getCodeName().get(), FailedValidation);
	}

	public static RejectionReason8Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RejectionReason8Code[] values() {
		RejectionReason8Code[] values = new RejectionReason8Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RejectionReason8Code> {
		@Override
		public RejectionReason8Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RejectionReason8Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}