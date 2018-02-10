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
import com.tools20022.repository.codeset.RejectionReason14Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason of a rejection of a movement cancellation request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason14Code#FailedValidation
 * RejectionReason14Code.FailedValidation}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RejectionReason14Code#Late
 * RejectionReason14Code.Late}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason14Code#InvalidEventType
 * RejectionReason14Code.InvalidEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason14Code#InvalidUnderlyingSecurity
 * RejectionReason14Code.InvalidUnderlyingSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason14Code#InvalidEventProcessingType
 * RejectionReason14Code.InvalidEventProcessingType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason14Code#InvalidMandatoryVoluntaryEventType
 * RejectionReason14Code.InvalidMandatoryVoluntaryEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason14Code#InvalidCorporateActionInformation
 * RejectionReason14Code.InvalidCorporateActionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason14Code#InvalidAgent
 * RejectionReason14Code.InvalidAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason14Code#InvalidMovementInformation
 * RejectionReason14Code.InvalidMovementInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason14Code#SameIdentification
 * RejectionReason14Code.SameIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason14Code#InvalidIdentification
 * RejectionReason14Code.InvalidIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason14Code#MovementAlreadySettled
 * RejectionReason14Code.MovementAlreadySettled}</li>
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
 * "RejectionReason14Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason of a rejection of a movement cancellation request."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RejectionReason14Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason14Code
	 * RejectionReason14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailedValidation"</li>
	 * </ul>
	 */
	public static final RejectionReason14Code FailedValidation = new RejectionReason14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailedValidation";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason14Code.mmObject();
			codeName = RejectionReasonCode.FailedValidation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason14Code
	 * RejectionReason14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Late"</li>
	 * </ul>
	 */
	public static final RejectionReason14Code Late = new RejectionReason14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Late";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason14Code.mmObject();
			codeName = RejectionReasonCode.Late.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason14Code
	 * RejectionReason14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidEventType"</li>
	 * </ul>
	 */
	public static final RejectionReason14Code InvalidEventType = new RejectionReason14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidEventType";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason14Code.mmObject();
			codeName = RejectionReasonCode.InvalidEventType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason14Code
	 * RejectionReason14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidUnderlyingSecurity"</li>
	 * </ul>
	 */
	public static final RejectionReason14Code InvalidUnderlyingSecurity = new RejectionReason14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidUnderlyingSecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason14Code.mmObject();
			codeName = RejectionReasonCode.InvalidUnderlyingSecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason14Code
	 * RejectionReason14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidEventProcessingType"</li>
	 * </ul>
	 */
	public static final RejectionReason14Code InvalidEventProcessingType = new RejectionReason14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidEventProcessingType";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason14Code.mmObject();
			codeName = RejectionReasonCode.InvalidEventProcessingType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason14Code
	 * RejectionReason14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidMandatoryVoluntaryEventType"</li>
	 * </ul>
	 */
	public static final RejectionReason14Code InvalidMandatoryVoluntaryEventType = new RejectionReason14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidMandatoryVoluntaryEventType";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason14Code.mmObject();
			codeName = RejectionReasonCode.InvalidMandatoryVoluntaryEventType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason14Code
	 * RejectionReason14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCorporateActionInformation"</li>
	 * </ul>
	 */
	public static final RejectionReason14Code InvalidCorporateActionInformation = new RejectionReason14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCorporateActionInformation";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason14Code.mmObject();
			codeName = RejectionReasonCode.InvalidCorporateActionInformation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason14Code
	 * RejectionReason14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidAgent"</li>
	 * </ul>
	 */
	public static final RejectionReason14Code InvalidAgent = new RejectionReason14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason14Code.mmObject();
			codeName = RejectionReasonCode.InvalidAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason14Code
	 * RejectionReason14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidMovementInformation"</li>
	 * </ul>
	 */
	public static final RejectionReason14Code InvalidMovementInformation = new RejectionReason14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidMovementInformation";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason14Code.mmObject();
			codeName = RejectionReasonCode.InvalidMovementInformation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason14Code
	 * RejectionReason14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SameIdentification"</li>
	 * </ul>
	 */
	public static final RejectionReason14Code SameIdentification = new RejectionReason14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SameIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason14Code.mmObject();
			codeName = RejectionReasonCode.SameIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason14Code
	 * RejectionReason14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidIdentification"</li>
	 * </ul>
	 */
	public static final RejectionReason14Code InvalidIdentification = new RejectionReason14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason14Code.mmObject();
			codeName = RejectionReasonCode.InvalidIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason14Code
	 * RejectionReason14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MovementAlreadySettled"</li>
	 * </ul>
	 */
	public static final RejectionReason14Code MovementAlreadySettled = new RejectionReason14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MovementAlreadySettled";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason14Code.mmObject();
			codeName = RejectionReasonCode.MovementAlreadySettled.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RejectionReason14Code> codesByName = new LinkedHashMap<>();

	protected RejectionReason14Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FAIL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectionReason14Code";
				definition = "Specifies the reason of a rejection of a movement cancellation request.";
				trace_lazy = () -> RejectionReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectionReason14Code.FailedValidation, com.tools20022.repository.codeset.RejectionReason14Code.Late,
						com.tools20022.repository.codeset.RejectionReason14Code.InvalidEventType, com.tools20022.repository.codeset.RejectionReason14Code.InvalidUnderlyingSecurity,
						com.tools20022.repository.codeset.RejectionReason14Code.InvalidEventProcessingType, com.tools20022.repository.codeset.RejectionReason14Code.InvalidMandatoryVoluntaryEventType,
						com.tools20022.repository.codeset.RejectionReason14Code.InvalidCorporateActionInformation, com.tools20022.repository.codeset.RejectionReason14Code.InvalidAgent,
						com.tools20022.repository.codeset.RejectionReason14Code.InvalidMovementInformation, com.tools20022.repository.codeset.RejectionReason14Code.SameIdentification,
						com.tools20022.repository.codeset.RejectionReason14Code.InvalidIdentification, com.tools20022.repository.codeset.RejectionReason14Code.MovementAlreadySettled);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(FailedValidation.getCodeName().get(), FailedValidation);
		codesByName.put(Late.getCodeName().get(), Late);
		codesByName.put(InvalidEventType.getCodeName().get(), InvalidEventType);
		codesByName.put(InvalidUnderlyingSecurity.getCodeName().get(), InvalidUnderlyingSecurity);
		codesByName.put(InvalidEventProcessingType.getCodeName().get(), InvalidEventProcessingType);
		codesByName.put(InvalidMandatoryVoluntaryEventType.getCodeName().get(), InvalidMandatoryVoluntaryEventType);
		codesByName.put(InvalidCorporateActionInformation.getCodeName().get(), InvalidCorporateActionInformation);
		codesByName.put(InvalidAgent.getCodeName().get(), InvalidAgent);
		codesByName.put(InvalidMovementInformation.getCodeName().get(), InvalidMovementInformation);
		codesByName.put(SameIdentification.getCodeName().get(), SameIdentification);
		codesByName.put(InvalidIdentification.getCodeName().get(), InvalidIdentification);
		codesByName.put(MovementAlreadySettled.getCodeName().get(), MovementAlreadySettled);
	}

	public static RejectionReason14Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RejectionReason14Code[] values() {
		RejectionReason14Code[] values = new RejectionReason14Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RejectionReason14Code> {
		@Override
		public RejectionReason14Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RejectionReason14Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}