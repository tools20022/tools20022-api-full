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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMMediaMix2;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Preferred withdrawal transaction chosen by the the customer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction8#mmAmount
 * ATMTransaction8.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction8#mmCurrency
 * ATMTransaction8.mmCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction8#mmReceiptFlag
 * ATMTransaction8.mmReceiptFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction8#mmBalancePrintFlag
 * ATMTransaction8.mmBalancePrintFlag}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction8#mmMixType
 * ATMTransaction8.mmMixType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction8#mmMix
 * ATMTransaction8.mmMix}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
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
 * "ATMTransaction8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Preferred withdrawal transaction chosen by the the customer."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.ATMTransaction1
 * ATMTransaction1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMTransaction8", propOrder = {"amount", "currency", "receiptFlag", "balancePrintFlag", "mixType", "mix"})
public class ATMTransaction8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Amt")
	protected ImpliedCurrencyAndAmount amount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction8
	 * ATMTransaction8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount to dispense."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction8, Optional<ImpliedCurrencyAndAmount>> mmAmount = new MMMessageAttribute<ATMTransaction8, Optional<ImpliedCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction8.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount to dispense.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(ATMTransaction8 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(ATMTransaction8 obj, Optional<ImpliedCurrencyAndAmount> value) {
			obj.setAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "Ccy")
	protected ActiveCurrencyCode currency;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction8
	 * ATMTransaction8}</li>
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
	 * definition} = "Currency."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction8, Optional<ActiveCurrencyCode>> mmCurrency = new MMMessageAttribute<ATMTransaction8, Optional<ActiveCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmCurrencyExchange;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction8.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Currency.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyCode> getValue(ATMTransaction8 obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(ATMTransaction8 obj, Optional<ActiveCurrencyCode> value) {
			obj.setCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "RctFlg")
	protected TrueFalseIndicator receiptFlag;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction8
	 * ATMTransaction8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RctFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiptFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "True if a receipt has to be printed by the ATM for the customer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction1#mmRequestedReceipt
	 * ATMTransaction1.mmRequestedReceipt}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction8, Optional<TrueFalseIndicator>> mmReceiptFlag = new MMMessageAttribute<ATMTransaction8, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction8.mmObject();
			isDerived = false;
			xmlTag = "RctFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiptFlag";
			definition = "True if a receipt has to be printed by the ATM for the customer.";
			previousVersion_lazy = () -> ATMTransaction1.mmRequestedReceipt;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(ATMTransaction8 obj) {
			return obj.getReceiptFlag();
		}

		@Override
		public void setValue(ATMTransaction8 obj, Optional<TrueFalseIndicator> value) {
			obj.setReceiptFlag(value.orElse(null));
		}
	};
	@XmlElement(name = "BalPrtFlg")
	protected TrueFalseIndicator balancePrintFlag;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction8
	 * ATMTransaction8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalPrtFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalancePrintFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "True if a balance has to be printed by the ATM on the customer receipt."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction8, Optional<TrueFalseIndicator>> mmBalancePrintFlag = new MMMessageAttribute<ATMTransaction8, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction8.mmObject();
			isDerived = false;
			xmlTag = "BalPrtFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalancePrintFlag";
			definition = "True if a balance has to be printed by the ATM on the customer receipt.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(ATMTransaction8 obj) {
			return obj.getBalancePrintFlag();
		}

		@Override
		public void setValue(ATMTransaction8 obj, Optional<TrueFalseIndicator> value) {
			obj.setBalancePrintFlag(value.orElse(null));
		}
	};
	@XmlElement(name = "MixTp")
	protected Max35Text mixType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction8
	 * ATMTransaction8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MixTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MixType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Media mix algorithm, the identification of the algorithm is an agreement between the ATM and the ATM manager."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction1#mmSelectedMixType
	 * ATMTransaction1.mmSelectedMixType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction8, Optional<Max35Text>> mmMixType = new MMMessageAttribute<ATMTransaction8, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction8.mmObject();
			isDerived = false;
			xmlTag = "MixTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MixType";
			definition = "Media mix algorithm, the identification of the algorithm is an agreement between the ATM and the ATM manager.";
			previousVersion_lazy = () -> ATMTransaction1.mmSelectedMixType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMTransaction8 obj) {
			return obj.getMixType();
		}

		@Override
		public void setValue(ATMTransaction8 obj, Optional<Max35Text> value) {
			obj.setMixType(value.orElse(null));
		}
	};
	@XmlElement(name = "Mix")
	protected List<ATMMediaMix2> mix;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMMediaMix2
	 * ATMMediaMix2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction8
	 * ATMTransaction8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mix"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mix"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Media mix to select."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction1#mmSelectedMix
	 * ATMTransaction1.mmSelectedMix}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction8, List<ATMMediaMix2>> mmMix = new MMMessageAssociationEnd<ATMTransaction8, List<ATMMediaMix2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction8.mmObject();
			isDerived = false;
			xmlTag = "Mix";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mix";
			definition = "Media mix to select.";
			previousVersion_lazy = () -> ATMTransaction1.mmSelectedMix;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMMediaMix2.mmObject();
		}

		@Override
		public List<ATMMediaMix2> getValue(ATMTransaction8 obj) {
			return obj.getMix();
		}

		@Override
		public void setValue(ATMTransaction8 obj, List<ATMMediaMix2> value) {
			obj.setMix(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction8.mmAmount, com.tools20022.repository.msg.ATMTransaction8.mmCurrency, com.tools20022.repository.msg.ATMTransaction8.mmReceiptFlag,
						com.tools20022.repository.msg.ATMTransaction8.mmBalancePrintFlag, com.tools20022.repository.msg.ATMTransaction8.mmMixType, com.tools20022.repository.msg.ATMTransaction8.mmMix);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMTransaction8";
				definition = "Preferred withdrawal transaction chosen by the the customer.";
				previousVersion_lazy = () -> ATMTransaction1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ImpliedCurrencyAndAmount> getAmount() {
		return amount == null ? Optional.empty() : Optional.of(amount);
	}

	public ATMTransaction8 setAmount(ImpliedCurrencyAndAmount amount) {
		this.amount = amount;
		return this;
	}

	public Optional<ActiveCurrencyCode> getCurrency() {
		return currency == null ? Optional.empty() : Optional.of(currency);
	}

	public ATMTransaction8 setCurrency(ActiveCurrencyCode currency) {
		this.currency = currency;
		return this;
	}

	public Optional<TrueFalseIndicator> getReceiptFlag() {
		return receiptFlag == null ? Optional.empty() : Optional.of(receiptFlag);
	}

	public ATMTransaction8 setReceiptFlag(TrueFalseIndicator receiptFlag) {
		this.receiptFlag = receiptFlag;
		return this;
	}

	public Optional<TrueFalseIndicator> getBalancePrintFlag() {
		return balancePrintFlag == null ? Optional.empty() : Optional.of(balancePrintFlag);
	}

	public ATMTransaction8 setBalancePrintFlag(TrueFalseIndicator balancePrintFlag) {
		this.balancePrintFlag = balancePrintFlag;
		return this;
	}

	public Optional<Max35Text> getMixType() {
		return mixType == null ? Optional.empty() : Optional.of(mixType);
	}

	public ATMTransaction8 setMixType(Max35Text mixType) {
		this.mixType = mixType;
		return this;
	}

	public List<ATMMediaMix2> getMix() {
		return mix == null ? mix = new ArrayList<>() : mix;
	}

	public ATMTransaction8 setMix(List<ATMMediaMix2> mix) {
		this.mix = Objects.requireNonNull(mix);
		return this;
	}
}