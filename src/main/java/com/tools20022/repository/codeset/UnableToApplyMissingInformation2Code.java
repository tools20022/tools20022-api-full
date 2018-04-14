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
import com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason of an unable to apply due to missing information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code#MissingRemittanceInformation
 * UnableToApplyMissingInformation2Code.MissingRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code#MissingInstructionForNextAgent
 * UnableToApplyMissingInformation2Code.MissingInstructionForNextAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code#MissingDebtor
 * UnableToApplyMissingInformation2Code.MissingDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code#MissingDebtorAccount
 * UnableToApplyMissingInformation2Code.MissingDebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code#MissingDebtorAgent
 * UnableToApplyMissingInformation2Code.MissingDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code#MissingAmount
 * UnableToApplyMissingInformation2Code.MissingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code#MissingSettlementAccount
 * UnableToApplyMissingInformation2Code.MissingSettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code#MissingIntermediary
 * UnableToApplyMissingInformation2Code.MissingIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code#MissingInstructingReimbursementAgent
 * UnableToApplyMissingInformation2Code.MissingInstructingReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code#MissingInstructedReimbursementAgent
 * UnableToApplyMissingInformation2Code.MissingInstructedReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code#MissingThirdReimbursementAgent
 * UnableToApplyMissingInformation2Code.MissingThirdReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code#MissingCreditor
 * UnableToApplyMissingInformation2Code.MissingCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code#MissingCreditorAccount
 * UnableToApplyMissingInformation2Code.MissingCreditorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code#MissingInstruction
 * UnableToApplyMissingInformation2Code.MissingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code#MissingCreditorAgent
 * UnableToApplyMissingInformation2Code.MissingCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code#MissingInstructionForCreditorAgent
 * UnableToApplyMissingInformation2Code.MissingInstructionForCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code#MissingInstructionForDebtorAgent
 * UnableToApplyMissingInformation2Code.MissingInstructionForDebtorAgent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code
 * UnableToApplyMissingInformationV2Code}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnableToApplyMissingInformation2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason of an unable to apply due to missing information."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"MS01"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UnableToApplyMissingInformation2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code
	 * UnableToApplyMissingInformation2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingRemittanceInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformation2Code MissingRemittanceInformation = new UnableToApplyMissingInformation2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingRemittanceInformation";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code.mmObject();
			codeName = UnableToApplyMissingInformationV2Code.MissingRemittanceInformation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code
	 * UnableToApplyMissingInformation2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingInstructionForNextAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformation2Code MissingInstructionForNextAgent = new UnableToApplyMissingInformation2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingInstructionForNextAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code.mmObject();
			codeName = UnableToApplyMissingInformationV2Code.MissingInstructionForNextAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code
	 * UnableToApplyMissingInformation2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingDebtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformation2Code MissingDebtor = new UnableToApplyMissingInformation2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingDebtor";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code.mmObject();
			codeName = UnableToApplyMissingInformationV2Code.MissingDebtor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code
	 * UnableToApplyMissingInformation2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingDebtorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformation2Code MissingDebtorAccount = new UnableToApplyMissingInformation2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingDebtorAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code.mmObject();
			codeName = UnableToApplyMissingInformationV2Code.MissingDebtorAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code
	 * UnableToApplyMissingInformation2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingDebtorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformation2Code MissingDebtorAgent = new UnableToApplyMissingInformation2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingDebtorAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code.mmObject();
			codeName = UnableToApplyMissingInformationV2Code.MissingDebtorAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code
	 * UnableToApplyMissingInformation2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformation2Code MissingAmount = new UnableToApplyMissingInformation2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code.mmObject();
			codeName = UnableToApplyMissingInformationV2Code.MissingAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code
	 * UnableToApplyMissingInformation2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingSettlementAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformation2Code MissingSettlementAccount = new UnableToApplyMissingInformation2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingSettlementAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code.mmObject();
			codeName = UnableToApplyMissingInformationV2Code.MissingSettlementAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code
	 * UnableToApplyMissingInformation2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingIntermediary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformation2Code MissingIntermediary = new UnableToApplyMissingInformation2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingIntermediary";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code.mmObject();
			codeName = UnableToApplyMissingInformationV2Code.MissingIntermediary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code
	 * UnableToApplyMissingInformation2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingInstructingReimbursementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformation2Code MissingInstructingReimbursementAgent = new UnableToApplyMissingInformation2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingInstructingReimbursementAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code.mmObject();
			codeName = UnableToApplyMissingInformationV2Code.MissingInstructingReimbursementAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code
	 * UnableToApplyMissingInformation2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingInstructedReimbursementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformation2Code MissingInstructedReimbursementAgent = new UnableToApplyMissingInformation2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingInstructedReimbursementAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code.mmObject();
			codeName = UnableToApplyMissingInformationV2Code.MissingInstructedReimbursementAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code
	 * UnableToApplyMissingInformation2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingThirdReimbursementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformation2Code MissingThirdReimbursementAgent = new UnableToApplyMissingInformation2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingThirdReimbursementAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code.mmObject();
			codeName = UnableToApplyMissingInformationV2Code.MissingThirdReimbursementAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code
	 * UnableToApplyMissingInformation2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingCreditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformation2Code MissingCreditor = new UnableToApplyMissingInformation2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingCreditor";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code.mmObject();
			codeName = UnableToApplyMissingInformationV2Code.MissingCreditor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code
	 * UnableToApplyMissingInformation2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingCreditorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformation2Code MissingCreditorAccount = new UnableToApplyMissingInformation2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingCreditorAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code.mmObject();
			codeName = UnableToApplyMissingInformationV2Code.MissingCreditorAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code
	 * UnableToApplyMissingInformation2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformation2Code MissingInstruction = new UnableToApplyMissingInformation2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingInstruction";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code.mmObject();
			codeName = UnableToApplyMissingInformationV2Code.MissingInstruction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code
	 * UnableToApplyMissingInformation2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingCreditorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformation2Code MissingCreditorAgent = new UnableToApplyMissingInformation2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingCreditorAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code.mmObject();
			codeName = UnableToApplyMissingInformationV2Code.MissingCreditorAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code
	 * UnableToApplyMissingInformation2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingInstructionForCreditorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformation2Code MissingInstructionForCreditorAgent = new UnableToApplyMissingInformation2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingInstructionForCreditorAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code.mmObject();
			codeName = UnableToApplyMissingInformationV2Code.MissingInstructionForCreditorAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code
	 * UnableToApplyMissingInformation2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingInstructionForDebtorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UnableToApplyMissingInformation2Code MissingInstructionForDebtorAgent = new UnableToApplyMissingInformation2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingInstructionForDebtorAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code.mmObject();
			codeName = UnableToApplyMissingInformationV2Code.MissingInstructionForDebtorAgent.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, UnableToApplyMissingInformation2Code> codesByName = new LinkedHashMap<>();

	protected UnableToApplyMissingInformation2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MS01");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnableToApplyMissingInformation2Code";
				definition = "Specifies the reason of an unable to apply due to missing information.";
				trace_lazy = () -> UnableToApplyMissingInformationV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code.MissingRemittanceInformation,
						com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code.MissingInstructionForNextAgent, com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code.MissingDebtor,
						com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code.MissingDebtorAccount, com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code.MissingDebtorAgent,
						com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code.MissingAmount, com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code.MissingSettlementAccount,
						com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code.MissingIntermediary, com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code.MissingInstructingReimbursementAgent,
						com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code.MissingInstructedReimbursementAgent, com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code.MissingThirdReimbursementAgent,
						com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code.MissingCreditor, com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code.MissingCreditorAccount,
						com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code.MissingInstruction, com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code.MissingCreditorAgent,
						com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code.MissingInstructionForCreditorAgent, com.tools20022.repository.codeset.UnableToApplyMissingInformation2Code.MissingInstructionForDebtorAgent);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(MissingRemittanceInformation.getCodeName().get(), MissingRemittanceInformation);
		codesByName.put(MissingInstructionForNextAgent.getCodeName().get(), MissingInstructionForNextAgent);
		codesByName.put(MissingDebtor.getCodeName().get(), MissingDebtor);
		codesByName.put(MissingDebtorAccount.getCodeName().get(), MissingDebtorAccount);
		codesByName.put(MissingDebtorAgent.getCodeName().get(), MissingDebtorAgent);
		codesByName.put(MissingAmount.getCodeName().get(), MissingAmount);
		codesByName.put(MissingSettlementAccount.getCodeName().get(), MissingSettlementAccount);
		codesByName.put(MissingIntermediary.getCodeName().get(), MissingIntermediary);
		codesByName.put(MissingInstructingReimbursementAgent.getCodeName().get(), MissingInstructingReimbursementAgent);
		codesByName.put(MissingInstructedReimbursementAgent.getCodeName().get(), MissingInstructedReimbursementAgent);
		codesByName.put(MissingThirdReimbursementAgent.getCodeName().get(), MissingThirdReimbursementAgent);
		codesByName.put(MissingCreditor.getCodeName().get(), MissingCreditor);
		codesByName.put(MissingCreditorAccount.getCodeName().get(), MissingCreditorAccount);
		codesByName.put(MissingInstruction.getCodeName().get(), MissingInstruction);
		codesByName.put(MissingCreditorAgent.getCodeName().get(), MissingCreditorAgent);
		codesByName.put(MissingInstructionForCreditorAgent.getCodeName().get(), MissingInstructionForCreditorAgent);
		codesByName.put(MissingInstructionForDebtorAgent.getCodeName().get(), MissingInstructionForDebtorAgent);
	}

	public static UnableToApplyMissingInformation2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UnableToApplyMissingInformation2Code[] values() {
		UnableToApplyMissingInformation2Code[] values = new UnableToApplyMissingInformation2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UnableToApplyMissingInformation2Code> {
		@Override
		public UnableToApplyMissingInformation2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UnableToApplyMissingInformation2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}