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
import com.tools20022.repository.area.camt.DebitAuthorisationResponse;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.DebitAuthorisation;
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
 * Indicates if the debit authorisation is granted or not.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DebitAuthorisationConfirmation#mmDebitAuthorisation
 * DebitAuthorisationConfirmation.mmDebitAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DebitAuthorisationConfirmation#mmAmountToDebit
 * DebitAuthorisationConfirmation.mmAmountToDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DebitAuthorisationConfirmation#mmValueDateToDebit
 * DebitAuthorisationConfirmation.mmValueDateToDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DebitAuthorisationConfirmation#mmReason
 * DebitAuthorisationConfirmation.mmReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationResponse#mmConfirmation
 * DebitAuthorisationResponse.mmConfirmation}</li>
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
 * "DebitAuthorisationConfirmation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates if the debit authorisation is granted or not."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DebitAuthorisationConfirmation", propOrder = {"debitAuthorisation", "amountToDebit", "valueDateToDebit", "reason"})
public class DebitAuthorisationConfirmation {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DbtAuthstn", required = true)
	protected YesNoIndicator debitAuthorisation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation#mmDebitAuthorisationDecision
	 * DebitAuthorisation.mmDebitAuthorisationDecision}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisationConfirmation
	 * DebitAuthorisationConfirmation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtAuthstn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitAuthorisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code expressing the decision taken by the account owner relative to the request for debit authorization."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DebitAuthorisationConfirmation, YesNoIndicator> mmDebitAuthorisation = new MMMessageAttribute<DebitAuthorisationConfirmation, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> DebitAuthorisation.mmDebitAuthorisationDecision;
			componentContext_lazy = () -> com.tools20022.repository.msg.DebitAuthorisationConfirmation.mmObject();
			isDerived = false;
			xmlTag = "DbtAuthstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitAuthorisation";
			definition = "Code expressing the decision taken by the account owner relative to the request for debit authorization.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(DebitAuthorisationConfirmation obj) {
			return obj.getDebitAuthorisation();
		}

		@Override
		public void setValue(DebitAuthorisationConfirmation obj, YesNoIndicator value) {
			obj.setDebitAuthorisation(value);
		}
	};
	@XmlElement(name = "AmtToDbt")
	protected CurrencyAndAmount amountToDebit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation#mmAmountToDebit
	 * DebitAuthorisation.mmAmountToDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisationConfirmation
	 * DebitAuthorisationConfirmation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtToDbt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountToDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount authorised for debit. The party providing the debit authority may want to authorise the amount less charges and they may only be prepared to approve the debit for value today rather than the original value date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DebitAuthorisationConfirmation, Optional<CurrencyAndAmount>> mmAmountToDebit = new MMMessageAttribute<DebitAuthorisationConfirmation, Optional<CurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> DebitAuthorisation.mmAmountToDebit;
			componentContext_lazy = () -> com.tools20022.repository.msg.DebitAuthorisationConfirmation.mmObject();
			isDerived = false;
			xmlTag = "AmtToDbt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountToDebit";
			definition = "Amount authorised for debit. The party providing the debit authority may want to authorise the amount less charges and they may only be prepared to approve the debit for value today rather than the original value date.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<CurrencyAndAmount> getValue(DebitAuthorisationConfirmation obj) {
			return obj.getAmountToDebit();
		}

		@Override
		public void setValue(DebitAuthorisationConfirmation obj, Optional<CurrencyAndAmount> value) {
			obj.setAmountToDebit(value.orElse(null));
		}
	};
	@XmlElement(name = "ValDtToDbt")
	protected ISODate valueDateToDebit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation#mmValueDateToDebit
	 * DebitAuthorisation.mmValueDateToDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisationConfirmation
	 * DebitAuthorisationConfirmation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValDtToDbt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDateToDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value date for debiting the amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DebitAuthorisationConfirmation, Optional<ISODate>> mmValueDateToDebit = new MMMessageAttribute<DebitAuthorisationConfirmation, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> DebitAuthorisation.mmValueDateToDebit;
			componentContext_lazy = () -> com.tools20022.repository.msg.DebitAuthorisationConfirmation.mmObject();
			isDerived = false;
			xmlTag = "ValDtToDbt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDateToDebit";
			definition = "Value date for debiting the amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(DebitAuthorisationConfirmation obj) {
			return obj.getValueDateToDebit();
		}

		@Override
		public void setValue(DebitAuthorisationConfirmation obj, Optional<ISODate> value) {
			obj.setValueDateToDebit(value.orElse(null));
		}
	};
	@XmlElement(name = "Rsn")
	protected Max140Text reason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation#mmReason
	 * DebitAuthorisation.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisationConfirmation
	 * DebitAuthorisationConfirmation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Justification of the (partial) debit authorisation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DebitAuthorisationConfirmation, Optional<Max140Text>> mmReason = new MMMessageAttribute<DebitAuthorisationConfirmation, Optional<Max140Text>>() {
		{
			businessElementTrace_lazy = () -> DebitAuthorisation.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.DebitAuthorisationConfirmation.mmObject();
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Justification of the (partial) debit authorisation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(DebitAuthorisationConfirmation obj) {
			return obj.getReason();
		}

		@Override
		public void setValue(DebitAuthorisationConfirmation obj, Optional<Max140Text> value) {
			obj.setReason(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DebitAuthorisationConfirmation.mmDebitAuthorisation, com.tools20022.repository.msg.DebitAuthorisationConfirmation.mmAmountToDebit,
						com.tools20022.repository.msg.DebitAuthorisationConfirmation.mmValueDateToDebit, com.tools20022.repository.msg.DebitAuthorisationConfirmation.mmReason);
				messageBuildingBlock_lazy = () -> Arrays.asList(DebitAuthorisationResponse.mmConfirmation);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DebitAuthorisationConfirmation";
				definition = "Indicates if the debit authorisation is granted or not.";
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getDebitAuthorisation() {
		return debitAuthorisation;
	}

	public DebitAuthorisationConfirmation setDebitAuthorisation(YesNoIndicator debitAuthorisation) {
		this.debitAuthorisation = Objects.requireNonNull(debitAuthorisation);
		return this;
	}

	public Optional<CurrencyAndAmount> getAmountToDebit() {
		return amountToDebit == null ? Optional.empty() : Optional.of(amountToDebit);
	}

	public DebitAuthorisationConfirmation setAmountToDebit(CurrencyAndAmount amountToDebit) {
		this.amountToDebit = amountToDebit;
		return this;
	}

	public Optional<ISODate> getValueDateToDebit() {
		return valueDateToDebit == null ? Optional.empty() : Optional.of(valueDateToDebit);
	}

	public DebitAuthorisationConfirmation setValueDateToDebit(ISODate valueDateToDebit) {
		this.valueDateToDebit = valueDateToDebit;
		return this;
	}

	public Optional<Max140Text> getReason() {
		return reason == null ? Optional.empty() : Optional.of(reason);
	}

	public DebitAuthorisationConfirmation setReason(Max140Text reason) {
		this.reason = reason;
		return this;
	}
}