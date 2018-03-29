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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.CashManagementArchive;
import com.tools20022.repository.msg.Case;
import com.tools20022.repository.msg.CaseAssignment;
import com.tools20022.repository.msg.PaymentComplementaryInformation;
import com.tools20022.repository.msg.PaymentInstructionExtract;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The Additional Payment Information message is sent by an account servicing
 * institution to an account owner.<br>
 * This message is used to provide additional or corrected information on a
 * payment instruction or statement entry, in order to allow reconciliation.<br>
 * <b>Usage</b><br>
 * The Additional Payment Information message provides elements which are
 * usually not reported in a statement or advice (such as full remittance
 * information or identification of parties other than the account servicing
 * institution and the account owner.) It complements information about a
 * payment instruction that has already been received, in the form of one or
 * several entries of the original payment instruction.<br>
 * The Additional Payment Information message covers one and only one original
 * payment instruction. If several payment instructions need further details,
 * multiple Additional Payment Information messages must be used, one for each
 * of the payment instructions.<br>
 * The AdditionalPaymentInformation message may be used as a result of two
 * investigation processes and in a way outlined below.<br>
 * - A Claim Non Receipt workflow raised by the creditor or recipient of the
 * payment: This means that the payment instruction has reached the creditor or
 * beneficiary. The account owner needs further details or correct information
 * for its reconciliation processes. The Additional Payment Information can be
 * used to provide the missing information.<br>
 * - A Request To Modify Payment workflow raised by the debtor or one of the
 * intermediate agents upstream: When the payment instruction has reached its
 * intended recipient and the modification does not affect the accounting at the
 * account servicing institution, this Additional Payment Information message
 * allows the account owner to receive further particulars or correct
 * information about a payment instruction or an entry passed to its account.<br>
 * The Additional Payment Information message cannot be used to trigger a
 * request for modification of a payment instruction activity. A Request To
 * Modify Payment message must be used. In other words, if a debtor or one of
 * intermediate agent (excluding the account servicing institution of the
 * creditor) realises the some information was missing in the original payment
 * instruction, he should not use an Additional Payment Information but instead
 * a Request To Modify Payment message.<br>
 * It is assumed that when an account servicing institution sends out an
 * Additional Payment Information message, the institution is fairly confident
 * that this will resolve the case. Therefore it does not need to wait for a
 * Resolution Of Investigation message. Neither does the account owner, or
 * whoever receives the additional information, need to send back a Resolution
 * Of Investigation message. Positive resolution in this case is implicit. Both
 * parties are expected to close the case. In the event that the problem does
 * not go away, a party can re-open the case.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformation#mmAssignment
 * AdditionalPaymentInformation.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformation#mmCase
 * AdditionalPaymentInformation.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformation#mmUnderlying
 * AdditionalPaymentInformation.mmUnderlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformation#mmInformation
 * AdditionalPaymentInformation.mmInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "camt.028.001.01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementArchive
 * CashManagementArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlName
 * xmlName} = "camt.028.001.01"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.028.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AdditionalPaymentInformation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe Additional Payment Information message is sent by an account servicing institution to an account owner.\r\nThis message is used to provide additional or corrected information on a payment instruction or statement entry, in order to allow reconciliation.\r\nUsage\r\nThe Additional Payment Information message provides elements which are usually not reported in a statement or advice (such as full remittance information or identification of parties other than the account servicing institution and the account owner.) It complements information about a payment instruction that has already been received, in the form of one or several entries of the original payment instruction.\r\nThe Additional Payment Information message covers one and only one original payment instruction. If several payment instructions need further details, multiple Additional Payment Information messages must be used, one for each of the payment instructions.\r\nThe AdditionalPaymentInformation message may be used as a result of two investigation processes and in a way outlined below.\r\n- A Claim Non Receipt workflow raised by the creditor or recipient of the payment: This means that the payment instruction has reached the creditor or beneficiary. The account owner needs further details or correct information for its reconciliation processes. The Additional Payment Information can be used to provide the missing information.\r\n- A Request To Modify Payment workflow raised by the debtor or one of the intermediate agents upstream: When the payment instruction has reached its intended recipient and the modification does not affect the accounting at the account servicing institution, this Additional Payment Information message allows the account owner to receive further particulars or correct information about a payment instruction or an entry passed to its account.\r\nThe Additional Payment Information message cannot be used to trigger a request for modification of a payment instruction activity. A Request To Modify Payment message must be used. In other words, if a debtor or one of intermediate agent (excluding the account servicing institution of the creditor) realises the some information was missing in the original payment instruction, he should not use an Additional Payment Information but instead a Request To Modify Payment message.\r\nIt is assumed that when an account servicing institution sends out an Additional Payment Information message, the institution is fairly confident that this will resolve the case. Therefore it does not need to wait for a Resolution Of Investigation message. Neither does the account owner, or whoever receives the additional information, need to send back a Resolution Of Investigation message. Positive resolution in this case is implicit. Both parties are expected to close the case. In the event that the problem does not go away, a party can re-open the case."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "camt.028.001.01", propOrder = {"assignment", "case_", "underlying", "information"})
