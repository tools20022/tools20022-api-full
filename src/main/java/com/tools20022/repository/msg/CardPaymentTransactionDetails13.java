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
import com.tools20022.repository.codeset.CardAccountType1Code;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max10000Binary;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the transaction in the authorisation response.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails13#mmCurrency
 * CardPaymentTransactionDetails13.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails13#mmTotalAmount
 * CardPaymentTransactionDetails13.mmTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails13#mmDetailedAmount
 * CardPaymentTransactionDetails13.mmDetailedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails13#mmValidityDate
 * CardPaymentTransactionDetails13.mmValidityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails13#mmAccountType
 * CardPaymentTransactionDetails13.mmAccountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails13#mmICCRelatedData
 * CardPaymentTransactionDetails13.mmICCRelatedData}</li>
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
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardPaymentTransactionDetails13"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the transaction in the authorisation response."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails18
 * CardPaymentTransactionDetails18}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails20
 * CardPaymentTransactionDetails20}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails2
 * CardPaymentTransactionDetails2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CardPaymentTransactionDetails13", propOrder = {"currency", "totalAmount", "detailedAmount", "validityDate", "accountType", "ICCRelatedData"})
public class CardPaymentTransactionDetails13 {

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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails13
	 * CardPaymentTransactionDetails13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails18#mmCurrency
	 * CardPaymentTransactionDetails18.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails20#mmCurrency
	 * CardPaymentTransactionDetails20.mmCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails2#mmCurrency
	 * CardPaymentTransactionDetails2.mmCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmCurrencyOfTransfer;
			componentContext_lazy = () -> CardPaymentTransactionDetails13.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Currency associated with the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails18.mmCurrency, CardPaymentTransactionDetails20.mmCurrency);
			previousVersion_lazy = () -> CardPaymentTransactionDetails2.mmCurrency;
			maxOccurs = 1;
			minOccurs = 1;
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails13
	 * CardPaymentTransactionDetails13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails18#mmTotalAmount
	 * CardPaymentTransactionDetails18.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails20#mmTotalAmount
	 * CardPaymentTransactionDetails20.mmTotalAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails2#mmTotalAmount
	 * CardPaymentTransactionDetails2.mmTotalAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> CardPaymentTransactionDetails13.mmObject();
			isDerived = false;
			xmlTag = "TtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmount";
			definition = "Total amount of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails18.mmTotalAmount, CardPaymentTransactionDetails20.mmTotalAmount);
			previousVersion_lazy = () -> CardPaymentTransactionDetails2.mmTotalAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected DetailedAmount5 detailedAmount;
	/**
	 * Detailed amounts associated with the total amount of transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount5
	 * DetailedAmount5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmDetailedAmount
	 * CardPayment.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails13
	 * CardPaymentTransactionDetails13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails18#mmDetailedAmount
	 * CardPaymentTransactionDetails18.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails20#mmDetailedAmount
	 * CardPaymentTransactionDetails20.mmDetailedAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails2#mmDetailedAmount
	 * CardPaymentTransactionDetails2.mmDetailedAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDetailedAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmDetailedAmount;
			componentContext_lazy = () -> CardPaymentTransactionDetails13.mmObject();
			isDerived = false;
			xmlTag = "DtldAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DetailedAmount";
			definition = "Detailed amounts associated with the total amount of transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails18.mmDetailedAmount, CardPaymentTransactionDetails20.mmDetailedAmount);
			previousVersion_lazy = () -> CardPaymentTransactionDetails2.mmDetailedAmount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DetailedAmount5.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails13
	 * CardPaymentTransactionDetails13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails20#mmValidityDate
	 * CardPaymentTransactionDetails20.mmValidityDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails2#mmValidityDate
	 * CardPaymentTransactionDetails2.mmValidityDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValidityDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentValidation.mmValidityDate;
			componentContext_lazy = () -> CardPaymentTransactionDetails13.mmObject();
			isDerived = false;
			xmlTag = "VldtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidityDate";
			definition = "Transaction authorisation deadline to complete the related payment.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails20.mmValidityDate);
			previousVersion_lazy = () -> CardPaymentTransactionDetails2.mmValidityDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected CardAccountType1Code accountType;
	/**
	 * Type of cardholder account used for the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType1Code
	 * CardAccountType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmRelatedAccountType
	 * PaymentCard.mmRelatedAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails13
	 * CardPaymentTransactionDetails13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails20#mmAccountType
	 * CardPaymentTransactionDetails20.mmAccountType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails2#mmAccountType
	 * CardPaymentTransactionDetails2.mmAccountType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmRelatedAccountType;
			componentContext_lazy = () -> CardPaymentTransactionDetails13.mmObject();
			isDerived = false;
			xmlTag = "AcctTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountType";
			definition = "Type of cardholder account used for the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails20.mmAccountType);
			previousVersion_lazy = () -> CardPaymentTransactionDetails2.mmAccountType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CardAccountType1Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails13
	 * CardPaymentTransactionDetails13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails18#mmICCRelatedData
	 * CardPaymentTransactionDetails18.mmICCRelatedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails20#mmICCRelatedData
	 * CardPaymentTransactionDetails20.mmICCRelatedData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails2#mmICCRelatedData
	 * CardPaymentTransactionDetails2.mmICCRelatedData}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmICCRelatedData = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmICCRelatedData;
			componentContext_lazy = () -> CardPaymentTransactionDetails13.mmObject();
			isDerived = false;
			xmlTag = "ICCRltdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ICCRelatedData";
			definition = "Data related to an integrated circuit card application.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails18.mmICCRelatedData, CardPaymentTransactionDetails20.mmICCRelatedData);
			previousVersion_lazy = () -> CardPaymentTransactionDetails2.mmICCRelatedData;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CardPaymentTransactionDetails13.mmCurrency, CardPaymentTransactionDetails13.mmTotalAmount, CardPaymentTransactionDetails13.mmDetailedAmount,
						CardPaymentTransactionDetails13.mmValidityDate, CardPaymentTransactionDetails13.mmAccountType, CardPaymentTransactionDetails13.mmICCRelatedData);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "CardPaymentTransactionDetails13";
				definition = "Details of the transaction in the authorisation response.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentTransactionDetails18.mmObject(), CardPaymentTransactionDetails20.mmObject());
				previousVersion_lazy = () -> CardPaymentTransactionDetails2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Ccy", required = true)
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

	@XmlElement(name = "DtldAmt")
	public DetailedAmount5 getDetailedAmount() {
		return detailedAmount;
	}

	public void setDetailedAmount(com.tools20022.repository.msg.DetailedAmount5 detailedAmount) {
		this.detailedAmount = detailedAmount;
	}

	@XmlElement(name = "VldtyDt")
	public ISODate getValidityDate() {
		return validityDate;
	}

	public void setValidityDate(ISODate validityDate) {
		this.validityDate = validityDate;
	}

	@XmlElement(name = "AcctTp")
	public CardAccountType1Code getAccountType() {
		return accountType;
	}

	public void setAccountType(CardAccountType1Code accountType) {
		this.accountType = accountType;
	}

	@XmlElement(name = "ICCRltdData")
	public Max10000Binary getICCRelatedData() {
		return iCCRelatedData;
	}

	public void setICCRelatedData(Max10000Binary iCCRelatedData) {
		this.iCCRelatedData = iCCRelatedData;
	}
}