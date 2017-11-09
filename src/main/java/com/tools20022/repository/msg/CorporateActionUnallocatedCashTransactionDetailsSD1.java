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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.DateFormat22Choice;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.codeset.DTCAdjustmentPaymentType1Code;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.datatype.Max8Text;
import com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD1#mmCreditDebitIndicator
 * CorporateActionUnallocatedCashTransactionDetailsSD1.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD1#mmTransactionAmount
 * CorporateActionUnallocatedCashTransactionDetailsSD1.mmTransactionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD1#mmUnallocatedReasonCode
 * CorporateActionUnallocatedCashTransactionDetailsSD1.mmUnallocatedReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD1#mmContraParticipantNumber
 * CorporateActionUnallocatedCashTransactionDetailsSD1.mmContraParticipantNumber
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD1#mmEarliestPaymentDate
 * CorporateActionUnallocatedCashTransactionDetailsSD1.mmEarliestPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD1#mmReasonCode
 * CorporateActionUnallocatedCashTransactionDetailsSD1.mmReasonCode}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionUnallocatedCashTransactionDetailsSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Breakdown of unallocated cash transactions."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD2
 * CorporateActionUnallocatedCashTransactionDetailsSD2}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class CorporateActionUnallocatedCashTransactionDetailsSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CreditDebitCode creditDebitIndicator;
	/**
	 * Indicates whether the value is a debit or a credit.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD1
	 * CorporateActionUnallocatedCashTransactionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDbtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the value is a debit or a credit."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD2#mmCreditDebitIndicator
	 * CorporateActionUnallocatedCashTransactionDetailsSD2.
	 * mmCreditDebitIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreditDebitIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionUnallocatedCashTransactionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the value is a debit or a credit.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionUnallocatedCashTransactionDetailsSD2.mmCreditDebitIndicator);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount transactionAmount;
	/**
	 * Resulting cash amount concerned in this transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD1
	 * CorporateActionUnallocatedCashTransactionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Resulting cash amount concerned in this transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD2#mmTransactionAmount
	 * CorporateActionUnallocatedCashTransactionDetailsSD2.mmTransactionAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionUnallocatedCashTransactionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "TxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionAmount";
			definition = "Resulting cash amount concerned in this transaction.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionUnallocatedCashTransactionDetailsSD2.mmTransactionAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected Max4AlphaNumericText unallocatedReasonCode;
	/**
	 * Reason for the unallocation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD1
	 * CorporateActionUnallocatedCashTransactionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UallctdRsnCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnallocatedReasonCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the unallocation."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD2#mmUnallocatedReasonCode
	 * CorporateActionUnallocatedCashTransactionDetailsSD2.
	 * mmUnallocatedReasonCode}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnallocatedReasonCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionUnallocatedCashTransactionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "UallctdRsnCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnallocatedReasonCode";
			definition = "Reason for the unallocation.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionUnallocatedCashTransactionDetailsSD2.mmUnallocatedReasonCode);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
	protected Max8Text contraParticipantNumber;
	/**
	 * Transaction contra participant identification when shares are distributed
	 * / delivered to / from another participant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max8Text
	 * Max8Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD1
	 * CorporateActionUnallocatedCashTransactionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ContraPtcptNb"</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD2#mmContraParticipantNumber
	 * CorporateActionUnallocatedCashTransactionDetailsSD2.
	 * mmContraParticipantNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmContraParticipantNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionUnallocatedCashTransactionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "ContraPtcptNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContraParticipantNumber";
			definition = "Transaction contra participant identification when shares are distributed / delivered to / from another participant.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionUnallocatedCashTransactionDetailsSD2.mmContraParticipantNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max8Text.mmObject();
		}
	};
	protected DateFormat22Choice earliestPaymentDate;
	/**
	 * Date/time at which the movement was due to take place (cash and/or
	 * securities).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat22Choice
	 * DateFormat22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD1
	 * CorporateActionUnallocatedCashTransactionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlstPmtDt"</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD2#mmEarliestPaymentDate
	 * CorporateActionUnallocatedCashTransactionDetailsSD2.mmEarliestPaymentDate
	 * }</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEarliestPaymentDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionUnallocatedCashTransactionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "EarlstPmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarliestPaymentDate";
			definition = "Date/time at which the movement was due to take place (cash and/or securities).";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionUnallocatedCashTransactionDetailsSD2.mmEarliestPaymentDate);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat22Choice.mmObject();
		}
	};
	protected DTCAdjustmentPaymentType1Code reasonCode;
	/**
	 * Transaction reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType1Code
	 * DTCAdjustmentPaymentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD1
	 * CorporateActionUnallocatedCashTransactionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsnCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReasonCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction reason."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD2#mmReasonCode
	 * CorporateActionUnallocatedCashTransactionDetailsSD2.mmReasonCode}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReasonCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionUnallocatedCashTransactionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "RsnCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReasonCode";
			definition = "Transaction reason.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionUnallocatedCashTransactionDetailsSD2.mmReasonCode);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCAdjustmentPaymentType1Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionUnallocatedCashTransactionDetailsSD1.mmCreditDebitIndicator, CorporateActionUnallocatedCashTransactionDetailsSD1.mmTransactionAmount,
						CorporateActionUnallocatedCashTransactionDetailsSD1.mmUnallocatedReasonCode, CorporateActionUnallocatedCashTransactionDetailsSD1.mmContraParticipantNumber,
						CorporateActionUnallocatedCashTransactionDetailsSD1.mmEarliestPaymentDate, CorporateActionUnallocatedCashTransactionDetailsSD1.mmReasonCode);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionUnallocatedCashTransactionDetailsSD1";
				definition = "Breakdown of unallocated cash transactions.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionUnallocatedCashTransactionDetailsSD2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CreditDebitCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public void setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
	}

	public RestrictedFINActiveCurrencyAndAmount getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(RestrictedFINActiveCurrencyAndAmount transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public Max4AlphaNumericText getUnallocatedReasonCode() {
		return unallocatedReasonCode;
	}

	public void setUnallocatedReasonCode(Max4AlphaNumericText unallocatedReasonCode) {
		this.unallocatedReasonCode = unallocatedReasonCode;
	}

	public Max8Text getContraParticipantNumber() {
		return contraParticipantNumber;
	}

	public void setContraParticipantNumber(Max8Text contraParticipantNumber) {
		this.contraParticipantNumber = contraParticipantNumber;
	}

	public DateFormat22Choice getEarliestPaymentDate() {
		return earliestPaymentDate;
	}

	public void setEarliestPaymentDate(DateFormat22Choice earliestPaymentDate) {
		this.earliestPaymentDate = earliestPaymentDate;
	}

	public DTCAdjustmentPaymentType1Code getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(DTCAdjustmentPaymentType1Code reasonCode) {
		this.reasonCode = reasonCode;
	}
}