public class AdditionalPaymentInformation {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Assgnmt", required = true)
	protected CaseAssignment assignment;
	/**
	 * 
	 <p>
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
	 * definition} = "Identifies the assignment."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AdditionalPaymentInformation, CaseAssignment> mmAssignment = new MMMessageBuildingBlock<AdditionalPaymentInformation, CaseAssignment>() {
		{
			xmlTag = "Assgnmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			definition = "Identifies the assignment.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CaseAssignment.mmObject();
		}

		@Override
		public CaseAssignment getValue(AdditionalPaymentInformation obj) {
			return obj.getAssignment();
		}

		@Override
		public void setValue(AdditionalPaymentInformation obj, CaseAssignment value) {
			obj.setAssignment(value);
		}
	};
	@XmlElement(name = "Case", required = true)
	protected Case case_;
	/**
	 * 
	 <p>
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
	 * definition} = "Identifies the case."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AdditionalPaymentInformation, Case> mmCase = new MMMessageBuildingBlock<AdditionalPaymentInformation, Case>() {
		{
			xmlTag = "Case";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Case";
			definition = "Identifies the case.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Case.mmObject();
		}

		@Override
		public Case getValue(AdditionalPaymentInformation obj) {
			return obj.getCase();
		}

		@Override
		public void setValue(AdditionalPaymentInformation obj, Case value) {
			obj.setCase(value);
		}
	};
	@XmlElement(name = "Undrlyg", required = true)
	protected PaymentInstructionExtract underlying;
	/**
	 * 
	 <p>
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
	 * definition} = "Identifies the underlying payment instruction."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AdditionalPaymentInformation, PaymentInstructionExtract> mmUnderlying = new MMMessageBuildingBlock<AdditionalPaymentInformation, PaymentInstructionExtract>() {
		{
			xmlTag = "Undrlyg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Underlying";
			definition = "Identifies the underlying payment instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PaymentInstructionExtract.mmObject();
		}

		@Override
		public PaymentInstructionExtract getValue(AdditionalPaymentInformation obj) {
			return obj.getUnderlying();
		}

		@Override
		public void setValue(AdditionalPaymentInformation obj, PaymentInstructionExtract value) {
			obj.setUnderlying(value);
		}
	};
	@XmlElement(name = "Inf", required = true)
	protected PaymentComplementaryInformation information;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation
	 * PaymentComplementaryInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Inf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Information"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information to the underlying payment instruction."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AdditionalPaymentInformation, PaymentComplementaryInformation> mmInformation = new MMMessageBuildingBlock<AdditionalPaymentInformation, PaymentComplementaryInformation>() {
		{
			xmlTag = "Inf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Information";
			definition = "Additional information to the underlying payment instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PaymentComplementaryInformation.mmObject();
		}

		@Override
		public PaymentComplementaryInformation getValue(AdditionalPaymentInformation obj) {
			return obj.getInformation();
		}

		@Override
		public void setValue(AdditionalPaymentInformation obj, PaymentComplementaryInformation value) {
			obj.setInformation(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AdditionalPaymentInformation";
				definition = "Scope\r\nThe Additional Payment Information message is sent by an account servicing institution to an account owner.\r\nThis message is used to provide additional or corrected information on a payment instruction or statement entry, in order to allow reconciliation.\r\nUsage\r\nThe Additional Payment Information message provides elements which are usually not reported in a statement or advice (such as full remittance information or identification of parties other than the account servicing institution and the account owner.) It complements information about a payment instruction that has already been received, in the form of one or several entries of the original payment instruction.\r\nThe Additional Payment Information message covers one and only one original payment instruction. If several payment instructions need further details, multiple Additional Payment Information messages must be used, one for each of the payment instructions.\r\nThe AdditionalPaymentInformation message may be used as a result of two investigation processes and in a way outlined below.\r\n- A Claim Non Receipt workflow raised by the creditor or recipient of the payment: This means that the payment instruction has reached the creditor or beneficiary. The account owner needs further details or correct information for its reconciliation processes. The Additional Payment Information can be used to provide the missing information.\r\n- A Request To Modify Payment workflow raised by the debtor or one of the intermediate agents upstream: When the payment instruction has reached its intended recipient and the modification does not affect the accounting at the account servicing institution, this Additional Payment Information message allows the account owner to receive further particulars or correct information about a payment instruction or an entry passed to its account.\r\nThe Additional Payment Information message cannot be used to trigger a request for modification of a payment instruction activity. A Request To Modify Payment message must be used. In other words, if a debtor or one of intermediate agent (excluding the account servicing institution of the creditor) realises the some information was missing in the original payment instruction, he should not use an Additional Payment Information but instead a Request To Modify Payment message.\r\nIt is assumed that when an account servicing institution sends out an Additional Payment Information message, the institution is fairly confident that this will resolve the case. Therefore it does not need to wait for a Resolution Of Investigation message. Neither does the account owner, or whoever receives the additional information, need to send back a Resolution Of Investigation message. Positive resolution in this case is implicit. Both parties are expected to close the case. In the event that the problem does not go away, a party can re-open the case.";
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "camt.028.001.01";
				businessArea_lazy = () -> CashManagementArchive.mmObject();
				xmlName = "camt.028.001.01";
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.AdditionalPaymentInformation.mmAssignment, com.tools20022.repository.area.camt.AdditionalPaymentInformation.mmCase,
						com.tools20022.repository.area.camt.AdditionalPaymentInformation.mmUnderlying, com.tools20022.repository.area.camt.AdditionalPaymentInformation.mmInformation);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "028";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AdditionalPaymentInformation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CaseAssignment getAssignment() {
		return assignment;
	}

	public AdditionalPaymentInformation setAssignment(CaseAssignment assignment) {
		this.assignment = Objects.requireNonNull(assignment);
		return this;
	}

	public Case getCase() {
		return case_;
	}

	public AdditionalPaymentInformation setCase(Case case_) {
		this.case_ = Objects.requireNonNull(case_);
		return this;
	}

	public PaymentInstructionExtract getUnderlying() {
		return underlying;
	}

	public AdditionalPaymentInformation setUnderlying(PaymentInstructionExtract underlying) {
		this.underlying = Objects.requireNonNull(underlying);
		return this;
	}

	public PaymentComplementaryInformation getInformation() {
		return information;
	}

	public AdditionalPaymentInformation setInformation(PaymentComplementaryInformation information) {
		this.information = Objects.requireNonNull(information);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.028.001.01")
	static public class Document {
		@XmlElement(name = "camt.028.001.01", required = true)
		public AdditionalPaymentInformation messageBody;
	}
}