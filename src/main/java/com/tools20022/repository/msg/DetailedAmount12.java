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
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Amounts of the withdrawal transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DetailedAmount12#mmAmountToDispense
 * DetailedAmount12.mmAmountToDispense}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount12#mmCurrency
 * DetailedAmount12.mmCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount12#mmFees
 * DetailedAmount12.mmFees}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount12#mmDonation
 * DetailedAmount12.mmDonation}</li>
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
 * "DetailedAmount12"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Amounts of the withdrawal transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount16
 * DetailedAmount16}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.DetailedAmount11 DetailedAmount11}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "DetailedAmount12", propOrder = {"amountToDispense", "currency", "fees", "donation"})
public class DetailedAmount12 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ImpliedCurrencyAndAmount amountToDispense;
	/**
	 * Amount to be dispensed by the ATM after the approval of the withdrawal
	 * transaction.
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
	 * {@linkplain com.tools20022.repository.entity.Payment#mmAmount
	 * Payment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount12
	 * DetailedAmount12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtToDspns"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountToDispense"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount to be dispensed by the ATM after the approval of the withdrawal transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount16#mmAmountToDeposit
	 * DetailedAmount16.mmAmountToDeposit}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount11#mmAmount
	 * DetailedAmount11.mmAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmountToDispense = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmAmount;
			componentContext_lazy = () -> DetailedAmount12.mmObject();
			isDerived = false;
			xmlTag = "AmtToDspns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountToDispense";
			definition = "Amount to be dispensed by the ATM after the approval of the withdrawal transaction.";
			nextVersions_lazy = () -> Arrays.asList(DetailedAmount16.mmAmountToDeposit);
			previousVersion_lazy = () -> DetailedAmount11.mmAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyCode currency;
	/**
	 * Currency of the amount to dispense when different from the base currency
	 * of the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmCurrencyExchange
	 * Payment.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount12
	 * DetailedAmount12}</li>
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
	 * definition} =
	 * "Currency of the amount to dispense when different from the base currency of the ATM."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount16#mmCurrency
	 * DetailedAmount16.mmCurrency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmCurrencyExchange;
			componentContext_lazy = () -> DetailedAmount12.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Currency of the amount to dispense when different from the base currency of the ATM.";
			nextVersions_lazy = () -> Arrays.asList(DetailedAmount16.mmCurrency);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.DetailedAmount13> fees;
	/**
	 * Withdrawal fees, accepted by the customer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount13
	 * DetailedAmount13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount12
	 * DetailedAmount12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Fees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Withdrawal fees, accepted by the customer."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount16#mmFees
	 * DetailedAmount16.mmFees}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFees = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> DetailedAmount12.mmObject();
			isDerived = false;
			xmlTag = "Fees";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fees";
			definition = "Withdrawal fees, accepted by the customer.";
			nextVersions_lazy = () -> Arrays.asList(DetailedAmount16.mmFees);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DetailedAmount13.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.DetailedAmount13> donation;
	/**
	 * Amount of the donation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount13
	 * DetailedAmount13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount12
	 * DetailedAmount12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dontn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Donation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of the donation."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount16#mmDonation
	 * DetailedAmount16.mmDonation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDonation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> DetailedAmount12.mmObject();
			isDerived = false;
			xmlTag = "Dontn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Donation";
			definition = "Amount of the donation.";
			nextVersions_lazy = () -> Arrays.asList(DetailedAmount16.mmDonation);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DetailedAmount13.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(DetailedAmount12.mmAmountToDispense, DetailedAmount12.mmCurrency, DetailedAmount12.mmFees, DetailedAmount12.mmDonation);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DetailedAmount12";
				definition = "Amounts of the withdrawal transaction.";
				nextVersions_lazy = () -> Arrays.asList(DetailedAmount16.mmObject());
				previousVersion_lazy = () -> DetailedAmount11.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AmtToDspns", required = true)
	public ImpliedCurrencyAndAmount getAmountToDispense() {
		return amountToDispense;
	}

	public void setAmountToDispense(ImpliedCurrencyAndAmount amountToDispense) {
		this.amountToDispense = amountToDispense;
	}

	@XmlElement(name = "Ccy")
	public ActiveCurrencyCode getCurrency() {
		return currency;
	}

	public void setCurrency(ActiveCurrencyCode currency) {
		this.currency = currency;
	}

	@XmlElement(name = "Fees")
	public List<DetailedAmount13> getFees() {
		return fees;
	}

	public void setFees(List<com.tools20022.repository.msg.DetailedAmount13> fees) {
		this.fees = fees;
	}

	@XmlElement(name = "Dontn")
	public List<DetailedAmount13> getDonation() {
		return donation;
	}

	public void setDonation(List<com.tools20022.repository.msg.DetailedAmount13> donation) {
		this.donation = donation;
	}
}