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
import com.tools20022.repository.choice.UnderlyingTransaction1Choice;
import com.tools20022.repository.msg.Case2;
import com.tools20022.repository.msg.CaseAssignment2;
import com.tools20022.repository.msg.PaymentComplementaryInformation2;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
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
 * usually not reported in a statement or advice (for example full remittance
 * information or identification of parties other than the account servicing
 * institution and the account owner). It complements information about a
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
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV03#mmAssignment
 * AdditionalPaymentInformationV03.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV03#mmCase
 * AdditionalPaymentInformationV03.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV03#mmUnderlying
 * AdditionalPaymentInformationV03.mmUnderlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV03#mmInformation
 * AdditionalPaymentInformationV03.mmInformation}</li>
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
 * xmlTag} = "AddtlPmtInf"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementArchive
 * CashManagementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.028.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AdditionalPaymentInformationV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe Additional Payment Information message is sent by an account servicing institution to an account owner.\r\nThis message is used to provide additional or corrected information on a payment instruction or statement entry, in order to allow reconciliation.\r\nUsage\r\nThe Additional Payment Information message provides elements which are usually not reported in a statement or advice (for example full remittance information or identification of parties other than the account servicing institution and the account owner). It complements information about a payment instruction that has already been received, in the form of one or several entries of the original payment instruction.\r\nThe Additional Payment Information message covers one and only one original payment instruction. If several payment instructions need further details, multiple Additional Payment Information messages must be used, one for each of the payment instructions.\r\nThe AdditionalPaymentInformation message may be used as a result of two investigation processes and in a way outlined below.\r\n- A Claim Non Receipt workflow raised by the creditor or recipient of the payment: This means that the payment instruction has reached the creditor or beneficiary. The account owner needs further details or correct information for its reconciliation processes. The Additional Payment Information can be used to provide the missing information.\r\n- A Request To Modify Payment workflow raised by the debtor or one of the intermediate agents upstream: When the payment instruction has reached its intended recipient and the modification does not affect the accounting at the account servicing institution, this Additional Payment Information message allows the account owner to receive further particulars or correct information about a payment instruction or an entry passed to its account.\r\nThe Additional Payment Information message cannot be used to trigger a request for modification of a payment instruction activity. A Request To Modify Payment message must be used. In other words, if a debtor or one of intermediate agent (excluding the account servicing institution of the creditor) realises the some information was missing in the original payment instruction, he should not use an Additional Payment Information but instead a Request To Modify Payment message.\r\nIt is assumed that when an account servicing institution sends out an Additional Payment Information message, the institution is fairly confident that this will resolve the case. Therefore it does not need to wait for a Resolution Of Investigation message. Neither does the account owner, or whoever receives the additional information, need to send back a Resolution Of Investigation message. Positive resolution in this case is implicit. Both parties are expected to close the case. In the event that the problem does not go away, a party can re-open the case."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV04
 * AdditionalPaymentInformationV04}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AdditionalPaymentInformationV03", propOrder = {"assignment", "case_", "underlying", "information"})
