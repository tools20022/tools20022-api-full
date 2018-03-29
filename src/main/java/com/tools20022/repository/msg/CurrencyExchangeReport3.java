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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.ExchangeRateReportOrError2Choice;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CurrencySourceTarget1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reports either on currency exchange information or on a business error.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeReport3#mmCurrencyReference
 * CurrencyExchangeReport3.mmCurrencyReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeReport3#mmCurrencyExchangeOrError
 * CurrencyExchangeReport3.mmCurrencyExchangeOrError}</li>
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
 * "CurrencyExchangeReport3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Reports either on currency exchange information or on a business error."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CurrencyExchangeReport3", propOrder = {"currencyReference", "currencyExchangeOrError"})
public class CurrencyExchangeReport3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CcyRef", required = true)
	protected CurrencySourceTarget1 currencyReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CurrencySourceTarget1
	 * CurrencySourceTarget1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeReport3
	 * CurrencyExchangeReport3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Source and target currencies for which information is request."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CurrencyExchangeReport3, CurrencySourceTarget1> mmCurrencyReference = new MMMessageAssociationEnd<CurrencyExchangeReport3, CurrencySourceTarget1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyExchangeReport3.mmObject();
			isDerived = false;
			xmlTag = "CcyRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyReference";
			definition = "Source and target currencies for which information is request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CurrencySourceTarget1.mmObject();
		}

		@Override
		public CurrencySourceTarget1 getValue(CurrencyExchangeReport3 obj) {
			return obj.getCurrencyReference();
		}

		@Override
		public void setValue(CurrencyExchangeReport3 obj, CurrencySourceTarget1 value) {
			obj.setCurrencyReference(value);
		}
	};
	@XmlElement(name = "CcyXchgOrErr", required = true)
	protected ExchangeRateReportOrError2Choice currencyExchangeOrError;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ExchangeRateReportOrError2Choice
	 * ExchangeRateReportOrError2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeReport3
	 * CurrencyExchangeReport3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyXchgOrErr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchangeOrError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reports either on currency exchange information or on a business error."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CurrencyExchangeReport3, ExchangeRateReportOrError2Choice> mmCurrencyExchangeOrError = new MMMessageAssociationEnd<CurrencyExchangeReport3, ExchangeRateReportOrError2Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyExchangeReport3.mmObject();
			isDerived = false;
			xmlTag = "CcyXchgOrErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyExchangeOrError";
			definition = "Reports either on currency exchange information or on a business error.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ExchangeRateReportOrError2Choice.mmObject();
		}

		@Override
		public ExchangeRateReportOrError2Choice getValue(CurrencyExchangeReport3 obj) {
			return obj.getCurrencyExchangeOrError();
		}

		@Override
		public void setValue(CurrencyExchangeReport3 obj, ExchangeRateReportOrError2Choice value) {
			obj.setCurrencyExchangeOrError(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyExchangeReport3.mmCurrencyReference, com.tools20022.repository.msg.CurrencyExchangeReport3.mmCurrencyExchangeOrError);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CurrencyExchangeReport3";
				definition = "Reports either on currency exchange information or on a business error.";
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencySourceTarget1 getCurrencyReference() {
		return currencyReference;
	}

	public CurrencyExchangeReport3 setCurrencyReference(CurrencySourceTarget1 currencyReference) {
		this.currencyReference = Objects.requireNonNull(currencyReference);
		return this;
	}

	public ExchangeRateReportOrError2Choice getCurrencyExchangeOrError() {
		return currencyExchangeOrError;
	}

	public CurrencyExchangeReport3 setCurrencyExchangeOrError(ExchangeRateReportOrError2Choice currencyExchangeOrError) {
		this.currencyExchangeOrError = Objects.requireNonNull(currencyExchangeOrError);
		return this;
	}
}