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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CardAccountType3Code;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.OnLineReason1Code;
import com.tools20022.repository.codeset.TypeOfAmount1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the transaction in the authorisation request in a batch.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31#mmCurrency
 * CardPaymentTransactionDetails31.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31#mmTotalAmount
 * CardPaymentTransactionDetails31.mmTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31#mmAmountQualifier
 * CardPaymentTransactionDetails31.mmAmountQualifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31#mmDetailedAmount
 * CardPaymentTransactionDetails31.mmDetailedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31#mmValidityDate
 * CardPaymentTransactionDetails31.mmValidityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31#mmOnLineReason
 * CardPaymentTransactionDetails31.mmOnLineReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31#mmUnattendedLevelCategory
 * CardPaymentTransactionDetails31.mmUnattendedLevelCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31#mmAccountType
 * CardPaymentTransactionDetails31.mmAccountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31#mmCurrencyConversionResult
 * CardPaymentTransactionDetails31.mmCurrencyConversionResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31#mmInstalment
 * CardPaymentTransactionDetails31.mmInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31#mmAggregationTransaction
 * CardPaymentTransactionDetails31.mmAggregationTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31#mmProductCodeSetIdentification
 * CardPaymentTransactionDetails31.mmProductCodeSetIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31#mmSaleItem
 * CardPaymentTransactionDetails31.mmSaleItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31#mmDeliveryLocation
 * CardPaymentTransactionDetails31.mmDeliveryLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31#mmCardPaymentInvoice
 * CardPaymentTransactionDetails31.mmCardPaymentInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31#mmICCRelatedData
 * CardPaymentTransactionDetails31.mmICCRelatedData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardPaymentTransactionDetails31"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Details of the transaction in the authorisation request in a batch."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39
 * CardPaymentTransactionDetails39}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails24
 * CardPaymentTransactionDetails24}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CardPaymentTransactionDetails31", propOrder = {"currency", "totalAmount", "amountQualifier", "detailedAmount", "validityDate", "onLineReason", "unattendedLevelCategory", "accountType", "currencyConversionResult",
		"instalment", "aggregationTransaction", "productCodeSetIdentification", "saleItem", "deliveryLocation", "cardPaymentInvoice", "ICCRelatedData"})