public class AdditionalPaymentInformationV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Assgnmt", required = true)
	protected CaseAssignment2 assignment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CaseAssignment2
	 * CaseAssignment2}</li>
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
	 * definition} =
	 * "Identifies the assignment of an investigation case from an assigner to an assignee.\nUsage: The Assigner must be the sender of this confirmation and the Assignee must be the receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAssignment = new MMMessageBuildingBlock() {
		{
			xmlTag = "Assgnmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			definition = "Identifies the assignment of an investigation case from an assigner to an assignee.\nUsage: The Assigner must be the sender of this confirmation and the Assignee must be the receiver.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CaseAssignment2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AdditionalPaymentInformationV03.class.getMethod("getAssignment", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Case", required = true)
	protected Case2 case_;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Case2 Case2}</li>
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
	 * definition} = "Identifies the investigation case."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCase = new MMMessageBuildingBlock() {
		{
			xmlTag = "Case";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Case";
			definition = "Identifies the investigation case.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Case2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AdditionalPaymentInformationV03.class.getMethod("getCase", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Undrlyg", required = true)
	protected UnderlyingTransaction1Choice underlying;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction1Choice
	 * UnderlyingTransaction1Choice}</li>
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
	public static final MMMessageBuildingBlock mmUnderlying = new MMMessageBuildingBlock() {
		{
			xmlTag = "Undrlyg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Underlying";
			definition = "Identifies the underlying payment instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UnderlyingTransaction1Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AdditionalPaymentInformationV03.class.getMethod("getUnderlying", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Inf", required = true)
	protected PaymentComplementaryInformation2 information;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2
	 * PaymentComplementaryInformation2}</li>
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
	public static final MMMessageBuildingBlock mmInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "Inf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Information";
			definition = "Additional information to the underlying payment instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PaymentComplementaryInformation2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AdditionalPaymentInformationV03.class.getMethod("getInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AdditionalPaymentInformationV03";
				definition = "Scope\r\nThe Additional Payment Information message is sent by an account servicing institution to an account owner.\r\nThis message is used to provide additional or corrected information on a payment instruction or statement entry, in order to allow reconciliation.\r\nUsage\r\nThe Additional Payment Information message provides elements which are usually not reported in a statement or advice (for example full remittance information or identification of parties other than the account servicing institution and the account owner). It complements information about a payment instruction that has already been received, in the form of one or several entries of the original payment instruction.\r\nThe Additional Payment Information message covers one and only one original payment instruction. If several payment instructions need further details, multiple Additional Payment Information messages must be used, one for each of the payment instructions.\r\nThe AdditionalPaymentInformation message may be used as a result of two investigation processes and in a way outlined below.\r\n- A Claim Non Receipt workflow raised by the creditor or recipient of the payment: This means that the payment instruction has reached the creditor or beneficiary. The account owner needs further details or correct information for its reconciliation processes. The Additional Payment Information can be used to provide the missing information.\r\n- A Request To Modify Payment workflow raised by the debtor or one of the intermediate agents upstream: When the payment instruction has reached its intended recipient and the modification does not affect the accounting at the account servicing institution, this Additional Payment Information message allows the account owner to receive further particulars or correct information about a payment instruction or an entry passed to its account.\r\nThe Additional Payment Information message cannot be used to trigger a request for modification of a payment instruction activity. A Request To Modify Payment message must be used. In other words, if a debtor or one of intermediate agent (excluding the account servicing institution of the creditor) realises the some information was missing in the original payment instruction, he should not use an Additional Payment Information but instead a Request To Modify Payment message.\r\nIt is assumed that when an account servicing institution sends out an Additional Payment Information message, the institution is fairly confident that this will resolve the case. Therefore it does not need to wait for a Resolution Of Investigation message. Neither does the account owner, or whoever receives the additional information, need to send back a Resolution Of Investigation message. Positive resolution in this case is implicit. Both parties are expected to close the case. In the event that the problem does not go away, a party can re-open the case.";
				nextVersions_lazy = () -> Arrays.asList(AdditionalPaymentInformationV04.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "AddtlPmtInf";
				businessArea_lazy = () -> CashManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.AdditionalPaymentInformationV03.mmAssignment, com.tools20022.repository.area.camt.AdditionalPaymentInformationV03.mmCase,
						com.tools20022.repository.area.camt.AdditionalPaymentInformationV03.mmUnderlying, com.tools20022.repository.area.camt.AdditionalPaymentInformationV03.mmInformation);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "028";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AdditionalPaymentInformationV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CaseAssignment2 getAssignment() {
		return assignment;
	}

	public AdditionalPaymentInformationV03 setAssignment(CaseAssignment2 assignment) {
		this.assignment = Objects.requireNonNull(assignment);
		return this;
	}

	public Case2 getCase() {
		return case_;
	}

	public AdditionalPaymentInformationV03 setCase(Case2 case_) {
		this.case_ = Objects.requireNonNull(case_);
		return this;
	}

	public UnderlyingTransaction1Choice getUnderlying() {
		return underlying;
	}

	public AdditionalPaymentInformationV03 setUnderlying(UnderlyingTransaction1Choice underlying) {
		this.underlying = Objects.requireNonNull(underlying);
		return this;
	}

	public PaymentComplementaryInformation2 getInformation() {
		return information;
	}

	public AdditionalPaymentInformationV03 setInformation(PaymentComplementaryInformation2 information) {
		this.information = Objects.requireNonNull(information);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.028.001.03")
	static public class Document {
		@XmlElement(name = "AddtlPmtInf", required = true)
		public AdditionalPaymentInformationV03 messageBody;
	}
}