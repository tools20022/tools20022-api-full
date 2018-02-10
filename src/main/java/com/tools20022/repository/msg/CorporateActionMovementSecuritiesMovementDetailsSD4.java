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
import com.tools20022.repository.choice.DateFormat28Choice;
import com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code;
import com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code;
import com.tools20022.repository.codeset.DTCCPayoutType4Code;
import com.tools20022.repository.datatype.Exact32AlphaNumericText;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max8Text;
import com.tools20022.repository.datatype.PercentageRate;
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
 * Provides additional information regarding corporate action movement
 * securities movement rate details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4#mmPlaceAndName
 * CorporateActionMovementSecuritiesMovementDetailsSD4.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4#mmCreditDebitIndicator
 * CorporateActionMovementSecuritiesMovementDetailsSD4.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4#mmPayoutType
 * CorporateActionMovementSecuritiesMovementDetailsSD4.mmPayoutType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4#mmTransactionQuantity
 * CorporateActionMovementSecuritiesMovementDetailsSD4.mmTransactionQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4#mmReasonCode
 * CorporateActionMovementSecuritiesMovementDetailsSD4.mmReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4#mmSubReasonCode
 * CorporateActionMovementSecuritiesMovementDetailsSD4.mmSubReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4#mmContraParticipantNumber
 * CorporateActionMovementSecuritiesMovementDetailsSD4.mmContraParticipantNumber
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4#mmEarliestPaymentDate
 * CorporateActionMovementSecuritiesMovementDetailsSD4.mmEarliestPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4#mmTaxAdjustmentRate
 * CorporateActionMovementSecuritiesMovementDetailsSD4.mmTaxAdjustmentRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4#mmRDPReferenceNumber
 * CorporateActionMovementSecuritiesMovementDetailsSD4.mmRDPReferenceNumber}</li>
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
 * "CorporateActionMovementSecuritiesMovementDetailsSD4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action movement securities movement rate details."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3
 * CorporateActionMovementSecuritiesMovementDetailsSD3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionMovementSecuritiesMovementDetailsSD4", propOrder = {"placeAndName", "creditDebitIndicator", "payoutType", "transactionQuantity", "reasonCode", "subReasonCode", "contraParticipantNumber",
		"earliestPaymentDate", "taxAdjustmentRate", "rDPReferenceNumber"})
