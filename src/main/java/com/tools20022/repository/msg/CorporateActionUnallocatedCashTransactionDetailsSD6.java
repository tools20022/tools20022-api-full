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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.DateFormat48Choice;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.codeset.DTCAdjustmentPaymentType5Code;
import com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code;
import com.tools20022.repository.datatype.Max8Text;
import com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Breakdown of unallocated cash transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD6#mmCreditDebitIndicator
 * CorporateActionUnallocatedCashTransactionDetailsSD6.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD6#mmReasonCode
 * CorporateActionUnallocatedCashTransactionDetailsSD6.mmReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD6#mmTransactionAmount
 * CorporateActionUnallocatedCashTransactionDetailsSD6.mmTransactionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD6#mmUnallocatedReasonCode
 * CorporateActionUnallocatedCashTransactionDetailsSD6.mmUnallocatedReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD6#mmContraParticipantNumber
 * CorporateActionUnallocatedCashTransactionDetailsSD6.mmContraParticipantNumber
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD6#mmEarliestPaymentDate
 * CorporateActionUnallocatedCashTransactionDetailsSD6.mmEarliestPaymentDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionUnallocatedCashTransactionDetailsSD6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Breakdown of unallocated cash transactions."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD5
 * CorporateActionUnallocatedCashTransactionDetailsSD5}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionUnallocatedCashTransactionDetailsSD6", propOrder = {"creditDebitIndicator", "reasonCode", "transactionAmount", "unallocatedReasonCode", "contraParticipantNumber", "earliestPaymentDate"})
