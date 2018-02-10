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
import com.tools20022.repository.codeset.RejectionReason12Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason of a rejection of a deactivation instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason12Code#EventAlreadyDeactivated
 * RejectionReason12Code.EventAlreadyDeactivated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason12Code#FailedValidation
 * RejectionReason12Code.FailedValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason12Code#SameCAIdentification
 * RejectionReason12Code.SameCAIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason12Code#InvalidCAIdentification
 * RejectionReason12Code.InvalidCAIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason12Code#InvalidAgent
 * RejectionReason12Code.InvalidAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason12Code#NotMainAgent
 * RejectionReason12Code.NotMainAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason12Code#InvalidOption
 * RejectionReason12Code.InvalidOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason12Code#PendingDeactivation
 * RejectionReason12Code.PendingDeactivation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason12Code#NoRemainingOption
 * RejectionReason12Code.NoRemainingOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason12Code#InvalidEventType
 * RejectionReason12Code.InvalidEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason12Code#InvalidUnderlyingSecurity
 * RejectionReason12Code.InvalidUnderlyingSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason12Code#InvalidEventProcessingType
 * RejectionReason12Code.InvalidEventProcessingType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason12Code#InvalidMandatoryVoluntaryEventType
 * RejectionReason12Code.InvalidMandatoryVoluntaryEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason12Code#SameIdentification
 * RejectionReason12Code.SameIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason12Code#MismatchedCAIdentification
 * RejectionReason12Code.MismatchedCAIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason12Code#NotApplicable
 * RejectionReason12Code.NotApplicable}</li>
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
 * "RejectionReason12Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason of a rejection of a deactivation instruction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RejectionReason12Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason12Code
	 * RejectionReason12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventAlreadyDeactivated"</li>
	 * </ul>
	 */
	public static final RejectionReason12Code EventAlreadyDeactivated = new RejectionReason12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventAlreadyDeactivated";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason12Code.mmObject();
			codeName = RejectionReasonCode.EventAlreadyDeactivated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason12Code
	 * RejectionReason12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailedValidation"</li>
	 * </ul>
	 */
	public static final RejectionReason12Code FailedValidation = new RejectionReason12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailedValidation";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason12Code.mmObject();
			codeName = RejectionReasonCode.FailedValidation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason12Code
	 * RejectionReason12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SameCAIdentification"</li>
	 * </ul>
	 */
	public static final RejectionReason12Code SameCAIdentification = new RejectionReason12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SameCAIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason12Code.mmObject();
			codeName = RejectionReasonCode.SameCAIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason12Code
	 * RejectionReason12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCAIdentification"</li>
	 * </ul>
	 */
	public static final RejectionReason12Code InvalidCAIdentification = new RejectionReason12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCAIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason12Code.mmObject();
			codeName = RejectionReasonCode.InvalidCAIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason12Code
	 * RejectionReason12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidAgent"</li>
	 * </ul>
	 */
	public static final RejectionReason12Code InvalidAgent = new RejectionReason12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason12Code.mmObject();
			codeName = RejectionReasonCode.InvalidAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason12Code
	 * RejectionReason12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotMainAgent"</li>
	 * </ul>
	 */
	public static final RejectionReason12Code NotMainAgent = new RejectionReason12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotMainAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason12Code.mmObject();
			codeName = RejectionReasonCode.NotMainAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason12Code
	 * RejectionReason12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidOption"</li>
	 * </ul>
	 */
	public static final RejectionReason12Code InvalidOption = new RejectionReason12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidOption";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason12Code.mmObject();
			codeName = RejectionReasonCode.InvalidOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason12Code
	 * RejectionReason12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingDeactivation"</li>
	 * </ul>
	 */
	public static final RejectionReason12Code PendingDeactivation = new RejectionReason12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDeactivation";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason12Code.mmObject();
			codeName = RejectionReasonCode.PendingDeactivation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason12Code
	 * RejectionReason12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoRemainingOption"</li>
	 * </ul>
	 */
	public static final RejectionReason12Code NoRemainingOption = new RejectionReason12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoRemainingOption";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason12Code.mmObject();
			codeName = RejectionReasonCode.NoRemainingOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason12Code
	 * RejectionReason12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidEventType"</li>
	 * </ul>
	 */
	public static final RejectionReason12Code InvalidEventType = new RejectionReason12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidEventType";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason12Code.mmObject();
			codeName = RejectionReasonCode.InvalidEventType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason12Code
	 * RejectionReason12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidUnderlyingSecurity"</li>
	 * </ul>
	 */
	public static final RejectionReason12Code InvalidUnderlyingSecurity = new RejectionReason12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidUnderlyingSecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason12Code.mmObject();
			codeName = RejectionReasonCode.InvalidUnderlyingSecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason12Code
	 * RejectionReason12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidEventProcessingType"</li>
	 * </ul>
	 */
	public static final RejectionReason12Code InvalidEventProcessingType = new RejectionReason12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidEventProcessingType";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason12Code.mmObject();
			codeName = RejectionReasonCode.InvalidEventProcessingType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason12Code
	 * RejectionReason12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidMandatoryVoluntaryEventType"</li>
	 * </ul>
	 */
	public static final RejectionReason12Code InvalidMandatoryVoluntaryEventType = new RejectionReason12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidMandatoryVoluntaryEventType";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason12Code.mmObject();
			codeName = RejectionReasonCode.InvalidMandatoryVoluntaryEventType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason12Code
	 * RejectionReason12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SameIdentification"</li>
	 * </ul>
	 */
	public static final RejectionReason12Code SameIdentification = new RejectionReason12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SameIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason12Code.mmObject();
			codeName = RejectionReasonCode.SameIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason12Code
	 * RejectionReason12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MismatchedCAIdentification"</li>
	 * </ul>
	 */
	public static final RejectionReason12Code MismatchedCAIdentification = new RejectionReason12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MismatchedCAIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason12Code.mmObject();
			codeName = RejectionReasonCode.MismatchedCAIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason12Code
	 * RejectionReason12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotApplicable"</li>
	 * </ul>
	 */
	public static final RejectionReason12Code NotApplicable = new RejectionReason12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotApplicable";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason12Code.mmObject();
			codeName = RejectionReasonCode.NotApplicable.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RejectionReason12Code> codesByName = new LinkedHashMap<>();

	protected RejectionReason12Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DEAC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectionReason12Code";
				definition = "Specifies the reason of a rejection of a deactivation instruction.";
				trace_lazy = () -> RejectionReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectionReason12Code.EventAlreadyDeactivated, com.tools20022.repository.codeset.RejectionReason12Code.FailedValidation,
						com.tools20022.repository.codeset.RejectionReason12Code.SameCAIdentification, com.tools20022.repository.codeset.RejectionReason12Code.InvalidCAIdentification,
						com.tools20022.repository.codeset.RejectionReason12Code.InvalidAgent, com.tools20022.repository.codeset.RejectionReason12Code.NotMainAgent, com.tools20022.repository.codeset.RejectionReason12Code.InvalidOption,
						com.tools20022.repository.codeset.RejectionReason12Code.PendingDeactivation, com.tools20022.repository.codeset.RejectionReason12Code.NoRemainingOption,
						com.tools20022.repository.codeset.RejectionReason12Code.InvalidEventType, com.tools20022.repository.codeset.RejectionReason12Code.InvalidUnderlyingSecurity,
						com.tools20022.repository.codeset.RejectionReason12Code.InvalidEventProcessingType, com.tools20022.repository.codeset.RejectionReason12Code.InvalidMandatoryVoluntaryEventType,
						com.tools20022.repository.codeset.RejectionReason12Code.SameIdentification, com.tools20022.repository.codeset.RejectionReason12Code.MismatchedCAIdentification,
						com.tools20022.repository.codeset.RejectionReason12Code.NotApplicable);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(EventAlreadyDeactivated.getCodeName().get(), EventAlreadyDeactivated);
		codesByName.put(FailedValidation.getCodeName().get(), FailedValidation);
		codesByName.put(SameCAIdentification.getCodeName().get(), SameCAIdentification);
		codesByName.put(InvalidCAIdentification.getCodeName().get(), InvalidCAIdentification);
		codesByName.put(InvalidAgent.getCodeName().get(), InvalidAgent);
		codesByName.put(NotMainAgent.getCodeName().get(), NotMainAgent);
		codesByName.put(InvalidOption.getCodeName().get(), InvalidOption);
		codesByName.put(PendingDeactivation.getCodeName().get(), PendingDeactivation);
		codesByName.put(NoRemainingOption.getCodeName().get(), NoRemainingOption);
		codesByName.put(InvalidEventType.getCodeName().get(), InvalidEventType);
		codesByName.put(InvalidUnderlyingSecurity.getCodeName().get(), InvalidUnderlyingSecurity);
		codesByName.put(InvalidEventProcessingType.getCodeName().get(), InvalidEventProcessingType);
		codesByName.put(InvalidMandatoryVoluntaryEventType.getCodeName().get(), InvalidMandatoryVoluntaryEventType);
		codesByName.put(SameIdentification.getCodeName().get(), SameIdentification);
		codesByName.put(MismatchedCAIdentification.getCodeName().get(), MismatchedCAIdentification);
		codesByName.put(NotApplicable.getCodeName().get(), NotApplicable);
	}

	public static RejectionReason12Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RejectionReason12Code[] values() {
		RejectionReason12Code[] values = new RejectionReason12Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RejectionReason12Code> {
		@Override
		public RejectionReason12Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RejectionReason12Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}