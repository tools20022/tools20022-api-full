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
import com.tools20022.repository.codeset.RejectionReason13Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason of a rejection of a movement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason13Code#FailedValidation
 * RejectionReason13Code.FailedValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason13Code#SameIdentification
 * RejectionReason13Code.SameIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason13Code#InvalidIdentification
 * RejectionReason13Code.InvalidIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason13Code#InvalidCAIdentification
 * RejectionReason13Code.InvalidCAIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason13Code#MismatchedCAIdentification
 * RejectionReason13Code.MismatchedCAIdentification}</li>
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
 * <li>"FAIL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RejectionReason13Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason of a rejection of a movement."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RejectionReason13Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason13Code
	 * RejectionReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailedValidation"</li>
	 * </ul>
	 */
	public static final RejectionReason13Code FailedValidation = new RejectionReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailedValidation";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason13Code.mmObject();
			codeName = RejectionReasonCode.FailedValidation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason13Code
	 * RejectionReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SameIdentification"</li>
	 * </ul>
	 */
	public static final RejectionReason13Code SameIdentification = new RejectionReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SameIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason13Code.mmObject();
			codeName = RejectionReasonCode.SameIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason13Code
	 * RejectionReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidIdentification"</li>
	 * </ul>
	 */
	public static final RejectionReason13Code InvalidIdentification = new RejectionReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason13Code.mmObject();
			codeName = RejectionReasonCode.InvalidIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason13Code
	 * RejectionReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCAIdentification"</li>
	 * </ul>
	 */
	public static final RejectionReason13Code InvalidCAIdentification = new RejectionReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCAIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason13Code.mmObject();
			codeName = RejectionReasonCode.InvalidCAIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason13Code
	 * RejectionReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MismatchedCAIdentification"</li>
	 * </ul>
	 */
	public static final RejectionReason13Code MismatchedCAIdentification = new RejectionReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MismatchedCAIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason13Code.mmObject();
			codeName = RejectionReasonCode.MismatchedCAIdentification.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RejectionReason13Code> codesByName = new LinkedHashMap<>();

	protected RejectionReason13Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FAIL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectionReason13Code";
				definition = "Specifies the reason of a rejection of a movement.";
				trace_lazy = () -> RejectionReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectionReason13Code.FailedValidation, com.tools20022.repository.codeset.RejectionReason13Code.SameIdentification,
						com.tools20022.repository.codeset.RejectionReason13Code.InvalidIdentification, com.tools20022.repository.codeset.RejectionReason13Code.InvalidCAIdentification,
						com.tools20022.repository.codeset.RejectionReason13Code.MismatchedCAIdentification);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(FailedValidation.getCodeName().get(), FailedValidation);
		codesByName.put(SameIdentification.getCodeName().get(), SameIdentification);
		codesByName.put(InvalidIdentification.getCodeName().get(), InvalidIdentification);
		codesByName.put(InvalidCAIdentification.getCodeName().get(), InvalidCAIdentification);
		codesByName.put(MismatchedCAIdentification.getCodeName().get(), MismatchedCAIdentification);
	}

	public static RejectionReason13Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RejectionReason13Code[] values() {
		RejectionReason13Code[] values = new RejectionReason13Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RejectionReason13Code> {
		@Override
		public RejectionReason13Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RejectionReason13Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}