public class CorporateActionMovementSecuritiesMovementDetailsSD4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm", required = true)
	protected Max350Text placeAndName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4
	 * CorporateActionMovementSecuritiesMovementDetailsSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3#mmPlaceAndName
	 * CorporateActionMovementSecuritiesMovementDetailsSD3.mmPlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			previousVersion_lazy = () -> CorporateActionMovementSecuritiesMovementDetailsSD3.mmPlaceAndName;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4
	 * CorporateActionMovementSecuritiesMovementDetailsSD4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3#mmCreditDebitIndicator
	 * CorporateActionMovementSecuritiesMovementDetailsSD3.
	 * mmCreditDebitIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreditDebitIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Credit / Debit Indicator"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the value is a debit or a credit.";
			previousVersion_lazy = () -> CorporateActionMovementSecuritiesMovementDetailsSD3.mmCreditDebitIndicator;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}
	};
	@XmlElement(name = "PyoutTp", required = true)
	protected DTCCPayoutType4Code payoutType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType4Code
	 * DTCCPayoutType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4
	 * CorporateActionMovementSecuritiesMovementDetailsSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PyoutTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayoutType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of payout associated with the event (for example:  principal, long term capital gain)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3#mmPayoutType
	 * CorporateActionMovementSecuritiesMovementDetailsSD3.mmPayoutType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPayoutType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "PyoutTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayoutType";
			definition = "Specifies the type of payout associated with the event (for example:  principal, long term capital gain).";
			previousVersion_lazy = () -> CorporateActionMovementSecuritiesMovementDetailsSD3.mmPayoutType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DTCCPayoutType4Code.mmObject();
		}
	};
	@XmlElement(name = "TxQty")
	protected FinancialInstrumentQuantity15Choice transactionQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice
	 * FinancialInstrumentQuantity15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4
	 * CorporateActionMovementSecuritiesMovementDetailsSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Transaction Securities Quantity</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Resulting quantity of securities concerned in this transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3#mmTransactionQuantity
	 * CorporateActionMovementSecuritiesMovementDetailsSD3.mmTransactionQuantity
	 * }</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionQuantity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "TxQty";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Transaction Securities Quantity"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionQuantity";
			definition = "Resulting quantity of securities concerned in this transaction.";
			previousVersion_lazy = () -> CorporateActionMovementSecuritiesMovementDetailsSD3.mmTransactionQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}
	};
	@XmlElement(name = "RsnCd")
	protected DTCAdjustmentPaymentType2Code reasonCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4
	 * CorporateActionMovementSecuritiesMovementDetailsSD4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3#mmReasonCode
	 * CorporateActionMovementSecuritiesMovementDetailsSD3.mmReasonCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReasonCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "RsnCd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Transaction Reason Code"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReasonCode";
			definition = "Transaction reason.";
			previousVersion_lazy = () -> CorporateActionMovementSecuritiesMovementDetailsSD3.mmReasonCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCAdjustmentPaymentType2Code.mmObject();
		}
	};
	@XmlElement(name = "SubRsnCd")
	protected DTCAdjustmentPaymentSubReason1Code subReasonCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4
	 * CorporateActionMovementSecuritiesMovementDetailsSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubRsnCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubReasonCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction sub reason."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3#mmSubReasonCode
	 * CorporateActionMovementSecuritiesMovementDetailsSD3.mmSubReasonCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubReasonCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "SubRsnCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubReasonCode";
			definition = "Transaction sub reason.";
			previousVersion_lazy = () -> CorporateActionMovementSecuritiesMovementDetailsSD3.mmSubReasonCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCAdjustmentPaymentSubReason1Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4
	 * CorporateActionMovementSecuritiesMovementDetailsSD4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3#mmContraParticipantNumber
	 * CorporateActionMovementSecuritiesMovementDetailsSD3.
	 * mmContraParticipantNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmContraParticipantNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "ContraPtcptNb";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Contra Participant Number"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContraParticipantNumber";
			definition = "Transaction contra participant identification when shares are distributed / delivered to / from another participant.";
			previousVersion_lazy = () -> CorporateActionMovementSecuritiesMovementDetailsSD3.mmContraParticipantNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max8Text.mmObject();
		}
	};
	@XmlElement(name = "EarlstPmtDt")
	protected DateFormat28Choice earliestPaymentDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat28Choice
	 * DateFormat28Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4
	 * CorporateActionMovementSecuritiesMovementDetailsSD4}</li>
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
	 * "Date/Time on which the posting / draft of the securities is scheduled to take place for a transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3#mmEarliestPaymentDate
	 * CorporateActionMovementSecuritiesMovementDetailsSD3.mmEarliestPaymentDate
	 * }</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEarliestPaymentDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "EarlstPmtDt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Payable Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarliestPaymentDate";
			definition = "Date/Time on which the posting / draft of the securities is scheduled to take place for a transaction.";
			previousVersion_lazy = () -> CorporateActionMovementSecuritiesMovementDetailsSD3.mmEarliestPaymentDate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat28Choice.mmObject();
		}
	};
	@XmlElement(name = "TaxAdjstmntRate")
	protected PercentageRate taxAdjustmentRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4
	 * CorporateActionMovementSecuritiesMovementDetailsSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxAdjstmntRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxAdjustmentRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of the DTC legacy sub reason codes representing tax rate. Used with reason codes ‘TJXD’ ‘TJXF’ ‘TJXI’ ‘TJXL’ ‘TJXR’ ‘TJXT’ ‘TJXU’ to identify the correct tax rate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3#mmTaxAdjustmentRate
	 * CorporateActionMovementSecuritiesMovementDetailsSD3.mmTaxAdjustmentRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxAdjustmentRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "TaxAdjstmntRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxAdjustmentRate";
			definition = "Set of the DTC legacy sub reason codes representing tax rate. Used with reason codes ‘TJXD’ ‘TJXF’ ‘TJXI’ ‘TJXL’ ‘TJXR’ ‘TJXT’ ‘TJXU’ to identify the correct tax rate.";
			previousVersion_lazy = () -> CorporateActionMovementSecuritiesMovementDetailsSD3.mmTaxAdjustmentRate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	@XmlElement(name = "RDPRefNb")
	protected Exact32AlphaNumericText rDPReferenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact32AlphaNumericText
	 * Exact32AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4
	 * CorporateActionMovementSecuritiesMovementDetailsSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RDPRefNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RDPReferenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique DTCC legacy reference used for matching and reconciling legacy CCF records. The element will be populated to all levels of the message (Event Details, Options, Movements) where applicable to indicate how values are sourced from CCF legacy files.  For example: event has 2 related Activity Types 74, and 54. If event details and cash option are sourced from the Activity Type 74, then Activity Type 74 will be in RDP Reference Number in event details, and also on the cash option. The activity type 54 will be \"on\" the security option.  Also, usage rules will specify the different layouts of the   RDP Reference Number based on DTCC event group (reorganization, distribution, or redemption).  "
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD3#mmRDPReferenceNumber
	 * CorporateActionMovementSecuritiesMovementDetailsSD3.mmRDPReferenceNumber}
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRDPReferenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "RDPRefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RDPReferenceNumber";
			definition = "Unique DTCC legacy reference used for matching and reconciling legacy CCF records. The element will be populated to all levels of the message (Event Details, Options, Movements) where applicable to indicate how values are sourced from CCF legacy files.  For example: event has 2 related Activity Types 74, and 54. If event details and cash option are sourced from the Activity Type 74, then Activity Type 74 will be in RDP Reference Number in event details, and also on the cash option. The activity type 54 will be \"on\" the security option.  Also, usage rules will specify the different layouts of the   RDP Reference Number based on DTCC event group (reorganization, distribution, or redemption).  ";
			previousVersion_lazy = () -> CorporateActionMovementSecuritiesMovementDetailsSD3.mmRDPReferenceNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact32AlphaNumericText.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4.mmPlaceAndName,
						com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4.mmCreditDebitIndicator, com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4.mmPayoutType,
						com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4.mmTransactionQuantity, com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4.mmReasonCode,
						com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4.mmSubReasonCode, com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4.mmContraParticipantNumber,
						com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4.mmEarliestPaymentDate, com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4.mmTaxAdjustmentRate,
						com.tools20022.repository.msg.CorporateActionMovementSecuritiesMovementDetailsSD4.mmRDPReferenceNumber);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionMovementSecuritiesMovementDetailsSD4";
				definition = "Provides additional information regarding corporate action movement securities movement rate details.";
				previousVersion_lazy = () -> CorporateActionMovementSecuritiesMovementDetailsSD3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public CorporateActionMovementSecuritiesMovementDetailsSD4 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public CreditDebitCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public CorporateActionMovementSecuritiesMovementDetailsSD4 setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = Objects.requireNonNull(creditDebitIndicator);
		return this;
	}

	public DTCCPayoutType4Code getPayoutType() {
		return payoutType;
	}

	public CorporateActionMovementSecuritiesMovementDetailsSD4 setPayoutType(DTCCPayoutType4Code payoutType) {
		this.payoutType = Objects.requireNonNull(payoutType);
		return this;
	}

	public Optional<FinancialInstrumentQuantity15Choice> getTransactionQuantity() {
		return transactionQuantity == null ? Optional.empty() : Optional.of(transactionQuantity);
	}

	public CorporateActionMovementSecuritiesMovementDetailsSD4 setTransactionQuantity(FinancialInstrumentQuantity15Choice transactionQuantity) {
		this.transactionQuantity = transactionQuantity;
		return this;
	}

	public Optional<DTCAdjustmentPaymentType2Code> getReasonCode() {
		return reasonCode == null ? Optional.empty() : Optional.of(reasonCode);
	}

	public CorporateActionMovementSecuritiesMovementDetailsSD4 setReasonCode(DTCAdjustmentPaymentType2Code reasonCode) {
		this.reasonCode = reasonCode;
		return this;
	}

	public Optional<DTCAdjustmentPaymentSubReason1Code> getSubReasonCode() {
		return subReasonCode == null ? Optional.empty() : Optional.of(subReasonCode);
	}

	public CorporateActionMovementSecuritiesMovementDetailsSD4 setSubReasonCode(DTCAdjustmentPaymentSubReason1Code subReasonCode) {
		this.subReasonCode = subReasonCode;
		return this;
	}

	public Optional<Max8Text> getContraParticipantNumber() {
		return contraParticipantNumber == null ? Optional.empty() : Optional.of(contraParticipantNumber);
	}

	public CorporateActionMovementSecuritiesMovementDetailsSD4 setContraParticipantNumber(Max8Text contraParticipantNumber) {
		this.contraParticipantNumber = contraParticipantNumber;
		return this;
	}

	public Optional<DateFormat28Choice> getEarliestPaymentDate() {
		return earliestPaymentDate == null ? Optional.empty() : Optional.of(earliestPaymentDate);
	}

	public CorporateActionMovementSecuritiesMovementDetailsSD4 setEarliestPaymentDate(DateFormat28Choice earliestPaymentDate) {
		this.earliestPaymentDate = earliestPaymentDate;
		return this;
	}

	public Optional<PercentageRate> getTaxAdjustmentRate() {
		return taxAdjustmentRate == null ? Optional.empty() : Optional.of(taxAdjustmentRate);
	}

	public CorporateActionMovementSecuritiesMovementDetailsSD4 setTaxAdjustmentRate(PercentageRate taxAdjustmentRate) {
		this.taxAdjustmentRate = taxAdjustmentRate;
		return this;
	}

	public Optional<Exact32AlphaNumericText> getRDPReferenceNumber() {
		return rDPReferenceNumber == null ? Optional.empty() : Optional.of(rDPReferenceNumber);
	}

	public CorporateActionMovementSecuritiesMovementDetailsSD4 setRDPReferenceNumber(Exact32AlphaNumericText rDPReferenceNumber) {
		this.rDPReferenceNumber = rDPReferenceNumber;
		return this;
	}
}