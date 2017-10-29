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

package com.tools20022.repository.area.camt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.repository.area.CashManagementArchive;
import com.tools20022.repository.msg.CaseAssignment;
import com.tools20022.repository.msg.PaymentInstructionExtract;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Scope The Claim Non Receipt message is sent by a case creator/case assigner
 * to a case assignee. This message allows to initiate an investigation in case
 * the beneficiary of a payment has not received an expected payment. Usage Note
 * 1: Although there are cases where a creditor would contact the creditor's
 * bank when claiming non-receipt, the activity only retained the scenario where
 * the beneficiary claims non-receipt with its debtor, the debtor in its turn
 * contacting the first agent. Therefore the investigation follows the same
 * route as the original instruction. Note 2: This message is also used to
 * report a missing cover. The rationale behind this is that the beneficiary of
 * the cover (receiver of the payment instruction) missing the cover would be in
 * the very same position as a beneficiary expecting a credit to its account and
 * would therefore trigger the same processes. In case of a Missing cover, the
 * case will be assigned to the sender of the payment instruction, before
 * following the route of the payment instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementArchive
 * CashManagementArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlName
 * xmlName} = "camt.027.001.01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "camt.027.001.01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceipt#Assignment
 * ClaimNonReceipt.Assignment}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.ClaimNonReceipt#Case
 * ClaimNonReceipt.Case}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceipt#Underlying
 * ClaimNonReceipt.Underlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceipt#MissingCover
 * ClaimNonReceipt.MissingCover}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} =
 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceipt#identifier
 * ClaimNonReceipt.identifier}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ClaimNonReceipt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\nThe Claim Non Receipt message is sent by a case creator/case assigner to a case assignee.\nThis message allows to initiate an investigation in case the beneficiary of a payment has not received an expected payment.\nUsage\nNote 1: Although there are cases where a creditor would contact the creditor's bank when claiming non-receipt, the activity only retained the scenario where the beneficiary claims non-receipt with its debtor, the debtor in its turn contacting the first agent. Therefore the investigation follows the same route as the original instruction.\nNote 2: This message is also used to report a missing cover. The rationale behind this is that the beneficiary of the cover (receiver of the payment instruction) missing the cover would be in the very same position as a beneficiary expecting a credit to its account and would therefore trigger the same processes.\nIn case of a Missing cover, the case will be assigned to the sender of the payment instruction, before following the route of the payment instruction."
 * </li>
 * </ul>
 */
public class ClaimNonReceipt {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies an assignment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CaseAssignment
	 * CaseAssignment}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Assgnmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assignment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies an assignment."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock Assignment = new MMMessageBuildingBlock() {
		{
			xmlTag = "Assgnmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			definition = "Identifies an assignment.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> CaseAssignment.mmObject();
		}
	};
	/**
	 * Identifies a case.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Case Case}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Case"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Case"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies a case."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock Case = new MMMessageBuildingBlock() {
		{
			xmlTag = "Case";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Case";
			definition = "Identifies a case.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.Case.mmObject();
		}
	};
	/**
	 * Identifies the payment instruction for which the Creditor has not
	 * received the funds. Note: In case of a missing cover, it must be the
	 * Field 20 of the received MT103. In case of a claim non receipt initiated
	 * by the Debtor, it must be the identification of the instruction (Field 20
	 * of MT103, Instruction Identification of the Payment Initiation or the
	 * Bulk Credit Transfer).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract
	 * PaymentInstructionExtract}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Undrlyg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Underlying"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the payment instruction for which the Creditor has not received the funds.\nNote: \nIn case of a missing cover, it must be the Field 20 of the received MT103.\nIn case of a claim non receipt initiated by the Debtor, it must be the identification of the instruction (Field 20 of MT103, Instruction Identification of the Payment Initiation or the Bulk Credit Transfer)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock Underlying = new MMMessageBuildingBlock() {
		{
			xmlTag = "Undrlyg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Underlying";
			definition = "Identifies the payment instruction for which the Creditor has not received the funds.\nNote: \nIn case of a missing cover, it must be the Field 20 of the received MT103.\nIn case of a claim non receipt initiated by the Debtor, it must be the identification of the instruction (Field 20 of MT103, Instruction Identification of the Payment Initiation or the Bulk Credit Transfer).";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> PaymentInstructionExtract.mmObject();
		}
	};
	/**
	 * Indicates if the claim non receipt is a missing cover. The absence of the
	 * component means that the message is not for a missing cover.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.MissingCover
	 * MissingCover}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MssngCover"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingCover"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the claim non receipt is a missing cover. The absence of the component means that the message is not for a missing cover. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock MissingCover = new MMMessageBuildingBlock() {
		{
			xmlTag = "MssngCover";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingCover";
			definition = "Indicates if the claim non receipt is a missing cover. The absence of the component means that the message is not for a missing cover. ";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.MissingCover.mmObject();
		}
	};
	/**
	 * An instance of MessageDefinitionIdentifier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getVersion
	 * version} = "01"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getBusinessArea
	 * businessArea} = "camt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getMessageFunctionality
	 * messageFunctionality} = "027"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getFlavour
	 * flavour} = "001"</li>
	 * </ul>
	 */
	public static final MMMessageDefinitionIdentifier identifier = new MMMessageDefinitionIdentifier() {
		{
			businessArea = "camt";
			messageFunctionality = "027";
			version = "01";
			flavour = "001";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ClaimNonReceipt";
				definition = "Scope\nThe Claim Non Receipt message is sent by a case creator/case assigner to a case assignee.\nThis message allows to initiate an investigation in case the beneficiary of a payment has not received an expected payment.\nUsage\nNote 1: Although there are cases where a creditor would contact the creditor's bank when claiming non-receipt, the activity only retained the scenario where the beneficiary claims non-receipt with its debtor, the debtor in its turn contacting the first agent. Therefore the investigation follows the same route as the original instruction.\nNote 2: This message is also used to report a missing cover. The rationale behind this is that the beneficiary of the cover (receiver of the payment instruction) missing the cover would be in the very same position as a beneficiary expecting a credit to its account and would therefore trigger the same processes.\nIn case of a Missing cover, the case will be assigned to the sender of the payment instruction, before following the route of the payment instruction.";
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "camt.027.001.01";
				businessArea_lazy = () -> CashManagementArchive.mmObject();
				xmlName = "camt.027.001.01";
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.ClaimNonReceipt.Assignment, com.tools20022.repository.area.camt.ClaimNonReceipt.Case,
						com.tools20022.repository.area.camt.ClaimNonReceipt.Underlying, com.tools20022.repository.area.camt.ClaimNonReceipt.MissingCover);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.camt.ClaimNonReceipt.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}