public class CorporateActionUnallocatedCashTransactionDetailsSD6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CdtDbtInd", required = true)
	protected CreditDebitCode creditDebitIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CreditDebitCode
	 * CreditDebitCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD6
	 * CorporateActionUnallocatedCashTransactionDetailsSD6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDbtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Credit / Debit Indicator</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the value is a debit or a credit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD5#mmCreditDebitIndicator
	 * CorporateActionUnallocatedCashTransactionDetailsSD5.
	 * mmCreditDebitIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionUnallocatedCashTransactionDetailsSD6, CreditDebitCode> mmCreditDebitIndicator = new MMMessageAttribute<CorporateActionUnallocatedCashTransactionDetailsSD6, CreditDebitCode>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD6.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Credit / Debit Indicator"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the value is a debit or a credit.";
			previousVersion_lazy = () -> CorporateActionUnallocatedCashTransactionDetailsSD5.mmCreditDebitIndicator;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}

		@Override
		public CreditDebitCode getValue(CorporateActionUnallocatedCashTransactionDetailsSD6 obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(CorporateActionUnallocatedCashTransactionDetailsSD6 obj, CreditDebitCode value) {
			obj.setCreditDebitIndicator(value);
		}
	};
	@XmlElement(name = "RsnCd")
	protected DTCAdjustmentPaymentType5Code reasonCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType5Code
	 * DTCAdjustmentPaymentType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD6
	 * CorporateActionUnallocatedCashTransactionDetailsSD6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsnCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Transaction Reason Code</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReasonCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction reason."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD5#mmReasonCode
	 * CorporateActionUnallocatedCashTransactionDetailsSD5.mmReasonCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionUnallocatedCashTransactionDetailsSD6, Optional<DTCAdjustmentPaymentType5Code>> mmReasonCode = new MMMessageAttribute<CorporateActionUnallocatedCashTransactionDetailsSD6, Optional<DTCAdjustmentPaymentType5Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD6.mmObject();
			isDerived = false;
			xmlTag = "RsnCd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Transaction Reason Code"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReasonCode";
			definition = "Transaction reason.";
			previousVersion_lazy = () -> CorporateActionUnallocatedCashTransactionDetailsSD5.mmReasonCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCAdjustmentPaymentType5Code.mmObject();
		}

		@Override
		public Optional<DTCAdjustmentPaymentType5Code> getValue(CorporateActionUnallocatedCashTransactionDetailsSD6 obj) {
			return obj.getReasonCode();
		}

		@Override
		public void setValue(CorporateActionUnallocatedCashTransactionDetailsSD6 obj, Optional<DTCAdjustmentPaymentType5Code> value) {
			obj.setReasonCode(value.orElse(null));
		}
	};
	@XmlElement(name = "TxAmt")
	protected RestrictedFINActiveCurrencyAndAmount transactionAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD6
	 * CorporateActionUnallocatedCashTransactionDetailsSD6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Transaction Cash Amount</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Resulting cash amount concerned in this transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD5#mmTransactionAmount
	 * CorporateActionUnallocatedCashTransactionDetailsSD5.mmTransactionAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionUnallocatedCashTransactionDetailsSD6, Optional<RestrictedFINActiveCurrencyAndAmount>> mmTransactionAmount = new MMMessageAttribute<CorporateActionUnallocatedCashTransactionDetailsSD6, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD6.mmObject();
			isDerived = false;
			xmlTag = "TxAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Transaction Cash Amount"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionAmount";
			definition = "Resulting cash amount concerned in this transaction.";
			previousVersion_lazy = () -> CorporateActionUnallocatedCashTransactionDetailsSD5.mmTransactionAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionUnallocatedCashTransactionDetailsSD6 obj) {
			return obj.getTransactionAmount();
		}

		@Override
		public void setValue(CorporateActionUnallocatedCashTransactionDetailsSD6 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setTransactionAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "UallctdRsnCd")
	protected DTCUnallocatedAdjustmentReason4Code unallocatedReasonCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCUnallocatedAdjustmentReason4Code
	 * DTCUnallocatedAdjustmentReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD6
	 * CorporateActionUnallocatedCashTransactionDetailsSD6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UallctdRsnCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Unallocated Reason Code</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnallocatedReasonCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the unallocation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD5#mmUnallocatedReasonCode
	 * CorporateActionUnallocatedCashTransactionDetailsSD5.
	 * mmUnallocatedReasonCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionUnallocatedCashTransactionDetailsSD6, Optional<DTCUnallocatedAdjustmentReason4Code>> mmUnallocatedReasonCode = new MMMessageAttribute<CorporateActionUnallocatedCashTransactionDetailsSD6, Optional<DTCUnallocatedAdjustmentReason4Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD6.mmObject();
			isDerived = false;
			xmlTag = "UallctdRsnCd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Unallocated Reason Code"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnallocatedReasonCode";
			definition = "Reason for the unallocation.";
			previousVersion_lazy = () -> CorporateActionUnallocatedCashTransactionDetailsSD5.mmUnallocatedReasonCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCUnallocatedAdjustmentReason4Code.mmObject();
		}

		@Override
		public Optional<DTCUnallocatedAdjustmentReason4Code> getValue(CorporateActionUnallocatedCashTransactionDetailsSD6 obj) {
			return obj.getUnallocatedReasonCode();
		}

		@Override
		public void setValue(CorporateActionUnallocatedCashTransactionDetailsSD6 obj, Optional<DTCUnallocatedAdjustmentReason4Code> value) {
			obj.setUnallocatedReasonCode(value.orElse(null));
		}
	};
	@XmlElement(name = "ContraPtcptNb")
	protected Max8Text contraParticipantNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max8Text
	 * Max8Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD6
	 * CorporateActionUnallocatedCashTransactionDetailsSD6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ContraPtcptNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Contra Participant Number</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContraParticipantNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction contra participant identification when shares are distributed / delivered to / from another participant."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD5#mmContraParticipantNumber
	 * CorporateActionUnallocatedCashTransactionDetailsSD5.
	 * mmContraParticipantNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionUnallocatedCashTransactionDetailsSD6, Optional<Max8Text>> mmContraParticipantNumber = new MMMessageAttribute<CorporateActionUnallocatedCashTransactionDetailsSD6, Optional<Max8Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD6.mmObject();
			isDerived = false;
			xmlTag = "ContraPtcptNb";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Contra Participant Number"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContraParticipantNumber";
			definition = "Transaction contra participant identification when shares are distributed / delivered to / from another participant.";
			previousVersion_lazy = () -> CorporateActionUnallocatedCashTransactionDetailsSD5.mmContraParticipantNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max8Text.mmObject();
		}

		@Override
		public Optional<Max8Text> getValue(CorporateActionUnallocatedCashTransactionDetailsSD6 obj) {
			return obj.getContraParticipantNumber();
		}

		@Override
		public void setValue(CorporateActionUnallocatedCashTransactionDetailsSD6 obj, Optional<Max8Text> value) {
			obj.setContraParticipantNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "EarlstPmtDt")
	protected DateFormat48Choice earliestPaymentDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat48Choice
	 * DateFormat48Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD6
	 * CorporateActionUnallocatedCashTransactionDetailsSD6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlstPmtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Payable Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarliestPaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the movement was due to take place (cash and/or securities)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD5#mmEarliestPaymentDate
	 * CorporateActionUnallocatedCashTransactionDetailsSD5.mmEarliestPaymentDate
	 * }</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionUnallocatedCashTransactionDetailsSD6, Optional<DateFormat48Choice>> mmEarliestPaymentDate = new MMMessageAttribute<CorporateActionUnallocatedCashTransactionDetailsSD6, Optional<DateFormat48Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD6.mmObject();
			isDerived = false;
			xmlTag = "EarlstPmtDt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Payable Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarliestPaymentDate";
			definition = "Date/time at which the movement was due to take place (cash and/or securities).";
			previousVersion_lazy = () -> CorporateActionUnallocatedCashTransactionDetailsSD5.mmEarliestPaymentDate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat48Choice.mmObject();
		}

		@Override
		public Optional<DateFormat48Choice> getValue(CorporateActionUnallocatedCashTransactionDetailsSD6 obj) {
			return obj.getEarliestPaymentDate();
		}

		@Override
		public void setValue(CorporateActionUnallocatedCashTransactionDetailsSD6 obj, Optional<DateFormat48Choice> value) {
			obj.setEarliestPaymentDate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD6.mmCreditDebitIndicator,
						com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD6.mmReasonCode, com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD6.mmTransactionAmount,
						com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD6.mmUnallocatedReasonCode, com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD6.mmContraParticipantNumber,
						com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD6.mmEarliestPaymentDate);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionUnallocatedCashTransactionDetailsSD6";
				definition = "Breakdown of unallocated cash transactions.";
				previousVersion_lazy = () -> CorporateActionUnallocatedCashTransactionDetailsSD5.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CreditDebitCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public CorporateActionUnallocatedCashTransactionDetailsSD6 setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = Objects.requireNonNull(creditDebitIndicator);
		return this;
	}

	public Optional<DTCAdjustmentPaymentType5Code> getReasonCode() {
		return reasonCode == null ? Optional.empty() : Optional.of(reasonCode);
	}

	public CorporateActionUnallocatedCashTransactionDetailsSD6 setReasonCode(DTCAdjustmentPaymentType5Code reasonCode) {
		this.reasonCode = reasonCode;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getTransactionAmount() {
		return transactionAmount == null ? Optional.empty() : Optional.of(transactionAmount);
	}

	public CorporateActionUnallocatedCashTransactionDetailsSD6 setTransactionAmount(RestrictedFINActiveCurrencyAndAmount transactionAmount) {
		this.transactionAmount = transactionAmount;
		return this;
	}

	public Optional<DTCUnallocatedAdjustmentReason4Code> getUnallocatedReasonCode() {
		return unallocatedReasonCode == null ? Optional.empty() : Optional.of(unallocatedReasonCode);
	}

	public CorporateActionUnallocatedCashTransactionDetailsSD6 setUnallocatedReasonCode(DTCUnallocatedAdjustmentReason4Code unallocatedReasonCode) {
		this.unallocatedReasonCode = unallocatedReasonCode;
		return this;
	}

	public Optional<Max8Text> getContraParticipantNumber() {
		return contraParticipantNumber == null ? Optional.empty() : Optional.of(contraParticipantNumber);
	}

	public CorporateActionUnallocatedCashTransactionDetailsSD6 setContraParticipantNumber(Max8Text contraParticipantNumber) {
		this.contraParticipantNumber = contraParticipantNumber;
		return this;
	}

	public Optional<DateFormat48Choice> getEarliestPaymentDate() {
		return earliestPaymentDate == null ? Optional.empty() : Optional.of(earliestPaymentDate);
	}

	public CorporateActionUnallocatedCashTransactionDetailsSD6 setEarliestPaymentDate(DateFormat48Choice earliestPaymentDate) {
		this.earliestPaymentDate = earliestPaymentDate;
		return this;
	}
}