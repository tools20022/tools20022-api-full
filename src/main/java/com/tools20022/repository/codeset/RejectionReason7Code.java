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
import com.tools20022.repository.codeset.RejectionReason7Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason of a rejection cancellation request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason7Code#EventAlreadyDeactivated
 * RejectionReason7Code.EventAlreadyDeactivated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason7Code#FailedValidation
 * RejectionReason7Code.FailedValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason7Code#NoPendingDeactivationInstruction
 * RejectionReason7Code.NoPendingDeactivationInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason7Code#InvalidIdentification
 * RejectionReason7Code.InvalidIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason7Code#InvalidCAIdentification
 * RejectionReason7Code.InvalidCAIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason7Code#InvalidAgent
 * RejectionReason7Code.InvalidAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason7Code#SameIdentification
 * RejectionReason7Code.SameIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason7Code#OptionAlreadyDeactivated
 * RejectionReason7Code.OptionAlreadyDeactivated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason7Code#InvalidEventType
 * RejectionReason7Code.InvalidEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason7Code#InvalidUnderlyingSecurity
 * RejectionReason7Code.InvalidUnderlyingSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason7Code#InvalidEventProcessingType
 * RejectionReason7Code.InvalidEventProcessingType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason7Code#InvalidMandatoryVoluntaryEventType
 * RejectionReason7Code.InvalidMandatoryVoluntaryEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason7Code#InvalidCorporateActionInformation
 * RejectionReason7Code.InvalidCorporateActionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason7Code#InvalidDetails
 * RejectionReason7Code.InvalidDetails}</li>
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
 * <li>"DEAC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RejectionReason7Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason of a rejection cancellation request."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RejectionReason7Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason7Code
	 * RejectionReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventAlreadyDeactivated"</li>
	 * </ul>
	 */
	public static final RejectionReason7Code EventAlreadyDeactivated = new RejectionReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventAlreadyDeactivated";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason7Code.mmObject();
			codeName = RejectionReasonCode.EventAlreadyDeactivated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason7Code
	 * RejectionReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailedValidation"</li>
	 * </ul>
	 */
	public static final RejectionReason7Code FailedValidation = new RejectionReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailedValidation";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason7Code.mmObject();
			codeName = RejectionReasonCode.FailedValidation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason7Code
	 * RejectionReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoPendingDeactivationInstruction"</li>
	 * </ul>
	 */
	public static final RejectionReason7Code NoPendingDeactivationInstruction = new RejectionReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoPendingDeactivationInstruction";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason7Code.mmObject();
			codeName = RejectionReasonCode.NoPendingDeactivationInstruction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason7Code
	 * RejectionReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidIdentification"</li>
	 * </ul>
	 */
	public static final RejectionReason7Code InvalidIdentification = new RejectionReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason7Code.mmObject();
			codeName = RejectionReasonCode.InvalidIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason7Code
	 * RejectionReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCAIdentification"</li>
	 * </ul>
	 */
	public static final RejectionReason7Code InvalidCAIdentification = new RejectionReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCAIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason7Code.mmObject();
			codeName = RejectionReasonCode.InvalidCAIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason7Code
	 * RejectionReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidAgent"</li>
	 * </ul>
	 */
	public static final RejectionReason7Code InvalidAgent = new RejectionReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason7Code.mmObject();
			codeName = RejectionReasonCode.InvalidAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason7Code
	 * RejectionReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SameIdentification"</li>
	 * </ul>
	 */
	public static final RejectionReason7Code SameIdentification = new RejectionReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SameIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason7Code.mmObject();
			codeName = RejectionReasonCode.SameIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason7Code
	 * RejectionReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionAlreadyDeactivated"</li>
	 * </ul>
	 */
	public static final RejectionReason7Code OptionAlreadyDeactivated = new RejectionReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionAlreadyDeactivated";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason7Code.mmObject();
			codeName = RejectionReasonCode.OptionAlreadyDeactivated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason7Code
	 * RejectionReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidEventType"</li>
	 * </ul>
	 */
	public static final RejectionReason7Code InvalidEventType = new RejectionReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidEventType";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason7Code.mmObject();
			codeName = RejectionReasonCode.InvalidEventType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason7Code
	 * RejectionReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidUnderlyingSecurity"</li>
	 * </ul>
	 */
	public static final RejectionReason7Code InvalidUnderlyingSecurity = new RejectionReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidUnderlyingSecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason7Code.mmObject();
			codeName = RejectionReasonCode.InvalidUnderlyingSecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason7Code
	 * RejectionReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidEventProcessingType"</li>
	 * </ul>
	 */
	public static final RejectionReason7Code InvalidEventProcessingType = new RejectionReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidEventProcessingType";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason7Code.mmObject();
			codeName = RejectionReasonCode.InvalidEventProcessingType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason7Code
	 * RejectionReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidMandatoryVoluntaryEventType"</li>
	 * </ul>
	 */
	public static final RejectionReason7Code InvalidMandatoryVoluntaryEventType = new RejectionReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidMandatoryVoluntaryEventType";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason7Code.mmObject();
			codeName = RejectionReasonCode.InvalidMandatoryVoluntaryEventType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason7Code
	 * RejectionReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCorporateActionInformation"</li>
	 * </ul>
	 */
	public static final RejectionReason7Code InvalidCorporateActionInformation = new RejectionReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCorporateActionInformation";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason7Code.mmObject();
			codeName = RejectionReasonCode.InvalidCorporateActionInformation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason7Code
	 * RejectionReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidDetails"</li>
	 * </ul>
	 */
	public static final RejectionReason7Code InvalidDetails = new RejectionReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidDetails";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason7Code.mmObject();
			codeName = RejectionReasonCode.InvalidDetails.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RejectionReason7Code> codesByName = new LinkedHashMap<>();

	protected RejectionReason7Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DEAC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectionReason7Code";
				definition = "Specifies the reason of a rejection cancellation request.";
				trace_lazy = () -> RejectionReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectionReason7Code.EventAlreadyDeactivated, com.tools20022.repository.codeset.RejectionReason7Code.FailedValidation,
						com.tools20022.repository.codeset.RejectionReason7Code.NoPendingDeactivationInstruction, com.tools20022.repository.codeset.RejectionReason7Code.InvalidIdentification,
						com.tools20022.repository.codeset.RejectionReason7Code.InvalidCAIdentification, com.tools20022.repository.codeset.RejectionReason7Code.InvalidAgent,
						com.tools20022.repository.codeset.RejectionReason7Code.SameIdentification, com.tools20022.repository.codeset.RejectionReason7Code.OptionAlreadyDeactivated,
						com.tools20022.repository.codeset.RejectionReason7Code.InvalidEventType, com.tools20022.repository.codeset.RejectionReason7Code.InvalidUnderlyingSecurity,
						com.tools20022.repository.codeset.RejectionReason7Code.InvalidEventProcessingType, com.tools20022.repository.codeset.RejectionReason7Code.InvalidMandatoryVoluntaryEventType,
						com.tools20022.repository.codeset.RejectionReason7Code.InvalidCorporateActionInformation, com.tools20022.repository.codeset.RejectionReason7Code.InvalidDetails);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(EventAlreadyDeactivated.getCodeName().get(), EventAlreadyDeactivated);
		codesByName.put(FailedValidation.getCodeName().get(), FailedValidation);
		codesByName.put(NoPendingDeactivationInstruction.getCodeName().get(), NoPendingDeactivationInstruction);
		codesByName.put(InvalidIdentification.getCodeName().get(), InvalidIdentification);
		codesByName.put(InvalidCAIdentification.getCodeName().get(), InvalidCAIdentification);
		codesByName.put(InvalidAgent.getCodeName().get(), InvalidAgent);
		codesByName.put(SameIdentification.getCodeName().get(), SameIdentification);
		codesByName.put(OptionAlreadyDeactivated.getCodeName().get(), OptionAlreadyDeactivated);
		codesByName.put(InvalidEventType.getCodeName().get(), InvalidEventType);
		codesByName.put(InvalidUnderlyingSecurity.getCodeName().get(), InvalidUnderlyingSecurity);
		codesByName.put(InvalidEventProcessingType.getCodeName().get(), InvalidEventProcessingType);
		codesByName.put(InvalidMandatoryVoluntaryEventType.getCodeName().get(), InvalidMandatoryVoluntaryEventType);
		codesByName.put(InvalidCorporateActionInformation.getCodeName().get(), InvalidCorporateActionInformation);
		codesByName.put(InvalidDetails.getCodeName().get(), InvalidDetails);
	}

	public static RejectionReason7Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RejectionReason7Code[] values() {
		RejectionReason7Code[] values = new RejectionReason7Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RejectionReason7Code> {
		@Override
		public RejectionReason7Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RejectionReason7Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}