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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CurrencyExchangeReport3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Reports either on currency exchange information or on a business error."</li>
 * </ul>
 */
public class CurrencyExchangeReport3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencySourceTarget1 currencyReference;
	/**
	 * Source and target currencies for which information is request.
	 * <p>
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
	public static final MMMessageAssociationEnd mmCurrencyReference = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CurrencyExchangeReport3.mmObject();
			isDerived = false;
			xmlTag = "CcyRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyReference";
			definition = "Source and target currencies for which information is request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CurrencySourceTarget1.mmObject();
		}
	};
	protected ExchangeRateReportOrError2Choice currencyExchangeOrError;
	/**
	 * Reports either on currency exchange information or on a business error.
	 * <p>
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
	public static final MMMessageAssociationEnd mmCurrencyExchangeOrError = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CurrencyExchangeReport3.mmObject();
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
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CurrencyExchangeReport3.mmCurrencyReference, CurrencyExchangeReport3.mmCurrencyExchangeOrError);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CurrencyExchangeReport3";
				definition = "Reports either on currency exchange information or on a business error.";
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencySourceTarget1 getCurrencyReference() {
		return currencyReference;
	}

	public void setCurrencyReference(com.tools20022.repository.msg.CurrencySourceTarget1 currencyReference) {
		this.currencyReference = currencyReference;
	}

	public ExchangeRateReportOrError2Choice getCurrencyExchangeOrError() {
		return currencyExchangeOrError;
	}

	public void setCurrencyExchangeOrError(ExchangeRateReportOrError2Choice currencyExchangeOrError) {
		this.currencyExchangeOrError = currencyExchangeOrError;
	}
}