public class CardPaymentTransactionDetails31 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyCode currency;
	/**
	 * Currency associated with the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmCurrencyOfTransfer
	 * Payment.mmCurrencyOfTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31
	 * CardPaymentTransactionDetails31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency associated with the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#mmCurrency
	 * CardPaymentTransactionDetails39.mmCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails24#mmCurrency
	 * CardPaymentTransactionDetails24.mmCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmCurrencyOfTransfer;
			componentContext_lazy = () -> CardPaymentTransactionDetails31.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Currency associated with the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails39.mmCurrency);
			previousVersion_lazy = () -> CardPaymentTransactionDetails24.mmCurrency;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount totalAmount;
	/**
	 * Total amount of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
	 * Payment.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31
	 * CardPaymentTransactionDetails31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total amount of the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#mmTotalAmount
	 * CardPaymentTransactionDetails39.mmTotalAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails24#mmTotalAmount
	 * CardPaymentTransactionDetails24.mmTotalAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> CardPaymentTransactionDetails31.mmObject();
			isDerived = false;
			xmlTag = "TtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmount";
			definition = "Total amount of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails39.mmTotalAmount);
			previousVersion_lazy = () -> CardPaymentTransactionDetails24.mmTotalAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected TypeOfAmount1Code amountQualifier;
	/**
	 * Qualifies the amount associated with the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount1Code
	 * TypeOfAmount1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmAmountQualifier
	 * CardPayment.mmAmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31
	 * CardPaymentTransactionDetails31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtQlfr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountQualifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Qualifies the amount associated with the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#mmAmountQualifier
	 * CardPaymentTransactionDetails39.mmAmountQualifier}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails24#mmAmountQualifier
	 * CardPaymentTransactionDetails24.mmAmountQualifier}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmountQualifier = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmAmountQualifier;
			componentContext_lazy = () -> CardPaymentTransactionDetails31.mmObject();
			isDerived = false;
			xmlTag = "AmtQlfr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountQualifier";
			definition = "Qualifies the amount associated with the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails39.mmAmountQualifier);
			previousVersion_lazy = () -> CardPaymentTransactionDetails24.mmAmountQualifier;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TypeOfAmount1Code.mmObject();
		}
	};
	protected DetailedAmount15 detailedAmount;
	/**
	 * Detailed amounts associated with the total amount of transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount15
	 * DetailedAmount15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmDetailedAmount
	 * CardPayment.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31
	 * CardPaymentTransactionDetails31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtldAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DetailedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Detailed amounts associated with the total amount of transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#mmDetailedAmount
	 * CardPaymentTransactionDetails39.mmDetailedAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails24#mmDetailedAmount
	 * CardPaymentTransactionDetails24.mmDetailedAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDetailedAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmDetailedAmount;
			componentContext_lazy = () -> CardPaymentTransactionDetails31.mmObject();
			isDerived = false;
			xmlTag = "DtldAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DetailedAmount";
			definition = "Detailed amounts associated with the total amount of transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails39.mmDetailedAmount);
			previousVersion_lazy = () -> CardPaymentTransactionDetails24.mmDetailedAmount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DetailedAmount15.mmObject();
		}
	};
	protected ISODate validityDate;
	/**
	 * Transaction authorisation deadline to complete the related payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmValidityDate
	 * CardPaymentValidation.mmValidityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31
	 * CardPaymentTransactionDetails31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldtyDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction authorisation deadline to complete the related payment."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#mmValidityDate
	 * CardPaymentTransactionDetails39.mmValidityDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails24#mmValidityDate
	 * CardPaymentTransactionDetails24.mmValidityDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValidityDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentValidation.mmValidityDate;
			componentContext_lazy = () -> CardPaymentTransactionDetails31.mmObject();
			isDerived = false;
			xmlTag = "VldtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidityDate";
			definition = "Transaction authorisation deadline to complete the related payment.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails39.mmValidityDate);
			previousVersion_lazy = () -> CardPaymentTransactionDetails24.mmValidityDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected OnLineReason1Code onLineReason;
	/**
	 * Reason to process an online authorisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineReason1Code
	 * OnLineReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmOnLineReason
	 * CardPaymentValidation.mmOnLineReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31
	 * CardPaymentTransactionDetails31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OnLineRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLineReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason to process an online authorisation."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#mmOnLineReason
	 * CardPaymentTransactionDetails39.mmOnLineReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails24#mmOnLineReason
	 * CardPaymentTransactionDetails24.mmOnLineReason}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOnLineReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentValidation.mmOnLineReason;
			componentContext_lazy = () -> CardPaymentTransactionDetails31.mmObject();
			isDerived = false;
			xmlTag = "OnLineRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLineReason";
			definition = "Reason to process an online authorisation.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails39.mmOnLineReason);
			previousVersion_lazy = () -> CardPaymentTransactionDetails24.mmOnLineReason;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> OnLineReason1Code.mmObject();
		}
	};
	protected Max35NumericText unattendedLevelCategory;
	/**
	 * Transaction category level on an unattended POI (Point Of Interaction).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max35NumericText
	 * Max35NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmUnattendedLevelCategory
	 * CardPaymentAcquiring.mmUnattendedLevelCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31
	 * CardPaymentTransactionDetails31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UattnddLvlCtgy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnattendedLevelCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction category level on an unattended POI (Point Of Interaction)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#mmUnattendedLevelCategory
	 * CardPaymentTransactionDetails39.mmUnattendedLevelCategory}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails24#mmUnattendedLevelCategory
	 * CardPaymentTransactionDetails24.mmUnattendedLevelCategory}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnattendedLevelCategory = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmUnattendedLevelCategory;
			componentContext_lazy = () -> CardPaymentTransactionDetails31.mmObject();
			isDerived = false;
			xmlTag = "UattnddLvlCtgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnattendedLevelCategory";
			definition = "Transaction category level on an unattended POI (Point Of Interaction).";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails39.mmUnattendedLevelCategory);
			previousVersion_lazy = () -> CardPaymentTransactionDetails24.mmUnattendedLevelCategory;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35NumericText.mmObject();
		}
	};
	protected CardAccountType3Code accountType;
	/**
	 * Type of cardholder account used for the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code
	 * CardAccountType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmRelatedAccountType
	 * PaymentCard.mmRelatedAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31
	 * CardPaymentTransactionDetails31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of cardholder account used for the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#mmAccountType
	 * CardPaymentTransactionDetails39.mmAccountType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails24#mmAccountType
	 * CardPaymentTransactionDetails24.mmAccountType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmRelatedAccountType;
			componentContext_lazy = () -> CardPaymentTransactionDetails31.mmObject();
			isDerived = false;
			xmlTag = "AcctTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountType";
			definition = "Type of cardholder account used for the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails39.mmAccountType);
			previousVersion_lazy = () -> CardPaymentTransactionDetails24.mmAccountType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CardAccountType3Code.mmObject();
		}
	};
	protected CurrencyConversion8 currencyConversionResult;
	/**
	 * Result of the currency conversion proposed to the cardholder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CurrencyConversion8
	 * CurrencyConversion8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31
	 * CardPaymentTransactionDetails31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyConvsRslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyConversionResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Result of the currency conversion proposed to the cardholder."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#mmCurrencyConversionResult
	 * CardPaymentTransactionDetails39.mmCurrencyConversionResult}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCurrencyConversionResult = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardPaymentTransactionDetails31.mmObject();
			isDerived = false;
			xmlTag = "CcyConvsRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversionResult";
			definition = "Result of the currency conversion proposed to the cardholder.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails39.mmCurrencyConversionResult);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CurrencyConversion8.mmObject();
		}
	};
	protected RecurringTransaction2 instalment;
	/**
	 * Data related to a financial loan (instalment) or to a recurring
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RecurringTransaction2
	 * RecurringTransaction2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31
	 * CardPaymentTransactionDetails31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Instlmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Instalment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Data related to a financial loan (instalment) or to a recurring transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#mmInstalment
	 * CardPaymentTransactionDetails39.mmInstalment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails24#mmInstalment
	 * CardPaymentTransactionDetails24.mmInstalment}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstalment = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Instalment.mmObject();
			componentContext_lazy = () -> CardPaymentTransactionDetails31.mmObject();
			isDerived = false;
			xmlTag = "Instlmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Instalment";
			definition = "Data related to a financial loan (instalment) or to a recurring transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails39.mmInstalment);
			previousVersion_lazy = () -> CardPaymentTransactionDetails24.mmInstalment;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RecurringTransaction2.mmObject();
		}
	};
	protected AggregationTransaction2 aggregationTransaction;
	/**
	 * Payment transaction with an aggregated amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AggregationTransaction2
	 * AggregationTransaction2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31
	 * CardPaymentTransactionDetails31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AggtnTx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AggregationTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment transaction with an aggregated amount."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#mmAggregationTransaction
	 * CardPaymentTransactionDetails39.mmAggregationTransaction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails24#mmAggregationTransaction
	 * CardPaymentTransactionDetails24.mmAggregationTransaction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAggregationTransaction = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardPaymentTransactionDetails31.mmObject();
			isDerived = false;
			xmlTag = "AggtnTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregationTransaction";
			definition = "Payment transaction with an aggregated amount.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails39.mmAggregationTransaction);
			previousVersion_lazy = () -> CardPaymentTransactionDetails24.mmAggregationTransaction;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AggregationTransaction2.mmObject();
		}
	};
	protected Max10Text productCodeSetIdentification;
	/**
	 * Codification used to identify the products.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max10Text
	 * Max10Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31
	 * CardPaymentTransactionDetails31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctCdSetId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductCodeSetIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Codification used to identify the products."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#mmProductCodeSetIdentification
	 * CardPaymentTransactionDetails39.mmProductCodeSetIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProductCodeSetIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentTransactionDetails31.mmObject();
			isDerived = false;
			xmlTag = "PdctCdSetId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductCodeSetIdentification";
			definition = "Codification used to identify the products.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails39.mmProductCodeSetIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Product3> saleItem;
	/**
	 * Item purchased with the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Product3 Product3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmProduct
	 * CardPayment.mmProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31
	 * CardPaymentTransactionDetails31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SaleItm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Item purchased with the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#mmSaleItem
	 * CardPaymentTransactionDetails39.mmSaleItem}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails24#mmProduct
	 * CardPaymentTransactionDetails24.mmProduct}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSaleItem = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmProduct;
			componentContext_lazy = () -> CardPaymentTransactionDetails31.mmObject();
			isDerived = false;
			xmlTag = "SaleItm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleItem";
			definition = "Item purchased with the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails39.mmSaleItem);
			previousVersion_lazy = () -> CardPaymentTransactionDetails24.mmProduct;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Product3.mmObject();
		}
	};
	protected Max10Text deliveryLocation;
	/**
	 * Location of the delivery, for instance pump number or parking bay.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max10Text
	 * Max10Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31
	 * CardPaymentTransactionDetails31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryLctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Location of the delivery, for instance pump number or parking bay."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#mmDeliveryLocation
	 * CardPaymentTransactionDetails39.mmDeliveryLocation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeliveryLocation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentTransactionDetails31.mmObject();
			isDerived = false;
			xmlTag = "DlvryLctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryLocation";
			definition = "Location of the delivery, for instance pump number or parking bay.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails39.mmDeliveryLocation);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10Text.mmObject();
		}
	};
	protected CardPaymentInvoice2 cardPaymentInvoice;
	/**
	 * Detailed invoice data.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardPaymentInvoice2
	 * CardPaymentInvoice2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31
	 * CardPaymentTransactionDetails31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardPmtInvc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPaymentInvoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Detailed invoice data."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#mmCardPaymentInvoice
	 * CardPaymentTransactionDetails39.mmCardPaymentInvoice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails24#mmCardPaymentInvoice
	 * CardPaymentTransactionDetails24.mmCardPaymentInvoice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCardPaymentInvoice = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardPaymentTransactionDetails31.mmObject();
			isDerived = false;
			xmlTag = "CardPmtInvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardPaymentInvoice";
			definition = "Detailed invoice data.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails39.mmCardPaymentInvoice);
			previousVersion_lazy = () -> CardPaymentTransactionDetails24.mmCardPaymentInvoice;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardPaymentInvoice2.mmObject();
		}
	};
	protected Max10000Binary iCCRelatedData;
	/**
	 * Data related to an integrated circuit card application.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max10000Binary
	 * Max10000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmICCRelatedData
	 * CardPaymentAcquiring.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails31
	 * CardPaymentTransactionDetails31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ICCRltdData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ICCRelatedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data related to an integrated circuit card application."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails39#mmICCRelatedData
	 * CardPaymentTransactionDetails39.mmICCRelatedData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails24#mmICCRelatedData
	 * CardPaymentTransactionDetails24.mmICCRelatedData}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmICCRelatedData = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmICCRelatedData;
			componentContext_lazy = () -> CardPaymentTransactionDetails31.mmObject();
			isDerived = false;
			xmlTag = "ICCRltdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ICCRelatedData";
			definition = "Data related to an integrated circuit card application.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails39.mmICCRelatedData);
			previousVersion_lazy = () -> CardPaymentTransactionDetails24.mmICCRelatedData;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CardPaymentTransactionDetails31.mmCurrency, CardPaymentTransactionDetails31.mmTotalAmount, CardPaymentTransactionDetails31.mmAmountQualifier,
						CardPaymentTransactionDetails31.mmDetailedAmount, CardPaymentTransactionDetails31.mmValidityDate, CardPaymentTransactionDetails31.mmOnLineReason, CardPaymentTransactionDetails31.mmUnattendedLevelCategory,
						CardPaymentTransactionDetails31.mmAccountType, CardPaymentTransactionDetails31.mmCurrencyConversionResult, CardPaymentTransactionDetails31.mmInstalment, CardPaymentTransactionDetails31.mmAggregationTransaction,
						CardPaymentTransactionDetails31.mmProductCodeSetIdentification, CardPaymentTransactionDetails31.mmSaleItem, CardPaymentTransactionDetails31.mmDeliveryLocation, CardPaymentTransactionDetails31.mmCardPaymentInvoice,
						CardPaymentTransactionDetails31.mmICCRelatedData);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentTransactionDetails31";
				definition = "Details of the transaction in the authorisation request in a batch.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails39.mmObject());
				previousVersion_lazy = () -> CardPaymentTransactionDetails24.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Ccy")
	public CurrencyCode getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyCode currency) {
		this.currency = currency;
	}

	@XmlElement(name = "TtlAmt", required = true)
	public ImpliedCurrencyAndAmount getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(ImpliedCurrencyAndAmount totalAmount) {
		this.totalAmount = totalAmount;
	}

	@XmlElement(name = "AmtQlfr")
	public TypeOfAmount1Code getAmountQualifier() {
		return amountQualifier;
	}

	public void setAmountQualifier(TypeOfAmount1Code amountQualifier) {
		this.amountQualifier = amountQualifier;
	}

	@XmlElement(name = "DtldAmt")
	public DetailedAmount15 getDetailedAmount() {
		return detailedAmount;
	}

	public void setDetailedAmount(com.tools20022.repository.msg.DetailedAmount15 detailedAmount) {
		this.detailedAmount = detailedAmount;
	}

	@XmlElement(name = "VldtyDt")
	public ISODate getValidityDate() {
		return validityDate;
	}

	public void setValidityDate(ISODate validityDate) {
		this.validityDate = validityDate;
	}

	@XmlElement(name = "OnLineRsn")
	public OnLineReason1Code getOnLineReason() {
		return onLineReason;
	}

	public void setOnLineReason(OnLineReason1Code onLineReason) {
		this.onLineReason = onLineReason;
	}

	@XmlElement(name = "UattnddLvlCtgy")
	public Max35NumericText getUnattendedLevelCategory() {
		return unattendedLevelCategory;
	}

	public void setUnattendedLevelCategory(Max35NumericText unattendedLevelCategory) {
		this.unattendedLevelCategory = unattendedLevelCategory;
	}

	@XmlElement(name = "AcctTp")
	public CardAccountType3Code getAccountType() {
		return accountType;
	}

	public void setAccountType(CardAccountType3Code accountType) {
		this.accountType = accountType;
	}

	@XmlElement(name = "CcyConvsRslt")
	public CurrencyConversion8 getCurrencyConversionResult() {
		return currencyConversionResult;
	}

	public void setCurrencyConversionResult(com.tools20022.repository.msg.CurrencyConversion8 currencyConversionResult) {
		this.currencyConversionResult = currencyConversionResult;
	}

	@XmlElement(name = "Instlmt")
	public RecurringTransaction2 getInstalment() {
		return instalment;
	}

	public void setInstalment(com.tools20022.repository.msg.RecurringTransaction2 instalment) {
		this.instalment = instalment;
	}

	@XmlElement(name = "AggtnTx")
	public AggregationTransaction2 getAggregationTransaction() {
		return aggregationTransaction;
	}

	public void setAggregationTransaction(com.tools20022.repository.msg.AggregationTransaction2 aggregationTransaction) {
		this.aggregationTransaction = aggregationTransaction;
	}

	@XmlElement(name = "PdctCdSetId")
	public Max10Text getProductCodeSetIdentification() {
		return productCodeSetIdentification;
	}

	public void setProductCodeSetIdentification(Max10Text productCodeSetIdentification) {
		this.productCodeSetIdentification = productCodeSetIdentification;
	}

	@XmlElement(name = "SaleItm")
	public List<Product3> getSaleItem() {
		return saleItem;
	}

	public void setSaleItem(List<com.tools20022.repository.msg.Product3> saleItem) {
		this.saleItem = saleItem;
	}

	@XmlElement(name = "DlvryLctn")
	public Max10Text getDeliveryLocation() {
		return deliveryLocation;
	}

	public void setDeliveryLocation(Max10Text deliveryLocation) {
		this.deliveryLocation = deliveryLocation;
	}

	@XmlElement(name = "CardPmtInvc")
	public CardPaymentInvoice2 getCardPaymentInvoice() {
		return cardPaymentInvoice;
	}

	public void setCardPaymentInvoice(com.tools20022.repository.msg.CardPaymentInvoice2 cardPaymentInvoice) {
		this.cardPaymentInvoice = cardPaymentInvoice;
	}

	@XmlElement(name = "ICCRltdData")
	public Max10000Binary getICCRelatedData() {
		return iCCRelatedData;
	}

	public void setICCRelatedData(Max10000Binary iCCRelatedData) {
		this.iCCRelatedData = iCCRelatedData;
	}
}